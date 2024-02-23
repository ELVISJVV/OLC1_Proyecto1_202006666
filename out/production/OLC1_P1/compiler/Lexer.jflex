// ------------  Paquete e importaciones ------------
package compiler;

import java_cup.runtime.*;

%%
//-------> Directivas (No tocar)

%public
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase

%{
%}

// ------> Expresiones Regulares

double = [0-9]+(\.[0-9]+)?
cadena = [\"][^\n\"]*[\"]
comentario = [!].*[\n]
comentarioMultilinea = [<!]*([.]|[\n])*?[!>]
entero = [0-9]+
letra = [a-zA-ZñÑáéíóúÁÉÍÓÚ]+

%%
// ------------  Reglas Lexicas -------------------
//------> Palabras Reservadas

"PROGRAM"   { return new Symbol(sym.RPROGRAM, yycolumn, yyline, yytext()); }
"END"       { return new Symbol(sym.REND, yycolumn, yyline, yytext()); }
"VAR"       { return new Symbol(sym.RVAR, yycolumn, yyline, yytext()); }
"RES"       { return new Symbol(sym.RRES, yycolumn, yyline, yytext()); }
"SUM"       { return new Symbol(sym.RSUM, yycolumn, yyline, yytext()); }
"MUL"       { return new Symbol(sym.RMUL, yycolumn, yyline, yytext()); }
"DIV"       { return new Symbol(sym.RDIV, yycolumn, yyline, yytext()); }
"MOD"       { return new Symbol(sym.RMOD, yycolumn, yyline, yytext()); }
"MEDIA"     { return new Symbol(sym.RMEDIA, yycolumn, yyline, yytext()); }
"MEDIANA"   { return new Symbol(sym.RMEDIANA, yycolumn, yyline, yytext()); }
"MODA"      { return new Symbol(sym.RMODA, yycolumn, yyline, yytext()); }
"VARIANZA"  { return new Symbol(sym.RVARIANZA, yycolumn, yyline, yytext()); }
"MAX"       { return new Symbol(sym.RMAX, yycolumn, yyline, yytext()); }
"MIN"       { return new Symbol(sym.RMIN, yycolumn, yyline, yytext()); }
"console"   { return new Symbol(sym.RCONSOLE, yycolumn, yyline, yytext()); }
"print"     { return new Symbol(sym.RPRINT, yycolumn, yyline, yytext()); }
"char"      { return new Symbol(sym.RCHAR, yycolumn, yyline, yytext()); }
"double"    { return new Symbol(sym.RDOUBLE, yycolumn, yyline, yytext()); }
//"endd"       { return new Symbol(sym.RENDPRINT, yycolumn, yyline, yytext()); }


// Simbolos
"!"         {return new Symbol(sym.EXCL, yycolumn, yyline, yytext());}
"("         {return new Symbol(sym.PARIZQ, yycolumn, yyline, yytext());}
")"         {return new Symbol(sym.PARDER, yycolumn, yyline, yytext());}
";"         {return new Symbol(sym.PYC, yycolumn, yyline, yytext());}
"["         {return new Symbol(sym.CORCHIZQ, yycolumn, yyline, yytext());}
"]"         {return new Symbol(sym.CORCHDER, yycolumn, yyline, yytext());}
","         {return new Symbol(sym.COMA, yycolumn, yyline, yytext());}
":"         {return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
"."         {return new Symbol(sym.PUNTO, yycolumn, yyline, yytext());}
"@"        {return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());}
//"""        {return new Symbol(sym.COMILLAS, yycolumn, yyline, yytext());}
"\""        {return new Symbol(sym.COMILLAS, yycolumn, yyline, yytext());}

// Operadores
"+"         {}
"-"         {return new Symbol(sym.MENOS, yycolumn, yyline, yytext());}
"="         {return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());}
"<"         {return new Symbol(sym.MENOR, yycolumn, yyline, yytext());}
">"         {return new Symbol(sym.MAYOR, yycolumn, yyline, yytext());}
"=="        {return new Symbol(sym.IGUALIGUAL, yycolumn, yyline, yytext());}


// Expresiones
{double}        { return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext()); }
{cadena}        { return new Symbol(sym.CADENA, yycolumn, yyline, yytext()); }
{comentario}    {  }
{comentarioMultilinea}    {  }
{entero} {}
{letra} {}

//------> Ingorados
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }

