grammar CMinus;

// Palavras reservadas - TOPICO 1
IF : 'if' ;
ELSE : 'else' ;
INT : 'int' ;
RETURN : 'return' ;
VOID : 'void' ;
WHILE : 'while' ;
// Palavras reservadas - TOPICO 1

//Simbolos especiais - TOPICO 2
LEFTPARENTHESIS : '(';
RIGHTPARENTHESIS : ')';
LEFTBRACKET : '[';
RIGHTBRACKET : ']';
LEFTBRACE : '{';
RIGHTBRACE : '}';

LESS : '<';
LESSEQUAL : '<=';
GREATER : '>';
GREATEREQUAL : '>=';
DOUBLEEQUAL : '==';
ASSIGN : '=';

PLUS : '+';
MINUS : '-';
STAR : '*';
DIV : '/';
STARLEFTCOMMENT : '/*';
STARRIGHTCOMMENT : '*/';

SEMICOLON : ';';
NEWLINE : '\n';
TAB : '\t';
BLANKSPACE : ' ';

LETTER : 'a'..'z' | 'A'..'Z' ;
DIGIT : ('0'..'9') ;

//Simbolos especiais - TOPICO 2

//REGRAS DEFINIDAS - TOPICO 3
id : LETTER+ ;
num : DIGIT+ ;
//REGRAS DEFINIDAS - TOPICO 3

space : BLANKSPACE+ | TAB+ | NEWLINE+ ;

comment: STARLEFTCOMMENT comment_text* STARRIGHTCOMMENT ;
comment_text: id+ | num+ | space+ ;

fragment
ENDOF: 'EOF';
