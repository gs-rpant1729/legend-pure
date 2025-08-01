// Copyright 2021 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.pure.runtime.java.extension.store.relational.interpreted.natives;

import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.map.MutableMap;
import org.eclipse.collections.api.map.primitive.ImmutableIntObjectMap;
import org.eclipse.collections.api.stack.MutableStack;
import org.eclipse.collections.impl.factory.primitive.IntObjectMaps;
import org.finos.legend.pure.m3.compiler.Context;
import org.finos.legend.pure.m3.exception.PureExecutionException;
import org.finos.legend.pure.m3.navigation.Instance;
import org.finos.legend.pure.m3.navigation.M3Paths;
import org.finos.legend.pure.m3.navigation.M3Properties;
import org.finos.legend.pure.m3.navigation.PrimitiveUtilities;
import org.finos.legend.pure.m3.navigation.ProcessorSupport;
import org.finos.legend.pure.m3.navigation.ValueSpecificationBootstrap;
import org.finos.legend.pure.m3.serialization.runtime.Message;
import org.finos.legend.pure.m3.tools.BinaryUtils;
import org.finos.legend.pure.m3.tools.MetricsRecorder;
import org.finos.legend.pure.m4.ModelRepository;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.primitive.date.DateFunctions;
import org.finos.legend.pure.m4.coreinstance.primitive.date.StrictDate;
import org.finos.legend.pure.runtime.java.extension.store.relational.shared.*;
import org.finos.legend.pure.runtime.java.interpreted.ExecutionSupport;
import org.finos.legend.pure.runtime.java.interpreted.VariableContext;
import org.finos.legend.pure.runtime.java.interpreted.natives.InstantiationContext;
import org.finos.legend.pure.runtime.java.interpreted.natives.NativeFunction;
import org.finos.legend.pure.runtime.java.interpreted.profiler.Profiler;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TimeZone;

public class ExecuteInDb extends NativeFunction
{
    private static final ImmutableIntObjectMap<String> sqlTypeToPureType = IntObjectMaps.mutable.<String>empty()
            .withKeyValue(Types.NULL, M3Paths.Nil)

            .withKeyValue(Types.SMALLINT, M3Paths.Integer)
            .withKeyValue(Types.TINYINT, M3Paths.Integer)
            .withKeyValue(Types.INTEGER, M3Paths.Integer)
            .withKeyValue(Types.BIGINT, M3Paths.Integer)

            .withKeyValue(Types.CHAR, M3Paths.String)
            .withKeyValue(Types.VARCHAR, M3Paths.String)
            .withKeyValue(Types.LONGVARCHAR, M3Paths.String)
            .withKeyValue(Types.NCHAR, M3Paths.String)
            .withKeyValue(Types.NVARCHAR, M3Paths.String)
            .withKeyValue(Types.LONGNVARCHAR, M3Paths.String)
            .withKeyValue(Types.OTHER, M3Paths.String)

            .withKeyValue(Types.REAL, M3Paths.Float)
            .withKeyValue(Types.DOUBLE, M3Paths.Float)
            .withKeyValue(Types.DECIMAL, M3Paths.Float)
            .withKeyValue(Types.NUMERIC, M3Paths.Float)
            .withKeyValue(Types.FLOAT, M3Paths.Float)

            .withKeyValue(Types.DATE, M3Paths.StrictDate)
            .withKeyValue(Types.TIME, M3Paths.DateTime)
            .withKeyValue(Types.TIMESTAMP, M3Paths.DateTime)
            .withKeyValue(Types.TIMESTAMP_WITH_TIMEZONE, M3Paths.DateTime)

            .withKeyValue(Types.BOOLEAN, M3Paths.Boolean)
            .withKeyValue(Types.BIT, M3Paths.Boolean)

            .withKeyValue(Types.BINARY, M3Paths.String)
            .withKeyValue(Types.VARBINARY, M3Paths.String)
            .withKeyValue(Types.LONGVARBINARY, M3Paths.String)
            .toImmutable();

    private static  Map<Integer, Map<String, String>> dbSpecificTypeToPureType = new HashMap<>();

    static
    {
        dbSpecificTypeToPureType.put(Types.JAVA_OBJECT, Collections.singletonMap("HUGEINT", M3Paths.Integer));
    }

    private static final IConnectionManagerHandler connectionManagerHandler = IConnectionManagerHandler.CONNECTION_MANAGER_HANDLER;

    private final ModelRepository repository;
    private final Message message;
    private final int maxRows;

    public ExecuteInDb(ModelRepository repository, Message message, int maxRows)
    {
        this.repository = repository;
        this.message = message;
        this.maxRows = Math.max(maxRows, 0);
    }

    @Override
    public CoreInstance execute(ListIterable<? extends CoreInstance> params, Stack<MutableMap<String, CoreInstance>> resolvedTypeParameters, Stack<MutableMap<String, CoreInstance>> resolvedMultiplicityParameters, VariableContext variableContext, MutableStack<CoreInstance> functionExpressionCallStack, Profiler profiler, InstantiationContext instantiationContext, ExecutionSupport executionSupport, Context context, ProcessorSupport processorSupport) throws PureExecutionException
    {

        String sql = Instance.getValueForMetaPropertyToOneResolved(params.get(0), M3Properties.values, processorSupport).getName();
        CoreInstance connectionInformation = Instance.getValueForMetaPropertyToOneResolved(params.get(1), M3Properties.values, processorSupport);

        Number timeOutInSeconds = PrimitiveUtilities.getIntegerValue(Instance.getValueForMetaPropertyToOneResolved(params.get(2), M3Properties.values, processorSupport));
        Number fetchSize = PrimitiveUtilities.getIntegerValue(Instance.getValueForMetaPropertyToOneResolved(params.get(3), M3Properties.values, processorSupport));

        CoreInstance pureResult = this.executeInDb(connectionInformation, sql, timeOutInSeconds.intValue(), fetchSize.intValue(), functionExpressionCallStack.peek(), functionExpressionCallStack, processorSupport);
        return ValueSpecificationBootstrap.wrapValueSpecification(pureResult, true, processorSupport);
    }

    public CoreInstance executeInDb(CoreInstance connectionInformation, String sql, int timeOutInSeconds, int fetchSize, CoreInstance functionExpression, MutableStack<CoreInstance> functionExpressionCallStack, ProcessorSupport processorSupport)
    {
        CoreInstance resultSetClassifier = processorSupport.package_getByUserPath("meta::relational::metamodel::execute::ResultSet");
        if (resultSetClassifier == null)
        {
            throw new RuntimeException("'meta::relational::metamodel::execute::ResultSet' is unknown");
        }
        CoreInstance rowClassifier = processorSupport.package_getByUserPath("meta::relational::metamodel::execute::Row");
        if (rowClassifier == null)
        {
            throw new RuntimeException("'meta::relational::metamodel::execute::Row' is unknown");
        }

        CoreInstance pureResult = this.repository.newAnonymousCoreInstance(functionExpression.getSourceInformation(), resultSetClassifier);

        Connection connection = null;
        ConnectionWithDataSourceInfo connectionWithDataSourceInfo = null;
        Statement statement = null;
        try
        {
            try
            {
                MetricsRecorder.incrementRelationalExecutionCounters();
                this.message.setMessage("Acquiring connection...");

                CoreInstance dbTimeZone = connectionInformation.getValueForMetaPropertyToOne("timeZone");
                String tz = dbTimeZone == null ? "GMT" : dbTimeZone.getName();

                long startRequestConnection = System.nanoTime();
                connectionWithDataSourceInfo = connectionManagerHandler.getConnectionWithDataSourceInfo(connectionInformation, processorSupport);
                Instance.addValueToProperty(pureResult, "connectionAcquisitionTimeInNanoSecond", this.repository.newIntegerCoreInstance(System.nanoTime() - startRequestConnection), processorSupport);

                connection = connectionWithDataSourceInfo.getConnection();
                if (!PureConnectionUtils.isPureConnectionType(connectionInformation, "Hive"))
                {
                    connection.setAutoCommit(true);

                }

                statement = connection.createStatement();
                int actualFetchSize = this.maxRows > 0 ? Math.min(fetchSize, this.maxRows) : fetchSize;
                connectionManagerHandler.registerStatement(statement, sql, actualFetchSize, timeOutInSeconds);
                statement.setMaxRows(this.maxRows);
                statement.setFetchSize(actualFetchSize);
                if (!PureConnectionUtils.isPureConnectionType(connectionInformation, "Hive"))
                {
                    statement.setQueryTimeout(timeOutInSeconds);

                }


                connectionManagerHandler.addPotentialDebug(connectionInformation, statement);
                this.message.setMessage("Executing SQL...");
                long start = System.nanoTime();
                if (statement.execute(sql))
                {
                    String URL = connectionManagerHandler.getPotentialDebug(connectionInformation, connection);
                    if (URL != null)
                    {
                        Instance.addValueToProperty(pureResult, "executionPlanInformation", this.repository.newStringCoreInstance(URL), processorSupport);
                    }

                    ResultSet rs = statement.getResultSet();

                    createPureResultSetFromDatabaseResultSet(pureResult, rs, functionExpression, rowClassifier, tz, repository, start, this.maxRows, processorSupport);
                }
                else
                {
                    Instance.addValueToProperty(pureResult, "executionTimeInNanoSecond", this.repository.newIntegerCoreInstance(0), processorSupport);
                }

                CoreInstance dbType = Instance.getValueForMetaPropertyToOneResolved(connectionInformation, "type", processorSupport);
                String dbHost = connectionWithDataSourceInfo.getDataSource().getHost();
                Integer dbPort = connectionWithDataSourceInfo.getDataSource().getPort();
                String dbName = connectionWithDataSourceInfo.getDataSource().getDataSourceName();
                String serverPrincipal = connectionWithDataSourceInfo.getDataSource().getServerPrincipal();

                if (dbType != null && dbHost != null && dbName != null && dbPort != null)
                {
                    CoreInstance dataSourceCoreInstance = this.repository.newEphemeralAnonymousCoreInstance(null, processorSupport.package_getByUserPath("meta::relational::runtime::DataSource"));

                    Instance.addValueToProperty(dataSourceCoreInstance, "host", this.repository.newStringCoreInstance(dbHost), processorSupport);
                    Instance.addValueToProperty(dataSourceCoreInstance, "port", this.repository.newIntegerCoreInstance(dbPort), processorSupport);
                    Instance.addValueToProperty(dataSourceCoreInstance, "name", this.repository.newStringCoreInstance(dbName), processorSupport);
                    Instance.addValueToProperty(dataSourceCoreInstance, "type", dbType, processorSupport);
                    if (serverPrincipal != null)
                    {
                        Instance.addValueToProperty(dataSourceCoreInstance, "serverPrincipal", this.repository.newStringCoreInstance(serverPrincipal), processorSupport);
                    }
                    Instance.addValueToProperty(pureResult, "dataSource", dataSourceCoreInstance, processorSupport);
                }
            }
            finally
            {
                if (statement != null)
                {
                    connectionManagerHandler.unregisterStatement(statement);
                    statement.close();
                }
                if (connection != null)
                {
                    connection.close();
                }
                MetricsRecorder.decrementCurrentRelationalExecutionCounter();
            }
        }
        catch (SQLException e)
        {
            throw new PureExecutionException(functionExpression.getSourceInformation(), SQLExceptionHandler.buildExceptionString(e, connection), e, functionExpressionCallStack);
        }

        this.message.setMessage("Executing SQL...[DONE]");
        return pureResult;
    }

    public static void createPureResultSetFromDatabaseResultSet(CoreInstance pureResult, ResultSet rs, CoreInstance functionExpression, CoreInstance rowClassifier, String tz, ModelRepository repository,
                                                                long start, int maxRows, ProcessorSupport processorSupport) throws SQLException
    {
        ResultSetMetaData metaData = rs.getMetaData();
        MutableList<String> columnNames = Lists.mutable.empty();
        MutableList<CoreInstance> columnPureTypes = Lists.mutable.empty();
        int count = metaData.getColumnCount();
        for (int i = 1; i <= count; i++)
        {
            String column = metaData.getColumnLabel(i);
            columnNames.add(column);
            columnPureTypes.add(processorSupport.package_getByUserPath(pathFromColumnType(metaData, i)));
            Instance.addValueToProperty(pureResult, "columnNames", repository.newStringCoreInstance(column), processorSupport);
        }

        CoreInstance nullValue = repository.newCoreInstance("SQLNull", processorSupport.package_getByUserPath("meta::relational::metamodel::SQLNull"), null);

        if (rs.next())
        {
            Instance.addValueToProperty(pureResult, "executionTimeInNanoSecond", repository.newIntegerCoreInstance(System.nanoTime() - start), processorSupport);
            MutableList<CoreInstance> rows = Lists.mutable.ofInitialCapacity(maxRows);
            int rowNum = 0;
            do
            {
                CoreInstance row = repository.newAnonymousCoreInstance(functionExpression.getSourceInformation(), rowClassifier);
                Instance.addValueToProperty(row, "parent", pureResult, processorSupport);
                GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone(tz));

                MutableList<CoreInstance> rowValues = Lists.mutable.ofInitialCapacity(count);
                for (int i = 1; i <= count; i++)
                {
                    CoreInstance value = nullValue;
                    switch (metaData.getColumnType(i))
                    {
                        case Types.DATE:
                        {
                            java.sql.Date date = rs.getDate(i);
                            if (date != null)
                            {
                                value = repository.newDateCoreInstance(StrictDate.fromSQLDate(date));
                            }
                            break;
                        }
                        case Types.TIMESTAMP:
                        case Types.TIMESTAMP_WITH_TIMEZONE:
                        {
                            java.sql.Timestamp timestamp = rs.getTimestamp(i, calendar);
                            if (timestamp != null)
                            {
                                value = repository.newDateCoreInstance(DateFunctions.fromSQLTimestamp(timestamp));
                            }
                            break;
                        }
                        case Types.TINYINT:
                        case Types.SMALLINT:
                        case Types.INTEGER:
                        {
                            int num = rs.getInt(i);
                            if (!rs.wasNull())
                            {
                                value = repository.newIntegerCoreInstance(num);
                            }
                            break;
                        }
                        case Types.BIGINT:
                        {
                            long num = rs.getLong(i);
                            if (!rs.wasNull())
                            {
                                value = repository.newIntegerCoreInstance(num);
                            }
                            break;
                        }
                        case Types.REAL:
                        case Types.FLOAT:
                        case Types.DOUBLE:
                        {
                            double num = rs.getDouble(i);
                            if (!rs.wasNull())
                            {
                                value = repository.newFloatCoreInstance(BigDecimal.valueOf(num));
                            }
                            break;
                        }
                        case Types.DECIMAL:
                        case Types.NUMERIC:
                        {
                            BigDecimal num = rs.getBigDecimal(i);
                            if (num != null)
                            {
                                value = repository.newFloatCoreInstance(num);
                            }
                            break;
                        }
                        case Types.CHAR:
                        case Types.VARCHAR:
                        case Types.LONGVARCHAR:
                        case Types.NCHAR:
                        case Types.NVARCHAR:
                        case Types.LONGNVARCHAR:
                        case Types.OTHER:
                        {
                            if (metaData.getColumnTypeName(i).equals("HUGEINT"))      // DuckDB Specific datatype
                            {
                                long num = rs.getLong(i);
                                if (!rs.wasNull())
                                {
                                    value = repository.newIntegerCoreInstance(num);
                                }
                            }
                            else
                            {
                                String string = rs.getString(i);
                                if (string != null)
                                {
                                    value = repository.newStringCoreInstance(string);
                                }
                            }
                            break;
                        }
                        case Types.BIT:
                        case Types.BOOLEAN:
                        {
                            boolean boolValue = rs.getBoolean(i);
                            if (!rs.wasNull())
                            {
                                value = repository.newBooleanCoreInstance(boolValue);
                            }
                            break;
                        }
                        case Types.BINARY:
                        case Types.VARBINARY:
                        case Types.LONGVARBINARY:
                        {
                            byte[] bytes = rs.getBytes(i);
                            if (bytes != null)
                            {
                                String string = BinaryUtils.encodeHex(bytes);
                                value = repository.newStringCoreInstance(string);
                            }
                            break;
                        }
                        case Types.JAVA_OBJECT:
                        {
                            if (metaData.getColumnTypeName(i).equals("HUGEINT"))      // DuckDB Specific datatype
                            {
                                long num = rs.getLong(i);
                                if (!rs.wasNull())
                                {
                                    value = repository.newIntegerCoreInstance(num);
                                }
                                break;
                            }
                            break;
                        }
                        case Types.NULL:
                        {
                            // do nothing: value is already assigned to null
                            break;
                        }
                        default:
                        {
                            Object obj = rs.getObject(i);
                            if (obj != null)
                            {
                                value = repository.newEphemeralCoreInstance(obj.toString(), columnPureTypes.get(i - 1), null);
                            }
                        }
                    }
                    rowValues.add(value);
                }
                Instance.setValuesForProperty(row, M3Properties.values, rowValues, processorSupport);
                rows.add(row);
                rowNum++;
            }
            while (rs.next() && isRowWithinLimit(rowNum, maxRows));
            Instance.setValuesForProperty(pureResult, "rows", rows, processorSupport);
        }
        else
        {
            Instance.addValueToProperty(pureResult, "executionTimeInNanoSecond", repository.newIntegerCoreInstance(System.nanoTime() - start), processorSupport);
        }
    }

    public void bulkInsertInDb(CoreInstance connectionInformation, CoreInstance table, Iterable<? extends Iterable<?>> values, MutableStack<CoreInstance> functionExpressionCallStack, final ProcessorSupport processorSupport)
    {

        if (!Instance.instanceOf(connectionInformation, "meta::external::store::relational::runtime::TestDatabaseConnection", processorSupport))
        {
            throw new PureExecutionException("Bulk insert is only supported for the TestDatabaseConnection", functionExpressionCallStack);
        }

        String tableName = Instance.getValueForMetaPropertyToOneResolved(table, M3Properties.name, processorSupport).getName();
        ListIterable<? extends CoreInstance> columns = Instance.getValueForMetaPropertyToManyResolved(table, "columns", processorSupport);

        ListIterable<String> columnNames = columns.collect(c -> Instance.getValueForMetaPropertyToOneResolved(c, M3Properties.name, processorSupport).getName());
        CoreInstance schema = Instance.getValueForMetaPropertyToOneResolved(table, "schema", processorSupport);
        String schemaName = schema.getValueForMetaPropertyToOne(M3Properties.name).getName();
        StringBuilder sql = LoadToDbTableHelper.buildInsertStatementHeader(schemaName, tableName, columnNames);

        Connection connection = null;
        PreparedStatement statement = null;
        try
        {
            try
            {

                this.message.setMessage("Acquiring connection...");
                connection = connectionManagerHandler.getConnectionWithDataSourceInfo(connectionInformation, processorSupport).getConnection();
                String sqlString = sql.toString();
                statement = connection.prepareStatement(sqlString);

                connectionManagerHandler.registerStatement(statement, sqlString, -1, -1);
                statement.setMaxRows(this.maxRows);
                this.message.setMessage("Inserting DB rows...");
                long start = System.currentTimeMillis();

                int[] res = LoadToDbTableHelper.insertBatch(values, statement);
                connection.commit();
                this.message.setMessage("Finished inserting rows. " + res.length + " rows inserted in " + (System.currentTimeMillis() - start) + " ms.");
            }
            finally
            {
                if (statement != null)
                {
                    connectionManagerHandler.unregisterStatement(statement);
                    statement.close();
                }
                if (connection != null)
                {
                    connection.close();
                }
            }
        }
        catch (SQLException e)
        {
            throw new PureExecutionException(functionExpressionCallStack.peek().getSourceInformation(), SQLExceptionHandler.buildExceptionString(e, connection), e, functionExpressionCallStack);
        }

    }

    private static boolean isRowWithinLimit(int rowNum, int maxRows)
    {
        return (maxRows == 0) || (rowNum <= maxRows);
    }

    private static String pathFromColumnType(ResultSetMetaData metaData, int columnIndex) throws SQLException
    {
        int sqlType = metaData.getColumnType(columnIndex);
        String pureType = sqlTypeToPureType.get(sqlType);

        if (pureType == null)
        {
           String pureTypeDbSpecific = dbSpecificTypeToPureType.get(sqlType).get(metaData.getColumnTypeName(columnIndex));

            if (pureType == null && pureTypeDbSpecific == null)
            {
                throw new RuntimeException("No compatible PURE type found for column type (java.sql.Types): " + sqlType + ", column: " + columnIndex +
                        " " + metaData.getColumnName(columnIndex) + " " + metaData.getColumnTypeName(columnIndex));
            }
            return pureTypeDbSpecific;
        }
        else
        {
            return pureType;
        }
    }
}
