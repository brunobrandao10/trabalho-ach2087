// Generated from /home/nicbacic/workspace/java/antlr/trabalho-ach2087/CMinusCompiler/CMinus.g4 by ANTLR 4.7
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMinusParser}.
 */
public interface CMinusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMinusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CMinusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CMinusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#list_declartion}.
	 * @param ctx the parse tree
	 */
	void enterList_declartion(CMinusParser.List_declartionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#list_declartion}.
	 * @param ctx the parse tree
	 */
	void exitList_declartion(CMinusParser.List_declartionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CMinusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CMinusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(CMinusParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(CMinusParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(CMinusParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(CMinusParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CMinusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CMinusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CMinusParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CMinusParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#list_params}.
	 * @param ctx the parse tree
	 */
	void enterList_params(CMinusParser.List_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#list_params}.
	 * @param ctx the parse tree
	 */
	void exitList_params(CMinusParser.List_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CMinusParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CMinusParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CMinusParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CMinusParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#local_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_var_declaration(CMinusParser.Local_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#local_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_var_declaration(CMinusParser.Local_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#list_statement}.
	 * @param ctx the parse tree
	 */
	void enterList_statement(CMinusParser.List_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#list_statement}.
	 * @param ctx the parse tree
	 */
	void exitList_statement(CMinusParser.List_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CMinusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CMinusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#expression_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExpression_declaration(CMinusParser.Expression_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#expression_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExpression_declaration(CMinusParser.Expression_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link CMinusParser#if_else_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIf(CMinusParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link CMinusParser#if_else_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIf(CMinusParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link CMinusParser#if_else_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(CMinusParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link CMinusParser#if_else_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(CMinusParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link CMinusParser#iterator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CMinusParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link CMinusParser#iterator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CMinusParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CMinusParser#return_declaration}.
	 * @param ctx the parse tree
	 */
	void enterReturn(CMinusParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CMinusParser#return_declaration}.
	 * @param ctx the parse tree
	 */
	void exitReturn(CMinusParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link CMinusParser#return_declaration}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(CMinusParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link CMinusParser#return_declaration}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(CMinusParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CMinusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CMinusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CMinusParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CMinusParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(CMinusParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(CMinusParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#sum_expression}.
	 * @param ctx the parse tree
	 */
	void enterSum_expression(CMinusParser.Sum_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#sum_expression}.
	 * @param ctx the parse tree
	 */
	void exitSum_expression(CMinusParser.Sum_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CMinusParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CMinusParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CMinusParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CMinusParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(CMinusParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(CMinusParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CMinusParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CMinusParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(CMinusParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(CMinusParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#write_func}.
	 * @param ctx the parse tree
	 */
	void enterWrite_func(CMinusParser.Write_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#write_func}.
	 * @param ctx the parse tree
	 */
	void exitWrite_func(CMinusParser.Write_funcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bleq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterBleq(CMinusParser.BleqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bleq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitBleq(CMinusParser.BleqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bl}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterBl(CMinusParser.BlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bl}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitBl(CMinusParser.BlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bg}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterBg(CMinusParser.BgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bg}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitBg(CMinusParser.BgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bgeq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterBgeq(CMinusParser.BgeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bgeq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitBgeq(CMinusParser.BgeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Beq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterBeq(CMinusParser.BeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Beq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitBeq(CMinusParser.BeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bneq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterBneq(CMinusParser.BneqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bneq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitBneq(CMinusParser.BneqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CMinusParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CMinusParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CMinusParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CMinusParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CMinusParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSub(CMinusParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CMinusParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSub(CMinusParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link CMinusParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterDiv(CMinusParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link CMinusParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitDiv(CMinusParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multi}
	 * labeled alternative in {@link CMinusParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMulti(CMinusParser.MultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multi}
	 * labeled alternative in {@link CMinusParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMulti(CMinusParser.MultiContext ctx);
}