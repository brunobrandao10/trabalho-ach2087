// Generated from /home/nicbacic/workspace/java/antlr/trabalho-ach2087/CMinusCompiler/CMinus.g4 by ANTLR 4.7
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMinusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMinusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMinusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CMinusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#list_declartion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_declartion(CMinusParser.List_declartionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CMinusParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(CMinusParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(CMinusParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CMinusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CMinusParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#list_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_params(CMinusParser.List_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CMinusParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CMinusParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#local_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_var_declaration(CMinusParser.Local_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#list_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_statement(CMinusParser.List_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CMinusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#expression_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_declaration(CMinusParser.Expression_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link CMinusParser#if_else_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CMinusParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link CMinusParser#if_else_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(CMinusParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link CMinusParser#iterator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(CMinusParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CMinusParser#return_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(CMinusParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link CMinusParser#return_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(CMinusParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CMinusParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CMinusParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(CMinusParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#sum_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_expression(CMinusParser.Sum_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CMinusParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CMinusParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(CMinusParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CMinusParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(CMinusParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#write_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_func(CMinusParser.Write_funcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bleq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBleq(CMinusParser.BleqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bl}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBl(CMinusParser.BlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bg}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBg(CMinusParser.BgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bgeq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBgeq(CMinusParser.BgeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Beq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeq(CMinusParser.BeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bneq}
	 * labeled alternative in {@link CMinusParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBneq(CMinusParser.BneqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CMinusParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CMinusParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CMinusParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(CMinusParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link CMinusParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(CMinusParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multi}
	 * labeled alternative in {@link CMinusParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti(CMinusParser.MultiContext ctx);
}