// Generated from /Users/atieharmin/Desktop/term 6/Compiler/Project/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JepetoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JepetoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JepetoParser#jepeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJepeto(JepetoParser.JepetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#jepetoProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJepetoProgram(JepetoParser.JepetoProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(JepetoParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JepetoParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(JepetoParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#valueArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArguments(JepetoParser.ValueArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#keyValueArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValueArguments(JepetoParser.KeyValueArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(JepetoParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(JepetoParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JepetoParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#functionPointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPointer(JepetoParser.FunctionPointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(JepetoParser.ReturnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#normalBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalBlock(JepetoParser.NormalBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(JepetoParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JepetoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(JepetoParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JepetoParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#comparitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparitiveExpression(JepetoParser.ComparitiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JepetoParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JepetoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JepetoParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#appendicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendicalExpression(JepetoParser.AppendicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#sizeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeExpression(JepetoParser.SizeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#sizePrimeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizePrimeExpression(JepetoParser.SizePrimeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#getAccessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAccessExpression(JepetoParser.GetAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#otherExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherExpression(JepetoParser.OtherExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(JepetoParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(JepetoParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JepetoParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(JepetoParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#ifReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfReturnStatement(JepetoParser.IfReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#ifReturnBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfReturnBody(JepetoParser.IfReturnBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JepetoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JepetoParser.IdentifierContext ctx);
}