// Copyright 2020 Goldman Sachs
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

package org.finos.legend.pure.m3.tests.elements.function.inference;

import java.util.function.Function;
import org.eclipse.collections.api.list.ListIterable;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.ConcreteFunctionDefinition;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.LambdaFunction;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.FunctionType;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.InstanceValue;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.SimpleFunctionExpression;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.ValueSpecification;
import org.finos.legend.pure.m3.exception.PureUnmatchedFunctionException;
import org.finos.legend.pure.m3.navigation.Instance;
import org.finos.legend.pure.m3.navigation.M3Paths;
import org.finos.legend.pure.m3.navigation.M3Properties;
import org.finos.legend.pure.m3.navigation.PackageableElement.PackageableElement;
import org.finos.legend.pure.m3.navigation.generictype.GenericType;
import org.finos.legend.pure.m3.tests.AbstractPureTestWithCoreCompiledPlatform;
import org.finos.legend.pure.m3.tools.ListHelper;
import org.finos.legend.pure.m3.tools.test.ToFix;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.finos.legend.pure.m4.exception.PureCompilationException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

public class TestFunctionTypeInference extends AbstractPureTestWithCoreCompiledPlatform
{
    private static final boolean shouldSetTypeInferenceObserver = false;
    private static final String typeInferenceTestProperty = "pure.typeinference.test";
    private static boolean typeInferenceTestPropertySet = false;
    private static String previousTypeInferenceTest;

    private static final String inferenceTestFileName = "inferenceTest.pure";

    @BeforeClass
    public static void setUp()
    {
        setUpRuntime(getExtra());

        if (shouldSetTypeInferenceObserver)
        {
            previousTypeInferenceTest = System.setProperty(typeInferenceTestProperty, "true");
            typeInferenceTestPropertySet = true;
        }
    }

    @AfterClass
    public static void cleanUp()
    {
        if (typeInferenceTestPropertySet)
        {
            if (previousTypeInferenceTest == null)
            {
                System.clearProperty(typeInferenceTestProperty);
            }
            else
            {
                System.setProperty(typeInferenceTestProperty, previousTypeInferenceTest);
            }
        }
    }

    @After
    public void clearRuntime()
    {
        deleteInferenceTest();
    }

    @Test
    public void inferClassTypeParameter()
    {
        compileInferenceTest(
                "Class MyClass<Z>{value:Z[1];}\n" +
                        "function f<T>(s:T[*]):MyClass<T>[1]{^MyClass<T>(value='ok')}\n" +
                        "function test():Any[*]{f(['a','b']).value+'ee';}\n");
        deleteInferenceTest();

        compileInferenceTest(
                "Class MyClass<Z>{value:Z[1];}\n" +
                        "function f<T>(s:T[*]):MyClass<T>[1]{^MyClass<T>(value='ok')}\n" +
                        "function test():Any[*]{f([1,2]).value+3;}\n");
        deleteInferenceTest();

        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "Class MyClass<Z>{value:Z[1];}\n" +
                        "function f<T>(s:T[*]):MyClass<T>[1]{^MyClass<T>(value='ok')}\n" +
                        "function test():Any[*]{f([1,2]).value+'3';}\n"));
        assertPureException(PureCompilationException.class, PureUnmatchedFunctionException.FUNCTION_UNMATCHED_MESSAGE + "plus(_:Any[2])\n" +
                PureUnmatchedFunctionException.EMPTY_CANDIDATES_WITH_PACKAGE_IMPORTED_MESSAGE +
                PureUnmatchedFunctionException.NONEMPTY_CANDIDATES_WITH_PACKAGE_NOT_IMPORTED_MESSAGE +
                "\tmeta::pure::functions::math::plus(Decimal[*]):Decimal[1]\n" +
                "\tmeta::pure::functions::math::plus(Float[*]):Float[1]\n" +
                "\tmeta::pure::functions::math::plus(Integer[*]):Integer[1]\n" +
                "\tmeta::pure::functions::math::plus(Number[*]):Number[1]\n" +
                "\tmeta::pure::functions::string::plus(String[*]):String[1]\n", inferenceTestFileName, 3, 38, e);
    }

    @Test
    public void inferMultiplicityParameter()
    {
        compileInferenceTest(
                "function f<|m>(s:String[m]):String[m]{$s}\n" +
                        "function pl(a:String[1], b:String[1]):String[1]{$a+$b}\n" +
                        "function test():Any[*]{f('a')->pl('ok')}\n");
        deleteInferenceTest();

        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "function f<|m>(s:String[m]):String[m]{$s}\n" +
                        "function pl(a:String[1], b:String[1]):String[1]{$a+$b}\n" +
                        "function test():Any[*]{f(['a','b'])->pl('ok')}\n"));
        assertPureException(PureCompilationException.class, PureUnmatchedFunctionException.FUNCTION_UNMATCHED_MESSAGE + "pl(_:String[2],_:String[1])\n" +
                PureUnmatchedFunctionException.NONEMPTY_CANDIDATES_WITH_PACKAGE_IMPORTED_MESSAGE +
                "\tpl(String[1], String[1]):String[1]\n" +
                PureUnmatchedFunctionException.EMPTY_CANDIDATES_WITH_PACKAGE_NOT_IMPORTED_MESSAGE, inferenceTestFileName, 3, 38, e);
    }

    @Test
    public void inferMultipleParametersInLambda()
    {
        compileInferenceTest(
                "Profile decision\n" +
                        "{\n" +
                        "   tags: [name, id, domainType, dataType, include];\n" +
                        "}\n" +
                        "native function meta::pure::functions::meta::value4Tag(f:ElementWithTaggedValues[1], tagName:String[1], profile:Profile[1]):TaggedValue[*];\n" +
                        "function <<access.private>> datamarts::dtm::domain::bdm::sapiens::impl::getTagValue(p:ElementWithTaggedValues[1], tagName:String[1]):String[1] {\n" +
                        "   $p->value4Tag($tagName, decision)->fold({t, str:String[1]|$t.value}, '');  \n" +
                        "}\n");
    }

    @Test
    public void inferVariableTypeOfFunctionUsedAsParameter()
    {
        compileInferenceTest(
                "function f<T>(s:Function<{->T[1]}>[1]):T[1]{$s->eval();}\n" +
                        "function test():Any[*]{f(|1)+1}\n");
        deleteInferenceTest();

        compileInferenceTest(
                "function f<T>(s:Function<{->T[1]}>[1]):T[1]{$s->eval();}\n" +
                        "function test():Any[*]{f(|'1')+'1'}\n");
        deleteInferenceTest();

        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "function f<T>(s:Function<{->T[1]}>[1]):T[1]{$s->eval();}\n" +
                        "function test():Any[*]{f(|'1')+1}\n"));
        assertPureException(PureCompilationException.class, PureUnmatchedFunctionException.FUNCTION_UNMATCHED_MESSAGE + "plus(_:Any[2])\n" +
                PureUnmatchedFunctionException.EMPTY_CANDIDATES_WITH_PACKAGE_IMPORTED_MESSAGE +
                PureUnmatchedFunctionException.NONEMPTY_CANDIDATES_WITH_PACKAGE_NOT_IMPORTED_MESSAGE +
                "\tmeta::pure::functions::math::plus(Decimal[*]):Decimal[1]\n" +
                "\tmeta::pure::functions::math::plus(Float[*]):Float[1]\n" +
                "\tmeta::pure::functions::math::plus(Integer[*]):Integer[1]\n" +
                "\tmeta::pure::functions::math::plus(Number[*]):Number[1]\n" +
                "\tmeta::pure::functions::string::plus(String[*]):String[1]\n", inferenceTestFileName, 2, 31, e);
    }

    @Test
    public void inferLambdaTypeParameterUsingMultiPass()
    {
        compileInferenceTest(
                "Class MyClass<Z>{}\n" +
                        "function g<K>(f:Function<{K[1]->Boolean[1]}>[1]):MyClass<K>[1]{^MyClass<K>()}\n" +
                        "function f<T>(s:T[*], a:MyClass<T>[1]):String[1]{'a'}\n" +
                        "function test():Any[*]{f(['a','b'], g(t|$t->startsWith('ee')))}\n");
        deleteInferenceTest();

        compileInferenceTest(
                "Class MyClass<Z>{}\n" +
                        "function g<K>(f:Function<{K[1]->Boolean[1]}>[1]):MyClass<K>[1]{^MyClass<K>()}\n" +
                        "function f<T>(s:T[*], a:MyClass<T>[1]):String[1]{'a'}\n" +
                        "function test():Any[*]{f([1,2], g(t|let e = $t+3; $e == 2;))}\n");
        deleteInferenceTest();

        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "Class MyClass<Z>{}\n" +
                        "function g<K>(f:Function<{K[1]->Boolean[1]}>[1]):MyClass<K>[1]{^MyClass<K>()}\n" +
                        "function f<T>(s:T[*], a:MyClass<T>[1]):String[1]{'a'}\n" +
                        "function test():Any[*]{f(['a','b'], g(t|let e = $t+3; $e == 2;))}\n"));
        assertPureException(PureCompilationException.class, PureUnmatchedFunctionException.FUNCTION_UNMATCHED_MESSAGE + "plus(_:Any[2])\n" +
                PureUnmatchedFunctionException.EMPTY_CANDIDATES_WITH_PACKAGE_IMPORTED_MESSAGE +
                PureUnmatchedFunctionException.NONEMPTY_CANDIDATES_WITH_PACKAGE_NOT_IMPORTED_MESSAGE +
                "\tmeta::pure::functions::math::plus(Decimal[*]):Decimal[1]\n" +
                "\tmeta::pure::functions::math::plus(Float[*]):Float[1]\n" +
                "\tmeta::pure::functions::math::plus(Integer[*]):Integer[1]\n" +
                "\tmeta::pure::functions::math::plus(Number[*]):Number[1]\n" +
                "\tmeta::pure::functions::string::plus(String[*]):String[1]\n", inferenceTestFileName, 4, 51, e);
    }

    @Test
    public void ensureNoCrashWhenAnyIsUsedForAFunctionType()
    {
        compileInferenceTest(
                "function f<T>(a:T[*]):T[*]\n" +
                        "{\n" +
                        "     $a;\n" +
                        "}\n" +
                        "function t(f:Function<Any>[1]):Any[*]\n" +
                        "{\n" +
                        "     $f;\n" +
                        "}\n" +
                        "function go():Any[*]\n" +
                        "{\n" +
                        "     t(f_T_MANY__T_MANY_);\n" +
                        "}\n"
        );
    }

    @Test
    public void ensureInferenceIsResilientEnoughToHaveFunctionsProcessedDuringFunctionExpressionProcessing()
    {
        compileInferenceTest(
                "Class TabularDataSet{}\n" +
                        "function project<T>(set:T[*], paths:meta::pure::metamodel::path::Path<T,Any|*>[*]):TabularDataSet[1]{^TabularDataSet()}\n" +
                        "Class QueryFunctionPair extends Pair<meta::pure::metamodel::function::Function<Any>, meta::pure::metamodel::function::Function<{->String[1]}>>{}\n" +
                        "Class meta::pure::metamodel::path::Path<-U,V|m> extends Function<{U[1]->V[m]}>\n" +
                        "{\n" +
                        "}" +
                        "function f<T>(a:T[*]):T[*]\n" +
                        "{\n" +
                        "     $a;\n" +
                        "}\n" +
                        "function a(k:FunctionExpression[1]):Any[*]\n" +
                        "{\n" +
                        "   let dispatch = [\n" +
                        "             ^QueryFunctionPair(first = project_T_MANY__Path_MANY__TabularDataSet_1_, second = | p($k)),\n" +
                        "             ^QueryFunctionPair(first = f_T_MANY__T_MANY_, second = | p($k))\n" +
                        "        ]\n" +
                        "}\n" +
                        "function p(o:FunctionExpression[1]):String[1]\n" +
                        "{'l';}\n");
    }

    @Test
    public void inferTheTypeOfParametersOfACollectionOfLambdas()
    {
        compileInferenceTest(
                "Class Person{age:Integer[1];}\n" +
                        "function tt<T>(a:T[*],e:Function<{T[1]->Integer[1]}>[*]):Any[*]\n" +
                        "{\n" +
                        " 'aa';\n" +
                        "}\n" +
                        "function a(k:FunctionExpression[1]):Any[*]\n" +
                        "{\n" +
                        "   let f = tt([1,2,3],[f|$f+2, f|$f+4]);\n" +
                        "}\n");
        deleteInferenceTest();

        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "Class Person{age:Integer[1];}\n" +
                        "function tt<T>(a:T[*],e:Function<{T[1]->Integer[1]}>[*]):Any[*]\n" +
                        "{\n" +
                        " 'aa';\n" +
                        "}\n" +
                        "function a(k:FunctionExpression[1]):Any[*]\n" +
                        "{\n" +
                        "   let f = tt([1,2,3],[f|$f+'2', f|$f+4]);\n" +
                        "}\n"));
        assertPureException(PureCompilationException.class, PureUnmatchedFunctionException.FUNCTION_UNMATCHED_MESSAGE + "plus(_:Any[2])\n" +
                PureUnmatchedFunctionException.EMPTY_CANDIDATES_WITH_PACKAGE_IMPORTED_MESSAGE +
                PureUnmatchedFunctionException.NONEMPTY_CANDIDATES_WITH_PACKAGE_NOT_IMPORTED_MESSAGE +
                "\tmeta::pure::functions::math::plus(Decimal[*]):Decimal[1]\n" +
                "\tmeta::pure::functions::math::plus(Float[*]):Float[1]\n" +
                "\tmeta::pure::functions::math::plus(Integer[*]):Integer[1]\n" +
                "\tmeta::pure::functions::math::plus(Number[*]):Number[1]\n" +
                "\tmeta::pure::functions::string::plus(String[*]):String[1]\n", inferenceTestFileName, 8, 28, e);
    }

    @Test
    public void ensureProperFailureWhenTheLambdaWithACollectionHaveDifferentParametersCount()
    {
        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "Class Person{age:Integer[1];}\n" +
                        "function tt<T>(a:T[*],e:Function<Any>[*]):Any[*]\n" +
                        "{\n" +
                        " 'aa';\n" +
                        "}\n" +
                        "function a(k:FunctionExpression[1]):Any[*]\n" +
                        "{\n" +
                        "   let f = tt([1,2,3],[f|2, {f,k|4}]);\n" +
                        "}\n"));
        assertPureException(PureCompilationException.class, "Can't infer the parameters' types for the lambda. Please specify it in the signature.", inferenceTestFileName, 8, 24, e);
    }

    @Test
    public void testFunctionTypeForListOfAbstractProperties()
    {
        compileInferenceTest(
                "function test::propByName(name:String[1]):AbstractProperty<Any>[0..1]\n" +
                        "{\n" +
                        "  []\n" +
                        "}\n" +
                        "\n" +
                        "function test::testFn():Any[*]\n" +
                        "{\n" +
                        "  [test::propByName('name1')->toOne(),\n" +
                        "   test::propByName('name2')->toOne()]\n" +
                        "}");
        CoreInstance testFn = runtime.getFunction("test::testFn():Any[*]");
        Assert.assertNotNull(testFn);
        CoreInstance firstExpression = testFn.getValueForMetaPropertyToOne(M3Properties.expressionSequence);
        CoreInstance genericType = firstExpression.getValueForMetaPropertyToOne(M3Properties.genericType);
        Assert.assertEquals("meta::pure::metamodel::function::property::AbstractProperty<meta::pure::metamodel::type::Any>", GenericType.print(genericType, true, processorSupport));
    }

    @Test
    public void inferTheTypeOfParametersOfACollectionOfLambdasAndFunctions()
    {
        compileInferenceTest(
                "function tt<T>(a:T[*],e:Function<{T[1]->String[1]}>[*]):Any[*]\n" +
                        "{\n" +
                        " 'aa';\n" +
                        "}\n" +
                        "function a(e:Integer[1]):String[1]\n" +
                        "{\n" +
                        " 'ee';\n" +
                        "}\n" +
                        "function a(k:FunctionExpression[1]):Any[*]\n" +
                        "{\n" +
                        "   let f = tt([1,2,3],[z|let k = $z+2; $k->toString();, a_Integer_1__String_1_]);\n" +
                        "}\n");
        deleteInferenceTest();

        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "function tt<T>(a:T[*],e:Function<{T[1]->Integer[1]}>[*]):Any[*]\n" +
                        "{\n" +
                        " 'aa';\n" +
                        "}\n" +
                        "function a(e:Integer[1]):String[1]\n" +
                        "{\n" +
                        " 'ee';\n" +
                        "}\n" +
                        "function a(k:FunctionExpression[1]):Any[*]\n" +
                        "{\n" +
                        "   let f = tt([1,2,3],[f|$f+2, a_Integer_1__String_1_]);\n" +
                        "}\n"));
        assertPureException(PureCompilationException.class, PureUnmatchedFunctionException.FUNCTION_UNMATCHED_MESSAGE + "tt(_:Integer[3],_:FunctionDefinition<{Integer[1]->Any[1]}>[2])\n" +
                PureUnmatchedFunctionException.NONEMPTY_CANDIDATES_WITH_PACKAGE_IMPORTED_MESSAGE +
                "\ttt(T[*], Function<{T[1]->Integer[1]}>[*]):Any[*]\n" +
                PureUnmatchedFunctionException.EMPTY_CANDIDATES_WITH_PACKAGE_NOT_IMPORTED_MESSAGE, inferenceTestFileName, 11, 12, e);
    }

    @Test
    public void typeInferenceNested()
    {
        compileInferenceTest(
                "Class TypeInferenceTest\n" +
                        "{\n" +
                        "   name: String[1];\n" +
                        "   number: Integer[1];\n" +
                        "}\n" +
                        "\n" +
                        "function typInferenceTest():Any[*]\n" +
                        "{\n" +
                        "   let result2 = [^TypeInferenceTest(name='David',  number=23)];\n" +
                        "    $result2->A(b(c(p|$p.name)));\n" +
                        "}\n" +
                        "\n" +
                        "\n" +
                        "function A<T>(sets:T[*], b:BA<T>[1]): Any[*]\n" +
                        "{\n" +
                        "   print('resolved',1);   \n" +
                        "}\n" +
                        "\n" +
                        "function c<V>(f:Function<{V[1]->Any[1]}>[1]): CA<V>[1]\n" +
                        "{\n" +
                        "   ^CA<V>\n" +
                        "   (\n" +
                        "   )\n" +
                        "}\n" +
                        "\n" +
                        "function b<U>(c:CA<U>[1]): BA<U>[1]\n" +
                        "{\n" +
                        "   ^BA<U>\n" +
                        "   (\n" +
                        "      c=$c\n" +
                        "   )\n" +
                        "}\n" +
                        "\n" +
                        "Class BA<U>\n" +
                        "{\n" +
                        "   c: CA<U>[1];\n" +
                        "}\n" +
                        "\n" +
                        "Class CA<V>\n" +
                        "{\n" +
                        "}");
    }

    @Test
    public void testIfType()
    {
        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "function test():Any[*]\n" +
                        "{\n" +
                        "    let r = if(true,|'a',|1)->toOne();\n" +
                        "    $r + 2;\n" +
                        "}"));
        assertPureException(PureCompilationException.class, PureUnmatchedFunctionException.FUNCTION_UNMATCHED_MESSAGE + "plus(_:Any[2])\n" +
                PureUnmatchedFunctionException.EMPTY_CANDIDATES_WITH_PACKAGE_IMPORTED_MESSAGE +
                PureUnmatchedFunctionException.NONEMPTY_CANDIDATES_WITH_PACKAGE_NOT_IMPORTED_MESSAGE +
                "\tmeta::pure::functions::math::plus(Decimal[*]):Decimal[1]\n" +
                "\tmeta::pure::functions::math::plus(Float[*]):Float[1]\n" +
                "\tmeta::pure::functions::math::plus(Integer[*]):Integer[1]\n" +
                "\tmeta::pure::functions::math::plus(Number[*]):Number[1]\n" +
                "\tmeta::pure::functions::string::plus(String[*]):String[1]\n", inferenceTestFileName, 4, 8, e);
    }

    @Test
    public void testIfMul()
    {
        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "function a(a:Integer[1],b:Integer[1]):Integer[1]\n" +
                        "{\n" +
                        "    $a + $b;\n" +
                        "}\n" +
                        "function test():Any[*]\n" +
                        "{\n" +
                        "    let r = if(true,|[1,2],|1);\n" +
                        "    a($r, 2);\n" +
                        "}"));
        assertPureException(PureCompilationException.class, PureUnmatchedFunctionException.FUNCTION_UNMATCHED_MESSAGE + "a(_:Integer[1..2],_:Integer[1])\n" +
                PureUnmatchedFunctionException.NONEMPTY_CANDIDATES_WITH_PACKAGE_IMPORTED_MESSAGE +
                "\ta(Integer[1], Integer[1]):Integer[1]\n" +
                PureUnmatchedFunctionException.EMPTY_CANDIDATES_WITH_PACKAGE_NOT_IMPORTED_MESSAGE, inferenceTestFileName, 8, 5, e);
    }

    @Test
    public void inferTypeParameterUpAndDownWithNestedFunctionArrayDiffAgg()
    {
        compileInferenceTest(
                "Class meta::pure::functions::collection::AggregateValue<A,B,C>\n" +
                        "{\n" +
                        "   mapFn : FunctionDefinition<{A[1]->B[1]}>[1];\n" +
                        "   aggregateFn : FunctionDefinition<{B[*]->C[1]}>[1];\n" +
                        "}\n" +
                        "Class meta::pure::tds::TabularDataSet\n" +
                        "{\n" +
                        "}\n" +
                        "native function sum(s:Number[*]):Number[1];" +
                        "native function count(s:Any[*]):Integer[1];" +
                        "function meta::pure::functions::collection::agg<K,L,M>(mapFn:FunctionDefinition<{K[1]->L[1]}>[1], aggregateFn:FunctionDefinition<{L[*]->M[1]}>[1]):meta::pure::functions::collection::AggregateValue<K,L,M>[1]\n" +
                        "{\n" +
                        "   ^meta::pure::functions::collection::AggregateValue<K,L,M>(mapFn=$mapFn, aggregateFn=$aggregateFn);\n" +
                        "}\n" +
                        "function meta::pure::functions::collection::groupBy<T,V,U>(set:T[*], functions:meta::pure::metamodel::function::Function<{T[1]->Any[*]}>[*], aggValues:meta::pure::functions::collection::AggregateValue<T,V,U>[*], ids:String[*]):TabularDataSet[1]\n" +
                        "{\n" +
                        "   fail('Currently only supported in the SQL flow!');\n" +
                        "   ^TabularDataSet();\n" +
                        "}\n" +
                        "Class Trade\n" +
                        "{\n" +
                        "   tradeId : String[1];\n" +
                        "   quantity : Float[1];\n" +
                        "}\n" +
                        "\n" +
                        "function go():Any[*]\n" +
                        "{\n" +
                        "      Trade.all()\n" +
                        "         ->groupBy([f|$f.quantity],\n" +
                        "                  [\n" +
                        "                     meta::pure::functions::collection::agg(f|$f.tradeId, f|$f->count()),\n" +
                        "                     meta::pure::functions::collection::agg(x|$x.quantity, x|$x->sum())\n" +
                        "                  ],\n" +
                        "            ['region', 'total', 'count']);\n" +
                        "}");
    }

    @Test
    public void infersToOneEvaluation()
    {
        compileInferenceTest(
                "function test():Integer[1]\n" +
                        "{\n" +
                        "   toOne_T_MANY__T_1_->eval([1]);\n" +
                        "}\n");
    }

    @Test
    public void infersEvalFromFunctionReference()
    {
        compileInferenceTest(
                "Class Simple\n" +
                        "{\n" +
                        "}\n" +
                        "\n" +
                        "function test():Any[*]\n" +
                        "{\n" +
                        "   getAll_Class_1__T_MANY_->eval(Simple);\n" +
                        "}");
    }

    @Test
    public void infersEvalFromFunctionAsParameter()
    {
        compileInferenceTest(
                "Class Simple\n" +
                        "{\n" +
                        "}\n" +
                        "\n" +
                        "function test<T>(func:Function<{Class<T>[1]->T[*]}>[1]):Any[*]\n" +
                        "{\n" +
                        "   getAll_Class_1__T_MANY_->eval(Simple);\n" +
                        "}");
    }

    @Test
    public void testProperties()
    {
        compileInferenceTest(
                "Class A{p(s:String[1]){$s}:String[1];}\n" +
                        "native function meta::pure::functions::collection::sortBy<T,U|m>(col:T[m], key:Function<{T[1]->U[1]}>[0..1]):T[m];\n" +
                        "function filterToSimpleFunctionProperties(qualifiedProperties : QualifiedProperty<Any>[*]) : QualifiedProperty<Any>[*]\n" +
                        "{\n" +
                        "   $qualifiedProperties->filter(p|$p->functionType().parameters->size() == 1);\n" +
                        "}\n" +
                        "function test(c : Class<Any>[1], propertyFilterFunc : Function<{AbstractProperty<Any>[1]->Boolean[1]}>[1]):Any[*]\n" +
                        "{\n" +
                        "                                   let prop = $c.qualifiedProperties\n" +
                        "                                             ->concatenate($c.propertiesFromAssociations)\n" +
                        "                                             ->sortBy(p|$p.name->toOne());\n" +
                        "                                   $prop->map(p|$p.name);\n" +
                        "}\n");
    }

    @Test
    public void testTypePropagation()
    {
        compileInferenceTest("function f(a:Pair<String, String>[*]):String[*]{$a->filter(p|$p.first == 'name').second}");
    }

    @Test
    public void testMulPropagation()
    {
        compileInferenceTest(
                "Class Address{name:String[1];}\n" +
                        "function a():Boolean[1]\n" +
                        "{\n" +
                        "   let address = ^Address(name='Hoboken, NJ');\n" +
                        "   assert('Hoboken, NJ' == {a | $a.name}->eval($address), |'');\n" +
                        "}");
    }

    @Test
    public void testLambdaType()
    {
        compileInferenceTest(
                "Class Person{lastName:String[1];}\n" +
                        "function a():Boolean[1]\n" +
                        "{\n" +
                        "   let name = 'ee';\n" +
                        "   let lambda = {|Person.all()->filter(p|$p.lastName == $name)};\n" +
                        "   assert('name' == $lambda.openVariables, |'');\n" +
                        "}");
    }

    @Test
    public void testFunctionReturnType()
    {
        compileInferenceTest(
                "function countValues<T>(collection:T[*]):Pair<T,Integer>[*]\n" +
                        "{\n" +
                        "   $collection->map(v|^Pair<T, Integer>(first=$v, second=2))\n" +
                        "}");
        Assert.assertEquals("Pair<T, Integer>", GenericType.print(processorSupport.package_getByUserPath("countValues_T_MANY__Pair_MANY_").getValueForMetaPropertyToOne(M3Properties.expressionSequence).getValueForMetaPropertyToOne(M3Properties.genericType), processorSupport));
    }

    @Test
    public void testFunctionReturnTypeInfersNestedTypeVariablesFromLambdaFunctions()
    {
        compileInferenceTest(
                "Class MyClass<Z>{value:Z[1];}\n" +
                        "function funcToTest<T>(s:Function<{Any[1]->MyClass<T>[1]}>[1]):MyClass<T>[1]{$s->eval(1)}\n" +
                        "function newObject<T>(a:T[1]):MyClass<T>[1]{^MyClass<T>(value=$a)}\n" +
                        "function testSimple1():Any[*]{funcToTest(a|$a->toString()->newObject());}\n" +
                        "function testSimple2():Any[*]{funcToTest(a|$a->cast(@Integer)->newObject());}\n" +
                        "function testNested():Any[*]{funcToTest(a|$a->cast(@Integer)->newObject()->newObject());}\n");

        Function<String, String> resolvedParamName = (func) ->
        {
            CoreInstance ci = runtime.getCoreInstance(func);
            return GenericType.print(ci.getValueForMetaPropertyToMany("expressionSequence")
                    .getOnly()
                    .getValueForMetaPropertyToOne("resolvedTypeParameters"), runtime.getProcessorSupport());
        };

        Assert.assertEquals("String", resolvedParamName.apply("testSimple1__Any_MANY_"));
        Assert.assertEquals("Integer", resolvedParamName.apply("testSimple2__Any_MANY_"));
        Assert.assertEquals("MyClass<Integer>", resolvedParamName.apply("testNested__Any_MANY_"));

        deleteInferenceTest();
    }

    @Test
    public void testFunctionReturnTypeInfersDeepNestedTypeVariablesFromLambdaFunctions()
    {
        compileInferenceTest(
                "Class MyClass<Z>{value:Z[1];}\n" +
                        "function newObject<T>(a:T[1]):MyClass<T>[1]{^MyClass<T>(value=$a)}\n" +
                        "function funcToTest<T>(s:Function<{Any[1]->MyClass<MyClass<T>>[1]}>[1]):MyClass<MyClass<T>>[1]{$s->eval(1)}\n" +
                        "function testNested():Any[*]{funcToTest(a|$a->cast(@Integer)->newObject()->newObject());}\n");

        Function<String, String> resolvedParamName = (func) ->
        {
            CoreInstance ci = runtime.getCoreInstance(func);
            return GenericType.print(ci.getValueForMetaPropertyToMany("expressionSequence")
                    .getOnly()
                    .getValueForMetaPropertyToOne("resolvedTypeParameters"), runtime.getProcessorSupport());
        };

        Assert.assertEquals("Integer", resolvedParamName.apply("testNested__Any_MANY_"));

        deleteInferenceTest();
    }

    @Test
    public void testConflictingParameterTypes()
    {
        compileInferenceTest(
                "function funcT<T>(c:T[*], f:Function<{T[1]->Boolean[1]}>[1]):Pair<List<T>,List<T>>[1]\n" +
                        "{\n" +
                        "   $c->fold({i,a|if($f->eval($i),\n" +
                        "                    |let l = $a.first; ^$a(first=^$l(values+=$i));,\n" +
                        "                    |let l = $a.second;^$a(second=^$l(values+=$i));\n" +
                        "                 )\n" +
                        "            },\n" +
                        "            pair(^List<T>(), ^List<T>())\n" +
                        "   );   \n" +
                        "}\n");
        CoreInstance ci = runtime.getCoreInstance("funcT_T_MANY__Function_1__Pair_1_");
        CoreInstance expressionSeq = Instance.getValueForMetaPropertyToOneResolved(ci, M3Properties.expressionSequence, processorSupport);
        CoreInstance expSeqGT = Instance.getValueForMetaPropertyToOneResolved(expressionSeq, M3Properties.genericType, processorSupport);
        CoreInstance pairRT = Instance.getValueForMetaPropertyToOneResolved(expSeqGT, M3Properties.rawType, processorSupport);
        Assert.assertEquals(M3Paths.Pair, PackageableElement.getUserPathForPackageableElement(pairRT));
        ListIterable<? extends CoreInstance> pairTAs = Instance.getValueForMetaPropertyToManyResolved(expSeqGT, M3Properties.typeArguments, processorSupport);
        CoreInstance listRT = Instance.getValueForMetaPropertyToOneResolved(pairTAs.get(0), M3Properties.rawType, processorSupport);
        Assert.assertNotNull(listRT);
        CoreInstance listTA = Instance.getValueForMetaPropertyToOneResolved(pairTAs.get(0), M3Properties.typeArguments, processorSupport);
        CoreInstance listTypeParameter = Instance.getValueForMetaPropertyToOneResolved(listTA, M3Properties.typeParameter, processorSupport);
        Assert.assertNotNull(listTypeParameter);
        Assert.assertEquals("T", listTypeParameter.getValueForMetaPropertyToOne(M3Properties.name).getName());
    }

    @Test
    public void testLambdasInferForDecide()
    {
        compileInferenceTest(
                "Class DecisionRule<T,U|m,n>\n" +
                        "{\n" +
                        "   condition: Function<{T[m]->Boolean[1]}>[1];\n" +
                        "   action: Function<{T[m]->U[n]}>[1];\n" +
                        "}\n" +
                        "\n" +
                        "function rule<T, U|m,n>(condition:Function<{T[m]->Boolean[1]}>[1], action:Function<{T[m]->U[n]}>[1]):DecisionRule<T,U|m,n>[1]\n" +
                        "{\n" +
                        "     ^DecisionRule<T, U|m,n>(condition=$condition, action=$action);\n" +
                        "}\n" +
                        "\n" +
                        "function decide<T, U|m,n>(input:T[m], rules:DecisionRule<T,U|m,n>[*]):U[n]\n" +
                        "{\n" +
                        "     let matched = $rules->filter(r| $r.condition->eval($input));\n" +
                        "     assert($matched->size() > 0, 'Expected at least one match');\n" +
                        "     $matched->first()->toOne().action->eval($input);\n" +
                        "}\n" +
                        "\n" +
                        "function useDecide(s:String[1]):Integer[1]\n" +
                        "{\n" +
                        "   $s->decide([\n" +
                        "      rule(x|$x == 'Dave', x| 1),\n" +
                        "      rule(x|$x == 'Mark', x| 2)\n" +
                        "   ]);\n" +
                        "}\n");
    }

    @Test
    public void ensureReturnTypeIsCorrectlyInferredForComplexNew()
    {
        compileInferenceTest(
                "Class Container { values : Any[*]; }\n" +
                        "\n" +
                        "function test<T>(value:T[1], func:Function<{T[1]->Any[*]}>[1]):List<Container>[*]\n" +
                        "{\n" +
                        "   ^List<Container>(values = $func->eval($value)->map(v|^Container(values=$v)));\n" +
                        "}\n");
    }

    @Test
    public void ensureNoCrashWhenSameMultiplicityTemplateNameAsParent()
    {
        // Stop recurrence of bug where type inference using the same multiplicity letter (n is multiplicity for
        // test3 and eval) causes resolution to the wrong type.
        compileInferenceTest(
                "function test3<T,U|m,n>(a:T[m], f:Function<{T[m]->U[n]}>[1]):U[n]\n" +
                        "{\n" +
                        "   $f->eval($a);\n" +
                        "}");
    }

    @Test
    public void testMap()
    {
        compileInferenceTest(
                "Class Person\n" +
                        "{\n" +
                        " age:Integer[1];\n" +
                        "}\n" +
                        "\n" +
                        "function test<T>(f:T[1], func:Function<{T[1]->Person[*]}>[1]):Person[*]\n" +
                        "{\n" +
                        "   $f->map($func);\n" +
                        "}\n");
    }

    @Test
    public void testPair()
    {
        // Error should be Pair<String, Property<Nil, Any|*>>[*]

        compileInferenceTest(
                "Class Person\n" +
                        "{\n" +
                        " age:Integer[1];\n" +
                        "}\n" +
                        "Class Firm" +
                        "{" +
                        "legalName:String[1];" +
                        "}" +
                        "function test<T>(f:T[1], func:Function<{T[1]->Person[*]}>[1]):Pair<String, Property<Nil, Any|*>>[*]\n" +
                        "{\n" +
                        "   [Person, Firm].properties->map(x|pair('a',$x));\n" +
                        "}\n");
    }

    @Test
    public void testProperty()
    {
        compileInferenceTest(
                "Class Person\n" +
                        "{\n" +
                        " age:Integer[1];\n" +
                        "}\n" +
                        "Class Firm" +
                        "{" +
                        "legalName:String[1];" +
                        "}" +
                        "function test<T>(f:T[1], func:Function<{T[1]->Person[*]}>[1]):Pair<String, Property<Nil, Any|*>>[*]\n" +
                        "{\n" +
                        "   [Person, Firm].properties->map(x|pair('a',$x));\n" +
                        "}\n");
    }

    @Test
    public void testPropertyThroughFunction()
    {
        compileInferenceTest(
                "Class Person\n" +
                        "{\n" +
                        " age:Integer[1];\n" +
                        "}\n" +
                        "Class Firm" +
                        "{" +
                        "legalName:String[1];" +
                        "}" +
                        "function process(c:Class<Any>[*]):Pair<Class<Any>, Property<Nil,Any|*>>[*]\n" +
                        "{\n" +
                        "    $c->map(x|$x.properties->map(w|pair($x,$w)));\n" +
                        "}" +
                        "function test():Boolean[1]\n" +
                        "{\n" +
                        "   [Person, Firm]->process();" +
                        "   true;\n" +
                        "}\n");

    }

    @Test
    public void testNativeFuncWithTypeParams()
    {
        compileInferenceTest(
                "function orElse<T>(val:T[0..1], dft:T[1]):T[1]\n" +
                        "{\n" +
                        "  if($val->isEmpty(), |$dft, |$val->toOne())\n" +
                        "}\n" +
                        "\n" +
                        "native function meta::pure::functions::collection::newMapNative<U,V>(pairs:Pair<U,V>[*]):Map<U,V>[1];\n" +
                        "\n" +
                        "function meta::pure::functions::collection::newMapNonNative<U,V>(pairs:Pair<U,V>[*]):Map<U,V>[1]\n" +
                        "{\n" +
                        "  ^Map<U,V>()\n" +
                        "}\n" +
                        "\n" +
                        "function orElseEmptyMapWithNonNative(maybeMap:Map<String,String>[0..1]):Map<String,String>[1]\n" +
                        "{\n" +
                        "  $maybeMap->orElse([]->newMapNonNative())\n" +
                        "}\n" +
                        "\n" +
                        "function orElseEmptyMapWithNative(maybeMap:Map<String,String>[0..1]):Map<String,String>[1]\n" +
                        "{\n" +
                        "  $maybeMap->orElse([]->newMapNative())\n" +
                        "}\n");
    }

    @Test
    public void testEvalWithFuncAsAParam()
    {
        compileInferenceTest(
                        "function test<Z|y>(f:Function<{Function<{->Z[y]}>[1]->Z[y]}>[1]):Boolean[1]\n" +
                        "{\n" +
                        "   assertEqWithinTolerance(1.570796326794, $f->eval(|acos(0)), 0.000000000001);\n" +
                        "}");
    }

    @Test
    public void testIfReturningFunctions()
    {
        compileInferenceTest(
                "Class meta::core::runtime::Runtime\n" +
                        "{}\n" +
                        "Class meta::pure::mapping::Mapping\n" +
                        "{}\n" +
                        "function <<functionType.NotImplementedFunction>> meta::pure::mapping::from<T|m>(t:T[m], runtime:meta::core::runtime::Runtime[1]):T[m]\n" +
                        "{\n" +
                        "    $t\n" +
                        "}\n" +
                        "\n" +
                        "function <<functionType.NotImplementedFunction>> meta::pure::mapping::from<T|m>(t:T[m], m:meta::pure::mapping::Mapping[1], runtime:meta::core::runtime::Runtime[1]):T[m]\n" +
                        "{\n" +
                        "    $t\n" +
                        "}\n" +
                        "function <<functionType.NotImplementedFunction>> meta::pure::mapping::from<T|m>(t:T[m], m:meta::pure::mapping::Mapping[1]):T[m]\n" +
                        "{\n" +
                        "    $t\n" +
                        "}\n" +
                        "function x():Function<Any>[1]\n" +
                        "{\n" +
                        "  if(true,|meta::pure::mapping::from_T_m__Runtime_1__T_m_,|meta::pure::mapping::from_T_m__Mapping_1__Runtime_1__T_m_)\n" +
                        "}\n" +
                        "function z():Function<{Nil[*], Nil[1]->Any[*]}>[1]\n" +
                        "{\n" +
                        "  if(true,|meta::pure::mapping::from_T_m__Runtime_1__T_m_,|meta::pure::mapping::from_T_m__Mapping_1__T_m_)\n" +
                        "}\n" +
                        "function z2():Function<Any>[1]\n" +
                        "{\n" +
                        "  if(true,|getAllVersionsInRange_Class_1__Date_1__Date_1__T_MANY_,|getAll_Class_1__T_MANY_)\n" +
                        "}"
        );
    }

    @Test
    public void testIfError()
    {
        PureCompilationException e = Assert.assertThrows(PureCompilationException.class, () -> compileInferenceTest(
                "Class TDSNull{}\n" +
                        "function z::x<Z>(va:Function<{->Z[1]}>[1]):TDSNull[1]\n" +
                        "{\n" +
                        "  if(true,|^TDSNull(),|$va->eval());\n" +
                        "}\n"));
        // Current bug, but expected by some platform code... Need to eventually fix... found type should be Any, not Z
        Assert.assertEquals("Compilation error at (resource:inferenceTest.pure line:4 column:3), \"Return type error in function 'x'; found: Z; expected: TDSNull\"", e.getMessage());
    }

    @Test
    public void testIfWithDifferentConcreteTypes()
    {
        compileInferenceTest(
                "Class TestClass\n" +
                        "{\n" +
                        "}\n" +
                        "\n" +
                        "Class TestSubClass1 extends TestClass\n" +
                        "{\n" +
                        "}\n" +
                        "\n" +
                        "Class TestSubClass2 extends TestClass\n" +
                        "{\n" +
                        "}\n" +
                        "\n" +
                        "function testFn(b:Boolean[1]):Any[*]\n" +
                        "{\n" +
                        "  let intOrString = if($b, |1, |'string');\n" +
                        "  let stringOrInt = if($b, |'string', |-1);\n" +
                        "  let intOrFloat = if($b, |5, |6.0);\n" +
                        "  let floatOrInt = if($b, |5.0, |6);\n" +
                        "  let classOrNil = if($b, |^TestClass(), |[]);\n" +
                        "  let nilOrClass = if($b, |[], |^TestClass());\n" +
                        "  let classOrBoolean = if($b, |^TestClass(), |true);\n" +
                        "  let booleanOrClass = if($b, |false, |^TestClass());\n" +
                        "  let classOrSubClass1 = if($b, |^TestClass(), |^TestSubClass1());\n" +
                        "  let subClass1OrClass = if($b, |^TestSubClass1(), |^TestClass());\n" +
                        "  let subClass1OrSubClass2 = if($b, |^TestSubClass1(), |^TestSubClass2());\n" +
                        "  let subClass2OrSubClass1 = if($b, |^TestSubClass2(), |^TestSubClass1());\n" +
                        "}\n");
        ConcreteFunctionDefinition<?> function = (ConcreteFunctionDefinition<?>) runtime.getFunction("testFn_Boolean_1__Any_MANY_");
        Assert.assertNotNull(function);

        ListIterable<? extends ValueSpecification> expressions = ListHelper.wrapListIterable(function._expressionSequence());
        // if($b, |1, |'string')
        assertGenericTypeEquals(M3Paths.Any, expressions.get(0)._genericType());
        // if($b, |'string', |-1)
        assertGenericTypeEquals(M3Paths.Any, expressions.get(1)._genericType());
        // if($b, |5, |6.0)
        assertGenericTypeEquals(M3Paths.Number, expressions.get(2)._genericType());
        // if($b, |5.0, |6)
        assertGenericTypeEquals(M3Paths.Number, expressions.get(3)._genericType());
        // if($b, |^TestClass(), |[]])
        assertGenericTypeEquals("TestClass", expressions.get(4)._genericType());
        // if($b, |[], |^TestClass())
        assertGenericTypeEquals("TestClass", expressions.get(5)._genericType());
        // if($b, |^TestClass(), |true)
        assertGenericTypeEquals(M3Paths.Any, expressions.get(6)._genericType());
        // if($b, |false, |^TestClass())
        assertGenericTypeEquals(M3Paths.Any, expressions.get(7)._genericType());
        // if($b, |^TestClass(), |^TestSubClass1())
        assertGenericTypeEquals("TestClass", expressions.get(8)._genericType());
        // if($b, |^TestSubClass1(), |^TestClass())
        assertGenericTypeEquals("TestClass", expressions.get(9)._genericType());
        // if($b, |^TestSubClass1(), |^TestSubClass2())
        assertGenericTypeEquals("TestClass", expressions.get(10)._genericType());
        // if($b, |^TestSubClass2(), |^TestSubClass1())
        assertGenericTypeEquals("TestClass", expressions.get(11)._genericType());
    }

    @Test
    @ToFix
    public void testIfWithConcreteAndNonConcreteTypes()
    {
        compileInferenceTest(
                "Class TestClass\n" +
                        "{\n" +
                        "}\n" +
                        "\n" +
                        "function testFn<Z>(b:Boolean[1], z:Z[1], f:Function<{->Z[1]}>[1]):Any[*]\n" +
                        "{\n" +
                        "  let intOrZ = if($b, |0, |$z);\n" +
                        "  let zOrInt = if($b, |$z, |-10);\n" +
                        "  let classOrEvalToZ = if($b, |^TestClass(), |$f->eval());\n" +
                        "  let evalToZOrClass = if($b, |$f->eval(), |^TestClass());\n" +
                        "  let zOrNil = if($b, |$z, |[]);\n" +
                        "  let nilOrZ = if($b, |[], |$z);\n" +
                        "  let nilOrEvalToZ = if($b, |[], |$f->eval());\n" +
                        "  let evalToZOrNil = if($b, |$f->eval(), |[]);\n" +
                        "  let booleanOrZ = if($b, |true, |$z);\n" +
                        "  let zOrBoolean = if($b, |$z, |false);\n" +
                        "}\n");
        ConcreteFunctionDefinition<?> function = (ConcreteFunctionDefinition<?>) runtime.getFunction("testFn_Boolean_1__Z_1__Function_1__Any_MANY_");
        Assert.assertNotNull(function);

        ListIterable<? extends ValueSpecification> expressions = ListHelper.wrapListIterable(function._expressionSequence());
        // TODO Current bug: should be Any
//        assertGenericTypeEquals(M3Paths.Any, expressions.get(0)._genericType());
        assertGenericTypeEquals("Z", expressions.get(0)._genericType());
        // if($b, |$z, |-10)
        // TODO Current bug: should be Any
//        assertGenericTypeEquals(M3Paths.Any, expressions.get(1)._genericType());
        assertGenericTypeEquals("Z", expressions.get(1)._genericType());
        // if($b, |^TestClass(), |$f->eval())
        // TODO Current bug: should be Any
//        assertGenericTypeEquals(M3Paths.Any, expressions.get(2)._genericType());
        assertGenericTypeEquals("Z", expressions.get(2)._genericType());
        // if($b, |$f->eval(), |^TestClass())
        // TODO Current bug: should be Any
//        assertGenericTypeEquals(M3Paths.Any, expressions.get(3)._genericType());
        assertGenericTypeEquals("Z", expressions.get(3)._genericType());
        // if($b, |$z, |[])
        assertGenericTypeEquals("Z", expressions.get(4)._genericType());
        // if($b, |[], |$z)
        assertGenericTypeEquals("Z", expressions.get(5)._genericType());
        // if($b, |[], |$f->eval())
        assertGenericTypeEquals("Z", expressions.get(6)._genericType());
        // if($b, |$f->eval(), |[])
        assertGenericTypeEquals("Z", expressions.get(7)._genericType());
        // if($b, |true, |$z)
        // TODO Current bug: should be Any
//        assertGenericTypeEquals(M3Paths.Any, expressions.get(8)._genericType());
        assertGenericTypeEquals("Z", expressions.get(8)._genericType());
        // if($b, |$z, |false)
        // TODO Current bug: should be Any
//        assertGenericTypeEquals(M3Paths.Any, expressions.get(9)._genericType());
        assertGenericTypeEquals("Z", expressions.get(9)._genericType());
    }

    @Test
    public void testIfWithFuncTypes()
    {
        compileInferenceTest(
                "function testFn<|m>(col:Integer[m], func:Function<{Integer[1]->Number[1]}>[0..1]):Number[m]\n" +
                        "{\n" +
                        "  let toStringFunc = if($func->isEmpty(), |{x:Number[1] | 5}, |$func->toOne());\n" +
                        "  $col->map(x | $toStringFunc->eval($x));\n" +
                        "}\n");
        ConcreteFunctionDefinition<?> function = (ConcreteFunctionDefinition<?>) runtime.getFunction("testFn_Integer_m__Function_$0_1$__Number_m_");
        Assert.assertNotNull(function);

        FunctionType functionType = (FunctionType) function._classifierGenericType()._typeArguments().getOnly()._rawType();
        assertGenericTypeEquals("meta::pure::metamodel::function::Function<{Integer[1]->Number[1]}>", functionType._parameters().getLast()._genericType());

        ListIterable<? extends ValueSpecification> expressionSequence = function._expressionSequence().toList();
        SimpleFunctionExpression letExpr = (SimpleFunctionExpression) expressionSequence.get(0);
        SimpleFunctionExpression ifExpr = (SimpleFunctionExpression) letExpr._parametersValues().toList().getLast();
        ListIterable<? extends ValueSpecification> ifParams = ifExpr._parametersValues().toList();
        LambdaFunction<?> ifTrue = (LambdaFunction<?>) ((InstanceValue) ifParams.get(1))._values().getOnly();
        LambdaFunction<?> ifFalse = (LambdaFunction<?>) ((InstanceValue) ifParams.get(2))._values().getOnly();
        assertGenericTypeEquals("meta::pure::metamodel::function::LambdaFunction<{->meta::pure::metamodel::function::LambdaFunction<{Number[1]->Integer[1]}>[1]}>", ifTrue._classifierGenericType());
        assertGenericTypeEquals("meta::pure::metamodel::function::LambdaFunction<{->meta::pure::metamodel::function::Function<{Integer[1]->Number[1]}>[1]}>", ifFalse._classifierGenericType());
        assertGenericTypeEquals("meta::pure::metamodel::function::Function<{Integer[1]->Number[1]}>", ifExpr._genericType());
        assertGenericTypeEquals("meta::pure::metamodel::function::Function<{Integer[1]->Number[1]}>", letExpr._genericType());

        SimpleFunctionExpression mapExpr = (SimpleFunctionExpression) expressionSequence.get(1);
        LambdaFunction<?> mapFn = (LambdaFunction<?>) ((InstanceValue) mapExpr._parametersValues().toList().getLast())._values().getOnly();
        assertGenericTypeEquals("meta::pure::metamodel::function::LambdaFunction<{Integer[1]->Number[1]}>", mapFn._classifierGenericType());
    }

    @Test
    public void testIfWithFuncTypesAndTypeParams()
    {
        compileInferenceTest(
                "function testFn<T|m>(col:T[m], func:Function<{T[1]->String[1]}>[0..1]):String[m]\n" +
                        "{\n" +
                        "  let toStringFunc = if($func->isEmpty(), |{x:T[1] | $x->toString()}, |$func->toOne());\n" +
                        "  $col->map(x | $toStringFunc->eval($x));\n" +
                        "}\n");
        ConcreteFunctionDefinition<?> function = (ConcreteFunctionDefinition<?>) runtime.getFunction("testFn_T_m__Function_$0_1$__String_m_");
        Assert.assertNotNull(function);

        FunctionType functionType = (FunctionType) function._classifierGenericType()._typeArguments().getOnly()._rawType();
        assertGenericTypeEquals("meta::pure::metamodel::function::Function<{T[1]->String[1]}>", functionType._parameters().getLast()._genericType());

        ListIterable<? extends ValueSpecification> expressionSequence = function._expressionSequence().toList();
        SimpleFunctionExpression letExpr = (SimpleFunctionExpression) expressionSequence.get(0);
        SimpleFunctionExpression ifExpr = (SimpleFunctionExpression) letExpr._parametersValues().toList().getLast();
        ListIterable<? extends ValueSpecification> ifParams = ifExpr._parametersValues().toList();
        LambdaFunction<?> ifTrue = (LambdaFunction<?>) ((InstanceValue) ifParams.get(1))._values().getOnly();
        LambdaFunction<?> ifFalse = (LambdaFunction<?>) ((InstanceValue) ifParams.get(2))._values().getOnly();
        assertGenericTypeEquals("meta::pure::metamodel::function::LambdaFunction<{->meta::pure::metamodel::function::LambdaFunction<{T[1]->String[1]}>[1]}>", ifTrue._classifierGenericType());
        assertGenericTypeEquals("meta::pure::metamodel::function::LambdaFunction<{->meta::pure::metamodel::function::Function<{T[1]->String[1]}>[1]}>", ifFalse._classifierGenericType());
        assertGenericTypeEquals("meta::pure::metamodel::function::Function<{T[1]->String[1]}>", ifExpr._genericType());
        assertGenericTypeEquals("meta::pure::metamodel::function::Function<{T[1]->String[1]}>", letExpr._genericType());

        SimpleFunctionExpression mapExpr = (SimpleFunctionExpression) expressionSequence.get(1);
        LambdaFunction<?> mapFn = (LambdaFunction<?>) ((InstanceValue) mapExpr._parametersValues().toList().getLast())._values().getOnly();
        assertGenericTypeEquals("meta::pure::metamodel::function::LambdaFunction<{T[1]->String[1]}>", mapFn._classifierGenericType());
    }

    @Test
    public void testGeneralizationWithTypeArguments()
    {
        compileInferenceTest(
                "import test::*;\n" +
                        "\n" +
                        "Class test::IntStringPair extends Pair<Integer, String>\n" +
                        "{\n" +
                        "}\n" +
                        "\n" +
                        "function test::getValue<X,Y>(pairs:Pair<X,Y>[*], key:X[1]):Y[1]\n" +
                        "{\n" +
                        "   $pairs->find(p | $key == $p.first)->toOne().second\n" +
                        "}\n" +
                        "\n" +
                        "function test::process(key:Integer[1]):String[1]\n" +
                        "{\n" +
                        "  [\n" +
                        "   ^IntStringPair(first=1, second='the quick brown fox'),\n" +
                        "   ^IntStringPair(first=2, second='jumped over the'),\n" +
                        "   ^IntStringPair(first=3, second='lazy dog')\n" +
                        "  ]->getValue($key)\n" +
                        "}\n");
        ConcreteFunctionDefinition<?> processFn = (ConcreteFunctionDefinition<?>) runtime.getFunction("test::process(Integer[1]):String[1]");
        SimpleFunctionExpression getValueExpr = (SimpleFunctionExpression) processFn._expressionSequence().getOnly();
        assertGenericTypeEquals("String", getValueExpr._genericType());

        ListIterable<? extends ValueSpecification> getValueArgs = ListHelper.wrapListIterable(getValueExpr._parametersValues());
        Assert.assertEquals(2, getValueArgs.size());
        assertGenericTypeEquals("test::IntStringPair", getValueArgs.get(0)._genericType());
        assertGenericTypeEquals("Integer", getValueArgs.get(1)._genericType());

        ListIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> resolvedTypeParams = ListHelper.wrapListIterable(getValueExpr._resolvedTypeParameters());
        assertGenericTypeEquals("Integer", resolvedTypeParams.get(0));
        Assert.assertEquals(getValueExpr.getSourceInformation(), resolvedTypeParams.get(0).getSourceInformation());
        assertGenericTypeEquals("String", resolvedTypeParams.get(1));
        Assert.assertEquals(getValueExpr.getSourceInformation(), resolvedTypeParams.get(1).getSourceInformation());
    }

    @Test
    public void testChainedFilters()
    {
        compileInferenceTest(
                "function test():Profile[*]\n" +
                        "{\n" +
                        "  meta::pure::metamodel::extension::Profile.all()\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 1)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 2)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 3)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 4)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 5)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 6)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 7)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 8)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 9)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 10)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 11)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 12)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 13)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 14)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 15)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 16)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 17)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 18)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 19)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 20)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 21)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 22)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 23)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 24)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 25)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 26)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 27)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 28)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 29)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 30)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 31)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 32)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 33)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 34)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 35)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 36)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 37)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 38)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 39)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 40)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 41)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 42)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 43)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 44)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 45)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 46)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 47)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 48)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 49)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 50)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 51)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 52)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 53)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 54)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 55)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 56)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 57)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 58)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 59)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 60)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 61)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 62)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 63)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 64)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 65)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 66)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 67)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 68)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 69)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 70)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 71)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 72)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 73)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 74)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 75)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 76)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 77)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 78)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 79)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 80)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 81)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 82)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 83)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 84)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 85)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 86)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 87)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 88)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 89)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 90)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 91)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 92)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 93)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 94)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 95)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 96)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 97)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 98)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 99)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 100)\n" +
                        "}");
    }

    @Test
    public void testShortChainedMapsWithConcreteTypes()
    {
        compileInferenceTest(
                "function test(strings:String[*]):Integer[*]\n" +
                        "{\n" +
                        "  $strings->map(s | $s->length())\n" +
                        "          ->map(i | $i * 3.5)\n" +
                        "          ->map(f | $f > 256)\n" +
                        "          ->map(b | $b->toString())\n" +
                        "          ->map(s | $s->length())\n" +
                        "}\n"
        );
    }

    @Test
    public void testChainedMapsWithConcreteTypes()
    {
        compileInferenceTest(
                "function test(strings:String[*]):Integer[*]\n" +
                        "{\n" +
                        "  $strings->map(s | $s->length())\n" +
                        "          ->map(i | $i * 3.5)\n" +
                        "          ->map(f | $f > 256)\n" +
                        "          ->map(b | $b->toString())\n" +
                        "          ->map(s | $s->length())\n" +
                        "          ->map(i | $i * 32)\n" +
                        "          ->map(i | $i > 128)\n" +
                        "          ->map(b | if($b, |1, |0))\n" +
                        "          ->map(i | $i / 2.0)\n" +
                        "          ->map(f | $f->toString())\n" +
                        "          ->map(s | $s->length())\n" +
                        "}\n"
        );
    }

    @Test
    public void testShortChainedMapsWithTypeParams()
    {
        compileInferenceTest(
                "function test<A,B,C,D>(list:A[*], funcAB:Function<{A[1]->B[0..1]}>[1], funcBC:Function<{B[1]->C[1]}>[1], funcCD:Function<{C[1]->D[0..1]}>[1]):D[*]\n" +
                        "{\n" +
                        "  $list->map(a | $funcAB->eval($a))\n" +
                        "       ->map(b | $funcBC->eval($b))\n" +
                        "       ->map(c | $funcCD->eval($c))\n" +
                        "}\n"
        );
    }

    @Test
    public void testChainedMapsWithTypeParams()
    {
        compileInferenceTest(
                "function test<A,B,C,D,E,F,G,H,I,J,K,L,M,N>(" +
                        "            list:A[*],\n" +
                        "            funcAB:Function<{A[1]->B[0..1]}>[1],\n" +
                        "            funcBC:Function<{B[1]->C[1]}>[1],\n" +
                        "            funcCD:Function<{C[1]->D[0..1]}>[1],\n" +
                        "            funcDE:Function<{D[1]->E[1]}>[1],\n" +
                        "            funcEF:Function<{E[1]->F[0..1]}>[1],\n" +
                        "            funcFG:Function<{F[1]->G[1]}>[1],\n" +
                        "            funcGH:Function<{G[1]->H[0..1]}>[1],\n" +
                        "            funcHI:Function<{H[1]->I[1]}>[1],\n" +
                        "            funcIJ:Function<{I[1]->J[0..1]}>[1],\n" +
                        "            funcJK:Function<{J[1]->K[0..1]}>[1],\n" +
                        "            funcKL:Function<{K[1]->L[1]}>[1],\n" +
                        "            funcLM:Function<{L[1]->M[0..1]}>[1],\n" +
                        "            funcMN:Function<{M[1]->N[1]}>[1]\n" +
                        "            ):N[*]\n" +
                        "{\n" +
                        "  $list->map(a | $funcAB->eval($a))\n" +
                        "       ->map(b | $funcBC->eval($b))\n" +
                        "       ->map(c | $funcCD->eval($c))\n" +
                        "       ->map(d | $funcDE->eval($d))\n" +
                        "       ->map(e | $funcEF->eval($e))\n" +
                        "       ->map(f | $funcFG->eval($f))\n" +
                        "       ->map(g | $funcGH->eval($g))\n" +
                        "       ->map(h | $funcHI->eval($h))\n" +
                        "       ->map(i | $funcIJ->eval($i))\n" +
                        "       ->map(j | $funcJK->eval($j))\n" +
                        "       ->map(k | $funcKL->eval($k))\n" +
                        "       ->map(l | $funcLM->eval($l))\n" +
                        "       ->map(m | $funcMN->eval($m))\n" +
                        "}\n"
        );
    }

    @Test
    public void testMixedChain()
    {
        compileInferenceTest(
                "function test():Profile[*]\n" +
                        "{\n" +
                        "  meta::pure::metamodel::extension::Profile.all()\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 1)\n" +
                        "   ->map(p | $p.p_stereotypes)\n" +
                        "   ->filter(s | !$s.value->isEmpty())\n" +
                        "   ->map(s | $s.profile)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 2)\n" +
                        "   ->map(p | $p.p_stereotypes)\n" +
                        "   ->filter(s | !$s.value->isEmpty())\n" +
                        "   ->map(s | $s.profile)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 3)\n" +
                        "   ->map(p | $p.p_stereotypes)\n" +
                        "   ->filter(s | !$s.value->isEmpty())\n" +
                        "   ->map(s | $s.profile)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 4)\n" +
                        "   ->map(p | $p.p_stereotypes)\n" +
                        "   ->filter(s | !$s.value->isEmpty())\n" +
                        "   ->map(s | $s.profile)\n" +
                        "   ->filter(p | $p.p_stereotypes->size() > 5)\n" +
                        "   ->map(p | $p.p_stereotypes)\n" +
                        "   ->filter(s | !$s.value->isEmpty())\n" +
                        "   ->map(s | $s.profile)\n" +
                        "}");
    }

    @Test
    public void testShortChainWithParameterizedReturn()
    {
        compileInferenceTest(
                "function test<X, Y, Z>(list:X[*], funcXY:Function<{X[1]->Y[1]}>[1], predY:Function<{Y[1]->Boolean[1]}>[1], funcYZ:Function<{Y[1]->Z[0..1]}>[1], predZ:Function<{Z[1]->Boolean[1]}>[1]):Z[*]\n" +
                        "{\n" +
                        "  $list\n" +
                        "   ->map(c | $funcXY->eval($c))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->map(y | $funcYZ->eval($y))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "}");
    }

    @Test
    public void testChainWithParameterizedReturn()
    {
        compileInferenceTest(
                "function test<X, Y, Z>(classes:Class<X>[*], funcXY:Function<{Class<X>[1]->Y[1]}>[1], predY:Function<{Y[1]->Boolean[1]}>[1], funcYZ:Function<{Y[1]->Z[0..1]}>[1], predZ:Function<{Z[1]->Boolean[1]}>[1]):Z[*]\n" +
                        "{\n" +
                        "  $classes\n" +
                        "   ->filter(c | $c.properties->size() > 1)\n" +
                        "   ->filter(c | $c.properties->size() > 2)\n" +
                        "   ->filter(c | $c.properties->size() > 3)\n" +
                        "   ->filter(c | $c.properties->size() > 4)\n" +
                        "   ->filter(c | $c.properties->size() > 5)\n" +
                        "   ->filter(c | $c.properties->size() > 6)\n" +
                        "   ->filter(c | $c.properties->size() > 7)\n" +
                        "   ->filter(c | $c.properties->size() > 8)\n" +
                        "   ->filter(c | $c.properties->size() > 9)\n" +
                        "   ->filter(c | $c.properties->size() > 10)\n" +
                        "   ->map(c | $funcXY->eval($c))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->filter(y | $predY->eval($y))\n" +
                        "   ->map(y | $funcYZ->eval($y))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "   ->filter(z | $predZ->eval($z))\n" +
                        "}");
    }

    private void compileInferenceTest(String source)
    {
        compileTestSource(inferenceTestFileName, source);
    }

    private void deleteInferenceTest()
    {
        runtime.delete(inferenceTestFileName);
        runtime.compile();
    }

    private void assertGenericTypeEquals(String expected, org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType genericType)
    {
        String actual = GenericType.print(genericType, true, processorSupport);
        Assert.assertEquals(Optional.ofNullable(genericType.getSourceInformation()).map(SourceInformation::getMessage).orElse(null), expected, actual);
    }
}
