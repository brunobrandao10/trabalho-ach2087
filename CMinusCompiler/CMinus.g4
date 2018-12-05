grammar CMinus;

program: list_declartion;
list_declartion: list_declartion declaration | declaration | write_func;
declaration: var_declaration | function_declaration ;
var_declaration: type varName=LETTER ';' | type varName=LETTER '[' number=DIGIT ']' ';';
function_declaration: type funcName=LETTER '(' params ')' function;
type: 'int' | 'void';

params: list_params | 'void';
list_params: list_params ',' param | param;
param: type paramName=LETTER | type paramName=LETTER '['']';
function: '{' local_var_declaration list_statement '}';
local_var_declaration: var_declaration*;
list_statement: statement*;
statement: expression_declaration | function | if_else_declaration | iterator_declaration | return_declaration
           | write_func;
expression_declaration: expression';' | ';';

if_else_declaration: 'if' '(' expression ')' statement #If | 'if' '(' expression ')' statement 'else' statement #IfElse;
iterator_declaration: 'while' '(' expression ')' statement #While;
return_declaration: 'return' ';' #Return| 'return' expression ';' #ReturnExpression;

expression: var '=' expression | simple_expression;
var: varName=LETTER | varName=LETTER '[' expression ']';
simple_expression: sum_expression relational_operator sum_expression | sum_expression;
sum_expression: left=sum_expression sum right=term | term;
term: left=term mult right=factor | factor;
factor: '(' simple_expression ')' | var | function_call | number=DIGIT;

function_call: funcName=LETTER '(' args ')';
args: arg_list?;
arg_list: arg_list','expression | expression;

write_func: 'write' '(' function_call ')' ';' | 'write' '(' var ')' ';'
            | 'write' '(' number=DIGIT ')' ';';

// Branch operations: Branch Less or Equal; Branch Less; Branch Greater; Branch Greater or Equal;
// Branch Equal; Branch Not Equal
relational_operator: '<=' #Bleq| '<' #Bl| '>' #Bg| '>=' #Bgeq| '==' #Beq| '!=' #Bneq;
sum: '+' #Add | '-' #Sub;
mult: '/' #Div | '*' #Multi;

COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;

LETTER : [a-zA-Z]+ ;
DIGIT : [0-9]+;
