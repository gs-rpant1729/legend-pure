// Generated from /Users/rohitpant/Projects/legend-pure/legend-pure-core/legend-pure-m3-core/src/main/antlr4/org/finos/legend/pure/m3/serialization/grammar/m3parser/antlr/core/M3CoreParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link M3CoreParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface M3CoreParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(M3CoreParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(M3CoreParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#packagePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackagePath(M3CoreParser.PackagePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(M3CoreParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(M3CoreParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(M3CoreParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(M3CoreParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#typeVariableParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableParameters(M3CoreParser.TypeVariableParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#primitiveDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDefinition(M3CoreParser.PrimitiveDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#measureDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasureDefinition(M3CoreParser.MeasureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#measureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasureBody(M3CoreParser.MeasureBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#canonicalUnitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanonicalUnitExpr(M3CoreParser.CanonicalUnitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#unitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitExpr(M3CoreParser.UnitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#nonConvertibleUnitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonConvertibleUnitExpr(M3CoreParser.NonConvertibleUnitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#unitConversionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitConversionExpr(M3CoreParser.UnitConversionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping(M3CoreParser.MappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#mappingLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingLine(M3CoreParser.MappingLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#sourceAndTargetMappingId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceAndTargetMappingId(M3CoreParser.SourceAndTargetMappingIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#sourceId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceId(M3CoreParser.SourceIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#targetId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetId(M3CoreParser.TargetIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(M3CoreParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(M3CoreParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(M3CoreParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(M3CoreParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#qualifiedProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedProperty(M3CoreParser.QualifiedPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#qualifiedPropertyBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedPropertyBody(M3CoreParser.QualifiedPropertyBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation(M3CoreParser.AssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#associationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociationBody(M3CoreParser.AssociationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#associationProjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociationProjection(M3CoreParser.AssociationProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(M3CoreParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(M3CoreParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#nativeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeFunction(M3CoreParser.NativeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#functionTypeSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeSignature(M3CoreParser.FunctionTypeSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(M3CoreParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#functionDescriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDescriptor(M3CoreParser.FunctionDescriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#nonArrowOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonArrowOrEqualExpression(M3CoreParser.NonArrowOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(M3CoreParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instanceBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceBlock(M3CoreParser.InstanceBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance(M3CoreParser.InstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#unitInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitInstance(M3CoreParser.UnitInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#unitName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitName(M3CoreParser.UnitNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instancePropertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstancePropertyAssignment(M3CoreParser.InstancePropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instanceRightSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceRightSide(M3CoreParser.InstanceRightSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instanceAtomicRightSideScalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceAtomicRightSideScalar(M3CoreParser.InstanceAtomicRightSideScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instanceAtomicRightSideVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceAtomicRightSideVector(M3CoreParser.InstanceAtomicRightSideVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instanceAtomicRightSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceAtomicRightSide(M3CoreParser.InstanceAtomicRightSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#enumReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumReference(M3CoreParser.EnumReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#stereotypeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStereotypeReference(M3CoreParser.StereotypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#tagReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagReference(M3CoreParser.TagReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#propertyReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyReturnType(M3CoreParser.PropertyReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#stereotypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStereotypes(M3CoreParser.StereotypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#stereotype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStereotype(M3CoreParser.StereotypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#taggedValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaggedValues(M3CoreParser.TaggedValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#taggedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaggedValue(M3CoreParser.TaggedValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(M3CoreParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#defaultValueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValueExpression(M3CoreParser.DefaultValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#defaultValueExpressionsArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValueExpressionsArray(M3CoreParser.DefaultValueExpressionsArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#profile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfile(M3CoreParser.ProfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#stereotypeDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStereotypeDefinitions(M3CoreParser.StereotypeDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#tagDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagDefinitions(M3CoreParser.TagDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(M3CoreParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#programLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramLine(M3CoreParser.ProgramLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#equalNotEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNotEqual(M3CoreParser.EqualNotEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#combinedArithmeticOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinedArithmeticOnly(M3CoreParser.CombinedArithmeticOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#expressionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPart(M3CoreParser.ExpressionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#letExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpression(M3CoreParser.LetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#combinedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinedExpression(M3CoreParser.CombinedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#expressionOrExpressionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrExpressionGroup(M3CoreParser.ExpressionOrExpressionGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#expressionsArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsArray(M3CoreParser.ExpressionsArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#propertyOrFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyOrFunctionExpression(M3CoreParser.PropertyOrFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#propertyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpression(M3CoreParser.PropertyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(M3CoreParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#functionExpressionLatestMilestoningDateParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpressionLatestMilestoningDateParameter(M3CoreParser.FunctionExpressionLatestMilestoningDateParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#functionExpressionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpressionParameters(M3CoreParser.FunctionExpressionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#atomicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpression(M3CoreParser.AtomicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#columnBuilders}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnBuilders(M3CoreParser.ColumnBuildersContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#oneColSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneColSpec(M3CoreParser.OneColSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#extraFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraFunction(M3CoreParser.ExtraFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instanceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceReference(M3CoreParser.InstanceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#anyLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyLambda(M3CoreParser.AnyLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#lambdaFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunction(M3CoreParser.LambdaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(M3CoreParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#allOrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrFunction(M3CoreParser.AllOrFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#allFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllFunction(M3CoreParser.AllFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#allVersionsFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllVersionsFunction(M3CoreParser.AllVersionsFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#allVersionsInRangeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllVersionsInRangeFunction(M3CoreParser.AllVersionsInRangeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#allFunctionWithMilestoning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllFunctionWithMilestoning(M3CoreParser.AllFunctionWithMilestoningContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#buildMilestoningVariableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildMilestoningVariableExpression(M3CoreParser.BuildMilestoningVariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#expressionInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInstance(M3CoreParser.ExpressionInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#expressionInstanceRightSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInstanceRightSide(M3CoreParser.ExpressionInstanceRightSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#expressionInstanceAtomicRightSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInstanceAtomicRightSide(M3CoreParser.ExpressionInstanceAtomicRightSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#expressionInstanceParserPropertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInstanceParserPropertyAssignment(M3CoreParser.ExpressionInstanceParserPropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#sliceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceExpression(M3CoreParser.SliceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints(M3CoreParser.ConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(M3CoreParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#simpleConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleConstraint(M3CoreParser.SimpleConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#complexConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexConstraint(M3CoreParser.ComplexConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#constraintOwner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintOwner(M3CoreParser.ConstraintOwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#constraintExternalId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintExternalId(M3CoreParser.ConstraintExternalIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#constraintFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintFunction(M3CoreParser.ConstraintFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#constraintEnforcementLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintEnforcementLevel(M3CoreParser.ConstraintEnforcementLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#constraintMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintMessage(M3CoreParser.ConstraintMessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#constraintId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintId(M3CoreParser.ConstraintIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(M3CoreParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#signedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedExpression(M3CoreParser.SignedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#lambdaPipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaPipe(M3CoreParser.LambdaPipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#lambdaParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParam(M3CoreParser.LambdaParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#lambdaParamType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParamType(M3CoreParser.LambdaParamTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instanceLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceLiteral(M3CoreParser.InstanceLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#instanceLiteralToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceLiteralToken(M3CoreParser.InstanceLiteralTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#unitInstanceLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitInstanceLiteral(M3CoreParser.UnitInstanceLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#arithmeticPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticPart(M3CoreParser.ArithmeticPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#booleanPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPart(M3CoreParser.BooleanPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#functionVariableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVariableExpression(M3CoreParser.FunctionVariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(M3CoreParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#typeVariableValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableValues(M3CoreParser.TypeVariableValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#columnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnType(M3CoreParser.ColumnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#mayColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayColumnName(M3CoreParser.MayColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#mayColumnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayColumnType(M3CoreParser.MayColumnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(M3CoreParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#multiplicity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicity(M3CoreParser.MultiplicityContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#fromMultiplicity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromMultiplicity(M3CoreParser.FromMultiplicityContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#toMultiplicity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultiplicity(M3CoreParser.ToMultiplicityContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(M3CoreParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#functionTypePureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypePureType(M3CoreParser.FunctionTypePureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#typeAndMultiplicityParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAndMultiplicityParameters(M3CoreParser.TypeAndMultiplicityParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#typeParametersWithContravarianceAndMultiplicityParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParametersWithContravarianceAndMultiplicityParameters(M3CoreParser.TypeParametersWithContravarianceAndMultiplicityParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(M3CoreParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(M3CoreParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#contravarianceTypeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContravarianceTypeParameters(M3CoreParser.ContravarianceTypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#contravarianceTypeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContravarianceTypeParameter(M3CoreParser.ContravarianceTypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#multiplicityArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicityArguments(M3CoreParser.MultiplicityArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#multiplicityArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicityArgument(M3CoreParser.MultiplicityArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(M3CoreParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#typeWithOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeWithOperation(M3CoreParser.TypeWithOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#typeAddSubOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAddSubOperation(M3CoreParser.TypeAddSubOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#addType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddType(M3CoreParser.AddTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#subType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubType(M3CoreParser.SubTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#subsetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsetType(M3CoreParser.SubsetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#equalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualType(M3CoreParser.EqualTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#multiplictyParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplictyParameters(M3CoreParser.MultiplictyParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#dsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl(M3CoreParser.DslContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(M3CoreParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#aggregateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateSpecification(M3CoreParser.AggregateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#groupByFunctionSpecifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByFunctionSpecifications(M3CoreParser.GroupByFunctionSpecificationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#groupByFunctionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByFunctionSpecification(M3CoreParser.GroupByFunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#aggregationFunctionSpecifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionSpecifications(M3CoreParser.AggregationFunctionSpecificationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#aggregationFunctionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionSpecification(M3CoreParser.AggregationFunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#treePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreePath(M3CoreParser.TreePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#treePathClassBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreePathClassBody(M3CoreParser.TreePathClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(M3CoreParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#simplePropertyFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePropertyFilter(M3CoreParser.SimplePropertyFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#simpleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleProperty(M3CoreParser.SimplePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#complexProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexProperty(M3CoreParser.ComplexPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#derivedProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedProperty(M3CoreParser.DerivedPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#propertyRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyRef(M3CoreParser.PropertyRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link M3CoreParser#treePathPropertyParameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreePathPropertyParameterType(M3CoreParser.TreePathPropertyParameterTypeContext ctx);
}