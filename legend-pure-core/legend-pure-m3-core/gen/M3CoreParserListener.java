// Generated from /Users/rohitpant/Projects/legend-pure/legend-pure-core/legend-pure-m3-core/src/main/antlr4/org/finos/legend/pure/m3/serialization/grammar/m3parser/antlr/core/M3CoreParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link M3CoreParser}.
 */
public interface M3CoreParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(M3CoreParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(M3CoreParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(M3CoreParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(M3CoreParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void enterPackagePath(M3CoreParser.PackagePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void exitPackagePath(M3CoreParser.PackagePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(M3CoreParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(M3CoreParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(M3CoreParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(M3CoreParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(M3CoreParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(M3CoreParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(M3CoreParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(M3CoreParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#typeVariableParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableParameters(M3CoreParser.TypeVariableParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#typeVariableParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableParameters(M3CoreParser.TypeVariableParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#primitiveDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDefinition(M3CoreParser.PrimitiveDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#primitiveDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDefinition(M3CoreParser.PrimitiveDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#measureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMeasureDefinition(M3CoreParser.MeasureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#measureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMeasureDefinition(M3CoreParser.MeasureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#measureBody}.
	 * @param ctx the parse tree
	 */
	void enterMeasureBody(M3CoreParser.MeasureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#measureBody}.
	 * @param ctx the parse tree
	 */
	void exitMeasureBody(M3CoreParser.MeasureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#canonicalUnitExpr}.
	 * @param ctx the parse tree
	 */
	void enterCanonicalUnitExpr(M3CoreParser.CanonicalUnitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#canonicalUnitExpr}.
	 * @param ctx the parse tree
	 */
	void exitCanonicalUnitExpr(M3CoreParser.CanonicalUnitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#unitExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnitExpr(M3CoreParser.UnitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#unitExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnitExpr(M3CoreParser.UnitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#nonConvertibleUnitExpr}.
	 * @param ctx the parse tree
	 */
	void enterNonConvertibleUnitExpr(M3CoreParser.NonConvertibleUnitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#nonConvertibleUnitExpr}.
	 * @param ctx the parse tree
	 */
	void exitNonConvertibleUnitExpr(M3CoreParser.NonConvertibleUnitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#unitConversionExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnitConversionExpr(M3CoreParser.UnitConversionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#unitConversionExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnitConversionExpr(M3CoreParser.UnitConversionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(M3CoreParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(M3CoreParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#mappingLine}.
	 * @param ctx the parse tree
	 */
	void enterMappingLine(M3CoreParser.MappingLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#mappingLine}.
	 * @param ctx the parse tree
	 */
	void exitMappingLine(M3CoreParser.MappingLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#sourceAndTargetMappingId}.
	 * @param ctx the parse tree
	 */
	void enterSourceAndTargetMappingId(M3CoreParser.SourceAndTargetMappingIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#sourceAndTargetMappingId}.
	 * @param ctx the parse tree
	 */
	void exitSourceAndTargetMappingId(M3CoreParser.SourceAndTargetMappingIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#sourceId}.
	 * @param ctx the parse tree
	 */
	void enterSourceId(M3CoreParser.SourceIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#sourceId}.
	 * @param ctx the parse tree
	 */
	void exitSourceId(M3CoreParser.SourceIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#targetId}.
	 * @param ctx the parse tree
	 */
	void enterTargetId(M3CoreParser.TargetIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#targetId}.
	 * @param ctx the parse tree
	 */
	void exitTargetId(M3CoreParser.TargetIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(M3CoreParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(M3CoreParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(M3CoreParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(M3CoreParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(M3CoreParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(M3CoreParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(M3CoreParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(M3CoreParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#qualifiedProperty}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedProperty(M3CoreParser.QualifiedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#qualifiedProperty}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedProperty(M3CoreParser.QualifiedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#qualifiedPropertyBody}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedPropertyBody(M3CoreParser.QualifiedPropertyBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#qualifiedPropertyBody}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedPropertyBody(M3CoreParser.QualifiedPropertyBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#association}.
	 * @param ctx the parse tree
	 */
	void enterAssociation(M3CoreParser.AssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#association}.
	 * @param ctx the parse tree
	 */
	void exitAssociation(M3CoreParser.AssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#associationBody}.
	 * @param ctx the parse tree
	 */
	void enterAssociationBody(M3CoreParser.AssociationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#associationBody}.
	 * @param ctx the parse tree
	 */
	void exitAssociationBody(M3CoreParser.AssociationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#associationProjection}.
	 * @param ctx the parse tree
	 */
	void enterAssociationProjection(M3CoreParser.AssociationProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#associationProjection}.
	 * @param ctx the parse tree
	 */
	void exitAssociationProjection(M3CoreParser.AssociationProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(M3CoreParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(M3CoreParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(M3CoreParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(M3CoreParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#nativeFunction}.
	 * @param ctx the parse tree
	 */
	void enterNativeFunction(M3CoreParser.NativeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#nativeFunction}.
	 * @param ctx the parse tree
	 */
	void exitNativeFunction(M3CoreParser.NativeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#functionTypeSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeSignature(M3CoreParser.FunctionTypeSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#functionTypeSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeSignature(M3CoreParser.FunctionTypeSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(M3CoreParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(M3CoreParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#functionDescriptor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDescriptor(M3CoreParser.FunctionDescriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#functionDescriptor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDescriptor(M3CoreParser.FunctionDescriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#nonArrowOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterNonArrowOrEqualExpression(M3CoreParser.NonArrowOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#nonArrowOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitNonArrowOrEqualExpression(M3CoreParser.NonArrowOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(M3CoreParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(M3CoreParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instanceBlock}.
	 * @param ctx the parse tree
	 */
	void enterInstanceBlock(M3CoreParser.InstanceBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instanceBlock}.
	 * @param ctx the parse tree
	 */
	void exitInstanceBlock(M3CoreParser.InstanceBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstance(M3CoreParser.InstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstance(M3CoreParser.InstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#unitInstance}.
	 * @param ctx the parse tree
	 */
	void enterUnitInstance(M3CoreParser.UnitInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#unitInstance}.
	 * @param ctx the parse tree
	 */
	void exitUnitInstance(M3CoreParser.UnitInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#unitName}.
	 * @param ctx the parse tree
	 */
	void enterUnitName(M3CoreParser.UnitNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#unitName}.
	 * @param ctx the parse tree
	 */
	void exitUnitName(M3CoreParser.UnitNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instancePropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterInstancePropertyAssignment(M3CoreParser.InstancePropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instancePropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitInstancePropertyAssignment(M3CoreParser.InstancePropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instanceRightSide}.
	 * @param ctx the parse tree
	 */
	void enterInstanceRightSide(M3CoreParser.InstanceRightSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instanceRightSide}.
	 * @param ctx the parse tree
	 */
	void exitInstanceRightSide(M3CoreParser.InstanceRightSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instanceAtomicRightSideScalar}.
	 * @param ctx the parse tree
	 */
	void enterInstanceAtomicRightSideScalar(M3CoreParser.InstanceAtomicRightSideScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instanceAtomicRightSideScalar}.
	 * @param ctx the parse tree
	 */
	void exitInstanceAtomicRightSideScalar(M3CoreParser.InstanceAtomicRightSideScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instanceAtomicRightSideVector}.
	 * @param ctx the parse tree
	 */
	void enterInstanceAtomicRightSideVector(M3CoreParser.InstanceAtomicRightSideVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instanceAtomicRightSideVector}.
	 * @param ctx the parse tree
	 */
	void exitInstanceAtomicRightSideVector(M3CoreParser.InstanceAtomicRightSideVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instanceAtomicRightSide}.
	 * @param ctx the parse tree
	 */
	void enterInstanceAtomicRightSide(M3CoreParser.InstanceAtomicRightSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instanceAtomicRightSide}.
	 * @param ctx the parse tree
	 */
	void exitInstanceAtomicRightSide(M3CoreParser.InstanceAtomicRightSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#enumReference}.
	 * @param ctx the parse tree
	 */
	void enterEnumReference(M3CoreParser.EnumReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#enumReference}.
	 * @param ctx the parse tree
	 */
	void exitEnumReference(M3CoreParser.EnumReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#stereotypeReference}.
	 * @param ctx the parse tree
	 */
	void enterStereotypeReference(M3CoreParser.StereotypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#stereotypeReference}.
	 * @param ctx the parse tree
	 */
	void exitStereotypeReference(M3CoreParser.StereotypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#tagReference}.
	 * @param ctx the parse tree
	 */
	void enterTagReference(M3CoreParser.TagReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#tagReference}.
	 * @param ctx the parse tree
	 */
	void exitTagReference(M3CoreParser.TagReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#propertyReturnType}.
	 * @param ctx the parse tree
	 */
	void enterPropertyReturnType(M3CoreParser.PropertyReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#propertyReturnType}.
	 * @param ctx the parse tree
	 */
	void exitPropertyReturnType(M3CoreParser.PropertyReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#stereotypes}.
	 * @param ctx the parse tree
	 */
	void enterStereotypes(M3CoreParser.StereotypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#stereotypes}.
	 * @param ctx the parse tree
	 */
	void exitStereotypes(M3CoreParser.StereotypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#stereotype}.
	 * @param ctx the parse tree
	 */
	void enterStereotype(M3CoreParser.StereotypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#stereotype}.
	 * @param ctx the parse tree
	 */
	void exitStereotype(M3CoreParser.StereotypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#taggedValues}.
	 * @param ctx the parse tree
	 */
	void enterTaggedValues(M3CoreParser.TaggedValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#taggedValues}.
	 * @param ctx the parse tree
	 */
	void exitTaggedValues(M3CoreParser.TaggedValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#taggedValue}.
	 * @param ctx the parse tree
	 */
	void enterTaggedValue(M3CoreParser.TaggedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#taggedValue}.
	 * @param ctx the parse tree
	 */
	void exitTaggedValue(M3CoreParser.TaggedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(M3CoreParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(M3CoreParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#defaultValueExpression}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValueExpression(M3CoreParser.DefaultValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#defaultValueExpression}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValueExpression(M3CoreParser.DefaultValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#defaultValueExpressionsArray}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValueExpressionsArray(M3CoreParser.DefaultValueExpressionsArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#defaultValueExpressionsArray}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValueExpressionsArray(M3CoreParser.DefaultValueExpressionsArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#profile}.
	 * @param ctx the parse tree
	 */
	void enterProfile(M3CoreParser.ProfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#profile}.
	 * @param ctx the parse tree
	 */
	void exitProfile(M3CoreParser.ProfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#stereotypeDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterStereotypeDefinitions(M3CoreParser.StereotypeDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#stereotypeDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitStereotypeDefinitions(M3CoreParser.StereotypeDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#tagDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterTagDefinitions(M3CoreParser.TagDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#tagDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitTagDefinitions(M3CoreParser.TagDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(M3CoreParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(M3CoreParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#programLine}.
	 * @param ctx the parse tree
	 */
	void enterProgramLine(M3CoreParser.ProgramLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#programLine}.
	 * @param ctx the parse tree
	 */
	void exitProgramLine(M3CoreParser.ProgramLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#equalNotEqual}.
	 * @param ctx the parse tree
	 */
	void enterEqualNotEqual(M3CoreParser.EqualNotEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#equalNotEqual}.
	 * @param ctx the parse tree
	 */
	void exitEqualNotEqual(M3CoreParser.EqualNotEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#combinedArithmeticOnly}.
	 * @param ctx the parse tree
	 */
	void enterCombinedArithmeticOnly(M3CoreParser.CombinedArithmeticOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#combinedArithmeticOnly}.
	 * @param ctx the parse tree
	 */
	void exitCombinedArithmeticOnly(M3CoreParser.CombinedArithmeticOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#expressionPart}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPart(M3CoreParser.ExpressionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#expressionPart}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPart(M3CoreParser.ExpressionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#letExpression}.
	 * @param ctx the parse tree
	 */
	void enterLetExpression(M3CoreParser.LetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#letExpression}.
	 * @param ctx the parse tree
	 */
	void exitLetExpression(M3CoreParser.LetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#combinedExpression}.
	 * @param ctx the parse tree
	 */
	void enterCombinedExpression(M3CoreParser.CombinedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#combinedExpression}.
	 * @param ctx the parse tree
	 */
	void exitCombinedExpression(M3CoreParser.CombinedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#expressionOrExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrExpressionGroup(M3CoreParser.ExpressionOrExpressionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#expressionOrExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrExpressionGroup(M3CoreParser.ExpressionOrExpressionGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#expressionsArray}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsArray(M3CoreParser.ExpressionsArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#expressionsArray}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsArray(M3CoreParser.ExpressionsArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#propertyOrFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyOrFunctionExpression(M3CoreParser.PropertyOrFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#propertyOrFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyOrFunctionExpression(M3CoreParser.PropertyOrFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#propertyExpression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpression(M3CoreParser.PropertyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#propertyExpression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpression(M3CoreParser.PropertyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(M3CoreParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(M3CoreParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#functionExpressionLatestMilestoningDateParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpressionLatestMilestoningDateParameter(M3CoreParser.FunctionExpressionLatestMilestoningDateParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#functionExpressionLatestMilestoningDateParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpressionLatestMilestoningDateParameter(M3CoreParser.FunctionExpressionLatestMilestoningDateParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#functionExpressionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpressionParameters(M3CoreParser.FunctionExpressionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#functionExpressionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpressionParameters(M3CoreParser.FunctionExpressionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(M3CoreParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(M3CoreParser.AtomicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#columnBuilders}.
	 * @param ctx the parse tree
	 */
	void enterColumnBuilders(M3CoreParser.ColumnBuildersContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#columnBuilders}.
	 * @param ctx the parse tree
	 */
	void exitColumnBuilders(M3CoreParser.ColumnBuildersContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#oneColSpec}.
	 * @param ctx the parse tree
	 */
	void enterOneColSpec(M3CoreParser.OneColSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#oneColSpec}.
	 * @param ctx the parse tree
	 */
	void exitOneColSpec(M3CoreParser.OneColSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#extraFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtraFunction(M3CoreParser.ExtraFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#extraFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtraFunction(M3CoreParser.ExtraFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instanceReference}.
	 * @param ctx the parse tree
	 */
	void enterInstanceReference(M3CoreParser.InstanceReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instanceReference}.
	 * @param ctx the parse tree
	 */
	void exitInstanceReference(M3CoreParser.InstanceReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#anyLambda}.
	 * @param ctx the parse tree
	 */
	void enterAnyLambda(M3CoreParser.AnyLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#anyLambda}.
	 * @param ctx the parse tree
	 */
	void exitAnyLambda(M3CoreParser.AnyLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunction(M3CoreParser.LambdaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunction(M3CoreParser.LambdaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(M3CoreParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(M3CoreParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#allOrFunction}.
	 * @param ctx the parse tree
	 */
	void enterAllOrFunction(M3CoreParser.AllOrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#allOrFunction}.
	 * @param ctx the parse tree
	 */
	void exitAllOrFunction(M3CoreParser.AllOrFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#allFunction}.
	 * @param ctx the parse tree
	 */
	void enterAllFunction(M3CoreParser.AllFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#allFunction}.
	 * @param ctx the parse tree
	 */
	void exitAllFunction(M3CoreParser.AllFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#allVersionsFunction}.
	 * @param ctx the parse tree
	 */
	void enterAllVersionsFunction(M3CoreParser.AllVersionsFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#allVersionsFunction}.
	 * @param ctx the parse tree
	 */
	void exitAllVersionsFunction(M3CoreParser.AllVersionsFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#allVersionsInRangeFunction}.
	 * @param ctx the parse tree
	 */
	void enterAllVersionsInRangeFunction(M3CoreParser.AllVersionsInRangeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#allVersionsInRangeFunction}.
	 * @param ctx the parse tree
	 */
	void exitAllVersionsInRangeFunction(M3CoreParser.AllVersionsInRangeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#allFunctionWithMilestoning}.
	 * @param ctx the parse tree
	 */
	void enterAllFunctionWithMilestoning(M3CoreParser.AllFunctionWithMilestoningContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#allFunctionWithMilestoning}.
	 * @param ctx the parse tree
	 */
	void exitAllFunctionWithMilestoning(M3CoreParser.AllFunctionWithMilestoningContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#buildMilestoningVariableExpression}.
	 * @param ctx the parse tree
	 */
	void enterBuildMilestoningVariableExpression(M3CoreParser.BuildMilestoningVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#buildMilestoningVariableExpression}.
	 * @param ctx the parse tree
	 */
	void exitBuildMilestoningVariableExpression(M3CoreParser.BuildMilestoningVariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#expressionInstance}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInstance(M3CoreParser.ExpressionInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#expressionInstance}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInstance(M3CoreParser.ExpressionInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#expressionInstanceRightSide}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInstanceRightSide(M3CoreParser.ExpressionInstanceRightSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#expressionInstanceRightSide}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInstanceRightSide(M3CoreParser.ExpressionInstanceRightSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#expressionInstanceAtomicRightSide}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInstanceAtomicRightSide(M3CoreParser.ExpressionInstanceAtomicRightSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#expressionInstanceAtomicRightSide}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInstanceAtomicRightSide(M3CoreParser.ExpressionInstanceAtomicRightSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#expressionInstanceParserPropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInstanceParserPropertyAssignment(M3CoreParser.ExpressionInstanceParserPropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#expressionInstanceParserPropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInstanceParserPropertyAssignment(M3CoreParser.ExpressionInstanceParserPropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#sliceExpression}.
	 * @param ctx the parse tree
	 */
	void enterSliceExpression(M3CoreParser.SliceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#sliceExpression}.
	 * @param ctx the parse tree
	 */
	void exitSliceExpression(M3CoreParser.SliceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterConstraints(M3CoreParser.ConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitConstraints(M3CoreParser.ConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(M3CoreParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(M3CoreParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#simpleConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSimpleConstraint(M3CoreParser.SimpleConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#simpleConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSimpleConstraint(M3CoreParser.SimpleConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#complexConstraint}.
	 * @param ctx the parse tree
	 */
	void enterComplexConstraint(M3CoreParser.ComplexConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#complexConstraint}.
	 * @param ctx the parse tree
	 */
	void exitComplexConstraint(M3CoreParser.ComplexConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#constraintOwner}.
	 * @param ctx the parse tree
	 */
	void enterConstraintOwner(M3CoreParser.ConstraintOwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#constraintOwner}.
	 * @param ctx the parse tree
	 */
	void exitConstraintOwner(M3CoreParser.ConstraintOwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#constraintExternalId}.
	 * @param ctx the parse tree
	 */
	void enterConstraintExternalId(M3CoreParser.ConstraintExternalIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#constraintExternalId}.
	 * @param ctx the parse tree
	 */
	void exitConstraintExternalId(M3CoreParser.ConstraintExternalIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#constraintFunction}.
	 * @param ctx the parse tree
	 */
	void enterConstraintFunction(M3CoreParser.ConstraintFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#constraintFunction}.
	 * @param ctx the parse tree
	 */
	void exitConstraintFunction(M3CoreParser.ConstraintFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#constraintEnforcementLevel}.
	 * @param ctx the parse tree
	 */
	void enterConstraintEnforcementLevel(M3CoreParser.ConstraintEnforcementLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#constraintEnforcementLevel}.
	 * @param ctx the parse tree
	 */
	void exitConstraintEnforcementLevel(M3CoreParser.ConstraintEnforcementLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#constraintMessage}.
	 * @param ctx the parse tree
	 */
	void enterConstraintMessage(M3CoreParser.ConstraintMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#constraintMessage}.
	 * @param ctx the parse tree
	 */
	void exitConstraintMessage(M3CoreParser.ConstraintMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#constraintId}.
	 * @param ctx the parse tree
	 */
	void enterConstraintId(M3CoreParser.ConstraintIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#constraintId}.
	 * @param ctx the parse tree
	 */
	void exitConstraintId(M3CoreParser.ConstraintIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(M3CoreParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(M3CoreParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#signedExpression}.
	 * @param ctx the parse tree
	 */
	void enterSignedExpression(M3CoreParser.SignedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#signedExpression}.
	 * @param ctx the parse tree
	 */
	void exitSignedExpression(M3CoreParser.SignedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#lambdaPipe}.
	 * @param ctx the parse tree
	 */
	void enterLambdaPipe(M3CoreParser.LambdaPipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#lambdaPipe}.
	 * @param ctx the parse tree
	 */
	void exitLambdaPipe(M3CoreParser.LambdaPipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#lambdaParam}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParam(M3CoreParser.LambdaParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#lambdaParam}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParam(M3CoreParser.LambdaParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#lambdaParamType}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParamType(M3CoreParser.LambdaParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#lambdaParamType}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParamType(M3CoreParser.LambdaParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instanceLiteral}.
	 * @param ctx the parse tree
	 */
	void enterInstanceLiteral(M3CoreParser.InstanceLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instanceLiteral}.
	 * @param ctx the parse tree
	 */
	void exitInstanceLiteral(M3CoreParser.InstanceLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#instanceLiteralToken}.
	 * @param ctx the parse tree
	 */
	void enterInstanceLiteralToken(M3CoreParser.InstanceLiteralTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#instanceLiteralToken}.
	 * @param ctx the parse tree
	 */
	void exitInstanceLiteralToken(M3CoreParser.InstanceLiteralTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#unitInstanceLiteral}.
	 * @param ctx the parse tree
	 */
	void enterUnitInstanceLiteral(M3CoreParser.UnitInstanceLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#unitInstanceLiteral}.
	 * @param ctx the parse tree
	 */
	void exitUnitInstanceLiteral(M3CoreParser.UnitInstanceLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#arithmeticPart}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticPart(M3CoreParser.ArithmeticPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#arithmeticPart}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticPart(M3CoreParser.ArithmeticPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#booleanPart}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPart(M3CoreParser.BooleanPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#booleanPart}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPart(M3CoreParser.BooleanPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#functionVariableExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVariableExpression(M3CoreParser.FunctionVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#functionVariableExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVariableExpression(M3CoreParser.FunctionVariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(M3CoreParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(M3CoreParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#typeVariableValues}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableValues(M3CoreParser.TypeVariableValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#typeVariableValues}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableValues(M3CoreParser.TypeVariableValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#columnType}.
	 * @param ctx the parse tree
	 */
	void enterColumnType(M3CoreParser.ColumnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#columnType}.
	 * @param ctx the parse tree
	 */
	void exitColumnType(M3CoreParser.ColumnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#mayColumnName}.
	 * @param ctx the parse tree
	 */
	void enterMayColumnName(M3CoreParser.MayColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#mayColumnName}.
	 * @param ctx the parse tree
	 */
	void exitMayColumnName(M3CoreParser.MayColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#mayColumnType}.
	 * @param ctx the parse tree
	 */
	void enterMayColumnType(M3CoreParser.MayColumnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#mayColumnType}.
	 * @param ctx the parse tree
	 */
	void exitMayColumnType(M3CoreParser.MayColumnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(M3CoreParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(M3CoreParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#multiplicity}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicity(M3CoreParser.MultiplicityContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#multiplicity}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicity(M3CoreParser.MultiplicityContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#fromMultiplicity}.
	 * @param ctx the parse tree
	 */
	void enterFromMultiplicity(M3CoreParser.FromMultiplicityContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#fromMultiplicity}.
	 * @param ctx the parse tree
	 */
	void exitFromMultiplicity(M3CoreParser.FromMultiplicityContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#toMultiplicity}.
	 * @param ctx the parse tree
	 */
	void enterToMultiplicity(M3CoreParser.ToMultiplicityContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#toMultiplicity}.
	 * @param ctx the parse tree
	 */
	void exitToMultiplicity(M3CoreParser.ToMultiplicityContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(M3CoreParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(M3CoreParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#functionTypePureType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypePureType(M3CoreParser.FunctionTypePureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#functionTypePureType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypePureType(M3CoreParser.FunctionTypePureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#typeAndMultiplicityParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeAndMultiplicityParameters(M3CoreParser.TypeAndMultiplicityParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#typeAndMultiplicityParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeAndMultiplicityParameters(M3CoreParser.TypeAndMultiplicityParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#typeParametersWithContravarianceAndMultiplicityParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParametersWithContravarianceAndMultiplicityParameters(M3CoreParser.TypeParametersWithContravarianceAndMultiplicityParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#typeParametersWithContravarianceAndMultiplicityParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParametersWithContravarianceAndMultiplicityParameters(M3CoreParser.TypeParametersWithContravarianceAndMultiplicityParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(M3CoreParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(M3CoreParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(M3CoreParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(M3CoreParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#contravarianceTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterContravarianceTypeParameters(M3CoreParser.ContravarianceTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#contravarianceTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitContravarianceTypeParameters(M3CoreParser.ContravarianceTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#contravarianceTypeParameter}.
	 * @param ctx the parse tree
	 */
	void enterContravarianceTypeParameter(M3CoreParser.ContravarianceTypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#contravarianceTypeParameter}.
	 * @param ctx the parse tree
	 */
	void exitContravarianceTypeParameter(M3CoreParser.ContravarianceTypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#multiplicityArguments}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicityArguments(M3CoreParser.MultiplicityArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#multiplicityArguments}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicityArguments(M3CoreParser.MultiplicityArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#multiplicityArgument}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicityArgument(M3CoreParser.MultiplicityArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#multiplicityArgument}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicityArgument(M3CoreParser.MultiplicityArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(M3CoreParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(M3CoreParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#typeWithOperation}.
	 * @param ctx the parse tree
	 */
	void enterTypeWithOperation(M3CoreParser.TypeWithOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#typeWithOperation}.
	 * @param ctx the parse tree
	 */
	void exitTypeWithOperation(M3CoreParser.TypeWithOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#typeAddSubOperation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAddSubOperation(M3CoreParser.TypeAddSubOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#typeAddSubOperation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAddSubOperation(M3CoreParser.TypeAddSubOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#addType}.
	 * @param ctx the parse tree
	 */
	void enterAddType(M3CoreParser.AddTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#addType}.
	 * @param ctx the parse tree
	 */
	void exitAddType(M3CoreParser.AddTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#subType}.
	 * @param ctx the parse tree
	 */
	void enterSubType(M3CoreParser.SubTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#subType}.
	 * @param ctx the parse tree
	 */
	void exitSubType(M3CoreParser.SubTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#subsetType}.
	 * @param ctx the parse tree
	 */
	void enterSubsetType(M3CoreParser.SubsetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#subsetType}.
	 * @param ctx the parse tree
	 */
	void exitSubsetType(M3CoreParser.SubsetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#equalType}.
	 * @param ctx the parse tree
	 */
	void enterEqualType(M3CoreParser.EqualTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#equalType}.
	 * @param ctx the parse tree
	 */
	void exitEqualType(M3CoreParser.EqualTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#multiplictyParameters}.
	 * @param ctx the parse tree
	 */
	void enterMultiplictyParameters(M3CoreParser.MultiplictyParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#multiplictyParameters}.
	 * @param ctx the parse tree
	 */
	void exitMultiplictyParameters(M3CoreParser.MultiplictyParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#dsl}.
	 * @param ctx the parse tree
	 */
	void enterDsl(M3CoreParser.DslContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#dsl}.
	 * @param ctx the parse tree
	 */
	void exitDsl(M3CoreParser.DslContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(M3CoreParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(M3CoreParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#aggregateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAggregateSpecification(M3CoreParser.AggregateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#aggregateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAggregateSpecification(M3CoreParser.AggregateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#groupByFunctionSpecifications}.
	 * @param ctx the parse tree
	 */
	void enterGroupByFunctionSpecifications(M3CoreParser.GroupByFunctionSpecificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#groupByFunctionSpecifications}.
	 * @param ctx the parse tree
	 */
	void exitGroupByFunctionSpecifications(M3CoreParser.GroupByFunctionSpecificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#groupByFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterGroupByFunctionSpecification(M3CoreParser.GroupByFunctionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#groupByFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitGroupByFunctionSpecification(M3CoreParser.GroupByFunctionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#aggregationFunctionSpecifications}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionSpecifications(M3CoreParser.AggregationFunctionSpecificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#aggregationFunctionSpecifications}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionSpecifications(M3CoreParser.AggregationFunctionSpecificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#aggregationFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionSpecification(M3CoreParser.AggregationFunctionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#aggregationFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionSpecification(M3CoreParser.AggregationFunctionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#treePath}.
	 * @param ctx the parse tree
	 */
	void enterTreePath(M3CoreParser.TreePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#treePath}.
	 * @param ctx the parse tree
	 */
	void exitTreePath(M3CoreParser.TreePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#treePathClassBody}.
	 * @param ctx the parse tree
	 */
	void enterTreePathClassBody(M3CoreParser.TreePathClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#treePathClassBody}.
	 * @param ctx the parse tree
	 */
	void exitTreePathClassBody(M3CoreParser.TreePathClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(M3CoreParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(M3CoreParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#simplePropertyFilter}.
	 * @param ctx the parse tree
	 */
	void enterSimplePropertyFilter(M3CoreParser.SimplePropertyFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#simplePropertyFilter}.
	 * @param ctx the parse tree
	 */
	void exitSimplePropertyFilter(M3CoreParser.SimplePropertyFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#simpleProperty}.
	 * @param ctx the parse tree
	 */
	void enterSimpleProperty(M3CoreParser.SimplePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#simpleProperty}.
	 * @param ctx the parse tree
	 */
	void exitSimpleProperty(M3CoreParser.SimplePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#complexProperty}.
	 * @param ctx the parse tree
	 */
	void enterComplexProperty(M3CoreParser.ComplexPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#complexProperty}.
	 * @param ctx the parse tree
	 */
	void exitComplexProperty(M3CoreParser.ComplexPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#derivedProperty}.
	 * @param ctx the parse tree
	 */
	void enterDerivedProperty(M3CoreParser.DerivedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#derivedProperty}.
	 * @param ctx the parse tree
	 */
	void exitDerivedProperty(M3CoreParser.DerivedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#propertyRef}.
	 * @param ctx the parse tree
	 */
	void enterPropertyRef(M3CoreParser.PropertyRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#propertyRef}.
	 * @param ctx the parse tree
	 */
	void exitPropertyRef(M3CoreParser.PropertyRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link M3CoreParser#treePathPropertyParameterType}.
	 * @param ctx the parse tree
	 */
	void enterTreePathPropertyParameterType(M3CoreParser.TreePathPropertyParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link M3CoreParser#treePathPropertyParameterType}.
	 * @param ctx the parse tree
	 */
	void exitTreePathPropertyParameterType(M3CoreParser.TreePathPropertyParameterTypeContext ctx);
}