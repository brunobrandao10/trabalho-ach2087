grammar Cminus;

// Palavras reservadas - TOPICO 1
IF : 'if' ;
ELSE : 'else' ;
INT : 'int' ;
RETURN : 'return' ;
VOID : 'void' ;
WHILE : 'while' ;
// Palavras reservadas - TOPICO 1

//Simbolos especiais - TOPICO 2
LEFTPAREN : '(';
RIGHTPAREN : ')';
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
STARLEFTCOMMENT : '*/';
STARRIGHTCOMMENT : '*/';
//Simbolos especiais - TOPICO 2

//REGRAS DEFINIDAS - TOPICO 3
ID : LETTER LETTER* ;
NUM : DIGIT DIGIT*;
//REGRAS DEFINIDAS - TOPICO 3

LETTER : 'a'..'z' | 'A'..'Z';
fragment
DIGIT : ('0'..'9');