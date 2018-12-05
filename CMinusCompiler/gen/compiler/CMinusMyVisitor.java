package compiler;

public class CMinusMyVisitor extends CMinusBaseVisitor<String> {
	
	@Override public String visitProgram(CMinusParser.ProgramContext ctx) {
		return ".text\n" +
			   ".globl main\n" +
			   "main:\n" +
			   "subu $t0, $sp, 8\n" + 
			   "sw  $ra, 4($t0)\n" + 
			   "sw  $sp, ($t0)\n" + 
			   "addu $sp, $t0, 0\n" +
			   visitChildren(ctx) + "\n" +
			   "lw  $ra, 4($sp)\n" + 
			   "lw  $sp, ($sp)\n" +
			   "jr $ra\n";
	}
	
	@Override public String visitList_declartion(CMinusParser.List_declartionContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitDeclaration(CMinusParser.DeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitVar_declaration(CMinusParser.Var_declarationContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitFunction_declaration(CMinusParser.Function_declarationContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitType(CMinusParser.TypeContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitParams(CMinusParser.ParamsContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitList_params(CMinusParser.List_paramsContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitParam(CMinusParser.ParamContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitFunction(CMinusParser.FunctionContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitLocal_var_declaration(CMinusParser.Local_var_declarationContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitList_statement(CMinusParser.List_statementContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitStatement(CMinusParser.StatementContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitExpression_declaration(CMinusParser.Expression_declarationContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitIf(CMinusParser.IfContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitIfElse(CMinusParser.IfElseContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitWhile(CMinusParser.WhileContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitReturn(CMinusParser.ReturnContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitReturnExpression(CMinusParser.ReturnExpressionContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitExpression(CMinusParser.ExpressionContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitVar(CMinusParser.VarContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitSimple_expression(CMinusParser.Simple_expressionContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitSum_expression(CMinusParser.Sum_expressionContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitTerm(CMinusParser.TermContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitFactor(CMinusParser.FactorContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitFunction_call(CMinusParser.Function_callContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitWrite_func(CMinusParser.Write_funcContext ctx) {
		return	"li $a0," + ctx.number.getText() + "\n" +
				"li $v0, 1\n" +
				"syscall\n" +
				"li $v0, 0\n";
	}

	@Override public String visitArgs(CMinusParser.ArgsContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitArg_list(CMinusParser.Arg_listContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitBleq(CMinusParser.BleqContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitBl(CMinusParser.BlContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitBg(CMinusParser.BgContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitBgeq(CMinusParser.BgeqContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitBeq(CMinusParser.BeqContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitBneq(CMinusParser.BneqContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitAdd(CMinusParser.AddContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitSub(CMinusParser.SubContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitDiv(CMinusParser.DivContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitMulti(CMinusParser.MultiContext ctx) { return visitChildren(ctx); }

}
