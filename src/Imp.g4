grammar Imp;

prog : com EOF ;

com : PRINT LPAR exp RPAR                                                           # output
    | idDecAssign                                                                   # idDecAsgn
    | SKIPP                                                                         # skip
    | com SEMICOLON com                                                             # seq

    | WHILE LPAR exp RPAR LBRACE com RBRACE (com)?                                  # while
    | IF LPAR exp RPAR LBRACE com RBRACE ELSE LBRACE com RBRACE (com)?              # if

    | FOR LPAR VAR ID idAssign TO exp RPAR LBRACE com RBRACE (com)?                 # forPascal
    | LBRACE com RBRACE ND LQUAD com RQUAD                                          # nonDet
    | SLY LBRACE bfCom RBRACE ARNOLD                                                # slyArnold

    | fun                                                                           # functionCom
    | FUN ID LPAR (idTypeDec ID (',' + idTypeDec ID)*)? RPAR LBRACE com (RET exp SEMICOLON)? RBRACE (com)?                 # funDef

    |                                                                               # nothing
    ;


//-----------Assign and Declaration-----------

idDecAssign: idTypeDec ID (idAssign)?              # declaration
           | ID idAssign                           # assign
           | VAR ID LQUAD index=(ID | INT) RQUAD                # vectorDeclaration
           | ID LQUAD index=(INT | ID) RQUAD idAssign           # vectorAssign
           ;

idAssign : ASSIGN exp;

idTypeDec: idType=(CONST | VAR);

//-----------Assign and Declaration-----------


//---------- Functions -----------------
fun : STR LPAR exp RPAR                             # funStr
    | INPUT LPAR RPAR                               # input
    | ID LPAR (exp (',' exp)*)? RPAR                # funCall
    ;

//---------- Functions -----------------

exp : types                                     # type
    | LPAR exp RPAR                             # parExp
    | <assoc=right> exp POW exp                 # pow
    | NOT exp                                   # not
    | exp op=(DIV | MUL | MOD) exp              # divMulMod
    | exp op=(ADD | SUB) exp                    # addSub
    | exp op=(LT | LEQ | GEQ | GT) exp          # cmpExp
    | exp op=(EQQ | NEQ) exp                    # eqExp
    | exp op=(AND | OR) exp                     # logicExp
    | exp CONC exp                              # concat
    | ID LQUAD index=(INT|ID) RQUAD             # arrayAccess
    | fun                                       # functionCalls
    ;

types : INT             # integers
     | FLOAT            # float
     | BOOL             # boolean
     | STRING           # string
     | ID               # id
     ;

bfCom  : (LT | GT | ADD | SUB | LQUAD | RQUAD | COMMA | DOT | '++')*
       |
       ;

STRING : ('“' | '"') STRCHR* ('”' | '"') ;
fragment STRCHR : ~[”"\\] | ESC ;
fragment ESC : '\\' [btnfr"'\\] ;

//tipi
INT  : '0' | [-]?[1-9][0-9]*;
BOOL : 'true' | 'false' ;
FLOAT   : [-]?[0-9]+[.][0-9]+ ;

//tipi identificatori
CONST : 'CONST';
VAR     : 'var';

//operatori

ADD   : '+' ;
SUB   : '-' ;
MUL   : '*' ;
DIV   : '/' ;
MOD   : 'mod' ;
POW   : '^' ;
CONC : '++' ;

//operatori logici
AND : '&&' ;
OR  : '||' ;
NOT : '!' ;

//operatori di confronto
EQQ : '==' ;
NEQ : '!=' ;
LEQ : '<=' ;
GEQ : '>=' ;
LT  : '<' ;
GT  : '>' ;

//comandi
IF     : 'if' ;
FOR    : 'for';
ELSE   : 'else' ;
WHILE  : 'while' ;
SKIPP  : 'skip' ;
ASSIGN : '=' ;
PRINT  : 'print' ;
INPUT  : 'input';
SLY    : 'sly';
ARNOLD : 'arnold';
ND     : 'ND';
TO     : 'to';
FUN    : 'fun';
RET    : 'ret';

// str funz
STR    : 'str';

//delimitatori
LPAR      : '(' ;
RPAR      : ')' ;
LQUAD     : '[' ;
RQUAD     : ']' ;
LBRACE    : '{' ;
RBRACE    : '}' ;
SEMICOLON : ';' ;

//identificatori
ID : [a-zA-Z]+ ;

//brainfuck
DOT       : '.' ;
COMMA     : ',' ;


//
WS : [ \t\r\n]+ -> skip ;
