grammar CMinus;

/* TODO: a expression não está bem definida ainda. Por exemplo, é possível
   escrever coisas como:

   if(a=a+b(3)) return;

   porque dentro do if cabe uma expression e a expression tá atrelada a uma operação assign.

   Eu acho que a expression tem que ser desvinculada da operação assign (a=3, por exemplo)
   O assign seria algo como

   var '=' expression

   dai evitaria alguns problemas como esse do if ou coisas ainda mais bizarras
   que da pra escrever. O que você acha?

   Recomendo escrever um codigozinho pra ver a árvore sintática gerada, é bem bacana.

   Exemplo:

   int fib(int n) {
     if(n <= 1) return 1;
     return fib(n - 1) + fib(n-2);
   }
*/

program: list_declartion;
list_declartion: list_declartion declaration | declaration;
declaration: var_declaration | function_declaration;
var_declaration: type id ';' | type id '[' num ']' ';';
function_declaration: type id '(' params ')' function;
type: INT | VOID;

params: list_params | VOID;
list_params: list_params ',' param | param;
param: type id | type id '['']';
function: '{' local_var_declaration list_statement '}';
local_var_declaration: var_declaration*;
list_statement: statement*;
statement: expression_declaration | function | if_else_declaration | iterator_declaration | return_declaration;
expression_declaration: expression';' | ';';

if_else_declaration: IF '(' expression ')' statement | IF '(' expression ')' statement ELSE statement;
iterator_declaration: WHILE '(' expression ')' statement;
return_declaration: RETURN ';' | RETURN expression ';';

expression: var '=' expression | simple_expression;
var: id | id '[' expression ']';
simple_expression: sum_expression relational_operator sum_expression | sum_expression;
sum_expression: sum_expression sum term | term;
term: term mult factor | factor;
factor: '(' simple_expression ')' | var | function_call | num;

function_call: id '(' args ')';
args: arg_list?;
arg_list: arg_list','expression | expression;

id : LETTER+ ;
num : DIGIT+ ;

relational_operator: '<=' | '<' | '>' | '>=' | '==' | '!=';
sum: '+' | '-';
mult: '*' | '/';

IF : 'if' ;
ELSE : 'else' ;
INT : 'int' ;
RETURN : 'return' ;
VOID : 'void' ;
WHILE : 'while' ;

COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;

LETTER : [a-zA-Z] ;
DIGIT : [0-9] ;
