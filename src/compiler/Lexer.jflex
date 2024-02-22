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

entero = [0-9]+
cadena = [\"][^\n\"]*[\"]



%%
// ------------  Reglas Lexicas -------------------

//------> Palabras Reservadas
"PROGRAM"   { return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext()); }
"END"       { return new Symbol(sym.END, yycolumn, yyline, yytext()); }
"VAR"       { return new Symbol(sym.VAR, yycolumn, yyline, yytext()); }
"RES"       { return new Symbol(sym.RES, yycolumn, yyline, yytext()); }
"SUM"       { return new Symbol(sym.SUM, yycolumn, yyline, yytext()); }
"MUL"       { return new Symbol(sym.MUL, yycolumn, yyline, yytext()); }
"DIV"       { return new Symbol(sym.DIV, yycolumn, yyline, yytext()); }
"MOD"       { return new Symbol(sym.MOD, yycolumn, yyline, yytext()); }
"MEDIA"     { return new Symbol(sym.MEDIA, yycolumn, yyline, yytext()); }
"MEDIANA"   { return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext()); }
"MODA"      { return new Symbol(sym.MODA, yycolumn, yyline, yytext()); }
"VARIANZA"  { return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext()); }
"MAX"       { return new Symbol(sym.MAX, yycolumn, yyline, yytext()); }
"MIN"       { return new Symbol(sym.MIN, yycolumn, yyline, yytext()); }
"console"   { return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext()); }
"print"     { return new Symbol(sym.PRINT, yycolumn, yyline, yytext()); }

// Simbolos
"!"         {return new Symbol(sym.EXCL, yycolumn, yyline, yytext());}
"("         {return new Symbol(sym.PARIZQ, yycolumn, yyline, yytext());}
")"         {return new Symbol(sym.PARDER, yycolumn, yyline, yytext());}
";"         {return new Symbol(sym.PYC, yycolumn, yyline, yytext());}
"{"         {return new Symbol(sym.LLAVEIZQ, yycolumn, yyline, yytext());}
"}"         {return new Symbol(sym.LLAVEDER, yycolumn, yyline, yytext());}
"["         {return new Symbol(sym.CORCHIZQ, yycolumn, yyline, yytext());}
"]"         {return new Symbol(sym.CORCHDER, yycolumn, yyline, yytext());}
","         {return new Symbol(sym.COMA, yycolumn, yyline, yytext());}
":"         {return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
"."         {return new Symbol(sym.PUNTO, yycolumn, yyline, yytext());}
"::"        {return new Symbol(sym.DOSPUNTOSDOS, yycolumn, yyline, yytext());}



// Operadores
"+"         {return new Symbol(sym.MAS, yycolumn, yyline, yytext());}
"-"         {return new Symbol(sym.MENOS, yycolumn, yyline, yytext());}
"*"         {return new Symbol(sym.POR, yycolumn, yyline, yytext());}
"/"         {return new Symbol(sym.DIV, yycolumn, yyline, yytext());}
"%"         {return new Symbol(sym.MOD, yycolumn, yyline, yytext());}
"="         {return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());}
"<"         {return new Symbol(sym.MENOR, yycolumn, yyline, yytext());}
">"         {return new Symbol(sym.MAYOR, yycolumn, yyline, yytext());}
"<="        {return new Symbol(sym.MENORIGUAL, yycolumn, yyline, yytext());}
">="        {return new Symbol(sym.MAYORIGUAL, yycolumn, yyline, yytext());}
"!="        {return new Symbol(sym.DIFERENTE, yycolumn, yyline, yytext());}
"=="        {return new Symbol(sym.IGUALIGUAL, yycolumn, yyline, yytext());}}
":"         {return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
","         {return new Symbol(sym.COMA, yycolumn, yyline, yytext());}


// Expresiones
{entero}  { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{cadena}  { return new Symbol(sym.CADENA, yycolumn, yyline, yytext()); }






//------> Ingorados
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }

