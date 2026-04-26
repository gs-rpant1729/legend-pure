// Generated from /Users/rohitpant/Projects/legend-pure/legend-pure-core/legend-pure-m3-core/src/main/antlr4/org/finos/legend/pure/m3/serialization/grammar/m3parser/antlr/core/M3CoreParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class M3CoreParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VALID_STRING=1, CLASS=2, FUNCTION=3, PROFILE=4, ASSOCIATION=5, ENUM=6, 
		MEASURE=7, STEREOTYPES=8, TAGS=9, IMPORT=10, LET=11, AGGREGATION_TYPE=12, 
		PATH_SEPARATOR=13, AS=14, ALL=15, PROJECTS=16, ENFORCEMENT_LEVEL=17, ENUMERATION_MAPPING=18, 
		STAR=19, END_LINE=20, EXTENDS=21, COMMA=22, GROUP_OPEN=23, GROUP_CLOSE=24, 
		PRIMITIVE=25, CURLY_BRACKET_OPEN=26, CURLY_BRACKET_CLOSE=27, COLON=28, 
		ARROW=29, MAPPING_SRC=30, MAPPING_FILTER=31, PLUS=32, BRACKET_OPEN=33, 
		BRACKET_CLOSE=34, STRING=35, LESSTHAN=36, GREATERTHAN=37, NATIVE=38, NEW_SYMBOL=39, 
		PIPE=40, FILE_NAME=41, INTEGER=42, FILE_NAME_END=43, AT=44, TILDE=45, 
		EQUAL=46, LATEST_DATE=47, DOT=48, PERCENT=49, TEST_EQUAL=50, TEST_NOT_EQUAL=51, 
		DOLLAR=52, ALL_VERSIONS=53, ALL_VERSIONS_IN_RANGE=54, DATE=55, CONSTRAINT_OWNER=56, 
		CONSTRAINT_EXTERNAL_ID=57, CONSTRAINT_FUNCTION=58, CONSTRAINT_ENFORCEMENT=59, 
		CONSTRAINT_MESSAGE=60, NOT=61, MINUS=62, FLOAT=63, DECIMAL=64, BOOLEAN=65, 
		STRICTTIME=66, DIVIDE=67, LESSTHANEQUAL=68, GREATERTHANEQUAL=69, AND=70, 
		OR=71, QUESTION=72, DOTDOT=73, SUBSET=74, DSL_TEXT=75, CAN_AGGREGATE=76, 
		GROUP_BY_FUNCTIONS=77, AGGREGATE_VALUES=78, MAP_FN=79, AGGREGATE_FN=80;
	public static final int
		RULE_identifier = 0, RULE_qualifiedName = 1, RULE_packagePath = 2, RULE_imports = 3, 
		RULE_import_statement = 4, RULE_definition = 5, RULE_classDefinition = 6, 
		RULE_typeVariableParameters = 7, RULE_primitiveDefinition = 8, RULE_measureDefinition = 9, 
		RULE_measureBody = 10, RULE_canonicalUnitExpr = 11, RULE_unitExpr = 12, 
		RULE_nonConvertibleUnitExpr = 13, RULE_unitConversionExpr = 14, RULE_mapping = 15, 
		RULE_mappingLine = 16, RULE_sourceAndTargetMappingId = 17, RULE_sourceId = 18, 
		RULE_targetId = 19, RULE_classBody = 20, RULE_properties = 21, RULE_propertyName = 22, 
		RULE_property = 23, RULE_qualifiedProperty = 24, RULE_qualifiedPropertyBody = 25, 
		RULE_association = 26, RULE_associationBody = 27, RULE_associationProjection = 28, 
		RULE_enumDefinition = 29, RULE_enumValue = 30, RULE_nativeFunction = 31, 
		RULE_functionTypeSignature = 32, RULE_functionDefinition = 33, RULE_functionDescriptor = 34, 
		RULE_nonArrowOrEqualExpression = 35, RULE_expression = 36, RULE_instanceBlock = 37, 
		RULE_instance = 38, RULE_unitInstance = 39, RULE_unitName = 40, RULE_instancePropertyAssignment = 41, 
		RULE_instanceRightSide = 42, RULE_instanceAtomicRightSideScalar = 43, 
		RULE_instanceAtomicRightSideVector = 44, RULE_instanceAtomicRightSide = 45, 
		RULE_enumReference = 46, RULE_stereotypeReference = 47, RULE_tagReference = 48, 
		RULE_propertyReturnType = 49, RULE_stereotypes = 50, RULE_stereotype = 51, 
		RULE_taggedValues = 52, RULE_taggedValue = 53, RULE_defaultValue = 54, 
		RULE_defaultValueExpression = 55, RULE_defaultValueExpressionsArray = 56, 
		RULE_profile = 57, RULE_stereotypeDefinitions = 58, RULE_tagDefinitions = 59, 
		RULE_codeBlock = 60, RULE_programLine = 61, RULE_equalNotEqual = 62, RULE_combinedArithmeticOnly = 63, 
		RULE_expressionPart = 64, RULE_letExpression = 65, RULE_combinedExpression = 66, 
		RULE_expressionOrExpressionGroup = 67, RULE_expressionsArray = 68, RULE_propertyOrFunctionExpression = 69, 
		RULE_propertyExpression = 70, RULE_functionExpression = 71, RULE_functionExpressionLatestMilestoningDateParameter = 72, 
		RULE_functionExpressionParameters = 73, RULE_atomicExpression = 74, RULE_columnBuilders = 75, 
		RULE_oneColSpec = 76, RULE_extraFunction = 77, RULE_instanceReference = 78, 
		RULE_anyLambda = 79, RULE_lambdaFunction = 80, RULE_variable = 81, RULE_allOrFunction = 82, 
		RULE_allFunction = 83, RULE_allVersionsFunction = 84, RULE_allVersionsInRangeFunction = 85, 
		RULE_allFunctionWithMilestoning = 86, RULE_buildMilestoningVariableExpression = 87, 
		RULE_expressionInstance = 88, RULE_expressionInstanceRightSide = 89, RULE_expressionInstanceAtomicRightSide = 90, 
		RULE_expressionInstanceParserPropertyAssignment = 91, RULE_sliceExpression = 92, 
		RULE_constraints = 93, RULE_constraint = 94, RULE_simpleConstraint = 95, 
		RULE_complexConstraint = 96, RULE_constraintOwner = 97, RULE_constraintExternalId = 98, 
		RULE_constraintFunction = 99, RULE_constraintEnforcementLevel = 100, RULE_constraintMessage = 101, 
		RULE_constraintId = 102, RULE_notExpression = 103, RULE_signedExpression = 104, 
		RULE_lambdaPipe = 105, RULE_lambdaParam = 106, RULE_lambdaParamType = 107, 
		RULE_instanceLiteral = 108, RULE_instanceLiteralToken = 109, RULE_unitInstanceLiteral = 110, 
		RULE_arithmeticPart = 111, RULE_booleanPart = 112, RULE_functionVariableExpression = 113, 
		RULE_type = 114, RULE_typeVariableValues = 115, RULE_columnType = 116, 
		RULE_mayColumnName = 117, RULE_mayColumnType = 118, RULE_columnName = 119, 
		RULE_multiplicity = 120, RULE_fromMultiplicity = 121, RULE_toMultiplicity = 122, 
		RULE_projection = 123, RULE_functionTypePureType = 124, RULE_typeAndMultiplicityParameters = 125, 
		RULE_typeParametersWithContravarianceAndMultiplicityParameters = 126, 
		RULE_typeParameters = 127, RULE_typeParameter = 128, RULE_contravarianceTypeParameters = 129, 
		RULE_contravarianceTypeParameter = 130, RULE_multiplicityArguments = 131, 
		RULE_multiplicityArgument = 132, RULE_typeArguments = 133, RULE_typeWithOperation = 134, 
		RULE_typeAddSubOperation = 135, RULE_addType = 136, RULE_subType = 137, 
		RULE_subsetType = 138, RULE_equalType = 139, RULE_multiplictyParameters = 140, 
		RULE_dsl = 141, RULE_aggregation = 142, RULE_aggregateSpecification = 143, 
		RULE_groupByFunctionSpecifications = 144, RULE_groupByFunctionSpecification = 145, 
		RULE_aggregationFunctionSpecifications = 146, RULE_aggregationFunctionSpecification = 147, 
		RULE_treePath = 148, RULE_treePathClassBody = 149, RULE_alias = 150, RULE_simplePropertyFilter = 151, 
		RULE_simpleProperty = 152, RULE_complexProperty = 153, RULE_derivedProperty = 154, 
		RULE_propertyRef = 155, RULE_treePathPropertyParameterType = 156;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "qualifiedName", "packagePath", "imports", "import_statement", 
			"definition", "classDefinition", "typeVariableParameters", "primitiveDefinition", 
			"measureDefinition", "measureBody", "canonicalUnitExpr", "unitExpr", 
			"nonConvertibleUnitExpr", "unitConversionExpr", "mapping", "mappingLine", 
			"sourceAndTargetMappingId", "sourceId", "targetId", "classBody", "properties", 
			"propertyName", "property", "qualifiedProperty", "qualifiedPropertyBody", 
			"association", "associationBody", "associationProjection", "enumDefinition", 
			"enumValue", "nativeFunction", "functionTypeSignature", "functionDefinition", 
			"functionDescriptor", "nonArrowOrEqualExpression", "expression", "instanceBlock", 
			"instance", "unitInstance", "unitName", "instancePropertyAssignment", 
			"instanceRightSide", "instanceAtomicRightSideScalar", "instanceAtomicRightSideVector", 
			"instanceAtomicRightSide", "enumReference", "stereotypeReference", "tagReference", 
			"propertyReturnType", "stereotypes", "stereotype", "taggedValues", "taggedValue", 
			"defaultValue", "defaultValueExpression", "defaultValueExpressionsArray", 
			"profile", "stereotypeDefinitions", "tagDefinitions", "codeBlock", "programLine", 
			"equalNotEqual", "combinedArithmeticOnly", "expressionPart", "letExpression", 
			"combinedExpression", "expressionOrExpressionGroup", "expressionsArray", 
			"propertyOrFunctionExpression", "propertyExpression", "functionExpression", 
			"functionExpressionLatestMilestoningDateParameter", "functionExpressionParameters", 
			"atomicExpression", "columnBuilders", "oneColSpec", "extraFunction", 
			"instanceReference", "anyLambda", "lambdaFunction", "variable", "allOrFunction", 
			"allFunction", "allVersionsFunction", "allVersionsInRangeFunction", "allFunctionWithMilestoning", 
			"buildMilestoningVariableExpression", "expressionInstance", "expressionInstanceRightSide", 
			"expressionInstanceAtomicRightSide", "expressionInstanceParserPropertyAssignment", 
			"sliceExpression", "constraints", "constraint", "simpleConstraint", "complexConstraint", 
			"constraintOwner", "constraintExternalId", "constraintFunction", "constraintEnforcementLevel", 
			"constraintMessage", "constraintId", "notExpression", "signedExpression", 
			"lambdaPipe", "lambdaParam", "lambdaParamType", "instanceLiteral", "instanceLiteralToken", 
			"unitInstanceLiteral", "arithmeticPart", "booleanPart", "functionVariableExpression", 
			"type", "typeVariableValues", "columnType", "mayColumnName", "mayColumnType", 
			"columnName", "multiplicity", "fromMultiplicity", "toMultiplicity", "projection", 
			"functionTypePureType", "typeAndMultiplicityParameters", "typeParametersWithContravarianceAndMultiplicityParameters", 
			"typeParameters", "typeParameter", "contravarianceTypeParameters", "contravarianceTypeParameter", 
			"multiplicityArguments", "multiplicityArgument", "typeArguments", "typeWithOperation", 
			"typeAddSubOperation", "addType", "subType", "subsetType", "equalType", 
			"multiplictyParameters", "dsl", "aggregation", "aggregateSpecification", 
			"groupByFunctionSpecifications", "groupByFunctionSpecification", "aggregationFunctionSpecifications", 
			"aggregationFunctionSpecification", "treePath", "treePathClassBody", 
			"alias", "simplePropertyFilter", "simpleProperty", "complexProperty", 
			"derivedProperty", "propertyRef", "treePathPropertyParameterType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VALID_STRING", "CLASS", "FUNCTION", "PROFILE", "ASSOCIATION", 
			"ENUM", "MEASURE", "STEREOTYPES", "TAGS", "IMPORT", "LET", "AGGREGATION_TYPE", 
			"PATH_SEPARATOR", "AS", "ALL", "PROJECTS", "ENFORCEMENT_LEVEL", "ENUMERATION_MAPPING", 
			"STAR", "END_LINE", "EXTENDS", "COMMA", "GROUP_OPEN", "GROUP_CLOSE", 
			"PRIMITIVE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "COLON", "ARROW", 
			"MAPPING_SRC", "MAPPING_FILTER", "PLUS", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"STRING", "LESSTHAN", "GREATERTHAN", "NATIVE", "NEW_SYMBOL", "PIPE", 
			"FILE_NAME", "INTEGER", "FILE_NAME_END", "AT", "TILDE", "EQUAL", "LATEST_DATE", 
			"DOT", "PERCENT", "TEST_EQUAL", "TEST_NOT_EQUAL", "DOLLAR", "ALL_VERSIONS", 
			"ALL_VERSIONS_IN_RANGE", "DATE", "CONSTRAINT_OWNER", "CONSTRAINT_EXTERNAL_ID", 
			"CONSTRAINT_FUNCTION", "CONSTRAINT_ENFORCEMENT", "CONSTRAINT_MESSAGE", 
			"NOT", "MINUS", "FLOAT", "DECIMAL", "BOOLEAN", "STRICTTIME", "DIVIDE", 
			"LESSTHANEQUAL", "GREATERTHANEQUAL", "AND", "OR", "QUESTION", "DOTDOT", 
			"SUBSET", "DSL_TEXT", "CAN_AGGREGATE", "GROUP_BY_FUNCTIONS", "AGGREGATE_VALUES", 
			"MAP_FN", "AGGREGATE_FN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "M3CoreParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public M3CoreParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode VALID_STRING() { return getToken(M3CoreParser.VALID_STRING, 0); }
		public TerminalNode CLASS() { return getToken(M3CoreParser.CLASS, 0); }
		public TerminalNode FUNCTION() { return getToken(M3CoreParser.FUNCTION, 0); }
		public TerminalNode PROFILE() { return getToken(M3CoreParser.PROFILE, 0); }
		public TerminalNode ASSOCIATION() { return getToken(M3CoreParser.ASSOCIATION, 0); }
		public TerminalNode ENUM() { return getToken(M3CoreParser.ENUM, 0); }
		public TerminalNode MEASURE() { return getToken(M3CoreParser.MEASURE, 0); }
		public TerminalNode STEREOTYPES() { return getToken(M3CoreParser.STEREOTYPES, 0); }
		public TerminalNode TAGS() { return getToken(M3CoreParser.TAGS, 0); }
		public TerminalNode IMPORT() { return getToken(M3CoreParser.IMPORT, 0); }
		public TerminalNode LET() { return getToken(M3CoreParser.LET, 0); }
		public TerminalNode AGGREGATION_TYPE() { return getToken(M3CoreParser.AGGREGATION_TYPE, 0); }
		public TerminalNode PATH_SEPARATOR() { return getToken(M3CoreParser.PATH_SEPARATOR, 0); }
		public TerminalNode AS() { return getToken(M3CoreParser.AS, 0); }
		public TerminalNode ALL() { return getToken(M3CoreParser.ALL, 0); }
		public TerminalNode PROJECTS() { return getToken(M3CoreParser.PROJECTS, 0); }
		public TerminalNode ENFORCEMENT_LEVEL() { return getToken(M3CoreParser.ENFORCEMENT_LEVEL, 0); }
		public TerminalNode ENUMERATION_MAPPING() { return getToken(M3CoreParser.ENUMERATION_MAPPING, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackagePathContext packagePath() {
			return getRuleContext(PackagePathContext.class,0);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(316);
				packagePath();
				}
				break;
			}
			setState(319);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackagePathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> PATH_SEPARATOR() { return getTokens(M3CoreParser.PATH_SEPARATOR); }
		public TerminalNode PATH_SEPARATOR(int i) {
			return getToken(M3CoreParser.PATH_SEPARATOR, i);
		}
		public PackagePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterPackagePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitPackagePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitPackagePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackagePathContext packagePath() throws RecognitionException {
		PackagePathContext _localctx = new PackagePathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packagePath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(321);
					identifier();
					setState(322);
					match(PATH_SEPARATOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(328);
				import_statement();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(M3CoreParser.IMPORT, 0); }
		public PackagePathContext packagePath() {
			return getRuleContext(PackagePathContext.class,0);
		}
		public TerminalNode STAR() { return getToken(M3CoreParser.STAR, 0); }
		public TerminalNode END_LINE() { return getToken(M3CoreParser.END_LINE, 0); }
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(IMPORT);
			setState(335);
			packagePath();
			setState(336);
			match(STAR);
			setState(337);
			match(END_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(M3CoreParser.EOF, 0); }
		public List<ProfileContext> profile() {
			return getRuleContexts(ProfileContext.class);
		}
		public ProfileContext profile(int i) {
			return getRuleContext(ProfileContext.class,i);
		}
		public List<ClassDefinitionContext> classDefinition() {
			return getRuleContexts(ClassDefinitionContext.class);
		}
		public ClassDefinitionContext classDefinition(int i) {
			return getRuleContext(ClassDefinitionContext.class,i);
		}
		public List<PrimitiveDefinitionContext> primitiveDefinition() {
			return getRuleContexts(PrimitiveDefinitionContext.class);
		}
		public PrimitiveDefinitionContext primitiveDefinition(int i) {
			return getRuleContext(PrimitiveDefinitionContext.class,i);
		}
		public List<AssociationContext> association() {
			return getRuleContexts(AssociationContext.class);
		}
		public AssociationContext association(int i) {
			return getRuleContext(AssociationContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<NativeFunctionContext> nativeFunction() {
			return getRuleContexts(NativeFunctionContext.class);
		}
		public NativeFunctionContext nativeFunction(int i) {
			return getRuleContext(NativeFunctionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<InstanceContext> instance() {
			return getRuleContexts(InstanceContext.class);
		}
		public InstanceContext instance(int i) {
			return getRuleContext(InstanceContext.class,i);
		}
		public List<MeasureDefinitionContext> measureDefinition() {
			return getRuleContexts(MeasureDefinitionContext.class);
		}
		public MeasureDefinitionContext measureDefinition(int i) {
			return getRuleContext(MeasureDefinitionContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			imports();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824667275516L) != 0)) {
				{
				setState(349);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROFILE:
					{
					setState(340);
					profile();
					}
					break;
				case CLASS:
					{
					setState(341);
					classDefinition();
					}
					break;
				case PRIMITIVE:
					{
					setState(342);
					primitiveDefinition();
					}
					break;
				case ASSOCIATION:
					{
					setState(343);
					association();
					}
					break;
				case ENUM:
					{
					setState(344);
					enumDefinition();
					}
					break;
				case NATIVE:
					{
					setState(345);
					nativeFunction();
					}
					break;
				case FUNCTION:
					{
					setState(346);
					functionDefinition();
					}
					break;
				case NEW_SYMBOL:
					{
					setState(347);
					instance();
					}
					break;
				case MEASURE:
					{
					setState(348);
					measureDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(M3CoreParser.CLASS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public TypeVariableParametersContext typeVariableParameters() {
			return getRuleContext(TypeVariableParametersContext.class,0);
		}
		public TypeParametersWithContravarianceAndMultiplicityParametersContext typeParametersWithContravarianceAndMultiplicityParameters() {
			return getRuleContext(TypeParametersWithContravarianceAndMultiplicityParametersContext.class,0);
		}
		public TerminalNode PROJECTS() { return getToken(M3CoreParser.PROJECTS, 0); }
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(M3CoreParser.EXTENDS, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(CLASS);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(357);
				stereotypes();
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(360);
				taggedValues();
				}
			}

			setState(363);
			qualifiedName();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_OPEN) {
				{
				setState(364);
				typeVariableParameters();
				}
			}

			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(367);
				typeParametersWithContravarianceAndMultiplicityParameters();
				}
			}

			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROJECTS:
				{
				{
				setState(370);
				match(PROJECTS);
				setState(371);
				projection();
				}
				}
				break;
			case EXTENDS:
			case CURLY_BRACKET_OPEN:
			case BRACKET_OPEN:
				{
				{
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(372);
					match(EXTENDS);
					setState(373);
					type();
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(374);
						match(COMMA);
						setState(375);
						type();
						}
						}
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BRACKET_OPEN) {
					{
					setState(383);
					constraints();
					}
				}

				setState(386);
				classBody();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeVariableParametersContext extends ParserRuleContext {
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public List<FunctionVariableExpressionContext> functionVariableExpression() {
			return getRuleContexts(FunctionVariableExpressionContext.class);
		}
		public FunctionVariableExpressionContext functionVariableExpression(int i) {
			return getRuleContext(FunctionVariableExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TypeVariableParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTypeVariableParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTypeVariableParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTypeVariableParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableParametersContext typeVariableParameters() throws RecognitionException {
		TypeVariableParametersContext _localctx = new TypeVariableParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeVariableParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(GROUP_OPEN);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) {
				{
				setState(390);
				functionVariableExpression();
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(391);
					match(COMMA);
					setState(392);
					functionVariableExpression();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(400);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveDefinitionContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE() { return getToken(M3CoreParser.PRIMITIVE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(M3CoreParser.EXTENDS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public TypeVariableParametersContext typeVariableParameters() {
			return getRuleContext(TypeVariableParametersContext.class,0);
		}
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public PrimitiveDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterPrimitiveDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitPrimitiveDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitPrimitiveDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDefinitionContext primitiveDefinition() throws RecognitionException {
		PrimitiveDefinitionContext _localctx = new PrimitiveDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitiveDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(PRIMITIVE);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(403);
				stereotypes();
				}
			}

			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(406);
				taggedValues();
				}
			}

			setState(409);
			qualifiedName();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_OPEN) {
				{
				setState(410);
				typeVariableParameters();
				}
			}

			setState(413);
			match(EXTENDS);
			setState(414);
			type();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACKET_OPEN) {
				{
				setState(415);
				constraints();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MeasureDefinitionContext extends ParserRuleContext {
		public TerminalNode MEASURE() { return getToken(M3CoreParser.MEASURE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public MeasureBodyContext measureBody() {
			return getRuleContext(MeasureBodyContext.class,0);
		}
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public MeasureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMeasureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMeasureDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMeasureDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureDefinitionContext measureDefinition() throws RecognitionException {
		MeasureDefinitionContext _localctx = new MeasureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_measureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(MEASURE);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(419);
				stereotypes();
				}
			}

			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(422);
				taggedValues();
				}
			}

			setState(425);
			qualifiedName();
			setState(426);
			measureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MeasureBodyContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public CanonicalUnitExprContext canonicalUnitExpr() {
			return getRuleContext(CanonicalUnitExprContext.class,0);
		}
		public List<NonConvertibleUnitExprContext> nonConvertibleUnitExpr() {
			return getRuleContexts(NonConvertibleUnitExprContext.class);
		}
		public NonConvertibleUnitExprContext nonConvertibleUnitExpr(int i) {
			return getRuleContext(NonConvertibleUnitExprContext.class,i);
		}
		public List<UnitExprContext> unitExpr() {
			return getRuleContexts(UnitExprContext.class);
		}
		public UnitExprContext unitExpr(int i) {
			return getRuleContext(UnitExprContext.class,i);
		}
		public MeasureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMeasureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMeasureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMeasureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureBodyContext measureBody() throws RecognitionException {
		MeasureBodyContext _localctx = new MeasureBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_measureBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(CURLY_BRACKET_OPEN);
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) {
					{
					{
					setState(429);
					unitExpr();
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(435);
				canonicalUnitExpr();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) {
					{
					{
					setState(436);
					unitExpr();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(442);
					nonConvertibleUnitExpr();
					}
					}
					setState(445); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0) );
				}
				break;
			}
			setState(449);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CanonicalUnitExprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(M3CoreParser.STAR, 0); }
		public UnitExprContext unitExpr() {
			return getRuleContext(UnitExprContext.class,0);
		}
		public CanonicalUnitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canonicalUnitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterCanonicalUnitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitCanonicalUnitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitCanonicalUnitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanonicalUnitExprContext canonicalUnitExpr() throws RecognitionException {
		CanonicalUnitExprContext _localctx = new CanonicalUnitExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_canonicalUnitExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(STAR);
			setState(452);
			unitExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public UnitConversionExprContext unitConversionExpr() {
			return getRuleContext(UnitConversionExprContext.class,0);
		}
		public UnitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterUnitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitUnitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitUnitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitExprContext unitExpr() throws RecognitionException {
		UnitExprContext _localctx = new UnitExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unitExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			identifier();
			setState(455);
			match(COLON);
			setState(456);
			unitConversionExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonConvertibleUnitExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(M3CoreParser.END_LINE, 0); }
		public NonConvertibleUnitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonConvertibleUnitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterNonConvertibleUnitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitNonConvertibleUnitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitNonConvertibleUnitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonConvertibleUnitExprContext nonConvertibleUnitExpr() throws RecognitionException {
		NonConvertibleUnitExprContext _localctx = new NonConvertibleUnitExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nonConvertibleUnitExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			identifier();
			setState(459);
			match(END_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitConversionExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(M3CoreParser.ARROW, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public UnitConversionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitConversionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterUnitConversionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitUnitConversionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitUnitConversionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitConversionExprContext unitConversionExpr() throws RecognitionException {
		UnitConversionExprContext _localctx = new UnitConversionExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unitConversionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			identifier();
			setState(462);
			match(ARROW);
			setState(463);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MappingContext extends ParserRuleContext {
		public List<MappingLineContext> mappingLine() {
			return getRuleContexts(MappingLineContext.class);
		}
		public MappingLineContext mappingLine(int i) {
			return getRuleContext(MappingLineContext.class,i);
		}
		public TerminalNode MAPPING_SRC() { return getToken(M3CoreParser.MAPPING_SRC, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode MAPPING_FILTER() { return getToken(M3CoreParser.MAPPING_FILTER, 0); }
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAPPING_SRC) {
				{
				setState(465);
				match(MAPPING_SRC);
				setState(466);
				qualifiedName();
				}
			}

			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAPPING_FILTER) {
				{
				setState(469);
				match(MAPPING_FILTER);
				setState(470);
				combinedExpression();
				}
			}

			setState(473);
			mappingLine();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(474);
				match(COMMA);
				setState(475);
				mappingLine();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MappingLineContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(M3CoreParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(M3CoreParser.COLON, i);
		}
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(M3CoreParser.STAR, 0); }
		public TerminalNode ENUMERATION_MAPPING() { return getToken(M3CoreParser.ENUMERATION_MAPPING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(M3CoreParser.PLUS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public SourceAndTargetMappingIdContext sourceAndTargetMappingId() {
			return getRuleContext(SourceAndTargetMappingIdContext.class,0);
		}
		public MappingLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMappingLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMappingLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMappingLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingLineContext mappingLine() throws RecognitionException {
		MappingLineContext _localctx = new MappingLineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mappingLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				{
				{
				setState(481);
				match(PLUS);
				setState(482);
				qualifiedName();
				setState(483);
				match(COLON);
				setState(484);
				type();
				setState(485);
				multiplicity();
				}
				}
				break;
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
				{
				setState(487);
				qualifiedName();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BRACKET_OPEN) {
					{
					setState(488);
					sourceAndTargetMappingId();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(493);
				match(STAR);
				}
			}

			setState(496);
			match(COLON);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(497);
				match(ENUMERATION_MAPPING);
				setState(498);
				identifier();
				setState(499);
				match(COLON);
				}
				break;
			}
			setState(503);
			combinedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceAndTargetMappingIdContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public SourceIdContext sourceId() {
			return getRuleContext(SourceIdContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(M3CoreParser.COMMA, 0); }
		public TargetIdContext targetId() {
			return getRuleContext(TargetIdContext.class,0);
		}
		public SourceAndTargetMappingIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAndTargetMappingId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterSourceAndTargetMappingId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitSourceAndTargetMappingId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitSourceAndTargetMappingId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceAndTargetMappingIdContext sourceAndTargetMappingId() throws RecognitionException {
		SourceAndTargetMappingIdContext _localctx = new SourceAndTargetMappingIdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sourceAndTargetMappingId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(BRACKET_OPEN);
			setState(506);
			sourceId();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(507);
				match(COMMA);
				setState(508);
				targetId();
				}
			}

			setState(511);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceIdContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SourceIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterSourceId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitSourceId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitSourceId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceIdContext sourceId() throws RecognitionException {
		SourceIdContext _localctx = new SourceIdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sourceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TargetIdContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TargetIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTargetId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTargetId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTargetId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetIdContext targetId() throws RecognitionException {
		TargetIdContext _localctx = new TargetIdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_targetId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(CURLY_BRACKET_OPEN);
			setState(518);
			properties();
			setState(519);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<QualifiedPropertyContext> qualifiedProperty() {
			return getRuleContexts(QualifiedPropertyContext.class);
		}
		public QualifiedPropertyContext qualifiedProperty(int i) {
			return getRuleContext(QualifiedPropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 103155236862L) != 0)) {
				{
				setState(523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(521);
					property();
					}
					break;
				case 2:
					{
					setState(522);
					qualifiedProperty();
					}
					break;
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(M3CoreParser.STRING, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
				{
				setState(528);
				identifier();
				}
				break;
			case STRING:
				{
				setState(529);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public PropertyReturnTypeContext propertyReturnType() {
			return getRuleContext(PropertyReturnTypeContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(M3CoreParser.END_LINE, 0); }
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(532);
				stereotypes();
				}
			}

			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(535);
				taggedValues();
				}
			}

			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_OPEN) {
				{
				setState(538);
				aggregation();
				}
			}

			setState(541);
			propertyName();
			setState(542);
			match(COLON);
			setState(543);
			propertyReturnType();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(544);
				defaultValue();
				}
			}

			setState(547);
			match(END_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedPropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedPropertyBodyContext qualifiedPropertyBody() {
			return getRuleContext(QualifiedPropertyBodyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public PropertyReturnTypeContext propertyReturnType() {
			return getRuleContext(PropertyReturnTypeContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(M3CoreParser.END_LINE, 0); }
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public QualifiedPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterQualifiedProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitQualifiedProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitQualifiedProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPropertyContext qualifiedProperty() throws RecognitionException {
		QualifiedPropertyContext _localctx = new QualifiedPropertyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_qualifiedProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(549);
				stereotypes();
				}
			}

			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(552);
				taggedValues();
				}
			}

			setState(555);
			identifier();
			setState(556);
			qualifiedPropertyBody();
			setState(557);
			match(COLON);
			setState(558);
			propertyReturnType();
			setState(559);
			match(END_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedPropertyBodyContext extends ParserRuleContext {
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public List<FunctionVariableExpressionContext> functionVariableExpression() {
			return getRuleContexts(FunctionVariableExpressionContext.class);
		}
		public FunctionVariableExpressionContext functionVariableExpression(int i) {
			return getRuleContext(FunctionVariableExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public QualifiedPropertyBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPropertyBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterQualifiedPropertyBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitQualifiedPropertyBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitQualifiedPropertyBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPropertyBodyContext qualifiedPropertyBody() throws RecognitionException {
		QualifiedPropertyBodyContext _localctx = new QualifiedPropertyBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qualifiedPropertyBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(GROUP_OPEN);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) {
				{
				setState(562);
				functionVariableExpression();
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(563);
					match(COMMA);
					setState(564);
					functionVariableExpression();
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(572);
			match(GROUP_CLOSE);
			setState(573);
			match(CURLY_BRACKET_OPEN);
			setState(574);
			codeBlock();
			setState(575);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssociationContext extends ParserRuleContext {
		public TerminalNode ASSOCIATION() { return getToken(M3CoreParser.ASSOCIATION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AssociationProjectionContext associationProjection() {
			return getRuleContext(AssociationProjectionContext.class,0);
		}
		public AssociationBodyContext associationBody() {
			return getRuleContext(AssociationBodyContext.class,0);
		}
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public AssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociationContext association() throws RecognitionException {
		AssociationContext _localctx = new AssociationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_association);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(ASSOCIATION);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(578);
				stereotypes();
				}
			}

			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(581);
				taggedValues();
				}
			}

			setState(584);
			qualifiedName();
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROJECTS:
				{
				setState(585);
				associationProjection();
				}
				break;
			case CURLY_BRACKET_OPEN:
				{
				setState(586);
				associationBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssociationBodyContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public AssociationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAssociationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAssociationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAssociationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociationBodyContext associationBody() throws RecognitionException {
		AssociationBodyContext _localctx = new AssociationBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_associationBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(CURLY_BRACKET_OPEN);
			setState(590);
			properties();
			setState(591);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssociationProjectionContext extends ParserRuleContext {
		public TerminalNode PROJECTS() { return getToken(M3CoreParser.PROJECTS, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(M3CoreParser.LESSTHAN, 0); }
		public TerminalNode COMMA() { return getToken(M3CoreParser.COMMA, 0); }
		public TerminalNode GREATERTHAN() { return getToken(M3CoreParser.GREATERTHAN, 0); }
		public AssociationProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associationProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAssociationProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAssociationProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAssociationProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociationProjectionContext associationProjection() throws RecognitionException {
		AssociationProjectionContext _localctx = new AssociationProjectionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_associationProjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(PROJECTS);
			setState(594);
			qualifiedName();
			setState(595);
			match(LESSTHAN);
			setState(596);
			qualifiedName();
			setState(597);
			match(COMMA);
			setState(598);
			qualifiedName();
			setState(599);
			match(GREATERTHAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDefinitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(M3CoreParser.ENUM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitEnumDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitEnumDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(ENUM);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(602);
				stereotypes();
				}
			}

			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(605);
				taggedValues();
				}
			}

			setState(608);
			qualifiedName();
			setState(609);
			match(CURLY_BRACKET_OPEN);
			setState(610);
			enumValue();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(611);
				match(COMMA);
				setState(612);
				enumValue();
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(618);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enumValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(620);
				stereotypes();
				}
			}

			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(623);
				taggedValues();
				}
			}

			setState(626);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NativeFunctionContext extends ParserRuleContext {
		public TerminalNode NATIVE() { return getToken(M3CoreParser.NATIVE, 0); }
		public TerminalNode FUNCTION() { return getToken(M3CoreParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FunctionTypeSignatureContext functionTypeSignature() {
			return getRuleContext(FunctionTypeSignatureContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(M3CoreParser.END_LINE, 0); }
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public TypeAndMultiplicityParametersContext typeAndMultiplicityParameters() {
			return getRuleContext(TypeAndMultiplicityParametersContext.class,0);
		}
		public NativeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterNativeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitNativeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitNativeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeFunctionContext nativeFunction() throws RecognitionException {
		NativeFunctionContext _localctx = new NativeFunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nativeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(NATIVE);
			setState(629);
			match(FUNCTION);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(630);
				stereotypes();
				}
			}

			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(633);
				taggedValues();
				}
			}

			setState(636);
			qualifiedName();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(637);
				typeAndMultiplicityParameters();
				}
			}

			setState(640);
			functionTypeSignature();
			setState(641);
			match(END_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeSignatureContext extends ParserRuleContext {
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public List<FunctionVariableExpressionContext> functionVariableExpression() {
			return getRuleContexts(FunctionVariableExpressionContext.class);
		}
		public FunctionVariableExpressionContext functionVariableExpression(int i) {
			return getRuleContext(FunctionVariableExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public FunctionTypeSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterFunctionTypeSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitFunctionTypeSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitFunctionTypeSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeSignatureContext functionTypeSignature() throws RecognitionException {
		FunctionTypeSignatureContext _localctx = new FunctionTypeSignatureContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionTypeSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(GROUP_OPEN);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) {
				{
				setState(644);
				functionVariableExpression();
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(645);
					match(COMMA);
					setState(646);
					functionVariableExpression();
					}
					}
					setState(651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(654);
			match(GROUP_CLOSE);
			setState(655);
			match(COLON);
			setState(656);
			type();
			setState(657);
			multiplicity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(M3CoreParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FunctionTypeSignatureContext functionTypeSignature() {
			return getRuleContext(FunctionTypeSignatureContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public TypeAndMultiplicityParametersContext typeAndMultiplicityParameters() {
			return getRuleContext(TypeAndMultiplicityParametersContext.class,0);
		}
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(FUNCTION);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(660);
				stereotypes();
				}
			}

			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(663);
				taggedValues();
				}
			}

			setState(666);
			qualifiedName();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(667);
				typeAndMultiplicityParameters();
				}
			}

			setState(670);
			functionTypeSignature();
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACKET_OPEN) {
				{
				setState(671);
				constraints();
				}
			}

			setState(674);
			match(CURLY_BRACKET_OPEN);
			setState(675);
			codeBlock();
			setState(676);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDescriptorContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public List<FunctionTypePureTypeContext> functionTypePureType() {
			return getRuleContexts(FunctionTypePureTypeContext.class);
		}
		public FunctionTypePureTypeContext functionTypePureType(int i) {
			return getRuleContext(FunctionTypePureTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public FunctionDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDescriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterFunctionDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitFunctionDescriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitFunctionDescriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDescriptorContext functionDescriptor() throws RecognitionException {
		FunctionDescriptorContext _localctx = new FunctionDescriptorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionDescriptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			qualifiedName();
			setState(679);
			match(GROUP_OPEN);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76021758L) != 0)) {
				{
				setState(680);
				functionTypePureType();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(681);
					match(COMMA);
					setState(682);
					functionTypePureType();
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(690);
			match(GROUP_CLOSE);
			setState(691);
			match(COLON);
			setState(692);
			functionTypePureType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonArrowOrEqualExpressionContext extends ParserRuleContext {
		public SliceExpressionContext sliceExpression() {
			return getRuleContext(SliceExpressionContext.class,0);
		}
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public SignedExpressionContext signedExpression() {
			return getRuleContext(SignedExpressionContext.class,0);
		}
		public ExpressionsArrayContext expressionsArray() {
			return getRuleContext(ExpressionsArrayContext.class,0);
		}
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public NonArrowOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonArrowOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterNonArrowOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitNonArrowOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitNonArrowOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonArrowOrEqualExpressionContext nonArrowOrEqualExpression() throws RecognitionException {
		NonArrowOrEqualExpressionContext _localctx = new NonArrowOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nonArrowOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(694);
				sliceExpression();
				}
				break;
			case 2:
				{
				setState(695);
				atomicExpression();
				}
				break;
			case 3:
				{
				setState(696);
				notExpression();
				}
				break;
			case 4:
				{
				setState(697);
				signedExpression();
				}
				break;
			case 5:
				{
				setState(698);
				expressionsArray();
				}
				break;
			case 6:
				{
				{
				setState(699);
				match(GROUP_OPEN);
				setState(700);
				combinedExpression();
				setState(701);
				match(GROUP_CLOSE);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public NonArrowOrEqualExpressionContext nonArrowOrEqualExpression() {
			return getRuleContext(NonArrowOrEqualExpressionContext.class,0);
		}
		public List<PropertyOrFunctionExpressionContext> propertyOrFunctionExpression() {
			return getRuleContexts(PropertyOrFunctionExpressionContext.class);
		}
		public PropertyOrFunctionExpressionContext propertyOrFunctionExpression(int i) {
			return getRuleContext(PropertyOrFunctionExpressionContext.class,i);
		}
		public EqualNotEqualContext equalNotEqual() {
			return getRuleContext(EqualNotEqualContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(705);
			nonArrowOrEqualExpression();
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(706);
					propertyOrFunctionExpression();
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(712);
				equalNotEqual();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceBlockContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public List<InstanceContext> instance() {
			return getRuleContexts(InstanceContext.class);
		}
		public InstanceContext instance(int i) {
			return getRuleContext(InstanceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public InstanceBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstanceBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstanceBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstanceBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceBlockContext instanceBlock() throws RecognitionException {
		InstanceBlockContext _localctx = new InstanceBlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_instanceBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(BRACKET_OPEN);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_SYMBOL) {
				{
				setState(716);
				instance();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(717);
					match(COMMA);
					setState(718);
					instance();
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(726);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceContext extends ParserRuleContext {
		public TerminalNode NEW_SYMBOL() { return getToken(M3CoreParser.NEW_SYMBOL, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public TerminalNode LESSTHAN() { return getToken(M3CoreParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(M3CoreParser.GREATERTHAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FILE_NAME() { return getToken(M3CoreParser.FILE_NAME, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(M3CoreParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(M3CoreParser.INTEGER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TerminalNode FILE_NAME_END() { return getToken(M3CoreParser.FILE_NAME_END, 0); }
		public TerminalNode AT() { return getToken(M3CoreParser.AT, 0); }
		public List<InstancePropertyAssignmentContext> instancePropertyAssignment() {
			return getRuleContexts(InstancePropertyAssignmentContext.class);
		}
		public InstancePropertyAssignmentContext instancePropertyAssignment(int i) {
			return getRuleContext(InstancePropertyAssignmentContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(M3CoreParser.PIPE, 0); }
		public MultiplicityArgumentsContext multiplicityArguments() {
			return getRuleContext(MultiplicityArgumentsContext.class,0);
		}
		public InstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceContext instance() throws RecognitionException {
		InstanceContext _localctx = new InstanceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_instance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(NEW_SYMBOL);
			setState(729);
			qualifiedName();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(730);
				match(LESSTHAN);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76021758L) != 0)) {
					{
					setState(731);
					typeArguments();
					}
				}

				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(734);
					match(PIPE);
					setState(735);
					multiplicityArguments();
					}
				}

				setState(738);
				match(GREATERTHAN);
				}
			}

			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) {
				{
				setState(741);
				identifier();
				}
			}

			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_NAME) {
				{
				setState(744);
				match(FILE_NAME);
				setState(745);
				match(COLON);
				setState(746);
				match(INTEGER);
				setState(747);
				match(COMMA);
				setState(748);
				match(INTEGER);
				setState(749);
				match(COMMA);
				setState(750);
				match(INTEGER);
				setState(751);
				match(COMMA);
				setState(752);
				match(INTEGER);
				setState(753);
				match(COMMA);
				setState(754);
				match(INTEGER);
				setState(755);
				match(COMMA);
				setState(756);
				match(INTEGER);
				setState(757);
				match(FILE_NAME_END);
				}
			}

			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(760);
				match(AT);
				setState(761);
				qualifiedName();
				}
			}

			setState(764);
			match(GROUP_OPEN);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34360262654L) != 0)) {
				{
				setState(765);
				instancePropertyAssignment();
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(766);
					match(COMMA);
					setState(767);
					instancePropertyAssignment();
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(775);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitInstanceContext extends ParserRuleContext {
		public UnitInstanceLiteralContext unitInstanceLiteral() {
			return getRuleContext(UnitInstanceLiteralContext.class,0);
		}
		public UnitNameContext unitName() {
			return getRuleContext(UnitNameContext.class,0);
		}
		public UnitInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterUnitInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitUnitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitUnitInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitInstanceContext unitInstance() throws RecognitionException {
		UnitInstanceContext _localctx = new UnitInstanceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unitInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			unitInstanceLiteral();
			setState(778);
			unitName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(M3CoreParser.TILDE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnitNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterUnitName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitUnitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitUnitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitNameContext unitName() throws RecognitionException {
		UnitNameContext _localctx = new UnitNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unitName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			qualifiedName();
			setState(781);
			match(TILDE);
			setState(782);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstancePropertyAssignmentContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(M3CoreParser.EQUAL, 0); }
		public InstanceRightSideContext instanceRightSide() {
			return getRuleContext(InstanceRightSideContext.class,0);
		}
		public InstancePropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instancePropertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstancePropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstancePropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstancePropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstancePropertyAssignmentContext instancePropertyAssignment() throws RecognitionException {
		InstancePropertyAssignmentContext _localctx = new InstancePropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_instancePropertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			propertyName();
			setState(785);
			match(EQUAL);
			setState(786);
			instanceRightSide();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceRightSideContext extends ParserRuleContext {
		public InstanceAtomicRightSideScalarContext instanceAtomicRightSideScalar() {
			return getRuleContext(InstanceAtomicRightSideScalarContext.class,0);
		}
		public InstanceAtomicRightSideVectorContext instanceAtomicRightSideVector() {
			return getRuleContext(InstanceAtomicRightSideVectorContext.class,0);
		}
		public InstanceRightSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceRightSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstanceRightSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstanceRightSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstanceRightSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceRightSideContext instanceRightSide() throws RecognitionException {
		InstanceRightSideContext _localctx = new InstanceRightSideContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_instanceRightSide);
		try {
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
			case PLUS:
			case STRING:
			case NEW_SYMBOL:
			case INTEGER:
			case LATEST_DATE:
			case DATE:
			case MINUS:
			case FLOAT:
			case DECIMAL:
			case BOOLEAN:
			case STRICTTIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				instanceAtomicRightSideScalar();
				}
				break;
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				instanceAtomicRightSideVector();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceAtomicRightSideScalarContext extends ParserRuleContext {
		public InstanceAtomicRightSideContext instanceAtomicRightSide() {
			return getRuleContext(InstanceAtomicRightSideContext.class,0);
		}
		public InstanceAtomicRightSideScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceAtomicRightSideScalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstanceAtomicRightSideScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstanceAtomicRightSideScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstanceAtomicRightSideScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceAtomicRightSideScalarContext instanceAtomicRightSideScalar() throws RecognitionException {
		InstanceAtomicRightSideScalarContext _localctx = new InstanceAtomicRightSideScalarContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_instanceAtomicRightSideScalar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			instanceAtomicRightSide();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceAtomicRightSideVectorContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public List<InstanceAtomicRightSideContext> instanceAtomicRightSide() {
			return getRuleContexts(InstanceAtomicRightSideContext.class);
		}
		public InstanceAtomicRightSideContext instanceAtomicRightSide(int i) {
			return getRuleContext(InstanceAtomicRightSideContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public InstanceAtomicRightSideVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceAtomicRightSideVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstanceAtomicRightSideVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstanceAtomicRightSideVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstanceAtomicRightSideVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceAtomicRightSideVectorContext instanceAtomicRightSideVector() throws RecognitionException {
		InstanceAtomicRightSideVectorContext _localctx = new InstanceAtomicRightSideVectorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_instanceAtomicRightSideVector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(BRACKET_OPEN);
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4575511497462513666L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				setState(795);
				instanceAtomicRightSide();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(796);
					match(COMMA);
					setState(797);
					instanceAtomicRightSide();
					}
					}
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(805);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceAtomicRightSideContext extends ParserRuleContext {
		public InstanceLiteralContext instanceLiteral() {
			return getRuleContext(InstanceLiteralContext.class,0);
		}
		public TerminalNode LATEST_DATE() { return getToken(M3CoreParser.LATEST_DATE, 0); }
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public EnumReferenceContext enumReference() {
			return getRuleContext(EnumReferenceContext.class,0);
		}
		public StereotypeReferenceContext stereotypeReference() {
			return getRuleContext(StereotypeReferenceContext.class,0);
		}
		public TagReferenceContext tagReference() {
			return getRuleContext(TagReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InstanceAtomicRightSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceAtomicRightSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstanceAtomicRightSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstanceAtomicRightSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstanceAtomicRightSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceAtomicRightSideContext instanceAtomicRightSide() throws RecognitionException {
		InstanceAtomicRightSideContext _localctx = new InstanceAtomicRightSideContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_instanceAtomicRightSide);
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				instanceLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				match(LATEST_DATE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				instance();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				qualifiedName();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				enumReference();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				stereotypeReference();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(813);
				tagReference();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(814);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumReferenceContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(M3CoreParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterEnumReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitEnumReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitEnumReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumReferenceContext enumReference() throws RecognitionException {
		EnumReferenceContext _localctx = new EnumReferenceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			qualifiedName();
			setState(818);
			match(DOT);
			setState(819);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StereotypeReferenceContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AT() { return getToken(M3CoreParser.AT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StereotypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stereotypeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterStereotypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitStereotypeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitStereotypeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StereotypeReferenceContext stereotypeReference() throws RecognitionException {
		StereotypeReferenceContext _localctx = new StereotypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_stereotypeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			qualifiedName();
			setState(822);
			match(AT);
			setState(823);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagReferenceContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(M3CoreParser.PERCENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TagReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTagReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTagReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTagReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagReferenceContext tagReference() throws RecognitionException {
		TagReferenceContext _localctx = new TagReferenceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tagReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			qualifiedName();
			setState(826);
			match(PERCENT);
			setState(827);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public PropertyReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterPropertyReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitPropertyReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitPropertyReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyReturnTypeContext propertyReturnType() throws RecognitionException {
		PropertyReturnTypeContext _localctx = new PropertyReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_propertyReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			type();
			setState(830);
			multiplicity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StereotypesContext extends ParserRuleContext {
		public List<TerminalNode> LESSTHAN() { return getTokens(M3CoreParser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(M3CoreParser.LESSTHAN, i);
		}
		public List<StereotypeContext> stereotype() {
			return getRuleContexts(StereotypeContext.class);
		}
		public StereotypeContext stereotype(int i) {
			return getRuleContext(StereotypeContext.class,i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(M3CoreParser.GREATERTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(M3CoreParser.GREATERTHAN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public StereotypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stereotypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterStereotypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitStereotypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitStereotypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StereotypesContext stereotypes() throws RecognitionException {
		StereotypesContext _localctx = new StereotypesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_stereotypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(LESSTHAN);
			setState(833);
			match(LESSTHAN);
			setState(834);
			stereotype();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(835);
				match(COMMA);
				setState(836);
				stereotype();
				}
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(842);
			match(GREATERTHAN);
			setState(843);
			match(GREATERTHAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StereotypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(M3CoreParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StereotypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stereotype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterStereotype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitStereotype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitStereotype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StereotypeContext stereotype() throws RecognitionException {
		StereotypeContext _localctx = new StereotypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_stereotype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			qualifiedName();
			setState(846);
			match(DOT);
			setState(847);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TaggedValuesContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public List<TaggedValueContext> taggedValue() {
			return getRuleContexts(TaggedValueContext.class);
		}
		public TaggedValueContext taggedValue(int i) {
			return getRuleContext(TaggedValueContext.class,i);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TaggedValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taggedValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTaggedValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTaggedValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTaggedValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaggedValuesContext taggedValues() throws RecognitionException {
		TaggedValuesContext _localctx = new TaggedValuesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_taggedValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(CURLY_BRACKET_OPEN);
			setState(850);
			taggedValue();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(851);
				match(COMMA);
				setState(852);
				taggedValue();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(858);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TaggedValueContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(M3CoreParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(M3CoreParser.EQUAL, 0); }
		public List<TerminalNode> STRING() { return getTokens(M3CoreParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(M3CoreParser.STRING, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(M3CoreParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(M3CoreParser.PLUS, i);
		}
		public TaggedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taggedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTaggedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTaggedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTaggedValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaggedValueContext taggedValue() throws RecognitionException {
		TaggedValueContext _localctx = new TaggedValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_taggedValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			qualifiedName();
			setState(861);
			match(DOT);
			setState(862);
			identifier();
			setState(863);
			match(EQUAL);
			setState(864);
			match(STRING);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(865);
				match(PLUS);
				setState(866);
				match(STRING);
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(M3CoreParser.EQUAL, 0); }
		public DefaultValueExpressionContext defaultValueExpression() {
			return getRuleContext(DefaultValueExpressionContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(EQUAL);
			setState(873);
			defaultValueExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueExpressionContext extends ParserRuleContext {
		public InstanceReferenceContext instanceReference() {
			return getRuleContext(InstanceReferenceContext.class,0);
		}
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public ExpressionInstanceContext expressionInstance() {
			return getRuleContext(ExpressionInstanceContext.class,0);
		}
		public InstanceLiteralContext instanceLiteral() {
			return getRuleContext(InstanceLiteralContext.class,0);
		}
		public DefaultValueExpressionsArrayContext defaultValueExpressionsArray() {
			return getRuleContext(DefaultValueExpressionsArrayContext.class,0);
		}
		public DefaultValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterDefaultValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitDefaultValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitDefaultValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueExpressionContext defaultValueExpression() throws RecognitionException {
		DefaultValueExpressionContext _localctx = new DefaultValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_defaultValueExpression);
		try {
			setState(881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(875);
				instanceReference();
				}
				{
				setState(876);
				propertyExpression();
				}
				}
				break;
			case NEW_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				expressionInstance();
				}
				break;
			case PLUS:
			case STRING:
			case INTEGER:
			case DATE:
			case MINUS:
			case FLOAT:
			case DECIMAL:
			case BOOLEAN:
			case STRICTTIME:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				instanceLiteral();
				}
				break;
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(880);
				defaultValueExpressionsArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueExpressionsArrayContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public List<DefaultValueExpressionContext> defaultValueExpression() {
			return getRuleContexts(DefaultValueExpressionContext.class);
		}
		public DefaultValueExpressionContext defaultValueExpression(int i) {
			return getRuleContext(DefaultValueExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public DefaultValueExpressionsArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValueExpressionsArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterDefaultValueExpressionsArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitDefaultValueExpressionsArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitDefaultValueExpressionsArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueExpressionsArrayContext defaultValueExpressionsArray() throws RecognitionException {
		DefaultValueExpressionsArrayContext _localctx = new DefaultValueExpressionsArrayContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_defaultValueExpressionsArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(BRACKET_OPEN);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4575652226360934402L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				setState(884);
				defaultValueExpression();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(885);
					match(COMMA);
					setState(886);
					defaultValueExpression();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(894);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProfileContext extends ParserRuleContext {
		public TerminalNode PROFILE() { return getToken(M3CoreParser.PROFILE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public StereotypeDefinitionsContext stereotypeDefinitions() {
			return getRuleContext(StereotypeDefinitionsContext.class,0);
		}
		public TagDefinitionsContext tagDefinitions() {
			return getRuleContext(TagDefinitionsContext.class,0);
		}
		public ProfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterProfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitProfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitProfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProfileContext profile() throws RecognitionException {
		ProfileContext _localctx = new ProfileContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_profile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(PROFILE);
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(897);
				stereotypes();
				}
			}

			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(900);
				taggedValues();
				}
			}

			setState(903);
			qualifiedName();
			setState(904);
			match(CURLY_BRACKET_OPEN);
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEREOTYPES) {
				{
				setState(905);
				stereotypeDefinitions();
				}
			}

			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAGS) {
				{
				setState(908);
				tagDefinitions();
				}
			}

			setState(911);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StereotypeDefinitionsContext extends ParserRuleContext {
		public TerminalNode STEREOTYPES() { return getToken(M3CoreParser.STEREOTYPES, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public TerminalNode END_LINE() { return getToken(M3CoreParser.END_LINE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public StereotypeDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stereotypeDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterStereotypeDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitStereotypeDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitStereotypeDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StereotypeDefinitionsContext stereotypeDefinitions() throws RecognitionException {
		StereotypeDefinitionsContext _localctx = new StereotypeDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_stereotypeDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(913);
			match(STEREOTYPES);
			setState(914);
			match(COLON);
			setState(915);
			match(BRACKET_OPEN);
			setState(916);
			identifier();
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(917);
				match(COMMA);
				setState(918);
				identifier();
				}
				}
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(924);
			match(BRACKET_CLOSE);
			setState(925);
			match(END_LINE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagDefinitionsContext extends ParserRuleContext {
		public TerminalNode TAGS() { return getToken(M3CoreParser.TAGS, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public TerminalNode END_LINE() { return getToken(M3CoreParser.END_LINE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TagDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTagDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTagDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTagDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagDefinitionsContext tagDefinitions() throws RecognitionException {
		TagDefinitionsContext _localctx = new TagDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tagDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(927);
			match(TAGS);
			setState(928);
			match(COLON);
			setState(929);
			match(BRACKET_OPEN);
			setState(930);
			identifier();
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(931);
				match(COMMA);
				setState(932);
				identifier();
				}
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(938);
			match(BRACKET_CLOSE);
			setState(939);
			match(END_LINE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockContext extends ParserRuleContext {
		public List<ProgramLineContext> programLine() {
			return getRuleContexts(ProgramLineContext.class);
		}
		public ProgramLineContext programLine(int i) {
			return getRuleContext(ProgramLineContext.class,i);
		}
		public List<TerminalNode> END_LINE() { return getTokens(M3CoreParser.END_LINE); }
		public TerminalNode END_LINE(int i) {
			return getToken(M3CoreParser.END_LINE, i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_codeBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			programLine();
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(942);
				match(END_LINE);
				setState(948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(943);
						programLine();
						setState(944);
						match(END_LINE);
						}
						} 
					}
					setState(950);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramLineContext extends ParserRuleContext {
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public LetExpressionContext letExpression() {
			return getRuleContext(LetExpressionContext.class,0);
		}
		public ProgramLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterProgramLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitProgramLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitProgramLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramLineContext programLine() throws RecognitionException {
		ProgramLineContext _localctx = new ProgramLineContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_programLine);
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				combinedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				letExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualNotEqualContext extends ParserRuleContext {
		public CombinedArithmeticOnlyContext combinedArithmeticOnly() {
			return getRuleContext(CombinedArithmeticOnlyContext.class,0);
		}
		public TerminalNode TEST_EQUAL() { return getToken(M3CoreParser.TEST_EQUAL, 0); }
		public TerminalNode TEST_NOT_EQUAL() { return getToken(M3CoreParser.TEST_NOT_EQUAL, 0); }
		public EqualNotEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalNotEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterEqualNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitEqualNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitEqualNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualNotEqualContext equalNotEqual() throws RecognitionException {
		EqualNotEqualContext _localctx = new EqualNotEqualContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_equalNotEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_la = _input.LA(1);
			if ( !(_la==TEST_EQUAL || _la==TEST_NOT_EQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(958);
			combinedArithmeticOnly();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinedArithmeticOnlyContext extends ParserRuleContext {
		public ExpressionOrExpressionGroupContext expressionOrExpressionGroup() {
			return getRuleContext(ExpressionOrExpressionGroupContext.class,0);
		}
		public List<ArithmeticPartContext> arithmeticPart() {
			return getRuleContexts(ArithmeticPartContext.class);
		}
		public ArithmeticPartContext arithmeticPart(int i) {
			return getRuleContext(ArithmeticPartContext.class,i);
		}
		public CombinedArithmeticOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinedArithmeticOnly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterCombinedArithmeticOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitCombinedArithmeticOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitCombinedArithmeticOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinedArithmeticOnlyContext combinedArithmeticOnly() throws RecognitionException {
		CombinedArithmeticOnlyContext _localctx = new CombinedArithmeticOnlyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_combinedArithmeticOnly);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			expressionOrExpressionGroup();
			setState(964);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(961);
					arithmeticPart();
					}
					} 
				}
				setState(966);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPartContext extends ParserRuleContext {
		public BooleanPartContext booleanPart() {
			return getRuleContext(BooleanPartContext.class,0);
		}
		public ArithmeticPartContext arithmeticPart() {
			return getRuleContext(ArithmeticPartContext.class,0);
		}
		public ExpressionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterExpressionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitExpressionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitExpressionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPartContext expressionPart() throws RecognitionException {
		ExpressionPartContext _localctx = new ExpressionPartContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_expressionPart);
		try {
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEST_EQUAL:
			case TEST_NOT_EQUAL:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				booleanPart();
				}
				break;
			case STAR:
			case PLUS:
			case LESSTHAN:
			case GREATERTHAN:
			case MINUS:
			case DIVIDE:
			case LESSTHANEQUAL:
			case GREATERTHANEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				arithmeticPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetExpressionContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(M3CoreParser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(M3CoreParser.EQUAL, 0); }
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public LetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterLetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitLetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitLetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetExpressionContext letExpression() throws RecognitionException {
		LetExpressionContext _localctx = new LetExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_letExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(LET);
			setState(972);
			identifier();
			setState(973);
			match(EQUAL);
			setState(974);
			combinedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinedExpressionContext extends ParserRuleContext {
		public ExpressionOrExpressionGroupContext expressionOrExpressionGroup() {
			return getRuleContext(ExpressionOrExpressionGroupContext.class,0);
		}
		public List<ExpressionPartContext> expressionPart() {
			return getRuleContexts(ExpressionPartContext.class);
		}
		public ExpressionPartContext expressionPart(int i) {
			return getRuleContext(ExpressionPartContext.class,i);
		}
		public CombinedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterCombinedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitCombinedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitCombinedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinedExpressionContext combinedExpression() throws RecognitionException {
		CombinedExpressionContext _localctx = new CombinedExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_combinedExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			expressionOrExpressionGroup();
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(977);
					expressionPart();
					}
					} 
				}
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOrExpressionGroupContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionOrExpressionGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrExpressionGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterExpressionOrExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitExpressionOrExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitExpressionOrExpressionGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrExpressionGroupContext expressionOrExpressionGroup() throws RecognitionException {
		ExpressionOrExpressionGroupContext _localctx = new ExpressionOrExpressionGroupContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expressionOrExpressionGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsArrayContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public ExpressionsArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterExpressionsArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitExpressionsArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitExpressionsArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsArrayContext expressionsArray() throws RecognitionException {
		ExpressionsArrayContext _localctx = new ExpressionsArrayContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_expressionsArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(BRACKET_OPEN);
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2265251741374611458L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
				{
				setState(986);
				expression();
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(987);
					match(COMMA);
					setState(988);
					expression();
					}
					}
					setState(993);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(996);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyOrFunctionExpressionContext extends ParserRuleContext {
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public PropertyOrFunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyOrFunctionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterPropertyOrFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitPropertyOrFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitPropertyOrFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyOrFunctionExpressionContext propertyOrFunctionExpression() throws RecognitionException {
		PropertyOrFunctionExpressionContext _localctx = new PropertyOrFunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_propertyOrFunctionExpression);
		try {
			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				propertyExpression();
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				functionExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyExpressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(M3CoreParser.DOT, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public FunctionExpressionLatestMilestoningDateParameterContext functionExpressionLatestMilestoningDateParameter() {
			return getRuleContext(FunctionExpressionLatestMilestoningDateParameterContext.class,0);
		}
		public FunctionExpressionParametersContext functionExpressionParameters() {
			return getRuleContext(FunctionExpressionParametersContext.class,0);
		}
		public PropertyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitPropertyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitPropertyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyExpressionContext propertyExpression() throws RecognitionException {
		PropertyExpressionContext _localctx = new PropertyExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_propertyExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			match(DOT);
			setState(1003);
			propertyName();
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1004);
				functionExpressionLatestMilestoningDateParameter();
				}
				break;
			case 2:
				{
				setState(1005);
				functionExpressionParameters();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ARROW() { return getTokens(M3CoreParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(M3CoreParser.ARROW, i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<FunctionExpressionParametersContext> functionExpressionParameters() {
			return getRuleContexts(FunctionExpressionParametersContext.class);
		}
		public FunctionExpressionParametersContext functionExpressionParameters(int i) {
			return getRuleContext(FunctionExpressionParametersContext.class,i);
		}
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(ARROW);
			setState(1009);
			qualifiedName();
			setState(1010);
			functionExpressionParameters();
			setState(1017);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1011);
					match(ARROW);
					setState(1012);
					qualifiedName();
					setState(1013);
					functionExpressionParameters();
					}
					} 
				}
				setState(1019);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionLatestMilestoningDateParameterContext extends ParserRuleContext {
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public List<TerminalNode> LATEST_DATE() { return getTokens(M3CoreParser.LATEST_DATE); }
		public TerminalNode LATEST_DATE(int i) {
			return getToken(M3CoreParser.LATEST_DATE, i);
		}
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(M3CoreParser.COMMA, 0); }
		public FunctionExpressionLatestMilestoningDateParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpressionLatestMilestoningDateParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterFunctionExpressionLatestMilestoningDateParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitFunctionExpressionLatestMilestoningDateParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitFunctionExpressionLatestMilestoningDateParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionLatestMilestoningDateParameterContext functionExpressionLatestMilestoningDateParameter() throws RecognitionException {
		FunctionExpressionLatestMilestoningDateParameterContext _localctx = new FunctionExpressionLatestMilestoningDateParameterContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_functionExpressionLatestMilestoningDateParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(GROUP_OPEN);
			setState(1021);
			match(LATEST_DATE);
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1022);
				match(COMMA);
				setState(1023);
				match(LATEST_DATE);
				}
			}

			setState(1026);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionParametersContext extends ParserRuleContext {
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public List<CombinedExpressionContext> combinedExpression() {
			return getRuleContexts(CombinedExpressionContext.class);
		}
		public CombinedExpressionContext combinedExpression(int i) {
			return getRuleContext(CombinedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public FunctionExpressionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpressionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterFunctionExpressionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitFunctionExpressionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitFunctionExpressionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionParametersContext functionExpressionParameters() throws RecognitionException {
		FunctionExpressionParametersContext _localctx = new FunctionExpressionParametersContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functionExpressionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(GROUP_OPEN);
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2265251741374611458L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
				{
				setState(1029);
				combinedExpression();
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1030);
					match(COMMA);
					setState(1031);
					combinedExpression();
					}
					}
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1039);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicExpressionContext extends ParserRuleContext {
		public DslContext dsl() {
			return getRuleContext(DslContext.class,0);
		}
		public InstanceLiteralTokenContext instanceLiteralToken() {
			return getRuleContext(InstanceLiteralTokenContext.class,0);
		}
		public ExpressionInstanceContext expressionInstance() {
			return getRuleContext(ExpressionInstanceContext.class,0);
		}
		public UnitInstanceContext unitInstance() {
			return getRuleContext(UnitInstanceContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ColumnBuildersContext columnBuilders() {
			return getRuleContext(ColumnBuildersContext.class,0);
		}
		public TerminalNode AT() { return getToken(M3CoreParser.AT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public AnyLambdaContext anyLambda() {
			return getRuleContext(AnyLambdaContext.class,0);
		}
		public InstanceReferenceContext instanceReference() {
			return getRuleContext(InstanceReferenceContext.class,0);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAtomicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAtomicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_atomicExpression);
		try {
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				dsl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				instanceLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1043);
				expressionInstance();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1044);
				unitInstance();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1045);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1046);
				columnBuilders();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1047);
				match(AT);
				setState(1050);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VALID_STRING:
				case CLASS:
				case FUNCTION:
				case PROFILE:
				case ASSOCIATION:
				case ENUM:
				case MEASURE:
				case STEREOTYPES:
				case TAGS:
				case IMPORT:
				case LET:
				case AGGREGATION_TYPE:
				case PATH_SEPARATOR:
				case AS:
				case ALL:
				case PROJECTS:
				case ENFORCEMENT_LEVEL:
				case ENUMERATION_MAPPING:
				case GROUP_OPEN:
				case CURLY_BRACKET_OPEN:
					{
					setState(1048);
					type();
					}
					break;
				case BRACKET_OPEN:
					{
					setState(1049);
					multiplicity();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1052);
				anyLambda();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1053);
				instanceReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnBuildersContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(M3CoreParser.TILDE, 0); }
		public List<OneColSpecContext> oneColSpec() {
			return getRuleContexts(OneColSpecContext.class);
		}
		public OneColSpecContext oneColSpec(int i) {
			return getRuleContext(OneColSpecContext.class,i);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public ColumnBuildersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnBuilders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterColumnBuilders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitColumnBuilders(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitColumnBuilders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnBuildersContext columnBuilders() throws RecognitionException {
		ColumnBuildersContext _localctx = new ColumnBuildersContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_columnBuilders);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(TILDE);
			setState(1070);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
			case STRING:
				{
				setState(1057);
				oneColSpec();
				}
				break;
			case BRACKET_OPEN:
				{
				{
				setState(1058);
				match(BRACKET_OPEN);
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34360262654L) != 0)) {
					{
					setState(1059);
					oneColSpec();
					setState(1064);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1060);
						match(COMMA);
						setState(1061);
						oneColSpec();
						}
						}
						setState(1066);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1069);
				match(BRACKET_CLOSE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OneColSpecContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnyLambdaContext anyLambda() {
			return getRuleContext(AnyLambdaContext.class,0);
		}
		public ExtraFunctionContext extraFunction() {
			return getRuleContext(ExtraFunctionContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public OneColSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneColSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterOneColSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitOneColSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitOneColSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneColSpecContext oneColSpec() throws RecognitionException {
		OneColSpecContext _localctx = new OneColSpecContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_oneColSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			columnName();
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1073);
				match(COLON);
				setState(1079);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1074);
					type();
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BRACKET_OPEN) {
						{
						setState(1075);
						multiplicity();
						}
					}

					}
					break;
				case 2:
					{
					setState(1078);
					anyLambda();
					}
					break;
				}
				setState(1082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1081);
					extraFunction();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtraFunctionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public AnyLambdaContext anyLambda() {
			return getRuleContext(AnyLambdaContext.class,0);
		}
		public ExtraFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterExtraFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitExtraFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitExtraFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraFunctionContext extraFunction() throws RecognitionException {
		ExtraFunctionContext _localctx = new ExtraFunctionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_extraFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1086);
			match(COLON);
			setState(1087);
			anyLambda();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceReferenceContext extends ParserRuleContext {
		public TerminalNode PATH_SEPARATOR() { return getToken(M3CoreParser.PATH_SEPARATOR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public UnitNameContext unitName() {
			return getRuleContext(UnitNameContext.class,0);
		}
		public AllOrFunctionContext allOrFunction() {
			return getRuleContext(AllOrFunctionContext.class,0);
		}
		public InstanceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstanceReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstanceReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstanceReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceReferenceContext instanceReference() throws RecognitionException {
		InstanceReferenceContext _localctx = new InstanceReferenceContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_instanceReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1089);
				match(PATH_SEPARATOR);
				}
				break;
			case 2:
				{
				setState(1090);
				qualifiedName();
				}
				break;
			case 3:
				{
				setState(1091);
				unitName();
				}
				break;
			}
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1094);
				allOrFunction();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnyLambdaContext extends ParserRuleContext {
		public LambdaPipeContext lambdaPipe() {
			return getRuleContext(LambdaPipeContext.class,0);
		}
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public LambdaParamContext lambdaParam() {
			return getRuleContext(LambdaParamContext.class,0);
		}
		public AnyLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAnyLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAnyLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAnyLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyLambdaContext anyLambda() throws RecognitionException {
		AnyLambdaContext _localctx = new AnyLambdaContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_anyLambda);
		try {
			setState(1102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				lambdaPipe();
				}
				break;
			case CURLY_BRACKET_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				lambdaFunction();
				}
				break;
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1099);
				lambdaParam();
				setState(1100);
				lambdaPipe();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaFunctionContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public LambdaPipeContext lambdaPipe() {
			return getRuleContext(LambdaPipeContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public List<LambdaParamContext> lambdaParam() {
			return getRuleContexts(LambdaParamContext.class);
		}
		public LambdaParamContext lambdaParam(int i) {
			return getRuleContext(LambdaParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public LambdaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterLambdaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitLambdaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitLambdaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionContext lambdaFunction() throws RecognitionException {
		LambdaFunctionContext _localctx = new LambdaFunctionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_lambdaFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			match(CURLY_BRACKET_OPEN);
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) {
				{
				setState(1105);
				lambdaParam();
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1106);
					match(COMMA);
					setState(1107);
					lambdaParam();
					}
					}
					setState(1112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1115);
			lambdaPipe();
			setState(1116);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(M3CoreParser.DOLLAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(DOLLAR);
			setState(1119);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllOrFunctionContext extends ParserRuleContext {
		public AllFunctionContext allFunction() {
			return getRuleContext(AllFunctionContext.class,0);
		}
		public AllVersionsFunctionContext allVersionsFunction() {
			return getRuleContext(AllVersionsFunctionContext.class,0);
		}
		public AllVersionsInRangeFunctionContext allVersionsInRangeFunction() {
			return getRuleContext(AllVersionsInRangeFunctionContext.class,0);
		}
		public AllFunctionWithMilestoningContext allFunctionWithMilestoning() {
			return getRuleContext(AllFunctionWithMilestoningContext.class,0);
		}
		public FunctionExpressionParametersContext functionExpressionParameters() {
			return getRuleContext(FunctionExpressionParametersContext.class,0);
		}
		public AllOrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allOrFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAllOrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAllOrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAllOrFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllOrFunctionContext allOrFunction() throws RecognitionException {
		AllOrFunctionContext _localctx = new AllOrFunctionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_allOrFunction);
		try {
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1121);
				allFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				allVersionsFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1123);
				allVersionsInRangeFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				allFunctionWithMilestoning();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1125);
				functionExpressionParameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllFunctionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(M3CoreParser.DOT, 0); }
		public TerminalNode ALL() { return getToken(M3CoreParser.ALL, 0); }
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public AllFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAllFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAllFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAllFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllFunctionContext allFunction() throws RecognitionException {
		AllFunctionContext _localctx = new AllFunctionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_allFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(DOT);
			setState(1129);
			match(ALL);
			setState(1130);
			match(GROUP_OPEN);
			setState(1131);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllVersionsFunctionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(M3CoreParser.DOT, 0); }
		public TerminalNode ALL_VERSIONS() { return getToken(M3CoreParser.ALL_VERSIONS, 0); }
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public AllVersionsFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allVersionsFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAllVersionsFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAllVersionsFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAllVersionsFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllVersionsFunctionContext allVersionsFunction() throws RecognitionException {
		AllVersionsFunctionContext _localctx = new AllVersionsFunctionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_allVersionsFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(DOT);
			setState(1134);
			match(ALL_VERSIONS);
			setState(1135);
			match(GROUP_OPEN);
			setState(1136);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllVersionsInRangeFunctionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(M3CoreParser.DOT, 0); }
		public TerminalNode ALL_VERSIONS_IN_RANGE() { return getToken(M3CoreParser.ALL_VERSIONS_IN_RANGE, 0); }
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public List<BuildMilestoningVariableExpressionContext> buildMilestoningVariableExpression() {
			return getRuleContexts(BuildMilestoningVariableExpressionContext.class);
		}
		public BuildMilestoningVariableExpressionContext buildMilestoningVariableExpression(int i) {
			return getRuleContext(BuildMilestoningVariableExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(M3CoreParser.COMMA, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public AllVersionsInRangeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allVersionsInRangeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAllVersionsInRangeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAllVersionsInRangeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAllVersionsInRangeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllVersionsInRangeFunctionContext allVersionsInRangeFunction() throws RecognitionException {
		AllVersionsInRangeFunctionContext _localctx = new AllVersionsInRangeFunctionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_allVersionsInRangeFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			match(DOT);
			setState(1139);
			match(ALL_VERSIONS_IN_RANGE);
			setState(1140);
			match(GROUP_OPEN);
			setState(1141);
			buildMilestoningVariableExpression();
			setState(1142);
			match(COMMA);
			setState(1143);
			buildMilestoningVariableExpression();
			setState(1144);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllFunctionWithMilestoningContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(M3CoreParser.DOT, 0); }
		public TerminalNode ALL() { return getToken(M3CoreParser.ALL, 0); }
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public List<BuildMilestoningVariableExpressionContext> buildMilestoningVariableExpression() {
			return getRuleContexts(BuildMilestoningVariableExpressionContext.class);
		}
		public BuildMilestoningVariableExpressionContext buildMilestoningVariableExpression(int i) {
			return getRuleContext(BuildMilestoningVariableExpressionContext.class,i);
		}
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(M3CoreParser.COMMA, 0); }
		public AllFunctionWithMilestoningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allFunctionWithMilestoning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAllFunctionWithMilestoning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAllFunctionWithMilestoning(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAllFunctionWithMilestoning(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllFunctionWithMilestoningContext allFunctionWithMilestoning() throws RecognitionException {
		AllFunctionWithMilestoningContext _localctx = new AllFunctionWithMilestoningContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_allFunctionWithMilestoning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(DOT);
			setState(1147);
			match(ALL);
			setState(1148);
			match(GROUP_OPEN);
			setState(1149);
			buildMilestoningVariableExpression();
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1150);
				match(COMMA);
				setState(1151);
				buildMilestoningVariableExpression();
				}
			}

			setState(1154);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuildMilestoningVariableExpressionContext extends ParserRuleContext {
		public TerminalNode LATEST_DATE() { return getToken(M3CoreParser.LATEST_DATE, 0); }
		public TerminalNode DATE() { return getToken(M3CoreParser.DATE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BuildMilestoningVariableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildMilestoningVariableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterBuildMilestoningVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitBuildMilestoningVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitBuildMilestoningVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildMilestoningVariableExpressionContext buildMilestoningVariableExpression() throws RecognitionException {
		BuildMilestoningVariableExpressionContext _localctx = new BuildMilestoningVariableExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_buildMilestoningVariableExpression);
		try {
			setState(1159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LATEST_DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				match(LATEST_DATE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
				match(DATE);
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1158);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionInstanceContext extends ParserRuleContext {
		public TerminalNode NEW_SYMBOL() { return getToken(M3CoreParser.NEW_SYMBOL, 0); }
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LESSTHAN() { return getToken(M3CoreParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(M3CoreParser.GREATERTHAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeVariableValuesContext typeVariableValues() {
			return getRuleContext(TypeVariableValuesContext.class,0);
		}
		public List<ExpressionInstanceParserPropertyAssignmentContext> expressionInstanceParserPropertyAssignment() {
			return getRuleContexts(ExpressionInstanceParserPropertyAssignmentContext.class);
		}
		public ExpressionInstanceParserPropertyAssignmentContext expressionInstanceParserPropertyAssignment(int i) {
			return getRuleContext(ExpressionInstanceParserPropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(M3CoreParser.PIPE, 0); }
		public MultiplicityArgumentsContext multiplicityArguments() {
			return getRuleContext(MultiplicityArgumentsContext.class,0);
		}
		public ExpressionInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterExpressionInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitExpressionInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitExpressionInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInstanceContext expressionInstance() throws RecognitionException {
		ExpressionInstanceContext _localctx = new ExpressionInstanceContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_expressionInstance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(NEW_SYMBOL);
			setState(1164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(1162);
				variable();
				}
				break;
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
				{
				setState(1163);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(1166);
				match(LESSTHAN);
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76021758L) != 0)) {
					{
					setState(1167);
					typeArguments();
					}
				}

				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(1170);
					match(PIPE);
					setState(1171);
					multiplicityArguments();
					}
				}

				setState(1174);
				match(GREATERTHAN);
				}
			}

			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) {
				{
				setState(1177);
				identifier();
				}
			}

			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1180);
				typeVariableValues();
				}
				break;
			}
			setState(1183);
			match(GROUP_OPEN);
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34360262654L) != 0)) {
				{
				setState(1184);
				expressionInstanceParserPropertyAssignment();
				}
			}

			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1187);
				match(COMMA);
				setState(1188);
				expressionInstanceParserPropertyAssignment();
				}
				}
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1194);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionInstanceRightSideContext extends ParserRuleContext {
		public ExpressionInstanceAtomicRightSideContext expressionInstanceAtomicRightSide() {
			return getRuleContext(ExpressionInstanceAtomicRightSideContext.class,0);
		}
		public ExpressionInstanceRightSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInstanceRightSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterExpressionInstanceRightSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitExpressionInstanceRightSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitExpressionInstanceRightSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInstanceRightSideContext expressionInstanceRightSide() throws RecognitionException {
		ExpressionInstanceRightSideContext _localctx = new ExpressionInstanceRightSideContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_expressionInstanceRightSide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			expressionInstanceAtomicRightSide();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionInstanceAtomicRightSideContext extends ParserRuleContext {
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public ExpressionInstanceContext expressionInstance() {
			return getRuleContext(ExpressionInstanceContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ExpressionInstanceAtomicRightSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInstanceAtomicRightSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterExpressionInstanceAtomicRightSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitExpressionInstanceAtomicRightSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitExpressionInstanceAtomicRightSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInstanceAtomicRightSideContext expressionInstanceAtomicRightSide() throws RecognitionException {
		ExpressionInstanceAtomicRightSideContext _localctx = new ExpressionInstanceAtomicRightSideContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_expressionInstanceAtomicRightSide);
		try {
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				combinedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				expressionInstance();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1200);
				qualifiedName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionInstanceParserPropertyAssignmentContext extends ParserRuleContext {
		public List<PropertyNameContext> propertyName() {
			return getRuleContexts(PropertyNameContext.class);
		}
		public PropertyNameContext propertyName(int i) {
			return getRuleContext(PropertyNameContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(M3CoreParser.EQUAL, 0); }
		public ExpressionInstanceRightSideContext expressionInstanceRightSide() {
			return getRuleContext(ExpressionInstanceRightSideContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(M3CoreParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(M3CoreParser.DOT, i);
		}
		public TerminalNode PLUS() { return getToken(M3CoreParser.PLUS, 0); }
		public ExpressionInstanceParserPropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInstanceParserPropertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterExpressionInstanceParserPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitExpressionInstanceParserPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitExpressionInstanceParserPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInstanceParserPropertyAssignmentContext expressionInstanceParserPropertyAssignment() throws RecognitionException {
		ExpressionInstanceParserPropertyAssignmentContext _localctx = new ExpressionInstanceParserPropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_expressionInstanceParserPropertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			propertyName();
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1204);
				match(DOT);
				setState(1205);
				propertyName();
				}
				}
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(1211);
				match(PLUS);
				}
			}

			setState(1214);
			match(EQUAL);
			setState(1215);
			expressionInstanceRightSide();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SliceExpressionContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public List<TerminalNode> COLON() { return getTokens(M3CoreParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(M3CoreParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterSliceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitSliceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitSliceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceExpressionContext sliceExpression() throws RecognitionException {
		SliceExpressionContext _localctx = new SliceExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_sliceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(BRACKET_OPEN);
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				{
				setState(1218);
				match(COLON);
				setState(1219);
				expression();
				}
				}
				break;
			case 2:
				{
				{
				setState(1220);
				expression();
				setState(1221);
				match(COLON);
				setState(1222);
				expression();
				}
				}
				break;
			case 3:
				{
				{
				setState(1224);
				expression();
				setState(1225);
				match(COLON);
				setState(1226);
				expression();
				setState(1227);
				match(COLON);
				setState(1228);
				expression();
				}
				}
				break;
			}
			setState(1232);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintsContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public ConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintsContext constraints() throws RecognitionException {
		ConstraintsContext _localctx = new ConstraintsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_constraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(BRACKET_OPEN);
			setState(1235);
			constraint();
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1236);
				match(COMMA);
				setState(1237);
				constraint();
				}
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1243);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintContext extends ParserRuleContext {
		public SimpleConstraintContext simpleConstraint() {
			return getRuleContext(SimpleConstraintContext.class,0);
		}
		public ComplexConstraintContext complexConstraint() {
			return getRuleContext(ComplexConstraintContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_constraint);
		try {
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				simpleConstraint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				complexConstraint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleConstraintContext extends ParserRuleContext {
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public ConstraintIdContext constraintId() {
			return getRuleContext(ConstraintIdContext.class,0);
		}
		public SimpleConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterSimpleConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitSimpleConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitSimpleConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleConstraintContext simpleConstraint() throws RecognitionException {
		SimpleConstraintContext _localctx = new SimpleConstraintContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_simpleConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1249);
				constraintId();
				}
				break;
			}
			setState(1252);
			combinedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexConstraintContext extends ParserRuleContext {
		public TerminalNode VALID_STRING() { return getToken(M3CoreParser.VALID_STRING, 0); }
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public ConstraintFunctionContext constraintFunction() {
			return getRuleContext(ConstraintFunctionContext.class,0);
		}
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public ConstraintOwnerContext constraintOwner() {
			return getRuleContext(ConstraintOwnerContext.class,0);
		}
		public ConstraintExternalIdContext constraintExternalId() {
			return getRuleContext(ConstraintExternalIdContext.class,0);
		}
		public ConstraintEnforcementLevelContext constraintEnforcementLevel() {
			return getRuleContext(ConstraintEnforcementLevelContext.class,0);
		}
		public ConstraintMessageContext constraintMessage() {
			return getRuleContext(ConstraintMessageContext.class,0);
		}
		public ComplexConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterComplexConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitComplexConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitComplexConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexConstraintContext complexConstraint() throws RecognitionException {
		ComplexConstraintContext _localctx = new ComplexConstraintContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_complexConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(VALID_STRING);
			setState(1255);
			match(GROUP_OPEN);
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_OWNER) {
				{
				setState(1256);
				constraintOwner();
				}
			}

			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_EXTERNAL_ID) {
				{
				setState(1259);
				constraintExternalId();
				}
			}

			setState(1262);
			constraintFunction();
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_ENFORCEMENT) {
				{
				setState(1263);
				constraintEnforcementLevel();
				}
			}

			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_MESSAGE) {
				{
				setState(1266);
				constraintMessage();
				}
			}

			setState(1269);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintOwnerContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT_OWNER() { return getToken(M3CoreParser.CONSTRAINT_OWNER, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public TerminalNode VALID_STRING() { return getToken(M3CoreParser.VALID_STRING, 0); }
		public ConstraintOwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOwner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterConstraintOwner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitConstraintOwner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitConstraintOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintOwnerContext constraintOwner() throws RecognitionException {
		ConstraintOwnerContext _localctx = new ConstraintOwnerContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_constraintOwner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(CONSTRAINT_OWNER);
			setState(1272);
			match(COLON);
			setState(1273);
			match(VALID_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintExternalIdContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT_EXTERNAL_ID() { return getToken(M3CoreParser.CONSTRAINT_EXTERNAL_ID, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(M3CoreParser.STRING, 0); }
		public ConstraintExternalIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintExternalId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterConstraintExternalId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitConstraintExternalId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitConstraintExternalId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintExternalIdContext constraintExternalId() throws RecognitionException {
		ConstraintExternalIdContext _localctx = new ConstraintExternalIdContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_constraintExternalId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(CONSTRAINT_EXTERNAL_ID);
			setState(1276);
			match(COLON);
			setState(1277);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintFunctionContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT_FUNCTION() { return getToken(M3CoreParser.CONSTRAINT_FUNCTION, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public ConstraintFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterConstraintFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitConstraintFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitConstraintFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintFunctionContext constraintFunction() throws RecognitionException {
		ConstraintFunctionContext _localctx = new ConstraintFunctionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_constraintFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(CONSTRAINT_FUNCTION);
			setState(1280);
			match(COLON);
			setState(1281);
			combinedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintEnforcementLevelContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT_ENFORCEMENT() { return getToken(M3CoreParser.CONSTRAINT_ENFORCEMENT, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public TerminalNode ENFORCEMENT_LEVEL() { return getToken(M3CoreParser.ENFORCEMENT_LEVEL, 0); }
		public ConstraintEnforcementLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintEnforcementLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterConstraintEnforcementLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitConstraintEnforcementLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitConstraintEnforcementLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintEnforcementLevelContext constraintEnforcementLevel() throws RecognitionException {
		ConstraintEnforcementLevelContext _localctx = new ConstraintEnforcementLevelContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_constraintEnforcementLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			match(CONSTRAINT_ENFORCEMENT);
			setState(1284);
			match(COLON);
			setState(1285);
			match(ENFORCEMENT_LEVEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintMessageContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT_MESSAGE() { return getToken(M3CoreParser.CONSTRAINT_MESSAGE, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public ConstraintMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterConstraintMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitConstraintMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitConstraintMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintMessageContext constraintMessage() throws RecognitionException {
		ConstraintMessageContext _localctx = new ConstraintMessageContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_constraintMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			match(CONSTRAINT_MESSAGE);
			setState(1288);
			match(COLON);
			setState(1289);
			combinedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintIdContext extends ParserRuleContext {
		public TerminalNode VALID_STRING() { return getToken(M3CoreParser.VALID_STRING, 0); }
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public ConstraintIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterConstraintId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitConstraintId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitConstraintId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintIdContext constraintId() throws RecognitionException {
		ConstraintIdContext _localctx = new ConstraintIdContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_constraintId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			match(VALID_STRING);
			setState(1292);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(M3CoreParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(NOT);
			setState(1295);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(M3CoreParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(M3CoreParser.PLUS, 0); }
		public SignedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterSignedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitSignedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitSignedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedExpressionContext signedExpression() throws RecognitionException {
		SignedExpressionContext _localctx = new SignedExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_signedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1298);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaPipeContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(M3CoreParser.PIPE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public LambdaPipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaPipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterLambdaPipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitLambdaPipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitLambdaPipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaPipeContext lambdaPipe() throws RecognitionException {
		LambdaPipeContext _localctx = new LambdaPipeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_lambdaPipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			match(PIPE);
			setState(1301);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParamContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LambdaParamTypeContext lambdaParamType() {
			return getRuleContext(LambdaParamTypeContext.class,0);
		}
		public LambdaParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterLambdaParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitLambdaParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitLambdaParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParamContext lambdaParam() throws RecognitionException {
		LambdaParamContext _localctx = new LambdaParamContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_lambdaParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			identifier();
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1304);
				lambdaParamType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParamTypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public LambdaParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParamType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterLambdaParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitLambdaParamType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitLambdaParamType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParamTypeContext lambdaParamType() throws RecognitionException {
		LambdaParamTypeContext _localctx = new LambdaParamTypeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_lambdaParamType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			match(COLON);
			setState(1308);
			type();
			setState(1309);
			multiplicity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceLiteralContext extends ParserRuleContext {
		public InstanceLiteralTokenContext instanceLiteralToken() {
			return getRuleContext(InstanceLiteralTokenContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(M3CoreParser.MINUS, 0); }
		public TerminalNode INTEGER() { return getToken(M3CoreParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(M3CoreParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(M3CoreParser.DECIMAL, 0); }
		public TerminalNode PLUS() { return getToken(M3CoreParser.PLUS, 0); }
		public InstanceLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstanceLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstanceLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstanceLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceLiteralContext instanceLiteral() throws RecognitionException {
		InstanceLiteralContext _localctx = new InstanceLiteralContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_instanceLiteral);
		try {
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				instanceLiteralToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1312);
				match(MINUS);
				setState(1313);
				match(INTEGER);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1314);
				match(MINUS);
				setState(1315);
				match(FLOAT);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1316);
				match(MINUS);
				setState(1317);
				match(DECIMAL);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1318);
				match(PLUS);
				setState(1319);
				match(INTEGER);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1320);
				match(PLUS);
				setState(1321);
				match(FLOAT);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1322);
				match(PLUS);
				setState(1323);
				match(DECIMAL);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceLiteralTokenContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(M3CoreParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(M3CoreParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(M3CoreParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(M3CoreParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(M3CoreParser.DATE, 0); }
		public TerminalNode BOOLEAN() { return getToken(M3CoreParser.BOOLEAN, 0); }
		public TerminalNode STRICTTIME() { return getToken(M3CoreParser.STRICTTIME, 0); }
		public InstanceLiteralTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceLiteralToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterInstanceLiteralToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitInstanceLiteralToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitInstanceLiteralToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceLiteralTokenContext instanceLiteralToken() throws RecognitionException {
		InstanceLiteralTokenContext _localctx = new InstanceLiteralTokenContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_instanceLiteralToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 4027580545L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitInstanceLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(M3CoreParser.INTEGER, 0); }
		public TerminalNode MINUS() { return getToken(M3CoreParser.MINUS, 0); }
		public TerminalNode FLOAT() { return getToken(M3CoreParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(M3CoreParser.DECIMAL, 0); }
		public TerminalNode PLUS() { return getToken(M3CoreParser.PLUS, 0); }
		public UnitInstanceLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitInstanceLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterUnitInstanceLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitUnitInstanceLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitUnitInstanceLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitInstanceLiteralContext unitInstanceLiteral() throws RecognitionException {
		UnitInstanceLiteralContext _localctx = new UnitInstanceLiteralContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_unitInstanceLiteral);
		int _la;
		try {
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1328);
					match(MINUS);
					}
				}

				setState(1331);
				match(INTEGER);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1332);
					match(MINUS);
					}
				}

				setState(1335);
				match(FLOAT);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1336);
					match(MINUS);
					}
				}

				setState(1339);
				match(DECIMAL);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1340);
				match(PLUS);
				setState(1341);
				match(INTEGER);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1342);
				match(PLUS);
				setState(1343);
				match(FLOAT);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1344);
				match(PLUS);
				setState(1345);
				match(DECIMAL);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticPartContext extends ParserRuleContext {
		public List<TerminalNode> PLUS() { return getTokens(M3CoreParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(M3CoreParser.PLUS, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(M3CoreParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(M3CoreParser.STAR, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(M3CoreParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(M3CoreParser.MINUS, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(M3CoreParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(M3CoreParser.DIVIDE, i);
		}
		public TerminalNode LESSTHAN() { return getToken(M3CoreParser.LESSTHAN, 0); }
		public TerminalNode LESSTHANEQUAL() { return getToken(M3CoreParser.LESSTHANEQUAL, 0); }
		public TerminalNode GREATERTHAN() { return getToken(M3CoreParser.GREATERTHAN, 0); }
		public TerminalNode GREATERTHANEQUAL() { return getToken(M3CoreParser.GREATERTHANEQUAL, 0); }
		public ArithmeticPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterArithmeticPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitArithmeticPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitArithmeticPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticPartContext arithmeticPart() throws RecognitionException {
		ArithmeticPartContext _localctx = new ArithmeticPartContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_arithmeticPart);
		try {
			int _alt;
			setState(1392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348);
				match(PLUS);
				setState(1349);
				expression();
				setState(1354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1350);
						match(PLUS);
						setState(1351);
						expression();
						}
						} 
					}
					setState(1356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				}
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1357);
				match(STAR);
				setState(1358);
				expression();
				setState(1363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1359);
						match(STAR);
						setState(1360);
						expression();
						}
						} 
					}
					setState(1365);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				}
				}
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1366);
				match(MINUS);
				setState(1367);
				expression();
				setState(1372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1368);
						match(MINUS);
						setState(1369);
						expression();
						}
						} 
					}
					setState(1374);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				}
				}
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1375);
				match(DIVIDE);
				setState(1376);
				expression();
				setState(1381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1377);
						match(DIVIDE);
						setState(1378);
						expression();
						}
						} 
					}
					setState(1383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				}
				}
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1384);
				match(LESSTHAN);
				setState(1385);
				expression();
				}
				}
				break;
			case LESSTHANEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1386);
				match(LESSTHANEQUAL);
				setState(1387);
				expression();
				}
				}
				break;
			case GREATERTHAN:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1388);
				match(GREATERTHAN);
				setState(1389);
				expression();
				}
				}
				break;
			case GREATERTHANEQUAL:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1390);
				match(GREATERTHANEQUAL);
				setState(1391);
				expression();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanPartContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(M3CoreParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(M3CoreParser.OR, 0); }
		public EqualNotEqualContext equalNotEqual() {
			return getRuleContext(EqualNotEqualContext.class,0);
		}
		public BooleanPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterBooleanPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitBooleanPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitBooleanPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPartContext booleanPart() throws RecognitionException {
		BooleanPartContext _localctx = new BooleanPartContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_booleanPart);
		try {
			setState(1399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				match(AND);
				setState(1395);
				expression();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1396);
				match(OR);
				setState(1397);
				expression();
				}
				}
				break;
			case TEST_EQUAL:
			case TEST_NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1398);
				equalNotEqual();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionVariableExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public FunctionVariableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionVariableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterFunctionVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitFunctionVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitFunctionVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionVariableExpressionContext functionVariableExpression() throws RecognitionException {
		FunctionVariableExpressionContext _localctx = new FunctionVariableExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_functionVariableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			identifier();
			setState(1402);
			match(COLON);
			setState(1403);
			type();
			setState(1404);
			multiplicity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeVariableValuesContext typeVariableValues() {
			return getRuleContext(TypeVariableValuesContext.class,0);
		}
		public TerminalNode LESSTHAN() { return getToken(M3CoreParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(M3CoreParser.GREATERTHAN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(M3CoreParser.PIPE, 0); }
		public MultiplicityArgumentsContext multiplicityArguments() {
			return getRuleContext(MultiplicityArgumentsContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode ARROW() { return getToken(M3CoreParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public List<FunctionTypePureTypeContext> functionTypePureType() {
			return getRuleContexts(FunctionTypePureTypeContext.class);
		}
		public FunctionTypePureTypeContext functionTypePureType(int i) {
			return getRuleContext(FunctionTypePureTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public List<ColumnTypeContext> columnType() {
			return getRuleContexts(ColumnTypeContext.class);
		}
		public ColumnTypeContext columnType(int i) {
			return getRuleContext(ColumnTypeContext.class,i);
		}
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public UnitNameContext unitName() {
			return getRuleContext(UnitNameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_type);
		int _la;
		try {
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1406);
				qualifiedName();
				setState(1416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1407);
					match(LESSTHAN);
					{
					setState(1409);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76021758L) != 0)) {
						{
						setState(1408);
						typeArguments();
						}
					}

					setState(1413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PIPE) {
						{
						setState(1411);
						match(PIPE);
						setState(1412);
						multiplicityArguments();
						}
					}

					}
					setState(1415);
					match(GREATERTHAN);
					}
					break;
				}
				}
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP_OPEN) {
					{
					setState(1418);
					typeVariableValues();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1421);
				match(CURLY_BRACKET_OPEN);
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76021758L) != 0)) {
					{
					setState(1422);
					functionTypePureType();
					}
				}

				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1425);
					match(COMMA);
					setState(1426);
					functionTypePureType();
					}
					}
					setState(1431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1432);
				match(ARROW);
				setState(1433);
				type();
				setState(1434);
				multiplicity();
				setState(1435);
				match(CURLY_BRACKET_CLOSE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1437);
				match(GROUP_OPEN);
				setState(1438);
				columnType();
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1439);
					match(COMMA);
					setState(1440);
					columnType();
					}
					}
					setState(1445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1446);
				match(GROUP_CLOSE);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1448);
				unitName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeVariableValuesContext extends ParserRuleContext {
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public List<InstanceLiteralContext> instanceLiteral() {
			return getRuleContexts(InstanceLiteralContext.class);
		}
		public InstanceLiteralContext instanceLiteral(int i) {
			return getRuleContext(InstanceLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TypeVariableValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTypeVariableValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTypeVariableValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTypeVariableValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableValuesContext typeVariableValues() throws RecognitionException {
		TypeVariableValuesContext _localctx = new TypeVariableValuesContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_typeVariableValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(GROUP_OPEN);
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 33294386185L) != 0)) {
				{
				setState(1452);
				instanceLiteral();
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1453);
					match(COMMA);
					setState(1454);
					instanceLiteral();
					}
					}
					setState(1459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1462);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnTypeContext extends ParserRuleContext {
		public MayColumnNameContext mayColumnName() {
			return getRuleContext(MayColumnNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(M3CoreParser.COLON, 0); }
		public MayColumnTypeContext mayColumnType() {
			return getRuleContext(MayColumnTypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public ColumnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterColumnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitColumnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitColumnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeContext columnType() throws RecognitionException {
		ColumnTypeContext _localctx = new ColumnTypeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_columnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			mayColumnName();
			setState(1465);
			match(COLON);
			setState(1466);
			mayColumnType();
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACKET_OPEN) {
				{
				setState(1467);
				multiplicity();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MayColumnNameContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(M3CoreParser.QUESTION, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public MayColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMayColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMayColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMayColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayColumnNameContext mayColumnName() throws RecognitionException {
		MayColumnNameContext _localctx = new MayColumnNameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_mayColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUESTION:
				{
				setState(1470);
				match(QUESTION);
				}
				break;
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
			case STRING:
				{
				setState(1471);
				columnName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MayColumnTypeContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(M3CoreParser.QUESTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MayColumnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayColumnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMayColumnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMayColumnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMayColumnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayColumnTypeContext mayColumnType() throws RecognitionException {
		MayColumnTypeContext _localctx = new MayColumnTypeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_mayColumnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUESTION:
				{
				setState(1474);
				match(QUESTION);
				}
				break;
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
			case GROUP_OPEN:
			case CURLY_BRACKET_OPEN:
				{
				setState(1475);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(M3CoreParser.STRING, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_columnName);
		try {
			setState(1480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				identifier();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicityContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public MultiplicityArgumentContext multiplicityArgument() {
			return getRuleContext(MultiplicityArgumentContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public MultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMultiplicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMultiplicity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMultiplicity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicityContext multiplicity() throws RecognitionException {
		MultiplicityContext _localctx = new MultiplicityContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_multiplicity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			match(BRACKET_OPEN);
			setState(1483);
			multiplicityArgument();
			setState(1484);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromMultiplicityContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(M3CoreParser.INTEGER, 0); }
		public FromMultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromMultiplicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterFromMultiplicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitFromMultiplicity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitFromMultiplicity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromMultiplicityContext fromMultiplicity() throws RecognitionException {
		FromMultiplicityContext _localctx = new FromMultiplicityContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_fromMultiplicity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ToMultiplicityContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(M3CoreParser.INTEGER, 0); }
		public TerminalNode STAR() { return getToken(M3CoreParser.STAR, 0); }
		public ToMultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toMultiplicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterToMultiplicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitToMultiplicity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitToMultiplicity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToMultiplicityContext toMultiplicity() throws RecognitionException {
		ToMultiplicityContext _localctx = new ToMultiplicityContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_toMultiplicity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionContext extends ParserRuleContext {
		public DslContext dsl() {
			return getRuleContext(DslContext.class,0);
		}
		public TreePathContext treePath() {
			return getRuleContext(TreePathContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_projection);
		try {
			setState(1492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DSL_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				dsl();
				}
				break;
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
			case GROUP_OPEN:
			case CURLY_BRACKET_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				treePath();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypePureTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public FunctionTypePureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypePureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterFunctionTypePureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitFunctionTypePureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitFunctionTypePureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypePureTypeContext functionTypePureType() throws RecognitionException {
		FunctionTypePureTypeContext _localctx = new FunctionTypePureTypeContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_functionTypePureType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			type();
			setState(1495);
			multiplicity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAndMultiplicityParametersContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(M3CoreParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(M3CoreParser.GREATERTHAN, 0); }
		public MultiplictyParametersContext multiplictyParameters() {
			return getRuleContext(MultiplictyParametersContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeAndMultiplicityParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAndMultiplicityParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTypeAndMultiplicityParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTypeAndMultiplicityParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTypeAndMultiplicityParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAndMultiplicityParametersContext typeAndMultiplicityParameters() throws RecognitionException {
		TypeAndMultiplicityParametersContext _localctx = new TypeAndMultiplicityParametersContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_typeAndMultiplicityParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(LESSTHAN);
			setState(1503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
				{
				{
				setState(1498);
				typeParameters();
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(1499);
					multiplictyParameters();
					}
				}

				}
				}
				break;
			case PIPE:
				{
				setState(1502);
				multiplictyParameters();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1505);
			match(GREATERTHAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersWithContravarianceAndMultiplicityParametersContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(M3CoreParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(M3CoreParser.GREATERTHAN, 0); }
		public MultiplictyParametersContext multiplictyParameters() {
			return getRuleContext(MultiplictyParametersContext.class,0);
		}
		public ContravarianceTypeParametersContext contravarianceTypeParameters() {
			return getRuleContext(ContravarianceTypeParametersContext.class,0);
		}
		public TypeParametersWithContravarianceAndMultiplicityParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParametersWithContravarianceAndMultiplicityParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTypeParametersWithContravarianceAndMultiplicityParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTypeParametersWithContravarianceAndMultiplicityParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTypeParametersWithContravarianceAndMultiplicityParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersWithContravarianceAndMultiplicityParametersContext typeParametersWithContravarianceAndMultiplicityParameters() throws RecognitionException {
		TypeParametersWithContravarianceAndMultiplicityParametersContext _localctx = new TypeParametersWithContravarianceAndMultiplicityParametersContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_typeParametersWithContravarianceAndMultiplicityParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(LESSTHAN);
			setState(1513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
			case MINUS:
				{
				{
				setState(1508);
				contravarianceTypeParameters();
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(1509);
					multiplictyParameters();
					}
				}

				}
				}
				break;
			case PIPE:
				{
				setState(1512);
				multiplictyParameters();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1515);
			match(GREATERTHAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			typeParameter();
			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1518);
				match(COMMA);
				setState(1519);
				typeParameter();
				}
				}
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_typeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContravarianceTypeParametersContext extends ParserRuleContext {
		public List<ContravarianceTypeParameterContext> contravarianceTypeParameter() {
			return getRuleContexts(ContravarianceTypeParameterContext.class);
		}
		public ContravarianceTypeParameterContext contravarianceTypeParameter(int i) {
			return getRuleContext(ContravarianceTypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public ContravarianceTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contravarianceTypeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterContravarianceTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitContravarianceTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitContravarianceTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContravarianceTypeParametersContext contravarianceTypeParameters() throws RecognitionException {
		ContravarianceTypeParametersContext _localctx = new ContravarianceTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_contravarianceTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			contravarianceTypeParameter();
			setState(1532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1528);
				match(COMMA);
				setState(1529);
				contravarianceTypeParameter();
				}
				}
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContravarianceTypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(M3CoreParser.MINUS, 0); }
		public ContravarianceTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contravarianceTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterContravarianceTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitContravarianceTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitContravarianceTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContravarianceTypeParameterContext contravarianceTypeParameter() throws RecognitionException {
		ContravarianceTypeParameterContext _localctx = new ContravarianceTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_contravarianceTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(1535);
				match(MINUS);
				}
			}

			setState(1538);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicityArgumentsContext extends ParserRuleContext {
		public List<MultiplicityArgumentContext> multiplicityArgument() {
			return getRuleContexts(MultiplicityArgumentContext.class);
		}
		public MultiplicityArgumentContext multiplicityArgument(int i) {
			return getRuleContext(MultiplicityArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public MultiplicityArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicityArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMultiplicityArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMultiplicityArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMultiplicityArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicityArgumentsContext multiplicityArguments() throws RecognitionException {
		MultiplicityArgumentsContext _localctx = new MultiplicityArgumentsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_multiplicityArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			multiplicityArgument();
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1541);
				match(COMMA);
				setState(1542);
				multiplicityArgument();
				}
				}
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicityArgumentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ToMultiplicityContext toMultiplicity() {
			return getRuleContext(ToMultiplicityContext.class,0);
		}
		public FromMultiplicityContext fromMultiplicity() {
			return getRuleContext(FromMultiplicityContext.class,0);
		}
		public TerminalNode DOTDOT() { return getToken(M3CoreParser.DOTDOT, 0); }
		public MultiplicityArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicityArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMultiplicityArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMultiplicityArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMultiplicityArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicityArgumentContext multiplicityArgument() throws RecognitionException {
		MultiplicityArgumentContext _localctx = new MultiplicityArgumentContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_multiplicityArgument);
		try {
			setState(1555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALID_STRING:
			case CLASS:
			case FUNCTION:
			case PROFILE:
			case ASSOCIATION:
			case ENUM:
			case MEASURE:
			case STEREOTYPES:
			case TAGS:
			case IMPORT:
			case LET:
			case AGGREGATION_TYPE:
			case PATH_SEPARATOR:
			case AS:
			case ALL:
			case PROJECTS:
			case ENFORCEMENT_LEVEL:
			case ENUMERATION_MAPPING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548);
				identifier();
				}
				break;
			case STAR:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1549);
					fromMultiplicity();
					setState(1550);
					match(DOTDOT);
					}
					break;
				}
				setState(1554);
				toMultiplicity();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeWithOperationContext> typeWithOperation() {
			return getRuleContexts(TypeWithOperationContext.class);
		}
		public TypeWithOperationContext typeWithOperation(int i) {
			return getRuleContext(TypeWithOperationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			typeWithOperation();
			setState(1562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1558);
				match(COMMA);
				setState(1559);
				typeWithOperation();
				}
				}
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeWithOperationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EqualTypeContext equalType() {
			return getRuleContext(EqualTypeContext.class,0);
		}
		public List<TypeAddSubOperationContext> typeAddSubOperation() {
			return getRuleContexts(TypeAddSubOperationContext.class);
		}
		public TypeAddSubOperationContext typeAddSubOperation(int i) {
			return getRuleContext(TypeAddSubOperationContext.class,i);
		}
		public SubsetTypeContext subsetType() {
			return getRuleContext(SubsetTypeContext.class,0);
		}
		public TypeWithOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeWithOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTypeWithOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTypeWithOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTypeWithOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeWithOperationContext typeWithOperation() throws RecognitionException {
		TypeWithOperationContext _localctx = new TypeWithOperationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_typeWithOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			type();
			setState(1567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1566);
				equalType();
				}
			}

			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(1569);
				typeAddSubOperation();
				}
				}
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBSET) {
				{
				setState(1575);
				subsetType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAddSubOperationContext extends ParserRuleContext {
		public AddTypeContext addType() {
			return getRuleContext(AddTypeContext.class,0);
		}
		public SubTypeContext subType() {
			return getRuleContext(SubTypeContext.class,0);
		}
		public TypeAddSubOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAddSubOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTypeAddSubOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTypeAddSubOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTypeAddSubOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAddSubOperationContext typeAddSubOperation() throws RecognitionException {
		TypeAddSubOperationContext _localctx = new TypeAddSubOperationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_typeAddSubOperation);
		try {
			setState(1580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1578);
				addType();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1579);
				subType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddTypeContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(M3CoreParser.PLUS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AddTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAddType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAddType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAddType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddTypeContext addType() throws RecognitionException {
		AddTypeContext _localctx = new AddTypeContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_addType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			match(PLUS);
			setState(1583);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubTypeContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(M3CoreParser.MINUS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SubTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterSubType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitSubType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitSubType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubTypeContext subType() throws RecognitionException {
		SubTypeContext _localctx = new SubTypeContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_subType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(MINUS);
			setState(1586);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubsetTypeContext extends ParserRuleContext {
		public TerminalNode SUBSET() { return getToken(M3CoreParser.SUBSET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SubsetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsetType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterSubsetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitSubsetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitSubsetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubsetTypeContext subsetType() throws RecognitionException {
		SubsetTypeContext _localctx = new SubsetTypeContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_subsetType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			match(SUBSET);
			setState(1589);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualTypeContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(M3CoreParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EqualTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterEqualType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitEqualType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitEqualType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualTypeContext equalType() throws RecognitionException {
		EqualTypeContext _localctx = new EqualTypeContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_equalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(EQUAL);
			setState(1592);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplictyParametersContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(M3CoreParser.PIPE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public MultiplictyParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplictyParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterMultiplictyParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitMultiplictyParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitMultiplictyParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplictyParametersContext multiplictyParameters() throws RecognitionException {
		MultiplictyParametersContext _localctx = new MultiplictyParametersContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_multiplictyParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(PIPE);
			setState(1595);
			identifier();
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1596);
				match(COMMA);
				setState(1597);
				identifier();
				}
				}
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DslContext extends ParserRuleContext {
		public TerminalNode DSL_TEXT() { return getToken(M3CoreParser.DSL_TEXT, 0); }
		public DslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterDsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitDsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitDsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DslContext dsl() throws RecognitionException {
		DslContext _localctx = new DslContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_dsl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			match(DSL_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationContext extends ParserRuleContext {
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode AGGREGATION_TYPE() { return getToken(M3CoreParser.AGGREGATION_TYPE, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_aggregation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			match(GROUP_OPEN);
			setState(1606);
			match(AGGREGATION_TYPE);
			setState(1607);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateSpecificationContext extends ParserRuleContext {
		public TerminalNode CAN_AGGREGATE() { return getToken(M3CoreParser.CAN_AGGREGATE, 0); }
		public TerminalNode BOOLEAN() { return getToken(M3CoreParser.BOOLEAN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public TerminalNode GROUP_BY_FUNCTIONS() { return getToken(M3CoreParser.GROUP_BY_FUNCTIONS, 0); }
		public List<TerminalNode> GROUP_OPEN() { return getTokens(M3CoreParser.GROUP_OPEN); }
		public TerminalNode GROUP_OPEN(int i) {
			return getToken(M3CoreParser.GROUP_OPEN, i);
		}
		public List<TerminalNode> GROUP_CLOSE() { return getTokens(M3CoreParser.GROUP_CLOSE); }
		public TerminalNode GROUP_CLOSE(int i) {
			return getToken(M3CoreParser.GROUP_CLOSE, i);
		}
		public TerminalNode AGGREGATE_VALUES() { return getToken(M3CoreParser.AGGREGATE_VALUES, 0); }
		public GroupByFunctionSpecificationsContext groupByFunctionSpecifications() {
			return getRuleContext(GroupByFunctionSpecificationsContext.class,0);
		}
		public AggregationFunctionSpecificationsContext aggregationFunctionSpecifications() {
			return getRuleContext(AggregationFunctionSpecificationsContext.class,0);
		}
		public AggregateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAggregateSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAggregateSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAggregateSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateSpecificationContext aggregateSpecification() throws RecognitionException {
		AggregateSpecificationContext _localctx = new AggregateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_aggregateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(CAN_AGGREGATE);
			setState(1610);
			match(BOOLEAN);
			setState(1611);
			match(COMMA);
			setState(1612);
			match(GROUP_BY_FUNCTIONS);
			setState(1613);
			match(GROUP_OPEN);
			setState(1615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2265251741374611458L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2055L) != 0)) {
				{
				setState(1614);
				groupByFunctionSpecifications();
				}
			}

			setState(1617);
			match(GROUP_CLOSE);
			setState(1618);
			match(COMMA);
			setState(1619);
			match(AGGREGATE_VALUES);
			setState(1620);
			match(GROUP_OPEN);
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_OPEN) {
				{
				setState(1621);
				aggregationFunctionSpecifications();
				}
			}

			setState(1624);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByFunctionSpecificationsContext extends ParserRuleContext {
		public List<GroupByFunctionSpecificationContext> groupByFunctionSpecification() {
			return getRuleContexts(GroupByFunctionSpecificationContext.class);
		}
		public GroupByFunctionSpecificationContext groupByFunctionSpecification(int i) {
			return getRuleContext(GroupByFunctionSpecificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public GroupByFunctionSpecificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByFunctionSpecifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterGroupByFunctionSpecifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitGroupByFunctionSpecifications(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitGroupByFunctionSpecifications(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByFunctionSpecificationsContext groupByFunctionSpecifications() throws RecognitionException {
		GroupByFunctionSpecificationsContext _localctx = new GroupByFunctionSpecificationsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_groupByFunctionSpecifications);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			groupByFunctionSpecification();
			setState(1631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1627);
				match(COMMA);
				setState(1628);
				groupByFunctionSpecification();
				}
				}
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByFunctionSpecificationContext extends ParserRuleContext {
		public CombinedExpressionContext combinedExpression() {
			return getRuleContext(CombinedExpressionContext.class,0);
		}
		public GroupByFunctionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByFunctionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterGroupByFunctionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitGroupByFunctionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitGroupByFunctionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByFunctionSpecificationContext groupByFunctionSpecification() throws RecognitionException {
		GroupByFunctionSpecificationContext _localctx = new GroupByFunctionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_groupByFunctionSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			combinedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationFunctionSpecificationsContext extends ParserRuleContext {
		public List<AggregationFunctionSpecificationContext> aggregationFunctionSpecification() {
			return getRuleContexts(AggregationFunctionSpecificationContext.class);
		}
		public AggregationFunctionSpecificationContext aggregationFunctionSpecification(int i) {
			return getRuleContext(AggregationFunctionSpecificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public AggregationFunctionSpecificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionSpecifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAggregationFunctionSpecifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAggregationFunctionSpecifications(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAggregationFunctionSpecifications(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionSpecificationsContext aggregationFunctionSpecifications() throws RecognitionException {
		AggregationFunctionSpecificationsContext _localctx = new AggregationFunctionSpecificationsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_aggregationFunctionSpecifications);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			aggregationFunctionSpecification();
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1637);
				match(COMMA);
				setState(1638);
				aggregationFunctionSpecification();
				}
				}
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationFunctionSpecificationContext extends ParserRuleContext {
		public TerminalNode GROUP_OPEN() { return getToken(M3CoreParser.GROUP_OPEN, 0); }
		public TerminalNode MAP_FN() { return getToken(M3CoreParser.MAP_FN, 0); }
		public List<TerminalNode> COLON() { return getTokens(M3CoreParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(M3CoreParser.COLON, i);
		}
		public List<CombinedExpressionContext> combinedExpression() {
			return getRuleContexts(CombinedExpressionContext.class);
		}
		public CombinedExpressionContext combinedExpression(int i) {
			return getRuleContext(CombinedExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(M3CoreParser.COMMA, 0); }
		public TerminalNode AGGREGATE_FN() { return getToken(M3CoreParser.AGGREGATE_FN, 0); }
		public TerminalNode GROUP_CLOSE() { return getToken(M3CoreParser.GROUP_CLOSE, 0); }
		public AggregationFunctionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAggregationFunctionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAggregationFunctionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAggregationFunctionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionSpecificationContext aggregationFunctionSpecification() throws RecognitionException {
		AggregationFunctionSpecificationContext _localctx = new AggregationFunctionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_aggregationFunctionSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(GROUP_OPEN);
			setState(1645);
			match(MAP_FN);
			setState(1646);
			match(COLON);
			setState(1647);
			combinedExpression();
			setState(1648);
			match(COMMA);
			setState(1649);
			match(AGGREGATE_FN);
			setState(1650);
			match(COLON);
			setState(1651);
			combinedExpression();
			setState(1652);
			match(GROUP_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TreePathContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TreePathClassBodyContext treePathClassBody() {
			return getRuleContext(TreePathClassBodyContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public TreePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTreePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTreePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTreePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreePathContext treePath() throws RecognitionException {
		TreePathContext _localctx = new TreePathContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_treePath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			type();
			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1655);
				alias();
				}
			}

			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(1658);
				stereotypes();
				}
			}

			setState(1662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1661);
				taggedValues();
				}
				break;
			}
			setState(1664);
			treePathClassBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TreePathClassBodyContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(M3CoreParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(M3CoreParser.CURLY_BRACKET_CLOSE, 0); }
		public SimplePropertyFilterContext simplePropertyFilter() {
			return getRuleContext(SimplePropertyFilterContext.class,0);
		}
		public List<DerivedPropertyContext> derivedProperty() {
			return getRuleContexts(DerivedPropertyContext.class);
		}
		public DerivedPropertyContext derivedProperty(int i) {
			return getRuleContext(DerivedPropertyContext.class,i);
		}
		public List<ComplexPropertyContext> complexProperty() {
			return getRuleContexts(ComplexPropertyContext.class);
		}
		public ComplexPropertyContext complexProperty(int i) {
			return getRuleContext(ComplexPropertyContext.class,i);
		}
		public TreePathClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treePathClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTreePathClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTreePathClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTreePathClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreePathClassBodyContext treePathClassBody() throws RecognitionException {
		TreePathClassBodyContext _localctx = new TreePathClassBodyContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_treePathClassBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(CURLY_BRACKET_OPEN);
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022722879488L) != 0)) {
				{
				setState(1667);
				simplePropertyFilter();
				}
			}

			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439477758L) != 0)) {
				{
				setState(1672);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATERTHAN:
					{
					setState(1670);
					derivedProperty();
					}
					break;
				case VALID_STRING:
				case CLASS:
				case FUNCTION:
				case PROFILE:
				case ASSOCIATION:
				case ENUM:
				case MEASURE:
				case STEREOTYPES:
				case TAGS:
				case IMPORT:
				case LET:
				case AGGREGATION_TYPE:
				case PATH_SEPARATOR:
				case AS:
				case ALL:
				case PROJECTS:
				case ENFORCEMENT_LEVEL:
				case ENUMERATION_MAPPING:
					{
					setState(1671);
					complexProperty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1677);
			match(CURLY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(M3CoreParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(AS);
			setState(1680);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimplePropertyFilterContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(M3CoreParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(M3CoreParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(M3CoreParser.MINUS, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public List<SimplePropertyContext> simpleProperty() {
			return getRuleContexts(SimplePropertyContext.class);
		}
		public SimplePropertyContext simpleProperty(int i) {
			return getRuleContext(SimplePropertyContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public SimplePropertyFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePropertyFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterSimplePropertyFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitSimplePropertyFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitSimplePropertyFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePropertyFilterContext simplePropertyFilter() throws RecognitionException {
		SimplePropertyFilterContext _localctx = new SimplePropertyFilterContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_simplePropertyFilter);
		int _la;
		try {
			setState(1695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1682);
				match(STAR);
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1683);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(1684);
				match(BRACKET_OPEN);
				setState(1685);
				simpleProperty();
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1686);
					match(COMMA);
					setState(1687);
					simpleProperty();
					}
					}
					setState(1692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1693);
				match(BRACKET_CLOSE);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimplePropertyContext extends ParserRuleContext {
		public PropertyRefContext propertyRef() {
			return getRuleContext(PropertyRefContext.class,0);
		}
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public SimplePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterSimpleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitSimpleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitSimpleProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePropertyContext simpleProperty() throws RecognitionException {
		SimplePropertyContext _localctx = new SimplePropertyContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_simpleProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			propertyRef();
			setState(1699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(1698);
				stereotypes();
				}
			}

			setState(1702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(1701);
				taggedValues();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexPropertyContext extends ParserRuleContext {
		public PropertyRefContext propertyRef() {
			return getRuleContext(PropertyRefContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public TreePathClassBodyContext treePathClassBody() {
			return getRuleContext(TreePathClassBodyContext.class,0);
		}
		public ComplexPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterComplexProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitComplexProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitComplexProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexPropertyContext complexProperty() throws RecognitionException {
		ComplexPropertyContext _localctx = new ComplexPropertyContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_complexProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			propertyRef();
			setState(1706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1705);
				alias();
				}
				break;
			}
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(1708);
				stereotypes();
				}
			}

			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1711);
				taggedValues();
				}
				break;
			}
			setState(1715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(1714);
				treePathClassBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DerivedPropertyContext extends ParserRuleContext {
		public TerminalNode GREATERTHAN() { return getToken(M3CoreParser.GREATERTHAN, 0); }
		public PropertyRefContext propertyRef() {
			return getRuleContext(PropertyRefContext.class,0);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(M3CoreParser.BRACKET_OPEN, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(M3CoreParser.BRACKET_CLOSE, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public StereotypesContext stereotypes() {
			return getRuleContext(StereotypesContext.class,0);
		}
		public TaggedValuesContext taggedValues() {
			return getRuleContext(TaggedValuesContext.class,0);
		}
		public TreePathClassBodyContext treePathClassBody() {
			return getRuleContext(TreePathClassBodyContext.class,0);
		}
		public DerivedPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivedProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterDerivedProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitDerivedProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitDerivedProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivedPropertyContext derivedProperty() throws RecognitionException {
		DerivedPropertyContext _localctx = new DerivedPropertyContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_derivedProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			match(GREATERTHAN);
			setState(1718);
			propertyRef();
			setState(1719);
			match(BRACKET_OPEN);
			setState(1720);
			codeBlock();
			setState(1721);
			match(BRACKET_CLOSE);
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1722);
				alias();
				}
				break;
			}
			setState(1726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(1725);
				stereotypes();
				}
			}

			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1728);
				taggedValues();
				}
				break;
			}
			setState(1732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_BRACKET_OPEN) {
				{
				setState(1731);
				treePathClassBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyRefContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> GROUP_OPEN() { return getTokens(M3CoreParser.GROUP_OPEN); }
		public TerminalNode GROUP_OPEN(int i) {
			return getToken(M3CoreParser.GROUP_OPEN, i);
		}
		public List<TerminalNode> GROUP_CLOSE() { return getTokens(M3CoreParser.GROUP_CLOSE); }
		public TerminalNode GROUP_CLOSE(int i) {
			return getToken(M3CoreParser.GROUP_CLOSE, i);
		}
		public List<TreePathPropertyParameterTypeContext> treePathPropertyParameterType() {
			return getRuleContexts(TreePathPropertyParameterTypeContext.class);
		}
		public TreePathPropertyParameterTypeContext treePathPropertyParameterType(int i) {
			return getRuleContext(TreePathPropertyParameterTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(M3CoreParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(M3CoreParser.COMMA, i);
		}
		public PropertyRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterPropertyRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitPropertyRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitPropertyRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyRefContext propertyRef() throws RecognitionException {
		PropertyRefContext _localctx = new PropertyRefContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_propertyRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			identifier();
			setState(1749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GROUP_OPEN) {
				{
				{
				setState(1735);
				match(GROUP_OPEN);
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76021758L) != 0)) {
					{
					setState(1736);
					treePathPropertyParameterType();
					setState(1741);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1737);
						match(COMMA);
						setState(1738);
						treePathPropertyParameterType();
						}
						}
						setState(1743);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1746);
				match(GROUP_CLOSE);
				}
				}
				setState(1751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TreePathPropertyParameterTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public TreePathPropertyParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treePathPropertyParameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).enterTreePathPropertyParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof M3CoreParserListener ) ((M3CoreParserListener)listener).exitTreePathPropertyParameterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M3CoreParserVisitor ) return ((M3CoreParserVisitor<? extends T>)visitor).visitTreePathPropertyParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreePathPropertyParameterTypeContext treePathPropertyParameterType() throws RecognitionException {
		TreePathPropertyParameterTypeContext _localctx = new TreePathPropertyParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_treePathPropertyParameterType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			type();
			setState(1753);
			multiplicity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001P\u06dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002"+
		"s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007w\u0002"+
		"x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007|\u0002"+
		"}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007\u0080"+
		"\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007\u0083"+
		"\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007\u0086"+
		"\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007\u0089"+
		"\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007\u008c"+
		"\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007\u008f"+
		"\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007\u0092"+
		"\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007\u0095"+
		"\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007\u0098"+
		"\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007\u009b"+
		"\u0002\u009c\u0007\u009c\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001"+
		"\u013e\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u0145\b\u0002\u000b\u0002\f\u0002\u0146\u0001\u0003\u0005"+
		"\u0003\u014a\b\u0003\n\u0003\f\u0003\u014d\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u015e\b\u0005\n\u0005\f\u0005\u0161\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0167\b\u0006\u0001"+
		"\u0006\u0003\u0006\u016a\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u016e"+
		"\b\u0006\u0001\u0006\u0003\u0006\u0171\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0179\b\u0006"+
		"\n\u0006\f\u0006\u017c\t\u0006\u0003\u0006\u017e\b\u0006\u0001\u0006\u0003"+
		"\u0006\u0181\b\u0006\u0001\u0006\u0003\u0006\u0184\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u018a\b\u0007\n\u0007"+
		"\f\u0007\u018d\t\u0007\u0003\u0007\u018f\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0003\b\u0195\b\b\u0001\b\u0003\b\u0198\b\b\u0001\b\u0001"+
		"\b\u0003\b\u019c\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u01a1\b\b\u0001\t"+
		"\u0001\t\u0003\t\u01a5\b\t\u0001\t\u0003\t\u01a8\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0005\n\u01af\b\n\n\n\f\n\u01b2\t\n\u0001\n\u0001\n"+
		"\u0005\n\u01b6\b\n\n\n\f\n\u01b9\t\n\u0001\n\u0004\n\u01bc\b\n\u000b\n"+
		"\f\n\u01bd\u0003\n\u01c0\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u01d4\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01d8\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01dd\b\u000f\n\u000f\f\u000f"+
		"\u01e0\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01ea\b\u0010\u0003\u0010"+
		"\u01ec\b\u0010\u0001\u0010\u0003\u0010\u01ef\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01f6\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u01fe\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u020c\b\u0015\n\u0015\f\u0015\u020f\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0213\b\u0016\u0001\u0017\u0003\u0017"+
		"\u0216\b\u0017\u0001\u0017\u0003\u0017\u0219\b\u0017\u0001\u0017\u0003"+
		"\u0017\u021c\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0222\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u0227"+
		"\b\u0018\u0001\u0018\u0003\u0018\u022a\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0236\b\u0019\n\u0019\f\u0019\u0239"+
		"\t\u0019\u0003\u0019\u023b\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0244\b\u001a"+
		"\u0001\u001a\u0003\u001a\u0247\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u024c\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u025c\b\u001d"+
		"\u0001\u001d\u0003\u001d\u025f\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u0266\b\u001d\n\u001d\f\u001d\u0269"+
		"\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0003\u001e\u026e\b\u001e"+
		"\u0001\u001e\u0003\u001e\u0271\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0278\b\u001f\u0001\u001f\u0003\u001f"+
		"\u027b\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u027f\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u0288"+
		"\b \n \f \u028b\t \u0003 \u028d\b \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001!\u0001!\u0003!\u0296\b!\u0001!\u0003!\u0299\b!\u0001!\u0001!\u0003"+
		"!\u029d\b!\u0001!\u0001!\u0003!\u02a1\b!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u02ac\b\"\n\"\f\"\u02af\t\""+
		"\u0003\"\u02b1\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02c0\b#\u0001$\u0001"+
		"$\u0005$\u02c4\b$\n$\f$\u02c7\t$\u0001$\u0003$\u02ca\b$\u0001%\u0001%"+
		"\u0001%\u0001%\u0005%\u02d0\b%\n%\f%\u02d3\t%\u0003%\u02d5\b%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0003&\u02dd\b&\u0001&\u0001&\u0003&\u02e1"+
		"\b&\u0001&\u0003&\u02e4\b&\u0001&\u0003&\u02e7\b&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u02f7\b&\u0001&\u0001&\u0003&\u02fb\b&\u0001&\u0001&\u0001"+
		"&\u0001&\u0005&\u0301\b&\n&\f&\u0304\t&\u0003&\u0306\b&\u0001&\u0001&"+
		"\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0003*\u0317\b*\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u031f\b,\n,\f,\u0322\t,\u0003,\u0324\b,\u0001,\u0001,"+
		"\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0330"+
		"\b-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u0001"+
		"2\u00052\u0346\b2\n2\f2\u0349\t2\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00054\u0356\b4\n4\f4\u0359\t4\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00055\u0364"+
		"\b5\n5\f5\u0367\t5\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00037\u0372\b7\u00018\u00018\u00018\u00018\u00058\u0378\b8\n"+
		"8\f8\u037b\t8\u00038\u037d\b8\u00018\u00018\u00019\u00019\u00039\u0383"+
		"\b9\u00019\u00039\u0386\b9\u00019\u00019\u00019\u00039\u038b\b9\u0001"+
		"9\u00039\u038e\b9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0005:\u0398\b:\n:\f:\u039b\t:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0005;\u03a6\b;\n;\f;\u03a9\t;\u0001;\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001<\u0005<\u03b3\b<\n<\f<\u03b6\t<\u0003"+
		"<\u03b8\b<\u0001=\u0001=\u0003=\u03bc\b=\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0005?\u03c3\b?\n?\f?\u03c6\t?\u0001@\u0001@\u0003@\u03ca\b@\u0001A"+
		"\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0005B\u03d3\bB\nB\fB\u03d6"+
		"\tB\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0005D\u03de\bD\nD\fD\u03e1"+
		"\tD\u0003D\u03e3\bD\u0001D\u0001D\u0001E\u0001E\u0003E\u03e9\bE\u0001"+
		"F\u0001F\u0001F\u0001F\u0003F\u03ef\bF\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0005G\u03f8\bG\nG\fG\u03fb\tG\u0001H\u0001H\u0001H\u0001"+
		"H\u0003H\u0401\bH\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0005I\u0409"+
		"\bI\nI\fI\u040c\tI\u0003I\u040e\bI\u0001I\u0001I\u0001J\u0001J\u0001J"+
		"\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u041b\bJ\u0001J\u0001"+
		"J\u0003J\u041f\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0005K\u0427"+
		"\bK\nK\fK\u042a\tK\u0003K\u042c\bK\u0001K\u0003K\u042f\bK\u0001L\u0001"+
		"L\u0001L\u0001L\u0003L\u0435\bL\u0001L\u0003L\u0438\bL\u0001L\u0003L\u043b"+
		"\bL\u0003L\u043d\bL\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0003N\u0445"+
		"\bN\u0001N\u0003N\u0448\bN\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u044f"+
		"\bO\u0001P\u0001P\u0001P\u0001P\u0005P\u0455\bP\nP\fP\u0458\tP\u0003P"+
		"\u045a\bP\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0003R\u0467\bR\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"T\u0001T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u0481"+
		"\bV\u0001V\u0001V\u0001W\u0001W\u0001W\u0003W\u0488\bW\u0001X\u0001X\u0001"+
		"X\u0003X\u048d\bX\u0001X\u0001X\u0003X\u0491\bX\u0001X\u0001X\u0003X\u0495"+
		"\bX\u0001X\u0003X\u0498\bX\u0001X\u0003X\u049b\bX\u0001X\u0003X\u049e"+
		"\bX\u0001X\u0001X\u0003X\u04a2\bX\u0001X\u0001X\u0005X\u04a6\bX\nX\fX"+
		"\u04a9\tX\u0001X\u0001X\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0003Z\u04b2"+
		"\bZ\u0001[\u0001[\u0001[\u0005[\u04b7\b[\n[\f[\u04ba\t[\u0001[\u0003["+
		"\u04bd\b[\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\"+
		"\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u04cf\b\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0005]\u04d7"+
		"\b]\n]\f]\u04da\t]\u0001]\u0001]\u0001^\u0001^\u0003^\u04e0\b^\u0001_"+
		"\u0003_\u04e3\b_\u0001_\u0001_\u0001`\u0001`\u0001`\u0003`\u04ea\b`\u0001"+
		"`\u0003`\u04ed\b`\u0001`\u0001`\u0003`\u04f1\b`\u0001`\u0003`\u04f4\b"+
		"`\u0001`\u0001`\u0001a\u0001a\u0001a\u0001a\u0001b\u0001b\u0001b\u0001"+
		"b\u0001c\u0001c\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001e\u0001"+
		"e\u0001e\u0001e\u0001f\u0001f\u0001f\u0001g\u0001g\u0001g\u0001h\u0001"+
		"h\u0001h\u0001i\u0001i\u0001i\u0001j\u0001j\u0003j\u051a\bj\u0001k\u0001"+
		"k\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001l\u0001l\u0001l\u0001"+
		"l\u0001l\u0001l\u0001l\u0001l\u0001l\u0003l\u052d\bl\u0001m\u0001m\u0001"+
		"n\u0003n\u0532\bn\u0001n\u0001n\u0003n\u0536\bn\u0001n\u0001n\u0003n\u053a"+
		"\bn\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0003n\u0543\bn\u0001"+
		"o\u0001o\u0001o\u0001o\u0005o\u0549\bo\no\fo\u054c\to\u0001o\u0001o\u0001"+
		"o\u0001o\u0005o\u0552\bo\no\fo\u0555\to\u0001o\u0001o\u0001o\u0001o\u0005"+
		"o\u055b\bo\no\fo\u055e\to\u0001o\u0001o\u0001o\u0001o\u0005o\u0564\bo"+
		"\no\fo\u0567\to\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001"+
		"o\u0003o\u0571\bo\u0001p\u0001p\u0001p\u0001p\u0001p\u0003p\u0578\bp\u0001"+
		"q\u0001q\u0001q\u0001q\u0001q\u0001r\u0001r\u0001r\u0003r\u0582\br\u0001"+
		"r\u0001r\u0003r\u0586\br\u0001r\u0003r\u0589\br\u0001r\u0003r\u058c\b"+
		"r\u0001r\u0001r\u0003r\u0590\br\u0001r\u0001r\u0005r\u0594\br\nr\fr\u0597"+
		"\tr\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0005"+
		"r\u05a2\br\nr\fr\u05a5\tr\u0001r\u0001r\u0001r\u0003r\u05aa\br\u0001s"+
		"\u0001s\u0001s\u0001s\u0005s\u05b0\bs\ns\fs\u05b3\ts\u0003s\u05b5\bs\u0001"+
		"s\u0001s\u0001t\u0001t\u0001t\u0001t\u0003t\u05bd\bt\u0001u\u0001u\u0003"+
		"u\u05c1\bu\u0001v\u0001v\u0003v\u05c5\bv\u0001w\u0001w\u0003w\u05c9\b"+
		"w\u0001x\u0001x\u0001x\u0001x\u0001y\u0001y\u0001z\u0001z\u0001{\u0001"+
		"{\u0003{\u05d5\b{\u0001|\u0001|\u0001|\u0001}\u0001}\u0001}\u0003}\u05dd"+
		"\b}\u0001}\u0003}\u05e0\b}\u0001}\u0001}\u0001~\u0001~\u0001~\u0003~\u05e7"+
		"\b~\u0001~\u0003~\u05ea\b~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001"+
		"\u007f\u0005\u007f\u05f1\b\u007f\n\u007f\f\u007f\u05f4\t\u007f\u0001\u0080"+
		"\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0005\u0081\u05fb\b\u0081"+
		"\n\u0081\f\u0081\u05fe\t\u0081\u0001\u0082\u0003\u0082\u0601\b\u0082\u0001"+
		"\u0082\u0001\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0005\u0083\u0608"+
		"\b\u0083\n\u0083\f\u0083\u060b\t\u0083\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0003\u0084\u0611\b\u0084\u0001\u0084\u0003\u0084\u0614\b"+
		"\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0005\u0085\u0619\b\u0085\n"+
		"\u0085\f\u0085\u061c\t\u0085\u0001\u0086\u0001\u0086\u0003\u0086\u0620"+
		"\b\u0086\u0001\u0086\u0005\u0086\u0623\b\u0086\n\u0086\f\u0086\u0626\t"+
		"\u0086\u0001\u0086\u0003\u0086\u0629\b\u0086\u0001\u0087\u0001\u0087\u0003"+
		"\u0087\u062d\b\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0005"+
		"\u008c\u063f\b\u008c\n\u008c\f\u008c\u0642\t\u008c\u0001\u008d\u0001\u008d"+
		"\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0650\b\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003\u008f"+
		"\u0657\b\u008f\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0005\u0090\u065e\b\u0090\n\u0090\f\u0090\u0661\t\u0090\u0001\u0091\u0001"+
		"\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0005\u0092\u0668\b\u0092\n"+
		"\u0092\f\u0092\u066b\t\u0092\u0001\u0093\u0001\u0093\u0001\u0093\u0001"+
		"\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001"+
		"\u0093\u0001\u0094\u0001\u0094\u0003\u0094\u0679\b\u0094\u0001\u0094\u0003"+
		"\u0094\u067c\b\u0094\u0001\u0094\u0003\u0094\u067f\b\u0094\u0001\u0094"+
		"\u0001\u0094\u0001\u0095\u0001\u0095\u0003\u0095\u0685\b\u0095\u0001\u0095"+
		"\u0001\u0095\u0005\u0095\u0689\b\u0095\n\u0095\f\u0095\u068c\t\u0095\u0001"+
		"\u0095\u0001\u0095\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0097\u0001"+
		"\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0005\u0097\u0699"+
		"\b\u0097\n\u0097\f\u0097\u069c\t\u0097\u0001\u0097\u0001\u0097\u0003\u0097"+
		"\u06a0\b\u0097\u0001\u0098\u0001\u0098\u0003\u0098\u06a4\b\u0098\u0001"+
		"\u0098\u0003\u0098\u06a7\b\u0098\u0001\u0099\u0001\u0099\u0003\u0099\u06ab"+
		"\b\u0099\u0001\u0099\u0003\u0099\u06ae\b\u0099\u0001\u0099\u0003\u0099"+
		"\u06b1\b\u0099\u0001\u0099\u0003\u0099\u06b4\b\u0099\u0001\u009a\u0001"+
		"\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a\u06bc"+
		"\b\u009a\u0001\u009a\u0003\u009a\u06bf\b\u009a\u0001\u009a\u0003\u009a"+
		"\u06c2\b\u009a\u0001\u009a\u0003\u009a\u06c5\b\u009a\u0001\u009b\u0001"+
		"\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0005\u009b\u06cc\b\u009b\n"+
		"\u009b\f\u009b\u06cf\t\u009b\u0003\u009b\u06d1\b\u009b\u0001\u009b\u0005"+
		"\u009b\u06d4\b\u009b\n\u009b\f\u009b\u06d7\t\u009b\u0001\u009c\u0001\u009c"+
		"\u0001\u009c\u0001\u009c\u0000\u0000\u009d\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u0000\u0005\u0001\u0000\u0001\u0012\u0001\u000023\u0002"+
		"\u0000  >>\u0004\u0000##**77?B\u0002\u0000\u0013\u0013**\u0745\u0000\u013a"+
		"\u0001\u0000\u0000\u0000\u0002\u013d\u0001\u0000\u0000\u0000\u0004\u0144"+
		"\u0001\u0000\u0000\u0000\u0006\u014b\u0001\u0000\u0000\u0000\b\u014e\u0001"+
		"\u0000\u0000\u0000\n\u0153\u0001\u0000\u0000\u0000\f\u0164\u0001\u0000"+
		"\u0000\u0000\u000e\u0185\u0001\u0000\u0000\u0000\u0010\u0192\u0001\u0000"+
		"\u0000\u0000\u0012\u01a2\u0001\u0000\u0000\u0000\u0014\u01ac\u0001\u0000"+
		"\u0000\u0000\u0016\u01c3\u0001\u0000\u0000\u0000\u0018\u01c6\u0001\u0000"+
		"\u0000\u0000\u001a\u01ca\u0001\u0000\u0000\u0000\u001c\u01cd\u0001\u0000"+
		"\u0000\u0000\u001e\u01d3\u0001\u0000\u0000\u0000 \u01eb\u0001\u0000\u0000"+
		"\u0000\"\u01f9\u0001\u0000\u0000\u0000$\u0201\u0001\u0000\u0000\u0000"+
		"&\u0203\u0001\u0000\u0000\u0000(\u0205\u0001\u0000\u0000\u0000*\u020d"+
		"\u0001\u0000\u0000\u0000,\u0212\u0001\u0000\u0000\u0000.\u0215\u0001\u0000"+
		"\u0000\u00000\u0226\u0001\u0000\u0000\u00002\u0231\u0001\u0000\u0000\u0000"+
		"4\u0241\u0001\u0000\u0000\u00006\u024d\u0001\u0000\u0000\u00008\u0251"+
		"\u0001\u0000\u0000\u0000:\u0259\u0001\u0000\u0000\u0000<\u026d\u0001\u0000"+
		"\u0000\u0000>\u0274\u0001\u0000\u0000\u0000@\u0283\u0001\u0000\u0000\u0000"+
		"B\u0293\u0001\u0000\u0000\u0000D\u02a6\u0001\u0000\u0000\u0000F\u02bf"+
		"\u0001\u0000\u0000\u0000H\u02c1\u0001\u0000\u0000\u0000J\u02cb\u0001\u0000"+
		"\u0000\u0000L\u02d8\u0001\u0000\u0000\u0000N\u0309\u0001\u0000\u0000\u0000"+
		"P\u030c\u0001\u0000\u0000\u0000R\u0310\u0001\u0000\u0000\u0000T\u0316"+
		"\u0001\u0000\u0000\u0000V\u0318\u0001\u0000\u0000\u0000X\u031a\u0001\u0000"+
		"\u0000\u0000Z\u032f\u0001\u0000\u0000\u0000\\\u0331\u0001\u0000\u0000"+
		"\u0000^\u0335\u0001\u0000\u0000\u0000`\u0339\u0001\u0000\u0000\u0000b"+
		"\u033d\u0001\u0000\u0000\u0000d\u0340\u0001\u0000\u0000\u0000f\u034d\u0001"+
		"\u0000\u0000\u0000h\u0351\u0001\u0000\u0000\u0000j\u035c\u0001\u0000\u0000"+
		"\u0000l\u0368\u0001\u0000\u0000\u0000n\u0371\u0001\u0000\u0000\u0000p"+
		"\u0373\u0001\u0000\u0000\u0000r\u0380\u0001\u0000\u0000\u0000t\u0391\u0001"+
		"\u0000\u0000\u0000v\u039f\u0001\u0000\u0000\u0000x\u03ad\u0001\u0000\u0000"+
		"\u0000z\u03bb\u0001\u0000\u0000\u0000|\u03bd\u0001\u0000\u0000\u0000~"+
		"\u03c0\u0001\u0000\u0000\u0000\u0080\u03c9\u0001\u0000\u0000\u0000\u0082"+
		"\u03cb\u0001\u0000\u0000\u0000\u0084\u03d0\u0001\u0000\u0000\u0000\u0086"+
		"\u03d7\u0001\u0000\u0000\u0000\u0088\u03d9\u0001\u0000\u0000\u0000\u008a"+
		"\u03e8\u0001\u0000\u0000\u0000\u008c\u03ea\u0001\u0000\u0000\u0000\u008e"+
		"\u03f0\u0001\u0000\u0000\u0000\u0090\u03fc\u0001\u0000\u0000\u0000\u0092"+
		"\u0404\u0001\u0000\u0000\u0000\u0094\u041e\u0001\u0000\u0000\u0000\u0096"+
		"\u0420\u0001\u0000\u0000\u0000\u0098\u0430\u0001\u0000\u0000\u0000\u009a"+
		"\u043e\u0001\u0000\u0000\u0000\u009c\u0444\u0001\u0000\u0000\u0000\u009e"+
		"\u044e\u0001\u0000\u0000\u0000\u00a0\u0450\u0001\u0000\u0000\u0000\u00a2"+
		"\u045e\u0001\u0000\u0000\u0000\u00a4\u0466\u0001\u0000\u0000\u0000\u00a6"+
		"\u0468\u0001\u0000\u0000\u0000\u00a8\u046d\u0001\u0000\u0000\u0000\u00aa"+
		"\u0472\u0001\u0000\u0000\u0000\u00ac\u047a\u0001\u0000\u0000\u0000\u00ae"+
		"\u0487\u0001\u0000\u0000\u0000\u00b0\u0489\u0001\u0000\u0000\u0000\u00b2"+
		"\u04ac\u0001\u0000\u0000\u0000\u00b4\u04b1\u0001\u0000\u0000\u0000\u00b6"+
		"\u04b3\u0001\u0000\u0000\u0000\u00b8\u04c1\u0001\u0000\u0000\u0000\u00ba"+
		"\u04d2\u0001\u0000\u0000\u0000\u00bc\u04df\u0001\u0000\u0000\u0000\u00be"+
		"\u04e2\u0001\u0000\u0000\u0000\u00c0\u04e6\u0001\u0000\u0000\u0000\u00c2"+
		"\u04f7\u0001\u0000\u0000\u0000\u00c4\u04fb\u0001\u0000\u0000\u0000\u00c6"+
		"\u04ff\u0001\u0000\u0000\u0000\u00c8\u0503\u0001\u0000\u0000\u0000\u00ca"+
		"\u0507\u0001\u0000\u0000\u0000\u00cc\u050b\u0001\u0000\u0000\u0000\u00ce"+
		"\u050e\u0001\u0000\u0000\u0000\u00d0\u0511\u0001\u0000\u0000\u0000\u00d2"+
		"\u0514\u0001\u0000\u0000\u0000\u00d4\u0517\u0001\u0000\u0000\u0000\u00d6"+
		"\u051b\u0001\u0000\u0000\u0000\u00d8\u052c\u0001\u0000\u0000\u0000\u00da"+
		"\u052e\u0001\u0000\u0000\u0000\u00dc\u0542\u0001\u0000\u0000\u0000\u00de"+
		"\u0570\u0001\u0000\u0000\u0000\u00e0\u0577\u0001\u0000\u0000\u0000\u00e2"+
		"\u0579\u0001\u0000\u0000\u0000\u00e4\u05a9\u0001\u0000\u0000\u0000\u00e6"+
		"\u05ab\u0001\u0000\u0000\u0000\u00e8\u05b8\u0001\u0000\u0000\u0000\u00ea"+
		"\u05c0\u0001\u0000\u0000\u0000\u00ec\u05c4\u0001\u0000\u0000\u0000\u00ee"+
		"\u05c8\u0001\u0000\u0000\u0000\u00f0\u05ca\u0001\u0000\u0000\u0000\u00f2"+
		"\u05ce\u0001\u0000\u0000\u0000\u00f4\u05d0\u0001\u0000\u0000\u0000\u00f6"+
		"\u05d4\u0001\u0000\u0000\u0000\u00f8\u05d6\u0001\u0000\u0000\u0000\u00fa"+
		"\u05d9\u0001\u0000\u0000\u0000\u00fc\u05e3\u0001\u0000\u0000\u0000\u00fe"+
		"\u05ed\u0001\u0000\u0000\u0000\u0100\u05f5\u0001\u0000\u0000\u0000\u0102"+
		"\u05f7\u0001\u0000\u0000\u0000\u0104\u0600\u0001\u0000\u0000\u0000\u0106"+
		"\u0604\u0001\u0000\u0000\u0000\u0108\u0613\u0001\u0000\u0000\u0000\u010a"+
		"\u0615\u0001\u0000\u0000\u0000\u010c\u061d\u0001\u0000\u0000\u0000\u010e"+
		"\u062c\u0001\u0000\u0000\u0000\u0110\u062e\u0001\u0000\u0000\u0000\u0112"+
		"\u0631\u0001\u0000\u0000\u0000\u0114\u0634\u0001\u0000\u0000\u0000\u0116"+
		"\u0637\u0001\u0000\u0000\u0000\u0118\u063a\u0001\u0000\u0000\u0000\u011a"+
		"\u0643\u0001\u0000\u0000\u0000\u011c\u0645\u0001\u0000\u0000\u0000\u011e"+
		"\u0649\u0001\u0000\u0000\u0000\u0120\u065a\u0001\u0000\u0000\u0000\u0122"+
		"\u0662\u0001\u0000\u0000\u0000\u0124\u0664\u0001\u0000\u0000\u0000\u0126"+
		"\u066c\u0001\u0000\u0000\u0000\u0128\u0676\u0001\u0000\u0000\u0000\u012a"+
		"\u0682\u0001\u0000\u0000\u0000\u012c\u068f\u0001\u0000\u0000\u0000\u012e"+
		"\u069f\u0001\u0000\u0000\u0000\u0130\u06a1\u0001\u0000\u0000\u0000\u0132"+
		"\u06a8\u0001\u0000\u0000\u0000\u0134\u06b5\u0001\u0000\u0000\u0000\u0136"+
		"\u06c6\u0001\u0000\u0000\u0000\u0138\u06d8\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0007\u0000\u0000\u0000\u013b\u0001\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0003\u0004\u0002\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0003\u0000\u0000\u0000\u0140\u0003\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0003\u0000\u0000\u0000\u0142\u0143\u0005\r\u0000\u0000\u0143\u0145"+
		"\u0001\u0000\u0000\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0005\u0001\u0000\u0000\u0000\u0148\u014a"+
		"\u0003\b\u0004\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001"+
		"\u0000\u0000\u0000\u014c\u0007\u0001\u0000\u0000\u0000\u014d\u014b\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0005\n\u0000\u0000\u014f\u0150\u0003\u0004"+
		"\u0002\u0000\u0150\u0151\u0005\u0013\u0000\u0000\u0151\u0152\u0005\u0014"+
		"\u0000\u0000\u0152\t\u0001\u0000\u0000\u0000\u0153\u015f\u0003\u0006\u0003"+
		"\u0000\u0154\u015e\u0003r9\u0000\u0155\u015e\u0003\f\u0006\u0000\u0156"+
		"\u015e\u0003\u0010\b\u0000\u0157\u015e\u00034\u001a\u0000\u0158\u015e"+
		"\u0003:\u001d\u0000\u0159\u015e\u0003>\u001f\u0000\u015a\u015e\u0003B"+
		"!\u0000\u015b\u015e\u0003L&\u0000\u015c\u015e\u0003\u0012\t\u0000\u015d"+
		"\u0154\u0001\u0000\u0000\u0000\u015d\u0155\u0001\u0000\u0000\u0000\u015d"+
		"\u0156\u0001\u0000\u0000\u0000\u015d\u0157\u0001\u0000\u0000\u0000\u015d"+
		"\u0158\u0001\u0000\u0000\u0000\u015d\u0159\u0001\u0000\u0000\u0000\u015d"+
		"\u015a\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u0162\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0005\u0000\u0000\u0001\u0163\u000b\u0001\u0000\u0000\u0000\u0164"+
		"\u0166\u0005\u0002\u0000\u0000\u0165\u0167\u0003d2\u0000\u0166\u0165\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001"+
		"\u0000\u0000\u0000\u0168\u016a\u0003h4\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u016d\u0003\u0002\u0001\u0000\u016c\u016e\u0003\u000e\u0007"+
		"\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u0171\u0003\u00fc~\u0000"+
		"\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u0183\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0010\u0000\u0000"+
		"\u0173\u0184\u0003\u00f6{\u0000\u0174\u0175\u0005\u0015\u0000\u0000\u0175"+
		"\u017a\u0003\u00e4r\u0000\u0176\u0177\u0005\u0016\u0000\u0000\u0177\u0179"+
		"\u0003\u00e4r\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017c\u0001"+
		"\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001"+
		"\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017d\u0174\u0001\u0000\u0000\u0000\u017d\u017e\u0001"+
		"\u0000\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u0181\u0003"+
		"\u00ba]\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0003(\u0014"+
		"\u0000\u0183\u0172\u0001\u0000\u0000\u0000\u0183\u017d\u0001\u0000\u0000"+
		"\u0000\u0184\r\u0001\u0000\u0000\u0000\u0185\u018e\u0005\u0017\u0000\u0000"+
		"\u0186\u018b\u0003\u00e2q\u0000\u0187\u0188\u0005\u0016\u0000\u0000\u0188"+
		"\u018a\u0003\u00e2q\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018d"+
		"\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b"+
		"\u0001\u0000\u0000\u0000\u018e\u0186\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0005\u0018\u0000\u0000\u0191\u000f\u0001\u0000\u0000\u0000\u0192\u0194"+
		"\u0005\u0019\u0000\u0000\u0193\u0195\u0003d2\u0000\u0194\u0193\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0001\u0000"+
		"\u0000\u0000\u0196\u0198\u0003h4\u0000\u0197\u0196\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000"+
		"\u0199\u019b\u0003\u0002\u0001\u0000\u019a\u019c\u0003\u000e\u0007\u0000"+
		"\u019b\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0015\u0000\u0000"+
		"\u019e\u01a0\u0003\u00e4r\u0000\u019f\u01a1\u0003\u00ba]\u0000\u01a0\u019f"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u0011"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a4\u0005\u0007\u0000\u0000\u01a3\u01a5"+
		"\u0003d2\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003h4\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0003\u0002\u0001\u0000"+
		"\u01aa\u01ab\u0003\u0014\n\u0000\u01ab\u0013\u0001\u0000\u0000\u0000\u01ac"+
		"\u01bf\u0005\u001a\u0000\u0000\u01ad\u01af\u0003\u0018\f\u0000\u01ae\u01ad"+
		"\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b7"+
		"\u0003\u0016\u000b\u0000\u01b4\u01b6\u0003\u0018\f\u0000\u01b5\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01c0\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bc\u0003"+
		"\u001a\r\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000"+
		"\u0000\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01b0\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bb\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0005\u001b\u0000\u0000\u01c2\u0015\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0005\u0013\u0000\u0000\u01c4\u01c5\u0003\u0018"+
		"\f\u0000\u01c5\u0017\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0005\u001c\u0000\u0000\u01c8\u01c9\u0003\u001c\u000e"+
		"\u0000\u01c9\u0019\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0005\u0014\u0000\u0000\u01cc\u001b\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0003\u0000\u0000\u0000\u01ce\u01cf\u0005\u001d\u0000"+
		"\u0000\u01cf\u01d0\u0003x<\u0000\u01d0\u001d\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0005\u001e\u0000\u0000\u01d2\u01d4\u0003\u0002\u0001\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005\u001f\u0000\u0000\u01d6"+
		"\u01d8\u0003\u0084B\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01de"+
		"\u0003 \u0010\u0000\u01da\u01db\u0005\u0016\u0000\u0000\u01db\u01dd\u0003"+
		" \u0010\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001\u0000"+
		"\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01df\u001f\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0005 \u0000\u0000\u01e2\u01e3\u0003\u0002\u0001"+
		"\u0000\u01e3\u01e4\u0005\u001c\u0000\u0000\u01e4\u01e5\u0003\u00e4r\u0000"+
		"\u01e5\u01e6\u0003\u00f0x\u0000\u01e6\u01ec\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e9\u0003\u0002\u0001\u0000\u01e8\u01ea\u0003\"\u0011\u0000\u01e9\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec"+
		"\u0001\u0000\u0000\u0000\u01eb\u01e1\u0001\u0000\u0000\u0000\u01eb\u01e7"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01ef"+
		"\u0005\u0013\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f5"+
		"\u0005\u001c\u0000\u0000\u01f1\u01f2\u0005\u0012\u0000\u0000\u01f2\u01f3"+
		"\u0003\u0000\u0000\u0000\u01f3\u01f4\u0005\u001c\u0000\u0000\u01f4\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f1\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0003\u0084B\u0000\u01f8!\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005!"+
		"\u0000\u0000\u01fa\u01fd\u0003$\u0012\u0000\u01fb\u01fc\u0005\u0016\u0000"+
		"\u0000\u01fc\u01fe\u0003&\u0013\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0005\"\u0000\u0000\u0200#\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0003\u0002\u0001\u0000\u0202%\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0003\u0002\u0001\u0000\u0204\'\u0001\u0000\u0000\u0000\u0205\u0206\u0005"+
		"\u001a\u0000\u0000\u0206\u0207\u0003*\u0015\u0000\u0207\u0208\u0005\u001b"+
		"\u0000\u0000\u0208)\u0001\u0000\u0000\u0000\u0209\u020c\u0003.\u0017\u0000"+
		"\u020a\u020c\u00030\u0018\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b"+
		"\u020a\u0001\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d"+
		"\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e"+
		"+\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0213"+
		"\u0003\u0000\u0000\u0000\u0211\u0213\u0005#\u0000\u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213-\u0001\u0000"+
		"\u0000\u0000\u0214\u0216\u0003d2\u0000\u0215\u0214\u0001\u0000\u0000\u0000"+
		"\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000"+
		"\u0217\u0219\u0003h4\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0218\u0219"+
		"\u0001\u0000\u0000\u0000\u0219\u021b\u0001\u0000\u0000\u0000\u021a\u021c"+
		"\u0003\u011c\u008e\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0003,\u0016\u0000\u021e\u021f\u0005\u001c\u0000\u0000\u021f\u0221\u0003"+
		"b1\u0000\u0220\u0222\u0003l6\u0000\u0221\u0220\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\u0005\u0014\u0000\u0000\u0224/\u0001\u0000\u0000\u0000\u0225"+
		"\u0227\u0003d2\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001"+
		"\u0000\u0000\u0000\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u022a\u0003"+
		"h4\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0003\u0000\u0000"+
		"\u0000\u022c\u022d\u00032\u0019\u0000\u022d\u022e\u0005\u001c\u0000\u0000"+
		"\u022e\u022f\u0003b1\u0000\u022f\u0230\u0005\u0014\u0000\u0000\u02301"+
		"\u0001\u0000\u0000\u0000\u0231\u023a\u0005\u0017\u0000\u0000\u0232\u0237"+
		"\u0003\u00e2q\u0000\u0233\u0234\u0005\u0016\u0000\u0000\u0234\u0236\u0003"+
		"\u00e2q\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000"+
		"\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000"+
		"\u0000\u0000\u0238\u023b\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000"+
		"\u0000\u0000\u023a\u0232\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000"+
		"\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0005\u0018"+
		"\u0000\u0000\u023d\u023e\u0005\u001a\u0000\u0000\u023e\u023f\u0003x<\u0000"+
		"\u023f\u0240\u0005\u001b\u0000\u0000\u02403\u0001\u0000\u0000\u0000\u0241"+
		"\u0243\u0005\u0005\u0000\u0000\u0242\u0244\u0003d2\u0000\u0243\u0242\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0246\u0001"+
		"\u0000\u0000\u0000\u0245\u0247\u0003h4\u0000\u0246\u0245\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000"+
		"\u0000\u0248\u024b\u0003\u0002\u0001\u0000\u0249\u024c\u00038\u001c\u0000"+
		"\u024a\u024c\u00036\u001b\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b"+
		"\u024a\u0001\u0000\u0000\u0000\u024c5\u0001\u0000\u0000\u0000\u024d\u024e"+
		"\u0005\u001a\u0000\u0000\u024e\u024f\u0003*\u0015\u0000\u024f\u0250\u0005"+
		"\u001b\u0000\u0000\u02507\u0001\u0000\u0000\u0000\u0251\u0252\u0005\u0010"+
		"\u0000\u0000\u0252\u0253\u0003\u0002\u0001\u0000\u0253\u0254\u0005$\u0000"+
		"\u0000\u0254\u0255\u0003\u0002\u0001\u0000\u0255\u0256\u0005\u0016\u0000"+
		"\u0000\u0256\u0257\u0003\u0002\u0001\u0000\u0257\u0258\u0005%\u0000\u0000"+
		"\u02589\u0001\u0000\u0000\u0000\u0259\u025b\u0005\u0006\u0000\u0000\u025a"+
		"\u025c\u0003d2\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025b\u025c\u0001"+
		"\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u025f\u0003"+
		"h4\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000"+
		"\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0003\u0002\u0001"+
		"\u0000\u0261\u0262\u0005\u001a\u0000\u0000\u0262\u0267\u0003<\u001e\u0000"+
		"\u0263\u0264\u0005\u0016\u0000\u0000\u0264\u0266\u0003<\u001e\u0000\u0265"+
		"\u0263\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000\u0000\u0000\u0267"+
		"\u0265\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268"+
		"\u026a\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u026a"+
		"\u026b\u0005\u001b\u0000\u0000\u026b;\u0001\u0000\u0000\u0000\u026c\u026e"+
		"\u0003d2\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000"+
		"\u0000\u0000\u026e\u0270\u0001\u0000\u0000\u0000\u026f\u0271\u0003h4\u0000"+
		"\u0270\u026f\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0273\u0003\u0000\u0000\u0000"+
		"\u0273=\u0001\u0000\u0000\u0000\u0274\u0275\u0005&\u0000\u0000\u0275\u0277"+
		"\u0005\u0003\u0000\u0000\u0276\u0278\u0003d2\u0000\u0277\u0276\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a\u0001\u0000"+
		"\u0000\u0000\u0279\u027b\u0003h4\u0000\u027a\u0279\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000"+
		"\u027c\u027e\u0003\u0002\u0001\u0000\u027d\u027f\u0003\u00fa}\u0000\u027e"+
		"\u027d\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f"+
		"\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0003@ \u0000\u0281\u0282\u0005"+
		"\u0014\u0000\u0000\u0282?\u0001\u0000\u0000\u0000\u0283\u028c\u0005\u0017"+
		"\u0000\u0000\u0284\u0289\u0003\u00e2q\u0000\u0285\u0286\u0005\u0016\u0000"+
		"\u0000\u0286\u0288\u0003\u00e2q\u0000\u0287\u0285\u0001\u0000\u0000\u0000"+
		"\u0288\u028b\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028d\u0001\u0000\u0000\u0000"+
		"\u028b\u0289\u0001\u0000\u0000\u0000\u028c\u0284\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000"+
		"\u028e\u028f\u0005\u0018\u0000\u0000\u028f\u0290\u0005\u001c\u0000\u0000"+
		"\u0290\u0291\u0003\u00e4r\u0000\u0291\u0292\u0003\u00f0x\u0000\u0292A"+
		"\u0001\u0000\u0000\u0000\u0293\u0295\u0005\u0003\u0000\u0000\u0294\u0296"+
		"\u0003d2\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000"+
		"\u0000\u0000\u0296\u0298\u0001\u0000\u0000\u0000\u0297\u0299\u0003h4\u0000"+
		"\u0298\u0297\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029c\u0003\u0002\u0001\u0000"+
		"\u029b\u029d\u0003\u00fa}\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e"+
		"\u02a0\u0003@ \u0000\u029f\u02a1\u0003\u00ba]\u0000\u02a0\u029f\u0001"+
		"\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0005\u001a\u0000\u0000\u02a3\u02a4\u0003"+
		"x<\u0000\u02a4\u02a5\u0005\u001b\u0000\u0000\u02a5C\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0003\u0002\u0001\u0000\u02a7\u02b0\u0005\u0017\u0000"+
		"\u0000\u02a8\u02ad\u0003\u00f8|\u0000\u02a9\u02aa\u0005\u0016\u0000\u0000"+
		"\u02aa\u02ac\u0003\u00f8|\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac"+
		"\u02af\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af"+
		"\u02ad\u0001\u0000\u0000\u0000\u02b0\u02a8\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b3\u0005\u0018\u0000\u0000\u02b3\u02b4\u0005\u001c\u0000\u0000\u02b4"+
		"\u02b5\u0003\u00f8|\u0000\u02b5E\u0001\u0000\u0000\u0000\u02b6\u02c0\u0003"+
		"\u00b8\\\u0000\u02b7\u02c0\u0003\u0094J\u0000\u02b8\u02c0\u0003\u00ce"+
		"g\u0000\u02b9\u02c0\u0003\u00d0h\u0000\u02ba\u02c0\u0003\u0088D\u0000"+
		"\u02bb\u02bc\u0005\u0017\u0000\u0000\u02bc\u02bd\u0003\u0084B\u0000\u02bd"+
		"\u02be\u0005\u0018\u0000\u0000\u02be\u02c0\u0001\u0000\u0000\u0000\u02bf"+
		"\u02b6\u0001\u0000\u0000\u0000\u02bf\u02b7\u0001\u0000\u0000\u0000\u02bf"+
		"\u02b8\u0001\u0000\u0000\u0000\u02bf\u02b9\u0001\u0000\u0000\u0000\u02bf"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bf\u02bb\u0001\u0000\u0000\u0000\u02c0"+
		"G\u0001\u0000\u0000\u0000\u02c1\u02c5\u0003F#\u0000\u02c2\u02c4\u0003"+
		"\u008aE\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c8\u02ca\u0003|>\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c9\u02ca\u0001\u0000\u0000\u0000\u02caI\u0001\u0000\u0000\u0000\u02cb"+
		"\u02d4\u0005!\u0000\u0000\u02cc\u02d1\u0003L&\u0000\u02cd\u02ce\u0005"+
		"\u0016\u0000\u0000\u02ce\u02d0\u0003L&\u0000\u02cf\u02cd\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02cc\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d7\u0005\"\u0000\u0000\u02d7K\u0001\u0000\u0000\u0000"+
		"\u02d8\u02d9\u0005\'\u0000\u0000\u02d9\u02e3\u0003\u0002\u0001\u0000\u02da"+
		"\u02dc\u0005$\u0000\u0000\u02db\u02dd\u0003\u010a\u0085\u0000\u02dc\u02db"+
		"\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02e0"+
		"\u0001\u0000\u0000\u0000\u02de\u02df\u0005(\u0000\u0000\u02df\u02e1\u0003"+
		"\u0106\u0083\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e4\u0005"+
		"%\u0000\u0000\u02e3\u02da\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e7\u0003\u0000"+
		"\u0000\u0000\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000"+
		"\u0000\u0000\u02e7\u02f6\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005)\u0000"+
		"\u0000\u02e9\u02ea\u0005\u001c\u0000\u0000\u02ea\u02eb\u0005*\u0000\u0000"+
		"\u02eb\u02ec\u0005\u0016\u0000\u0000\u02ec\u02ed\u0005*\u0000\u0000\u02ed"+
		"\u02ee\u0005\u0016\u0000\u0000\u02ee\u02ef\u0005*\u0000\u0000\u02ef\u02f0"+
		"\u0005\u0016\u0000\u0000\u02f0\u02f1\u0005*\u0000\u0000\u02f1\u02f2\u0005"+
		"\u0016\u0000\u0000\u02f2\u02f3\u0005*\u0000\u0000\u02f3\u02f4\u0005\u0016"+
		"\u0000\u0000\u02f4\u02f5\u0005*\u0000\u0000\u02f5\u02f7\u0005+\u0000\u0000"+
		"\u02f6\u02e8\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000"+
		"\u02f7\u02fa\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005,\u0000\u0000\u02f9"+
		"\u02fb\u0003\u0002\u0001\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc"+
		"\u0305\u0005\u0017\u0000\u0000\u02fd\u0302\u0003R)\u0000\u02fe\u02ff\u0005"+
		"\u0016\u0000\u0000\u02ff\u0301\u0003R)\u0000\u0300\u02fe\u0001\u0000\u0000"+
		"\u0000\u0301\u0304\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000"+
		"\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000"+
		"\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0305\u02fd\u0001\u0000\u0000"+
		"\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000"+
		"\u0000\u0307\u0308\u0005\u0018\u0000\u0000\u0308M\u0001\u0000\u0000\u0000"+
		"\u0309\u030a\u0003\u00dcn\u0000\u030a\u030b\u0003P(\u0000\u030bO\u0001"+
		"\u0000\u0000\u0000\u030c\u030d\u0003\u0002\u0001\u0000\u030d\u030e\u0005"+
		"-\u0000\u0000\u030e\u030f\u0003\u0000\u0000\u0000\u030fQ\u0001\u0000\u0000"+
		"\u0000\u0310\u0311\u0003,\u0016\u0000\u0311\u0312\u0005.\u0000\u0000\u0312"+
		"\u0313\u0003T*\u0000\u0313S\u0001\u0000\u0000\u0000\u0314\u0317\u0003"+
		"V+\u0000\u0315\u0317\u0003X,\u0000\u0316\u0314\u0001\u0000\u0000\u0000"+
		"\u0316\u0315\u0001\u0000\u0000\u0000\u0317U\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0003Z-\u0000\u0319W\u0001\u0000\u0000\u0000\u031a\u0323\u0005"+
		"!\u0000\u0000\u031b\u0320\u0003Z-\u0000\u031c\u031d\u0005\u0016\u0000"+
		"\u0000\u031d\u031f\u0003Z-\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031f"+
		"\u0322\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000\u0000\u0000\u0322"+
		"\u0320\u0001\u0000\u0000\u0000\u0323\u031b\u0001\u0000\u0000\u0000\u0323"+
		"\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325"+
		"\u0326\u0005\"\u0000\u0000\u0326Y\u0001\u0000\u0000\u0000\u0327\u0330"+
		"\u0003\u00d8l\u0000\u0328\u0330\u0005/\u0000\u0000\u0329\u0330\u0003L"+
		"&\u0000\u032a\u0330\u0003\u0002\u0001\u0000\u032b\u0330\u0003\\.\u0000"+
		"\u032c\u0330\u0003^/\u0000\u032d\u0330\u0003`0\u0000\u032e\u0330\u0003"+
		"\u0000\u0000\u0000\u032f\u0327\u0001\u0000\u0000\u0000\u032f\u0328\u0001"+
		"\u0000\u0000\u0000\u032f\u0329\u0001\u0000\u0000\u0000\u032f\u032a\u0001"+
		"\u0000\u0000\u0000\u032f\u032b\u0001\u0000\u0000\u0000\u032f\u032c\u0001"+
		"\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f\u032e\u0001"+
		"\u0000\u0000\u0000\u0330[\u0001\u0000\u0000\u0000\u0331\u0332\u0003\u0002"+
		"\u0001\u0000\u0332\u0333\u00050\u0000\u0000\u0333\u0334\u0003\u0000\u0000"+
		"\u0000\u0334]\u0001\u0000\u0000\u0000\u0335\u0336\u0003\u0002\u0001\u0000"+
		"\u0336\u0337\u0005,\u0000\u0000\u0337\u0338\u0003\u0000\u0000\u0000\u0338"+
		"_\u0001\u0000\u0000\u0000\u0339\u033a\u0003\u0002\u0001\u0000\u033a\u033b"+
		"\u00051\u0000\u0000\u033b\u033c\u0003\u0000\u0000\u0000\u033ca\u0001\u0000"+
		"\u0000\u0000\u033d\u033e\u0003\u00e4r\u0000\u033e\u033f\u0003\u00f0x\u0000"+
		"\u033fc\u0001\u0000\u0000\u0000\u0340\u0341\u0005$\u0000\u0000\u0341\u0342"+
		"\u0005$\u0000\u0000\u0342\u0347\u0003f3\u0000\u0343\u0344\u0005\u0016"+
		"\u0000\u0000\u0344\u0346\u0003f3\u0000\u0345\u0343\u0001\u0000\u0000\u0000"+
		"\u0346\u0349\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000"+
		"\u0347\u0348\u0001\u0000\u0000\u0000\u0348\u034a\u0001\u0000\u0000\u0000"+
		"\u0349\u0347\u0001\u0000\u0000\u0000\u034a\u034b\u0005%\u0000\u0000\u034b"+
		"\u034c\u0005%\u0000\u0000\u034ce\u0001\u0000\u0000\u0000\u034d\u034e\u0003"+
		"\u0002\u0001\u0000\u034e\u034f\u00050\u0000\u0000\u034f\u0350\u0003\u0000"+
		"\u0000\u0000\u0350g\u0001\u0000\u0000\u0000\u0351\u0352\u0005\u001a\u0000"+
		"\u0000\u0352\u0357\u0003j5\u0000\u0353\u0354\u0005\u0016\u0000\u0000\u0354"+
		"\u0356\u0003j5\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0356\u0359\u0001"+
		"\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0357\u0358\u0001"+
		"\u0000\u0000\u0000\u0358\u035a\u0001\u0000\u0000\u0000\u0359\u0357\u0001"+
		"\u0000\u0000\u0000\u035a\u035b\u0005\u001b\u0000\u0000\u035bi\u0001\u0000"+
		"\u0000\u0000\u035c\u035d\u0003\u0002\u0001\u0000\u035d\u035e\u00050\u0000"+
		"\u0000\u035e\u035f\u0003\u0000\u0000\u0000\u035f\u0360\u0005.\u0000\u0000"+
		"\u0360\u0365\u0005#\u0000\u0000\u0361\u0362\u0005 \u0000\u0000\u0362\u0364"+
		"\u0005#\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0367\u0001"+
		"\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0365\u0366\u0001"+
		"\u0000\u0000\u0000\u0366k\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000"+
		"\u0000\u0000\u0368\u0369\u0005.\u0000\u0000\u0369\u036a\u0003n7\u0000"+
		"\u036am\u0001\u0000\u0000\u0000\u036b\u036c\u0003\u009cN\u0000\u036c\u036d"+
		"\u0003\u008cF\u0000\u036d\u0372\u0001\u0000\u0000\u0000\u036e\u0372\u0003"+
		"\u00b0X\u0000\u036f\u0372\u0003\u00d8l\u0000\u0370\u0372\u0003p8\u0000"+
		"\u0371\u036b\u0001\u0000\u0000\u0000\u0371\u036e\u0001\u0000\u0000\u0000"+
		"\u0371\u036f\u0001\u0000\u0000\u0000\u0371\u0370\u0001\u0000\u0000\u0000"+
		"\u0372o\u0001\u0000\u0000\u0000\u0373\u037c\u0005!\u0000\u0000\u0374\u0379"+
		"\u0003n7\u0000\u0375\u0376\u0005\u0016\u0000\u0000\u0376\u0378\u0003n"+
		"7\u0000\u0377\u0375\u0001\u0000\u0000\u0000\u0378\u037b\u0001\u0000\u0000"+
		"\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000"+
		"\u0000\u037a\u037d\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000\u0000"+
		"\u0000\u037c\u0374\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000"+
		"\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u037f\u0005\"\u0000\u0000"+
		"\u037fq\u0001\u0000\u0000\u0000\u0380\u0382\u0005\u0004\u0000\u0000\u0381"+
		"\u0383\u0003d2\u0000\u0382\u0381\u0001\u0000\u0000\u0000\u0382\u0383\u0001"+
		"\u0000\u0000\u0000\u0383\u0385\u0001\u0000\u0000\u0000\u0384\u0386\u0003"+
		"h4\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000"+
		"\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387\u0388\u0003\u0002\u0001"+
		"\u0000\u0388\u038a\u0005\u001a\u0000\u0000\u0389\u038b\u0003t:\u0000\u038a"+
		"\u0389\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b"+
		"\u038d\u0001\u0000\u0000\u0000\u038c\u038e\u0003v;\u0000\u038d\u038c\u0001"+
		"\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u038f\u0001"+
		"\u0000\u0000\u0000\u038f\u0390\u0005\u001b\u0000\u0000\u0390s\u0001\u0000"+
		"\u0000\u0000\u0391\u0392\u0005\b\u0000\u0000\u0392\u0393\u0005\u001c\u0000"+
		"\u0000\u0393\u0394\u0005!\u0000\u0000\u0394\u0399\u0003\u0000\u0000\u0000"+
		"\u0395\u0396\u0005\u0016\u0000\u0000\u0396\u0398\u0003\u0000\u0000\u0000"+
		"\u0397\u0395\u0001\u0000\u0000\u0000\u0398\u039b\u0001\u0000\u0000\u0000"+
		"\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000"+
		"\u039a\u039c\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000\u0000\u0000"+
		"\u039c\u039d\u0005\"\u0000\u0000\u039d\u039e\u0005\u0014\u0000\u0000\u039e"+
		"u\u0001\u0000\u0000\u0000\u039f\u03a0\u0005\t\u0000\u0000\u03a0\u03a1"+
		"\u0005\u001c\u0000\u0000\u03a1\u03a2\u0005!\u0000\u0000\u03a2\u03a7\u0003"+
		"\u0000\u0000\u0000\u03a3\u03a4\u0005\u0016\u0000\u0000\u03a4\u03a6\u0003"+
		"\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a6\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001"+
		"\u0000\u0000\u0000\u03a8\u03aa\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001"+
		"\u0000\u0000\u0000\u03aa\u03ab\u0005\"\u0000\u0000\u03ab\u03ac\u0005\u0014"+
		"\u0000\u0000\u03acw\u0001\u0000\u0000\u0000\u03ad\u03b7\u0003z=\u0000"+
		"\u03ae\u03b4\u0005\u0014\u0000\u0000\u03af\u03b0\u0003z=\u0000\u03b0\u03b1"+
		"\u0005\u0014\u0000\u0000\u03b1\u03b3\u0001\u0000\u0000\u0000\u03b2\u03af"+
		"\u0001\u0000\u0000\u0000\u03b3\u03b6\u0001\u0000\u0000\u0000\u03b4\u03b2"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b8"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b7\u03ae"+
		"\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8y\u0001"+
		"\u0000\u0000\u0000\u03b9\u03bc\u0003\u0084B\u0000\u03ba\u03bc\u0003\u0082"+
		"A\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bb\u03ba\u0001\u0000\u0000"+
		"\u0000\u03bc{\u0001\u0000\u0000\u0000\u03bd\u03be\u0007\u0001\u0000\u0000"+
		"\u03be\u03bf\u0003~?\u0000\u03bf}\u0001\u0000\u0000\u0000\u03c0\u03c4"+
		"\u0003\u0086C\u0000\u03c1\u03c3\u0003\u00deo\u0000\u03c2\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c6\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u007f\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c7\u03ca\u0003\u00e0"+
		"p\u0000\u03c8\u03ca\u0003\u00deo\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000"+
		"\u03c9\u03c8\u0001\u0000\u0000\u0000\u03ca\u0081\u0001\u0000\u0000\u0000"+
		"\u03cb\u03cc\u0005\u000b\u0000\u0000\u03cc\u03cd\u0003\u0000\u0000\u0000"+
		"\u03cd\u03ce\u0005.\u0000\u0000\u03ce\u03cf\u0003\u0084B\u0000\u03cf\u0083"+
		"\u0001\u0000\u0000\u0000\u03d0\u03d4\u0003\u0086C\u0000\u03d1\u03d3\u0003"+
		"\u0080@\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d3\u03d6\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000"+
		"\u0000\u0000\u03d5\u0085\u0001\u0000\u0000\u0000\u03d6\u03d4\u0001\u0000"+
		"\u0000\u0000\u03d7\u03d8\u0003H$\u0000\u03d8\u0087\u0001\u0000\u0000\u0000"+
		"\u03d9\u03e2\u0005!\u0000\u0000\u03da\u03df\u0003H$\u0000\u03db\u03dc"+
		"\u0005\u0016\u0000\u0000\u03dc\u03de\u0003H$\u0000\u03dd\u03db\u0001\u0000"+
		"\u0000\u0000\u03de\u03e1\u0001\u0000\u0000\u0000\u03df\u03dd\u0001\u0000"+
		"\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e1\u03df\u0001\u0000\u0000\u0000\u03e2\u03da\u0001\u0000"+
		"\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e5\u0005\"\u0000\u0000\u03e5\u0089\u0001\u0000\u0000"+
		"\u0000\u03e6\u03e9\u0003\u008cF\u0000\u03e7\u03e9\u0003\u008eG\u0000\u03e8"+
		"\u03e6\u0001\u0000\u0000\u0000\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e9"+
		"\u008b\u0001\u0000\u0000\u0000\u03ea\u03eb\u00050\u0000\u0000\u03eb\u03ee"+
		"\u0003,\u0016\u0000\u03ec\u03ef\u0003\u0090H\u0000\u03ed\u03ef\u0003\u0092"+
		"I\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ed\u0001\u0000\u0000"+
		"\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u008d\u0001\u0000\u0000"+
		"\u0000\u03f0\u03f1\u0005\u001d\u0000\u0000\u03f1\u03f2\u0003\u0002\u0001"+
		"\u0000\u03f2\u03f9\u0003\u0092I\u0000\u03f3\u03f4\u0005\u001d\u0000\u0000"+
		"\u03f4\u03f5\u0003\u0002\u0001\u0000\u03f5\u03f6\u0003\u0092I\u0000\u03f6"+
		"\u03f8\u0001\u0000\u0000\u0000\u03f7\u03f3\u0001\u0000\u0000\u0000\u03f8"+
		"\u03fb\u0001\u0000\u0000\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000\u03f9"+
		"\u03fa\u0001\u0000\u0000\u0000\u03fa\u008f\u0001\u0000\u0000\u0000\u03fb"+
		"\u03f9\u0001\u0000\u0000\u0000\u03fc\u03fd\u0005\u0017\u0000\u0000\u03fd"+
		"\u0400\u0005/\u0000\u0000\u03fe\u03ff\u0005\u0016\u0000\u0000\u03ff\u0401"+
		"\u0005/\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400\u0401\u0001"+
		"\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0005"+
		"\u0018\u0000\u0000\u0403\u0091\u0001\u0000\u0000\u0000\u0404\u040d\u0005"+
		"\u0017\u0000\u0000\u0405\u040a\u0003\u0084B\u0000\u0406\u0407\u0005\u0016"+
		"\u0000\u0000\u0407\u0409\u0003\u0084B\u0000\u0408\u0406\u0001\u0000\u0000"+
		"\u0000\u0409\u040c\u0001\u0000\u0000\u0000\u040a\u0408\u0001\u0000\u0000"+
		"\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040e\u0001\u0000\u0000"+
		"\u0000\u040c\u040a\u0001\u0000\u0000\u0000\u040d\u0405\u0001\u0000\u0000"+
		"\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000"+
		"\u0000\u040f\u0410\u0005\u0018\u0000\u0000\u0410\u0093\u0001\u0000\u0000"+
		"\u0000\u0411\u041f\u0003\u011a\u008d\u0000\u0412\u041f\u0003\u00dam\u0000"+
		"\u0413\u041f\u0003\u00b0X\u0000\u0414\u041f\u0003N\'\u0000\u0415\u041f"+
		"\u0003\u00a2Q\u0000\u0416\u041f\u0003\u0096K\u0000\u0417\u041a\u0005,"+
		"\u0000\u0000\u0418\u041b\u0003\u00e4r\u0000\u0419\u041b\u0003\u00f0x\u0000"+
		"\u041a\u0418\u0001\u0000\u0000\u0000\u041a\u0419\u0001\u0000\u0000\u0000"+
		"\u041b\u041f\u0001\u0000\u0000\u0000\u041c\u041f\u0003\u009eO\u0000\u041d"+
		"\u041f\u0003\u009cN\u0000\u041e\u0411\u0001\u0000\u0000\u0000\u041e\u0412"+
		"\u0001\u0000\u0000\u0000\u041e\u0413\u0001\u0000\u0000\u0000\u041e\u0414"+
		"\u0001\u0000\u0000\u0000\u041e\u0415\u0001\u0000\u0000\u0000\u041e\u0416"+
		"\u0001\u0000\u0000\u0000\u041e\u0417\u0001\u0000\u0000\u0000\u041e\u041c"+
		"\u0001\u0000\u0000\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041f\u0095"+
		"\u0001\u0000\u0000\u0000\u0420\u042e\u0005-\u0000\u0000\u0421\u042f\u0003"+
		"\u0098L\u0000\u0422\u042b\u0005!\u0000\u0000\u0423\u0428\u0003\u0098L"+
		"\u0000\u0424\u0425\u0005\u0016\u0000\u0000\u0425\u0427\u0003\u0098L\u0000"+
		"\u0426\u0424\u0001\u0000\u0000\u0000\u0427\u042a\u0001\u0000\u0000\u0000"+
		"\u0428\u0426\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000"+
		"\u0429\u042c\u0001\u0000\u0000\u0000\u042a\u0428\u0001\u0000\u0000\u0000"+
		"\u042b\u0423\u0001\u0000\u0000\u0000\u042b\u042c\u0001\u0000\u0000\u0000"+
		"\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u042f\u0005\"\u0000\u0000\u042e"+
		"\u0421\u0001\u0000\u0000\u0000\u042e\u0422\u0001\u0000\u0000\u0000\u042f"+
		"\u0097\u0001\u0000\u0000\u0000\u0430\u043c\u0003\u00eew\u0000\u0431\u0437"+
		"\u0005\u001c\u0000\u0000\u0432\u0434\u0003\u00e4r\u0000\u0433\u0435\u0003"+
		"\u00f0x\u0000\u0434\u0433\u0001\u0000\u0000\u0000\u0434\u0435\u0001\u0000"+
		"\u0000\u0000\u0435\u0438\u0001\u0000\u0000\u0000\u0436\u0438\u0003\u009e"+
		"O\u0000\u0437\u0432\u0001\u0000\u0000\u0000\u0437\u0436\u0001\u0000\u0000"+
		"\u0000\u0438\u043a\u0001\u0000\u0000\u0000\u0439\u043b\u0003\u009aM\u0000"+
		"\u043a\u0439\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000"+
		"\u043b\u043d\u0001\u0000\u0000\u0000\u043c\u0431\u0001\u0000\u0000\u0000"+
		"\u043c\u043d\u0001\u0000\u0000\u0000\u043d\u0099\u0001\u0000\u0000\u0000"+
		"\u043e\u043f\u0005\u001c\u0000\u0000\u043f\u0440\u0003\u009eO\u0000\u0440"+
		"\u009b\u0001\u0000\u0000\u0000\u0441\u0445\u0005\r\u0000\u0000\u0442\u0445"+
		"\u0003\u0002\u0001\u0000\u0443\u0445\u0003P(\u0000\u0444\u0441\u0001\u0000"+
		"\u0000\u0000\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0443\u0001\u0000"+
		"\u0000\u0000\u0445\u0447\u0001\u0000\u0000\u0000\u0446\u0448\u0003\u00a4"+
		"R\u0000\u0447\u0446\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000"+
		"\u0000\u0448\u009d\u0001\u0000\u0000\u0000\u0449\u044f\u0003\u00d2i\u0000"+
		"\u044a\u044f\u0003\u00a0P\u0000\u044b\u044c\u0003\u00d4j\u0000\u044c\u044d"+
		"\u0003\u00d2i\u0000\u044d\u044f\u0001\u0000\u0000\u0000\u044e\u0449\u0001"+
		"\u0000\u0000\u0000\u044e\u044a\u0001\u0000\u0000\u0000\u044e\u044b\u0001"+
		"\u0000\u0000\u0000\u044f\u009f\u0001\u0000\u0000\u0000\u0450\u0459\u0005"+
		"\u001a\u0000\u0000\u0451\u0456\u0003\u00d4j\u0000\u0452\u0453\u0005\u0016"+
		"\u0000\u0000\u0453\u0455\u0003\u00d4j\u0000\u0454\u0452\u0001\u0000\u0000"+
		"\u0000\u0455\u0458\u0001\u0000\u0000\u0000\u0456\u0454\u0001\u0000\u0000"+
		"\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u045a\u0001\u0000\u0000"+
		"\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0459\u0451\u0001\u0000\u0000"+
		"\u0000\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000"+
		"\u0000\u045b\u045c\u0003\u00d2i\u0000\u045c\u045d\u0005\u001b\u0000\u0000"+
		"\u045d\u00a1\u0001\u0000\u0000\u0000\u045e\u045f\u00054\u0000\u0000\u045f"+
		"\u0460\u0003\u0000\u0000\u0000\u0460\u00a3\u0001\u0000\u0000\u0000\u0461"+
		"\u0467\u0003\u00a6S\u0000\u0462\u0467\u0003\u00a8T\u0000\u0463\u0467\u0003"+
		"\u00aaU\u0000\u0464\u0467\u0003\u00acV\u0000\u0465\u0467\u0003\u0092I"+
		"\u0000\u0466\u0461\u0001\u0000\u0000\u0000\u0466\u0462\u0001\u0000\u0000"+
		"\u0000\u0466\u0463\u0001\u0000\u0000\u0000\u0466\u0464\u0001\u0000\u0000"+
		"\u0000\u0466\u0465\u0001\u0000\u0000\u0000\u0467\u00a5\u0001\u0000\u0000"+
		"\u0000\u0468\u0469\u00050\u0000\u0000\u0469\u046a\u0005\u000f\u0000\u0000"+
		"\u046a\u046b\u0005\u0017\u0000\u0000\u046b\u046c\u0005\u0018\u0000\u0000"+
		"\u046c\u00a7\u0001\u0000\u0000\u0000\u046d\u046e\u00050\u0000\u0000\u046e"+
		"\u046f\u00055\u0000\u0000\u046f\u0470\u0005\u0017\u0000\u0000\u0470\u0471"+
		"\u0005\u0018\u0000\u0000\u0471\u00a9\u0001\u0000\u0000\u0000\u0472\u0473"+
		"\u00050\u0000\u0000\u0473\u0474\u00056\u0000\u0000\u0474\u0475\u0005\u0017"+
		"\u0000\u0000\u0475\u0476\u0003\u00aeW\u0000\u0476\u0477\u0005\u0016\u0000"+
		"\u0000\u0477\u0478\u0003\u00aeW\u0000\u0478\u0479\u0005\u0018\u0000\u0000"+
		"\u0479\u00ab\u0001\u0000\u0000\u0000\u047a\u047b\u00050\u0000\u0000\u047b"+
		"\u047c\u0005\u000f\u0000\u0000\u047c\u047d\u0005\u0017\u0000\u0000\u047d"+
		"\u0480\u0003\u00aeW\u0000\u047e\u047f\u0005\u0016\u0000\u0000\u047f\u0481"+
		"\u0003\u00aeW\u0000\u0480\u047e\u0001\u0000\u0000\u0000\u0480\u0481\u0001"+
		"\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u0483\u0005"+
		"\u0018\u0000\u0000\u0483\u00ad\u0001\u0000\u0000\u0000\u0484\u0488\u0005"+
		"/\u0000\u0000\u0485\u0488\u00057\u0000\u0000\u0486\u0488\u0003\u00a2Q"+
		"\u0000\u0487\u0484\u0001\u0000\u0000\u0000\u0487\u0485\u0001\u0000\u0000"+
		"\u0000\u0487\u0486\u0001\u0000\u0000\u0000\u0488\u00af\u0001\u0000\u0000"+
		"\u0000\u0489\u048c\u0005\'\u0000\u0000\u048a\u048d\u0003\u00a2Q\u0000"+
		"\u048b\u048d\u0003\u0002\u0001\u0000\u048c\u048a\u0001\u0000\u0000\u0000"+
		"\u048c\u048b\u0001\u0000\u0000\u0000\u048d\u0497\u0001\u0000\u0000\u0000"+
		"\u048e\u0490\u0005$\u0000\u0000\u048f\u0491\u0003\u010a\u0085\u0000\u0490"+
		"\u048f\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000\u0000\u0000\u0491"+
		"\u0494\u0001\u0000\u0000\u0000\u0492\u0493\u0005(\u0000\u0000\u0493\u0495"+
		"\u0003\u0106\u0083\u0000\u0494\u0492\u0001\u0000\u0000\u0000\u0494\u0495"+
		"\u0001\u0000\u0000\u0000\u0495\u0496\u0001\u0000\u0000\u0000\u0496\u0498"+
		"\u0005%\u0000\u0000\u0497\u048e\u0001\u0000\u0000\u0000\u0497\u0498\u0001"+
		"\u0000\u0000\u0000\u0498\u049a\u0001\u0000\u0000\u0000\u0499\u049b\u0003"+
		"\u0000\u0000\u0000\u049a\u0499\u0001\u0000\u0000\u0000\u049a\u049b\u0001"+
		"\u0000\u0000\u0000\u049b\u049d\u0001\u0000\u0000\u0000\u049c\u049e\u0003"+
		"\u00e6s\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049d\u049e\u0001\u0000"+
		"\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f\u04a1\u0005\u0017"+
		"\u0000\u0000\u04a0\u04a2\u0003\u00b6[\u0000\u04a1\u04a0\u0001\u0000\u0000"+
		"\u0000\u04a1\u04a2\u0001\u0000\u0000\u0000\u04a2\u04a7\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a4\u0005\u0016\u0000\u0000\u04a4\u04a6\u0003\u00b6[\u0000"+
		"\u04a5\u04a3\u0001\u0000\u0000\u0000\u04a6\u04a9\u0001\u0000\u0000\u0000"+
		"\u04a7\u04a5\u0001\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000"+
		"\u04a8\u04aa\u0001\u0000\u0000\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000"+
		"\u04aa\u04ab\u0005\u0018\u0000\u0000\u04ab\u00b1\u0001\u0000\u0000\u0000"+
		"\u04ac\u04ad\u0003\u00b4Z\u0000\u04ad\u00b3\u0001\u0000\u0000\u0000\u04ae"+
		"\u04b2\u0003\u0084B\u0000\u04af\u04b2\u0003\u00b0X\u0000\u04b0\u04b2\u0003"+
		"\u0002\u0001\u0000\u04b1\u04ae\u0001\u0000\u0000\u0000\u04b1\u04af\u0001"+
		"\u0000\u0000\u0000\u04b1\u04b0\u0001\u0000\u0000\u0000\u04b2\u00b5\u0001"+
		"\u0000\u0000\u0000\u04b3\u04b8\u0003,\u0016\u0000\u04b4\u04b5\u00050\u0000"+
		"\u0000\u04b5\u04b7\u0003,\u0016\u0000\u04b6\u04b4\u0001\u0000\u0000\u0000"+
		"\u04b7\u04ba\u0001\u0000\u0000\u0000\u04b8\u04b6\u0001\u0000\u0000\u0000"+
		"\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04bc\u0001\u0000\u0000\u0000"+
		"\u04ba\u04b8\u0001\u0000\u0000\u0000\u04bb\u04bd\u0005 \u0000\u0000\u04bc"+
		"\u04bb\u0001\u0000\u0000\u0000\u04bc\u04bd\u0001\u0000\u0000\u0000\u04bd"+
		"\u04be\u0001\u0000\u0000\u0000\u04be\u04bf\u0005.\u0000\u0000\u04bf\u04c0"+
		"\u0003\u00b2Y\u0000\u04c0\u00b7\u0001\u0000\u0000\u0000\u04c1\u04ce\u0005"+
		"!\u0000\u0000\u04c2\u04c3\u0005\u001c\u0000\u0000\u04c3\u04cf\u0003H$"+
		"\u0000\u04c4\u04c5\u0003H$\u0000\u04c5\u04c6\u0005\u001c\u0000\u0000\u04c6"+
		"\u04c7\u0003H$\u0000\u04c7\u04cf\u0001\u0000\u0000\u0000\u04c8\u04c9\u0003"+
		"H$\u0000\u04c9\u04ca\u0005\u001c\u0000\u0000\u04ca\u04cb\u0003H$\u0000"+
		"\u04cb\u04cc\u0005\u001c\u0000\u0000\u04cc\u04cd\u0003H$\u0000\u04cd\u04cf"+
		"\u0001\u0000\u0000\u0000\u04ce\u04c2\u0001\u0000\u0000\u0000\u04ce\u04c4"+
		"\u0001\u0000\u0000\u0000\u04ce\u04c8\u0001\u0000\u0000\u0000\u04cf\u04d0"+
		"\u0001\u0000\u0000\u0000\u04d0\u04d1\u0005\"\u0000\u0000\u04d1\u00b9\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d3\u0005!\u0000\u0000\u04d3\u04d8\u0003\u00bc"+
		"^\u0000\u04d4\u04d5\u0005\u0016\u0000\u0000\u04d5\u04d7\u0003\u00bc^\u0000"+
		"\u04d6\u04d4\u0001\u0000\u0000\u0000\u04d7\u04da\u0001\u0000\u0000\u0000"+
		"\u04d8\u04d6\u0001\u0000\u0000\u0000\u04d8\u04d9\u0001\u0000\u0000\u0000"+
		"\u04d9\u04db\u0001\u0000\u0000\u0000\u04da\u04d8\u0001\u0000\u0000\u0000"+
		"\u04db\u04dc\u0005\"\u0000\u0000\u04dc\u00bb\u0001\u0000\u0000\u0000\u04dd"+
		"\u04e0\u0003\u00be_\u0000\u04de\u04e0\u0003\u00c0`\u0000\u04df\u04dd\u0001"+
		"\u0000\u0000\u0000\u04df\u04de\u0001\u0000\u0000\u0000\u04e0\u00bd\u0001"+
		"\u0000\u0000\u0000\u04e1\u04e3\u0003\u00ccf\u0000\u04e2\u04e1\u0001\u0000"+
		"\u0000\u0000\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04e4\u0001\u0000"+
		"\u0000\u0000\u04e4\u04e5\u0003\u0084B\u0000\u04e5\u00bf\u0001\u0000\u0000"+
		"\u0000\u04e6\u04e7\u0005\u0001\u0000\u0000\u04e7\u04e9\u0005\u0017\u0000"+
		"\u0000\u04e8\u04ea\u0003\u00c2a\u0000\u04e9\u04e8\u0001\u0000\u0000\u0000"+
		"\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u04ec\u0001\u0000\u0000\u0000"+
		"\u04eb\u04ed\u0003\u00c4b\u0000\u04ec\u04eb\u0001\u0000\u0000\u0000\u04ec"+
		"\u04ed\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001\u0000\u0000\u0000\u04ee"+
		"\u04f0\u0003\u00c6c\u0000\u04ef\u04f1\u0003\u00c8d\u0000\u04f0\u04ef\u0001"+
		"\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1\u04f3\u0001"+
		"\u0000\u0000\u0000\u04f2\u04f4\u0003\u00cae\u0000\u04f3\u04f2\u0001\u0000"+
		"\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f5\u04f6\u0005\u0018\u0000\u0000\u04f6\u00c1\u0001\u0000"+
		"\u0000\u0000\u04f7\u04f8\u00058\u0000\u0000\u04f8\u04f9\u0005\u001c\u0000"+
		"\u0000\u04f9\u04fa\u0005\u0001\u0000\u0000\u04fa\u00c3\u0001\u0000\u0000"+
		"\u0000\u04fb\u04fc\u00059\u0000\u0000\u04fc\u04fd\u0005\u001c\u0000\u0000"+
		"\u04fd\u04fe\u0005#\u0000\u0000\u04fe\u00c5\u0001\u0000\u0000\u0000\u04ff"+
		"\u0500\u0005:\u0000\u0000\u0500\u0501\u0005\u001c\u0000\u0000\u0501\u0502"+
		"\u0003\u0084B\u0000\u0502\u00c7\u0001\u0000\u0000\u0000\u0503\u0504\u0005"+
		";\u0000\u0000\u0504\u0505\u0005\u001c\u0000\u0000\u0505\u0506\u0005\u0011"+
		"\u0000\u0000\u0506\u00c9\u0001\u0000\u0000\u0000\u0507\u0508\u0005<\u0000"+
		"\u0000\u0508\u0509\u0005\u001c\u0000\u0000\u0509\u050a\u0003\u0084B\u0000"+
		"\u050a\u00cb\u0001\u0000\u0000\u0000\u050b\u050c\u0005\u0001\u0000\u0000"+
		"\u050c\u050d\u0005\u001c\u0000\u0000\u050d\u00cd\u0001\u0000\u0000\u0000"+
		"\u050e\u050f\u0005=\u0000\u0000\u050f\u0510\u0003H$\u0000\u0510\u00cf"+
		"\u0001\u0000\u0000\u0000\u0511\u0512\u0007\u0002\u0000\u0000\u0512\u0513"+
		"\u0003H$\u0000\u0513\u00d1\u0001\u0000\u0000\u0000\u0514\u0515\u0005("+
		"\u0000\u0000\u0515\u0516\u0003x<\u0000\u0516\u00d3\u0001\u0000\u0000\u0000"+
		"\u0517\u0519\u0003\u0000\u0000\u0000\u0518\u051a\u0003\u00d6k\u0000\u0519"+
		"\u0518\u0001\u0000\u0000\u0000\u0519\u051a\u0001\u0000\u0000\u0000\u051a"+
		"\u00d5\u0001\u0000\u0000\u0000\u051b\u051c\u0005\u001c\u0000\u0000\u051c"+
		"\u051d\u0003\u00e4r\u0000\u051d\u051e\u0003\u00f0x\u0000\u051e\u00d7\u0001"+
		"\u0000\u0000\u0000\u051f\u052d\u0003\u00dam\u0000\u0520\u0521\u0005>\u0000"+
		"\u0000\u0521\u052d\u0005*\u0000\u0000\u0522\u0523\u0005>\u0000\u0000\u0523"+
		"\u052d\u0005?\u0000\u0000\u0524\u0525\u0005>\u0000\u0000\u0525\u052d\u0005"+
		"@\u0000\u0000\u0526\u0527\u0005 \u0000\u0000\u0527\u052d\u0005*\u0000"+
		"\u0000\u0528\u0529\u0005 \u0000\u0000\u0529\u052d\u0005?\u0000\u0000\u052a"+
		"\u052b\u0005 \u0000\u0000\u052b\u052d\u0005@\u0000\u0000\u052c\u051f\u0001"+
		"\u0000\u0000\u0000\u052c\u0520\u0001\u0000\u0000\u0000\u052c\u0522\u0001"+
		"\u0000\u0000\u0000\u052c\u0524\u0001\u0000\u0000\u0000\u052c\u0526\u0001"+
		"\u0000\u0000\u0000\u052c\u0528\u0001\u0000\u0000\u0000\u052c\u052a\u0001"+
		"\u0000\u0000\u0000\u052d\u00d9\u0001\u0000\u0000\u0000\u052e\u052f\u0007"+
		"\u0003\u0000\u0000\u052f\u00db\u0001\u0000\u0000\u0000\u0530\u0532\u0005"+
		">\u0000\u0000\u0531\u0530\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000"+
		"\u0000\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u0543\u0005*\u0000"+
		"\u0000\u0534\u0536\u0005>\u0000\u0000\u0535\u0534\u0001\u0000\u0000\u0000"+
		"\u0535\u0536\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000"+
		"\u0537\u0543\u0005?\u0000\u0000\u0538\u053a\u0005>\u0000\u0000\u0539\u0538"+
		"\u0001\u0000\u0000\u0000\u0539\u053a\u0001\u0000\u0000\u0000\u053a\u053b"+
		"\u0001\u0000\u0000\u0000\u053b\u0543\u0005@\u0000\u0000\u053c\u053d\u0005"+
		" \u0000\u0000\u053d\u0543\u0005*\u0000\u0000\u053e\u053f\u0005 \u0000"+
		"\u0000\u053f\u0543\u0005?\u0000\u0000\u0540\u0541\u0005 \u0000\u0000\u0541"+
		"\u0543\u0005@\u0000\u0000\u0542\u0531\u0001\u0000\u0000\u0000\u0542\u0535"+
		"\u0001\u0000\u0000\u0000\u0542\u0539\u0001\u0000\u0000\u0000\u0542\u053c"+
		"\u0001\u0000\u0000\u0000\u0542\u053e\u0001\u0000\u0000\u0000\u0542\u0540"+
		"\u0001\u0000\u0000\u0000\u0543\u00dd\u0001\u0000\u0000\u0000\u0544\u0545"+
		"\u0005 \u0000\u0000\u0545\u054a\u0003H$\u0000\u0546\u0547\u0005 \u0000"+
		"\u0000\u0547\u0549\u0003H$\u0000\u0548\u0546\u0001\u0000\u0000\u0000\u0549"+
		"\u054c\u0001\u0000\u0000\u0000\u054a\u0548\u0001\u0000\u0000\u0000\u054a"+
		"\u054b\u0001\u0000\u0000\u0000\u054b\u0571\u0001\u0000\u0000\u0000\u054c"+
		"\u054a\u0001\u0000\u0000\u0000\u054d\u054e\u0005\u0013\u0000\u0000\u054e"+
		"\u0553\u0003H$\u0000\u054f\u0550\u0005\u0013\u0000\u0000\u0550\u0552\u0003"+
		"H$\u0000\u0551\u054f\u0001\u0000\u0000\u0000\u0552\u0555\u0001\u0000\u0000"+
		"\u0000\u0553\u0551\u0001\u0000\u0000\u0000\u0553\u0554\u0001\u0000\u0000"+
		"\u0000\u0554\u0571\u0001\u0000\u0000\u0000\u0555\u0553\u0001\u0000\u0000"+
		"\u0000\u0556\u0557\u0005>\u0000\u0000\u0557\u055c\u0003H$\u0000\u0558"+
		"\u0559\u0005>\u0000\u0000\u0559\u055b\u0003H$\u0000\u055a\u0558\u0001"+
		"\u0000\u0000\u0000\u055b\u055e\u0001\u0000\u0000\u0000\u055c\u055a\u0001"+
		"\u0000\u0000\u0000\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u0571\u0001"+
		"\u0000\u0000\u0000\u055e\u055c\u0001\u0000\u0000\u0000\u055f\u0560\u0005"+
		"C\u0000\u0000\u0560\u0565\u0003H$\u0000\u0561\u0562\u0005C\u0000\u0000"+
		"\u0562\u0564\u0003H$\u0000\u0563\u0561\u0001\u0000\u0000\u0000\u0564\u0567"+
		"\u0001\u0000\u0000\u0000\u0565\u0563\u0001\u0000\u0000\u0000\u0565\u0566"+
		"\u0001\u0000\u0000\u0000\u0566\u0571\u0001\u0000\u0000\u0000\u0567\u0565"+
		"\u0001\u0000\u0000\u0000\u0568\u0569\u0005$\u0000\u0000\u0569\u0571\u0003"+
		"H$\u0000\u056a\u056b\u0005D\u0000\u0000\u056b\u0571\u0003H$\u0000\u056c"+
		"\u056d\u0005%\u0000\u0000\u056d\u0571\u0003H$\u0000\u056e\u056f\u0005"+
		"E\u0000\u0000\u056f\u0571\u0003H$\u0000\u0570\u0544\u0001\u0000\u0000"+
		"\u0000\u0570\u054d\u0001\u0000\u0000\u0000\u0570\u0556\u0001\u0000\u0000"+
		"\u0000\u0570\u055f\u0001\u0000\u0000\u0000\u0570\u0568\u0001\u0000\u0000"+
		"\u0000\u0570\u056a\u0001\u0000\u0000\u0000\u0570\u056c\u0001\u0000\u0000"+
		"\u0000\u0570\u056e\u0001\u0000\u0000\u0000\u0571\u00df\u0001\u0000\u0000"+
		"\u0000\u0572\u0573\u0005F\u0000\u0000\u0573\u0578\u0003H$\u0000\u0574"+
		"\u0575\u0005G\u0000\u0000\u0575\u0578\u0003H$\u0000\u0576\u0578\u0003"+
		"|>\u0000\u0577\u0572\u0001\u0000\u0000\u0000\u0577\u0574\u0001\u0000\u0000"+
		"\u0000\u0577\u0576\u0001\u0000\u0000\u0000\u0578\u00e1\u0001\u0000\u0000"+
		"\u0000\u0579\u057a\u0003\u0000\u0000\u0000\u057a\u057b\u0005\u001c\u0000"+
		"\u0000\u057b\u057c\u0003\u00e4r\u0000\u057c\u057d\u0003\u00f0x\u0000\u057d"+
		"\u00e3\u0001\u0000\u0000\u0000\u057e\u0588\u0003\u0002\u0001\u0000\u057f"+
		"\u0581\u0005$\u0000\u0000\u0580\u0582\u0003\u010a\u0085\u0000\u0581\u0580"+
		"\u0001\u0000\u0000\u0000\u0581\u0582\u0001\u0000\u0000\u0000\u0582\u0585"+
		"\u0001\u0000\u0000\u0000\u0583\u0584\u0005(\u0000\u0000\u0584\u0586\u0003"+
		"\u0106\u0083\u0000\u0585\u0583\u0001\u0000\u0000\u0000\u0585\u0586\u0001"+
		"\u0000\u0000\u0000\u0586\u0587\u0001\u0000\u0000\u0000\u0587\u0589\u0005"+
		"%\u0000\u0000\u0588\u057f\u0001\u0000\u0000\u0000\u0588\u0589\u0001\u0000"+
		"\u0000\u0000\u0589\u058b\u0001\u0000\u0000\u0000\u058a\u058c\u0003\u00e6"+
		"s\u0000\u058b\u058a\u0001\u0000\u0000\u0000\u058b\u058c\u0001\u0000\u0000"+
		"\u0000\u058c\u05aa\u0001\u0000\u0000\u0000\u058d\u058f\u0005\u001a\u0000"+
		"\u0000\u058e\u0590\u0003\u00f8|\u0000\u058f\u058e\u0001\u0000\u0000\u0000"+
		"\u058f\u0590\u0001\u0000\u0000\u0000\u0590\u0595\u0001\u0000\u0000\u0000"+
		"\u0591\u0592\u0005\u0016\u0000\u0000\u0592\u0594\u0003\u00f8|\u0000\u0593"+
		"\u0591\u0001\u0000\u0000\u0000\u0594\u0597\u0001\u0000\u0000\u0000\u0595"+
		"\u0593\u0001\u0000\u0000\u0000\u0595\u0596\u0001\u0000\u0000\u0000\u0596"+
		"\u0598\u0001\u0000\u0000\u0000\u0597\u0595\u0001\u0000\u0000\u0000\u0598"+
		"\u0599\u0005\u001d\u0000\u0000\u0599\u059a\u0003\u00e4r\u0000\u059a\u059b"+
		"\u0003\u00f0x\u0000\u059b\u059c\u0005\u001b\u0000\u0000\u059c\u05aa\u0001"+
		"\u0000\u0000\u0000\u059d\u059e\u0005\u0017\u0000\u0000\u059e\u05a3\u0003"+
		"\u00e8t\u0000\u059f\u05a0\u0005\u0016\u0000\u0000\u05a0\u05a2\u0003\u00e8"+
		"t\u0000\u05a1\u059f\u0001\u0000\u0000\u0000\u05a2\u05a5\u0001\u0000\u0000"+
		"\u0000\u05a3\u05a1\u0001\u0000\u0000\u0000\u05a3\u05a4\u0001\u0000\u0000"+
		"\u0000\u05a4\u05a6\u0001\u0000\u0000\u0000\u05a5\u05a3\u0001\u0000\u0000"+
		"\u0000\u05a6\u05a7\u0005\u0018\u0000\u0000\u05a7\u05aa\u0001\u0000\u0000"+
		"\u0000\u05a8\u05aa\u0003P(\u0000\u05a9\u057e\u0001\u0000\u0000\u0000\u05a9"+
		"\u058d\u0001\u0000\u0000\u0000\u05a9\u059d\u0001\u0000\u0000\u0000\u05a9"+
		"\u05a8\u0001\u0000\u0000\u0000\u05aa\u00e5\u0001\u0000\u0000\u0000\u05ab"+
		"\u05b4\u0005\u0017\u0000\u0000\u05ac\u05b1\u0003\u00d8l\u0000\u05ad\u05ae"+
		"\u0005\u0016\u0000\u0000\u05ae\u05b0\u0003\u00d8l\u0000\u05af\u05ad\u0001"+
		"\u0000\u0000\u0000\u05b0\u05b3\u0001\u0000\u0000\u0000\u05b1\u05af\u0001"+
		"\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000\u0000\u05b2\u05b5\u0001"+
		"\u0000\u0000\u0000\u05b3\u05b1\u0001\u0000\u0000\u0000\u05b4\u05ac\u0001"+
		"\u0000\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000\u0000\u05b5\u05b6\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b7\u0005\u0018\u0000\u0000\u05b7\u00e7\u0001"+
		"\u0000\u0000\u0000\u05b8\u05b9\u0003\u00eau\u0000\u05b9\u05ba\u0005\u001c"+
		"\u0000\u0000\u05ba\u05bc\u0003\u00ecv\u0000\u05bb\u05bd\u0003\u00f0x\u0000"+
		"\u05bc\u05bb\u0001\u0000\u0000\u0000\u05bc\u05bd\u0001\u0000\u0000\u0000"+
		"\u05bd\u00e9\u0001\u0000\u0000\u0000\u05be\u05c1\u0005H\u0000\u0000\u05bf"+
		"\u05c1\u0003\u00eew\u0000\u05c0\u05be\u0001\u0000\u0000\u0000\u05c0\u05bf"+
		"\u0001\u0000\u0000\u0000\u05c1\u00eb\u0001\u0000\u0000\u0000\u05c2\u05c5"+
		"\u0005H\u0000\u0000\u05c3\u05c5\u0003\u00e4r\u0000\u05c4\u05c2\u0001\u0000"+
		"\u0000\u0000\u05c4\u05c3\u0001\u0000\u0000\u0000\u05c5\u00ed\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c9\u0003\u0000\u0000\u0000\u05c7\u05c9\u0005#\u0000"+
		"\u0000\u05c8\u05c6\u0001\u0000\u0000\u0000\u05c8\u05c7\u0001\u0000\u0000"+
		"\u0000\u05c9\u00ef\u0001\u0000\u0000\u0000\u05ca\u05cb\u0005!\u0000\u0000"+
		"\u05cb\u05cc\u0003\u0108\u0084\u0000\u05cc\u05cd\u0005\"\u0000\u0000\u05cd"+
		"\u00f1\u0001\u0000\u0000\u0000\u05ce\u05cf\u0005*\u0000\u0000\u05cf\u00f3"+
		"\u0001\u0000\u0000\u0000\u05d0\u05d1\u0007\u0004\u0000\u0000\u05d1\u00f5"+
		"\u0001\u0000\u0000\u0000\u05d2\u05d5\u0003\u011a\u008d\u0000\u05d3\u05d5"+
		"\u0003\u0128\u0094\u0000\u05d4\u05d2\u0001\u0000\u0000\u0000\u05d4\u05d3"+
		"\u0001\u0000\u0000\u0000\u05d5\u00f7\u0001\u0000\u0000\u0000\u05d6\u05d7"+
		"\u0003\u00e4r\u0000\u05d7\u05d8\u0003\u00f0x\u0000\u05d8\u00f9\u0001\u0000"+
		"\u0000\u0000\u05d9\u05df\u0005$\u0000\u0000\u05da\u05dc\u0003\u00fe\u007f"+
		"\u0000\u05db\u05dd\u0003\u0118\u008c\u0000\u05dc\u05db\u0001\u0000\u0000"+
		"\u0000\u05dc\u05dd\u0001\u0000\u0000\u0000\u05dd\u05e0\u0001\u0000\u0000"+
		"\u0000\u05de\u05e0\u0003\u0118\u008c\u0000\u05df\u05da\u0001\u0000\u0000"+
		"\u0000\u05df\u05de\u0001\u0000\u0000\u0000\u05e0\u05e1\u0001\u0000\u0000"+
		"\u0000\u05e1\u05e2\u0005%\u0000\u0000\u05e2\u00fb\u0001\u0000\u0000\u0000"+
		"\u05e3\u05e9\u0005$\u0000\u0000\u05e4\u05e6\u0003\u0102\u0081\u0000\u05e5"+
		"\u05e7\u0003\u0118\u008c\u0000\u05e6\u05e5\u0001\u0000\u0000\u0000\u05e6"+
		"\u05e7\u0001\u0000\u0000\u0000\u05e7\u05ea\u0001\u0000\u0000\u0000\u05e8"+
		"\u05ea\u0003\u0118\u008c\u0000\u05e9\u05e4\u0001\u0000\u0000\u0000\u05e9"+
		"\u05e8\u0001\u0000\u0000\u0000\u05ea\u05eb\u0001\u0000\u0000\u0000\u05eb"+
		"\u05ec\u0005%\u0000\u0000\u05ec\u00fd\u0001\u0000\u0000\u0000\u05ed\u05f2"+
		"\u0003\u0100\u0080\u0000\u05ee\u05ef\u0005\u0016\u0000\u0000\u05ef\u05f1"+
		"\u0003\u0100\u0080\u0000\u05f0\u05ee\u0001\u0000\u0000\u0000\u05f1\u05f4"+
		"\u0001\u0000\u0000\u0000\u05f2\u05f0\u0001\u0000\u0000\u0000\u05f2\u05f3"+
		"\u0001\u0000\u0000\u0000\u05f3\u00ff\u0001\u0000\u0000\u0000\u05f4\u05f2"+
		"\u0001\u0000\u0000\u0000\u05f5\u05f6\u0003\u0000\u0000\u0000\u05f6\u0101"+
		"\u0001\u0000\u0000\u0000\u05f7\u05fc\u0003\u0104\u0082\u0000\u05f8\u05f9"+
		"\u0005\u0016\u0000\u0000\u05f9\u05fb\u0003\u0104\u0082\u0000\u05fa\u05f8"+
		"\u0001\u0000\u0000\u0000\u05fb\u05fe\u0001\u0000\u0000\u0000\u05fc\u05fa"+
		"\u0001\u0000\u0000\u0000\u05fc\u05fd\u0001\u0000\u0000\u0000\u05fd\u0103"+
		"\u0001\u0000\u0000\u0000\u05fe\u05fc\u0001\u0000\u0000\u0000\u05ff\u0601"+
		"\u0005>\u0000\u0000\u0600\u05ff\u0001\u0000\u0000\u0000\u0600\u0601\u0001"+
		"\u0000\u0000\u0000\u0601\u0602\u0001\u0000\u0000\u0000\u0602\u0603\u0003"+
		"\u0000\u0000\u0000\u0603\u0105\u0001\u0000\u0000\u0000\u0604\u0609\u0003"+
		"\u0108\u0084\u0000\u0605\u0606\u0005\u0016\u0000\u0000\u0606\u0608\u0003"+
		"\u0108\u0084\u0000\u0607\u0605\u0001\u0000\u0000\u0000\u0608\u060b\u0001"+
		"\u0000\u0000\u0000\u0609\u0607\u0001\u0000\u0000\u0000\u0609\u060a\u0001"+
		"\u0000\u0000\u0000\u060a\u0107\u0001\u0000\u0000\u0000\u060b\u0609\u0001"+
		"\u0000\u0000\u0000\u060c\u0614\u0003\u0000\u0000\u0000\u060d\u060e\u0003"+
		"\u00f2y\u0000\u060e\u060f\u0005I\u0000\u0000\u060f\u0611\u0001\u0000\u0000"+
		"\u0000\u0610\u060d\u0001\u0000\u0000\u0000\u0610\u0611\u0001\u0000\u0000"+
		"\u0000\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u0614\u0003\u00f4z\u0000"+
		"\u0613\u060c\u0001\u0000\u0000\u0000\u0613\u0610\u0001\u0000\u0000\u0000"+
		"\u0614\u0109\u0001\u0000\u0000\u0000\u0615\u061a\u0003\u010c\u0086\u0000"+
		"\u0616\u0617\u0005\u0016\u0000\u0000\u0617\u0619\u0003\u010c\u0086\u0000"+
		"\u0618\u0616\u0001\u0000\u0000\u0000\u0619\u061c\u0001\u0000\u0000\u0000"+
		"\u061a\u0618\u0001\u0000\u0000\u0000\u061a\u061b\u0001\u0000\u0000\u0000"+
		"\u061b\u010b\u0001\u0000\u0000\u0000\u061c\u061a\u0001\u0000\u0000\u0000"+
		"\u061d\u061f\u0003\u00e4r\u0000\u061e\u0620\u0003\u0116\u008b\u0000\u061f"+
		"\u061e\u0001\u0000\u0000\u0000\u061f\u0620\u0001\u0000\u0000\u0000\u0620"+
		"\u0624\u0001\u0000\u0000\u0000\u0621\u0623\u0003\u010e\u0087\u0000\u0622"+
		"\u0621\u0001\u0000\u0000\u0000\u0623\u0626\u0001\u0000\u0000\u0000\u0624"+
		"\u0622\u0001\u0000\u0000\u0000\u0624\u0625\u0001\u0000\u0000\u0000\u0625"+
		"\u0628\u0001\u0000\u0000\u0000\u0626\u0624\u0001\u0000\u0000\u0000\u0627"+
		"\u0629\u0003\u0114\u008a\u0000\u0628\u0627\u0001\u0000\u0000\u0000\u0628"+
		"\u0629\u0001\u0000\u0000\u0000\u0629\u010d\u0001\u0000\u0000\u0000\u062a"+
		"\u062d\u0003\u0110\u0088\u0000\u062b\u062d\u0003\u0112\u0089\u0000\u062c"+
		"\u062a\u0001\u0000\u0000\u0000\u062c\u062b\u0001\u0000\u0000\u0000\u062d"+
		"\u010f\u0001\u0000\u0000\u0000\u062e\u062f\u0005 \u0000\u0000\u062f\u0630"+
		"\u0003\u00e4r\u0000\u0630\u0111\u0001\u0000\u0000\u0000\u0631\u0632\u0005"+
		">\u0000\u0000\u0632\u0633\u0003\u00e4r\u0000\u0633\u0113\u0001\u0000\u0000"+
		"\u0000\u0634\u0635\u0005J\u0000\u0000\u0635\u0636\u0003\u00e4r\u0000\u0636"+
		"\u0115\u0001\u0000\u0000\u0000\u0637\u0638\u0005.\u0000\u0000\u0638\u0639"+
		"\u0003\u00e4r\u0000\u0639\u0117\u0001\u0000\u0000\u0000\u063a\u063b\u0005"+
		"(\u0000\u0000\u063b\u0640\u0003\u0000\u0000\u0000\u063c\u063d\u0005\u0016"+
		"\u0000\u0000\u063d\u063f\u0003\u0000\u0000\u0000\u063e\u063c\u0001\u0000"+
		"\u0000\u0000\u063f\u0642\u0001\u0000\u0000\u0000\u0640\u063e\u0001\u0000"+
		"\u0000\u0000\u0640\u0641\u0001\u0000\u0000\u0000\u0641\u0119\u0001\u0000"+
		"\u0000\u0000\u0642\u0640\u0001\u0000\u0000\u0000\u0643\u0644\u0005K\u0000"+
		"\u0000\u0644\u011b\u0001\u0000\u0000\u0000\u0645\u0646\u0005\u0017\u0000"+
		"\u0000\u0646\u0647\u0005\f\u0000\u0000\u0647\u0648\u0005\u0018\u0000\u0000"+
		"\u0648\u011d\u0001\u0000\u0000\u0000\u0649\u064a\u0005L\u0000\u0000\u064a"+
		"\u064b\u0005A\u0000\u0000\u064b\u064c\u0005\u0016\u0000\u0000\u064c\u064d"+
		"\u0005M\u0000\u0000\u064d\u064f\u0005\u0017\u0000\u0000\u064e\u0650\u0003"+
		"\u0120\u0090\u0000\u064f\u064e\u0001\u0000\u0000\u0000\u064f\u0650\u0001"+
		"\u0000\u0000\u0000\u0650\u0651\u0001\u0000\u0000\u0000\u0651\u0652\u0005"+
		"\u0018\u0000\u0000\u0652\u0653\u0005\u0016\u0000\u0000\u0653\u0654\u0005"+
		"N\u0000\u0000\u0654\u0656\u0005\u0017\u0000\u0000\u0655\u0657\u0003\u0124"+
		"\u0092\u0000\u0656\u0655\u0001\u0000\u0000\u0000\u0656\u0657\u0001\u0000"+
		"\u0000\u0000\u0657\u0658\u0001\u0000\u0000\u0000\u0658\u0659\u0005\u0018"+
		"\u0000\u0000\u0659\u011f\u0001\u0000\u0000\u0000\u065a\u065f\u0003\u0122"+
		"\u0091\u0000\u065b\u065c\u0005\u0016\u0000\u0000\u065c\u065e\u0003\u0122"+
		"\u0091\u0000\u065d\u065b\u0001\u0000\u0000\u0000\u065e\u0661\u0001\u0000"+
		"\u0000\u0000\u065f\u065d\u0001\u0000\u0000\u0000\u065f\u0660\u0001\u0000"+
		"\u0000\u0000\u0660\u0121\u0001\u0000\u0000\u0000\u0661\u065f\u0001\u0000"+
		"\u0000\u0000\u0662\u0663\u0003\u0084B\u0000\u0663\u0123\u0001\u0000\u0000"+
		"\u0000\u0664\u0669\u0003\u0126\u0093\u0000\u0665\u0666\u0005\u0016\u0000"+
		"\u0000\u0666\u0668\u0003\u0126\u0093\u0000\u0667\u0665\u0001\u0000\u0000"+
		"\u0000\u0668\u066b\u0001\u0000\u0000\u0000\u0669\u0667\u0001\u0000\u0000"+
		"\u0000\u0669\u066a\u0001\u0000\u0000\u0000\u066a\u0125\u0001\u0000\u0000"+
		"\u0000\u066b\u0669\u0001\u0000\u0000\u0000\u066c\u066d\u0005\u0017\u0000"+
		"\u0000\u066d\u066e\u0005O\u0000\u0000\u066e\u066f\u0005\u001c\u0000\u0000"+
		"\u066f\u0670\u0003\u0084B\u0000\u0670\u0671\u0005\u0016\u0000\u0000\u0671"+
		"\u0672\u0005P\u0000\u0000\u0672\u0673\u0005\u001c\u0000\u0000\u0673\u0674"+
		"\u0003\u0084B\u0000\u0674\u0675\u0005\u0018\u0000\u0000\u0675\u0127\u0001"+
		"\u0000\u0000\u0000\u0676\u0678\u0003\u00e4r\u0000\u0677\u0679\u0003\u012c"+
		"\u0096\u0000\u0678\u0677\u0001\u0000\u0000\u0000\u0678\u0679\u0001\u0000"+
		"\u0000\u0000\u0679\u067b\u0001\u0000\u0000\u0000\u067a\u067c\u0003d2\u0000"+
		"\u067b\u067a\u0001\u0000\u0000\u0000\u067b\u067c\u0001\u0000\u0000\u0000"+
		"\u067c\u067e\u0001\u0000\u0000\u0000\u067d\u067f\u0003h4\u0000\u067e\u067d"+
		"\u0001\u0000\u0000\u0000\u067e\u067f\u0001\u0000\u0000\u0000\u067f\u0680"+
		"\u0001\u0000\u0000\u0000\u0680\u0681\u0003\u012a\u0095\u0000\u0681\u0129"+
		"\u0001\u0000\u0000\u0000\u0682\u0684\u0005\u001a\u0000\u0000\u0683\u0685"+
		"\u0003\u012e\u0097\u0000\u0684\u0683\u0001\u0000\u0000\u0000\u0684\u0685"+
		"\u0001\u0000\u0000\u0000\u0685\u068a\u0001\u0000\u0000\u0000\u0686\u0689"+
		"\u0003\u0134\u009a\u0000\u0687\u0689\u0003\u0132\u0099\u0000\u0688\u0686"+
		"\u0001\u0000\u0000\u0000\u0688\u0687\u0001\u0000\u0000\u0000\u0689\u068c"+
		"\u0001\u0000\u0000\u0000\u068a\u0688\u0001\u0000\u0000\u0000\u068a\u068b"+
		"\u0001\u0000\u0000\u0000\u068b\u068d\u0001\u0000\u0000\u0000\u068c\u068a"+
		"\u0001\u0000\u0000\u0000\u068d\u068e\u0005\u001b\u0000\u0000\u068e\u012b"+
		"\u0001\u0000\u0000\u0000\u068f\u0690\u0005\u000e\u0000\u0000\u0690\u0691"+
		"\u0003\u0000\u0000\u0000\u0691\u012d\u0001\u0000\u0000\u0000\u0692\u06a0"+
		"\u0005\u0013\u0000\u0000\u0693\u0694\u0007\u0002\u0000\u0000\u0694\u0695"+
		"\u0005!\u0000\u0000\u0695\u069a\u0003\u0130\u0098\u0000\u0696\u0697\u0005"+
		"\u0016\u0000\u0000\u0697\u0699\u0003\u0130\u0098\u0000\u0698\u0696\u0001"+
		"\u0000\u0000\u0000\u0699\u069c\u0001\u0000\u0000\u0000\u069a\u0698\u0001"+
		"\u0000\u0000\u0000\u069a\u069b\u0001\u0000\u0000\u0000\u069b\u069d\u0001"+
		"\u0000\u0000\u0000\u069c\u069a\u0001\u0000\u0000\u0000\u069d\u069e\u0005"+
		"\"\u0000\u0000\u069e\u06a0\u0001\u0000\u0000\u0000\u069f\u0692\u0001\u0000"+
		"\u0000\u0000\u069f\u0693\u0001\u0000\u0000\u0000\u06a0\u012f\u0001\u0000"+
		"\u0000\u0000\u06a1\u06a3\u0003\u0136\u009b\u0000\u06a2\u06a4\u0003d2\u0000"+
		"\u06a3\u06a2\u0001\u0000\u0000\u0000\u06a3\u06a4\u0001\u0000\u0000\u0000"+
		"\u06a4\u06a6\u0001\u0000\u0000\u0000\u06a5\u06a7\u0003h4\u0000\u06a6\u06a5"+
		"\u0001\u0000\u0000\u0000\u06a6\u06a7\u0001\u0000\u0000\u0000\u06a7\u0131"+
		"\u0001\u0000\u0000\u0000\u06a8\u06aa\u0003\u0136\u009b\u0000\u06a9\u06ab"+
		"\u0003\u012c\u0096\u0000\u06aa\u06a9\u0001\u0000\u0000\u0000\u06aa\u06ab"+
		"\u0001\u0000\u0000\u0000\u06ab\u06ad\u0001\u0000\u0000\u0000\u06ac\u06ae"+
		"\u0003d2\u0000\u06ad\u06ac\u0001\u0000\u0000\u0000\u06ad\u06ae\u0001\u0000"+
		"\u0000\u0000\u06ae\u06b0\u0001\u0000\u0000\u0000\u06af\u06b1\u0003h4\u0000"+
		"\u06b0\u06af\u0001\u0000\u0000\u0000\u06b0\u06b1\u0001\u0000\u0000\u0000"+
		"\u06b1\u06b3\u0001\u0000\u0000\u0000\u06b2\u06b4\u0003\u012a\u0095\u0000"+
		"\u06b3\u06b2\u0001\u0000\u0000\u0000\u06b3\u06b4\u0001\u0000\u0000\u0000"+
		"\u06b4\u0133\u0001\u0000\u0000\u0000\u06b5\u06b6\u0005%\u0000\u0000\u06b6"+
		"\u06b7\u0003\u0136\u009b\u0000\u06b7\u06b8\u0005!\u0000\u0000\u06b8\u06b9"+
		"\u0003x<\u0000\u06b9\u06bb\u0005\"\u0000\u0000\u06ba\u06bc\u0003\u012c"+
		"\u0096\u0000\u06bb\u06ba\u0001\u0000\u0000\u0000\u06bb\u06bc\u0001\u0000"+
		"\u0000\u0000\u06bc\u06be\u0001\u0000\u0000\u0000\u06bd\u06bf\u0003d2\u0000"+
		"\u06be\u06bd\u0001\u0000\u0000\u0000\u06be\u06bf\u0001\u0000\u0000\u0000"+
		"\u06bf\u06c1\u0001\u0000\u0000\u0000\u06c0\u06c2\u0003h4\u0000\u06c1\u06c0"+
		"\u0001\u0000\u0000\u0000\u06c1\u06c2\u0001\u0000\u0000\u0000\u06c2\u06c4"+
		"\u0001\u0000\u0000\u0000\u06c3\u06c5\u0003\u012a\u0095\u0000\u06c4\u06c3"+
		"\u0001\u0000\u0000\u0000\u06c4\u06c5\u0001\u0000\u0000\u0000\u06c5\u0135"+
		"\u0001\u0000\u0000\u0000\u06c6\u06d5\u0003\u0000\u0000\u0000\u06c7\u06d0"+
		"\u0005\u0017\u0000\u0000\u06c8\u06cd\u0003\u0138\u009c\u0000\u06c9\u06ca"+
		"\u0005\u0016\u0000\u0000\u06ca\u06cc\u0003\u0138\u009c\u0000\u06cb\u06c9"+
		"\u0001\u0000\u0000\u0000\u06cc\u06cf\u0001\u0000\u0000\u0000\u06cd\u06cb"+
		"\u0001\u0000\u0000\u0000\u06cd\u06ce\u0001\u0000\u0000\u0000\u06ce\u06d1"+
		"\u0001\u0000\u0000\u0000\u06cf\u06cd\u0001\u0000\u0000\u0000\u06d0\u06c8"+
		"\u0001\u0000\u0000\u0000\u06d0\u06d1\u0001\u0000\u0000\u0000\u06d1\u06d2"+
		"\u0001\u0000\u0000\u0000\u06d2\u06d4\u0005\u0018\u0000\u0000\u06d3\u06c7"+
		"\u0001\u0000\u0000\u0000\u06d4\u06d7\u0001\u0000\u0000\u0000\u06d5\u06d3"+
		"\u0001\u0000\u0000\u0000\u06d5\u06d6\u0001\u0000\u0000\u0000\u06d6\u0137"+
		"\u0001\u0000\u0000\u0000\u06d7\u06d5\u0001\u0000\u0000\u0000\u06d8\u06d9"+
		"\u0003\u00e4r\u0000\u06d9\u06da\u0003\u00f0x\u0000\u06da\u0139\u0001\u0000"+
		"\u0000\u0000\u00d2\u013d\u0146\u014b\u015d\u015f\u0166\u0169\u016d\u0170"+
		"\u017a\u017d\u0180\u0183\u018b\u018e\u0194\u0197\u019b\u01a0\u01a4\u01a7"+
		"\u01b0\u01b7\u01bd\u01bf\u01d3\u01d7\u01de\u01e9\u01eb\u01ee\u01f5\u01fd"+
		"\u020b\u020d\u0212\u0215\u0218\u021b\u0221\u0226\u0229\u0237\u023a\u0243"+
		"\u0246\u024b\u025b\u025e\u0267\u026d\u0270\u0277\u027a\u027e\u0289\u028c"+
		"\u0295\u0298\u029c\u02a0\u02ad\u02b0\u02bf\u02c5\u02c9\u02d1\u02d4\u02dc"+
		"\u02e0\u02e3\u02e6\u02f6\u02fa\u0302\u0305\u0316\u0320\u0323\u032f\u0347"+
		"\u0357\u0365\u0371\u0379\u037c\u0382\u0385\u038a\u038d\u0399\u03a7\u03b4"+
		"\u03b7\u03bb\u03c4\u03c9\u03d4\u03df\u03e2\u03e8\u03ee\u03f9\u0400\u040a"+
		"\u040d\u041a\u041e\u0428\u042b\u042e\u0434\u0437\u043a\u043c\u0444\u0447"+
		"\u044e\u0456\u0459\u0466\u0480\u0487\u048c\u0490\u0494\u0497\u049a\u049d"+
		"\u04a1\u04a7\u04b1\u04b8\u04bc\u04ce\u04d8\u04df\u04e2\u04e9\u04ec\u04f0"+
		"\u04f3\u0519\u052c\u0531\u0535\u0539\u0542\u054a\u0553\u055c\u0565\u0570"+
		"\u0577\u0581\u0585\u0588\u058b\u058f\u0595\u05a3\u05a9\u05b1\u05b4\u05bc"+
		"\u05c0\u05c4\u05c8\u05d4\u05dc\u05df\u05e6\u05e9\u05f2\u05fc\u0600\u0609"+
		"\u0610\u0613\u061a\u061f\u0624\u0628\u062c\u0640\u064f\u0656\u065f\u0669"+
		"\u0678\u067b\u067e\u0684\u0688\u068a\u069a\u069f\u06a3\u06a6\u06aa\u06ad"+
		"\u06b0\u06b3\u06bb\u06be\u06c1\u06c4\u06cd\u06d0\u06d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}