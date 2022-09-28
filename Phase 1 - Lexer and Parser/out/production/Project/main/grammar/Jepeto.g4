grammar Jepeto;

jepeto: (jepetoProgram)? EOF;

jepetoProgram: (func)* main (func)*;

main: MAIN  {
                System.out.println("Main");
            }
            COLON (functionCall | printStatement);

functionCall: identifier {
                            System.out.println("FunctionCall");
                         }
                         (LPAR functionCallArguments RPAR)+ SEMICOLLON;

functionCallArguments: ( valueArguments | keyValueArguments )?;

valueArguments: (expression COMMA)* expression;

keyValueArguments: (identifier ASSIGN expression COMMA)*(identifier ASSIGN expression);

func: FUNC funcName=identifier  {
                                    System.out.println("FunctionDec : "+$funcName.text);
                                }
                                LPAR ((arg = identifier {
                                                            System.out.println("ArgumentDec : "+$arg.text);
                                                        }
                                                        COMMA)* arg = identifier {
                                                                                    System.out.println("ArgumentDec : "+$arg.text);
                                                                                 }
                                                                                 )? RPAR COLON funcBody;

funcBody: returnBlock | returnStatement;

returnStatement: RETURN {
                            System.out.println("Return");
                        }
                        (expression|VOID) SEMICOLLON | ifReturnStatement;

functionPointer:LPAR {
                         System.out.println("Anonymous Function");
                     }
                     ((arg = identifier {
                                            System.out.println("ArgumentDec : "+$arg.text);
                                        }
                                        COMMA)* arg = identifier {
                                                                    System.out.println("ArgumentDec : "+$arg.text);
                                                                 }
                                                                 )? RPAR ARROW returnBlock;

returnBlock: LBRACE ((statement)* returnStatement)+ (statement)* RBRACE;

normalBlock: LBRACE (statement)* RBRACE;

printStatement: PRINT {
                        System.out.println("Built-in : print");
                      }
                      LPAR expression RPAR SEMICOLLON;

expression: andExpression (OR andExpression {
                                                System.out.println("Operator : or");
                                            })*;

andExpression: equalityExpression (AND  equalityExpression{
                                                            System.out.println("Operator : and");
                                                           }
                                                           )*;

equalityExpression: comparitiveExpression (EQUAL comparitiveExpression {
                                                                        System.out.println("Operator : is");
                                                                        }
                                                                        | NOT_EQUAL comparitiveExpression {
                                                                                                            System.out.println("Operator : not");
                                                                                                           }
                                                                                                            )*;

comparitiveExpression: additiveExpression (GREATER_THAN additiveExpression {
                                                                                System.out.println("Operator : >");
                                                                             }
                                                                             | LESS_THAN additiveExpression {
                                                                                                                System.out.println("Operator : <");
                                                                                                            }
                                                                                                            )*;

additiveExpression: multiplicativeExpression (PLUS multiplicativeExpression {
                                                                                System.out.println("Operator : +");
                                                                             }
                                                                             | MINUS multiplicativeExpression {
                                                                                        System.out.println("Operator : -");
                                                                                     }
                                                                                     )*;

multiplicativeExpression: unaryExpression (MULT unaryExpression {
                                                                    System.out.println("Operator : *");
                                                                 }
                                                                 | DIVIDE unaryExpression {
                                                                                System.out.println("Operator : /");
                                                                           }
                                                                           )*;

unaryExpression: (NOT unaryExpression {
                                            System.out.println("Operator : ~");
                                        }
                                        | MINUS unaryExpression {
                                                                    System.out.println("Operator : -");
                                                                }
                                                                ) | appendicalExpression;

appendicalExpression: sizeExpression (APPEND sizeExpression {
                                                                System.out.println("Operator : ::");
                                                            }
                                                            )*;

sizeExpression: getAccessExpression sizePrimeExpression;

sizePrimeExpression: (SIZE sizePrimeExpression {
                                                    System.out.println("Size");
                                                }
                                                )?;

getAccessExpression: otherExpression ((LBRACK expression RBRACK) | (LPAR functionCallArguments RPAR))* ;

otherExpression: values | identifier | LPAR (expression)? RPAR;

values: TRUE | FALSE | INT_VALUE | STRING_VALUE | list | functionPointer;

list: LBRACK ((expression COMMA)* expression)? RBRACK;

ifStatement: IF
                {
                    System.out.println("Conditional : if");
                }
                expression COLON ifBody (ELSE
                                            {
                                                System.out.println("Conditional : else");
                                            }
                                            COLON ifBody)?;

ifBody: normalBlock | returnBlock | statement | returnStatement;

ifReturnStatement: IF
                    {
                        System.out.println("Conditional : if");
                    }
                    expression COLON ifReturnBody ELSE
                                                     {
                                                        System.out.println("Conditional : else");
                                                     }
                                                     COLON ifReturnBody;

ifReturnBody: returnBlock | returnStatement ;

statement:  ifStatement | printStatement | functionCall;

identifier: IDENTIFIER;

MAIN: 'main';

PRINT: 'print';
FUNC: 'func';
RETURN: 'return';

IF: 'if';
ELSE: 'else';

VOID: 'void';

SIZE: '.size';

TRUE: 'true';
FALSE: 'false';

ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';
NOT_EQUAL: 'not';
EQUAL: 'is';

MULT: '*';
DIVIDE: '/';
PLUS: '+';
MINUS: '-';

AND: 'and';
OR: 'or';
NOT: '~';

ASSIGN: '=';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

COMMA: ',';
COLON: ':';
APPEND: '::';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';
COMMENT: ('#' ~( '\r' | '\n')*) -> skip;
WS: ([ \t\n\r]) -> skip;