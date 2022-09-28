// Generated from /Users/atieharmin/Desktop/term 6/Compiler/Project/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JepetoParser}.
 */
public interface JepetoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JepetoParser#jepeto}.
	 * @param ctx the parse tree
	 */
	void enterJepeto(JepetoParser.JepetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#jepeto}.
	 * @param ctx the parse tree
	 */
	void exitJepeto(JepetoParser.JepetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#jepetoProgram}.
	 * @param ctx the parse tree
	 */
	void enterJepetoProgram(JepetoParser.JepetoProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#jepetoProgram}.
	 * @param ctx the parse tree
	 */
	void exitJepetoProgram(JepetoParser.JepetoProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JepetoParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JepetoParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JepetoParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JepetoParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(JepetoParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(JepetoParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void enterValueArguments(JepetoParser.ValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void exitValueArguments(JepetoParser.ValueArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#keyValueArguments}.
	 * @param ctx the parse tree
	 */
	void enterKeyValueArguments(JepetoParser.KeyValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#keyValueArguments}.
	 * @param ctx the parse tree
	 */
	void exitKeyValueArguments(JepetoParser.KeyValueArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(JepetoParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(JepetoParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(JepetoParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(JepetoParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JepetoParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JepetoParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#functionPointer}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPointer(JepetoParser.FunctionPointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#functionPointer}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPointer(JepetoParser.FunctionPointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(JepetoParser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(JepetoParser.ReturnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#normalBlock}.
	 * @param ctx the parse tree
	 */
	void enterNormalBlock(JepetoParser.NormalBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#normalBlock}.
	 * @param ctx the parse tree
	 */
	void exitNormalBlock(JepetoParser.NormalBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(JepetoParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(JepetoParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JepetoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JepetoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JepetoParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JepetoParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JepetoParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JepetoParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#comparitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparitiveExpression(JepetoParser.ComparitiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#comparitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparitiveExpression(JepetoParser.ComparitiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JepetoParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JepetoParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JepetoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JepetoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JepetoParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JepetoParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#appendicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterAppendicalExpression(JepetoParser.AppendicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#appendicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitAppendicalExpression(JepetoParser.AppendicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeExpression(JepetoParser.SizeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeExpression(JepetoParser.SizeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#sizePrimeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizePrimeExpression(JepetoParser.SizePrimeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#sizePrimeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizePrimeExpression(JepetoParser.SizePrimeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#getAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterGetAccessExpression(JepetoParser.GetAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#getAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitGetAccessExpression(JepetoParser.GetAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpression(JepetoParser.OtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpression(JepetoParser.OtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(JepetoParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(JepetoParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(JepetoParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(JepetoParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JepetoParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JepetoParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(JepetoParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(JepetoParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#ifReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfReturnStatement(JepetoParser.IfReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#ifReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfReturnStatement(JepetoParser.IfReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#ifReturnBody}.
	 * @param ctx the parse tree
	 */
	void enterIfReturnBody(JepetoParser.IfReturnBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#ifReturnBody}.
	 * @param ctx the parse tree
	 */
	void exitIfReturnBody(JepetoParser.IfReturnBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JepetoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JepetoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JepetoParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JepetoParser.IdentifierContext ctx);
}