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
CARACTER = [^\r\n]
comentario = "!"{CARACTER}*{double}?
comentarioMultilinea = "<!"[^/]~"!>"
entero = [0-9]+
letra = [a-zA-Z]+
id = {letra}({letra}|{entero})*
idArray = "@"{id}

%%
// ------------  Reglas Lexicas -------------------
//------> Palabras Reservadas

"PROGRAM"   { main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RPROGRAM, yycolumn, yyline, yytext()); }
"END"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.REND, yycolumn, yyline, yytext()); }
"VAR"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RVAR, yycolumn, yyline, yytext()); }
"RES"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RRES, yycolumn, yyline, yytext()); }
"SUM"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RSUM, yycolumn, yyline, yytext()); }
"MUL"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RMUL, yycolumn, yyline, yytext()); }
"DIV"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RDIV, yycolumn, yyline, yytext()); }
"MOD"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RMOD, yycolumn, yyline, yytext()); }
"MEDIA"     {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RMEDIA, yycolumn, yyline, yytext()); }
"MEDIANA"   {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RMEDIANA, yycolumn, yyline, yytext()); }
"MODA"      {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RMODA, yycolumn, yyline, yytext()); }
"VARIANZA"  {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RVARIANZA, yycolumn, yyline, yytext()); }
"MAX"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RMAX, yycolumn, yyline, yytext()); }
"MIN"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RMIN, yycolumn, yyline, yytext()); }
"console"   {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RCONSOLE, yycolumn, yyline, yytext()); }
"print"     {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RPRINT, yycolumn, yyline, yytext()); }
"char"      {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RCHAR, yycolumn, yyline, yytext()); }
"double"    {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RDOUBLE, yycolumn, yyline, yytext()); }
"arr"       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RARRAY, yycolumn, yyline, yytext()); }
"column"    {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RCOLUMN, yycolumn, yyline, yytext()); }
"graphBar"  {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RGRAPHBAR, yycolumn, yyline, yytext()); }
"graphLine" {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RGRAPHLINE, yycolumn, yyline, yytext()); }
"graphPie"  {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RGRAPHPIE, yycolumn, yyline, yytext());
}
"Histogram" {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RHISTOGRAM, yycolumn, yyline, yytext());
}
"EXEC"      {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.REXEC, yycolumn, yyline, yytext());
}
"titulo"    {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RTITULO, yycolumn, yyline, yytext());
}
"ejeX"      {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.REJEX, yycolumn, yyline, yytext());
}
"ejeY"      {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.REJEY, yycolumn, yyline, yytext());
}
"tituloX"   {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RTITULOX, yycolumn, yyline, yytext());
}
"tituloY"   {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RTITULOY, yycolumn, yyline, yytext());
}
"label"     {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RLABEL, yycolumn, yyline, yytext());
}
"values"    {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Palabra Reservada", yyline, yycolumn));
    return new Symbol(sym.RVALUES, yycolumn, yyline, yytext());
}



// Simbolos
"!"         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.EXCL, yycolumn, yyline, yytext());}
"("         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.PARIZQ, yycolumn, yyline, yytext());}
")"         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.PARDER, yycolumn, yyline, yytext());}
";"         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.PYC, yycolumn, yyline, yytext());}
"["         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.CORCHIZQ, yycolumn, yyline, yytext());}
"]"         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.CORCHDER, yycolumn, yyline, yytext());}
","         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.COMA, yycolumn, yyline, yytext());}
":"         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
"@"        {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());}


// Operadores

"-"         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.MENOS, yycolumn, yyline, yytext());}
"="         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());}
"<"         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.MENOR, yycolumn, yyline, yytext());}
">"         {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Simbolo", yyline, yycolumn));
    return new Symbol(sym.MAYOR, yycolumn, yyline, yytext());}



// Expresiones
{double}        {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Double", yyline, yycolumn));
    return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext()); }
{cadena}        {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Char", yyline, yycolumn));
    return new Symbol(sym.CADENA, yycolumn, yyline, yytext()); }
{comentario}    {}

{comentarioMultilinea}    {}

{idArray}       {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Id Array", yyline, yycolumn));
    return new Symbol(sym.IDARRAY, yycolumn, yyline, yytext()); }

{id}            {
    main.Main.listaTokens.add(new utilities.Token(yytext() ,"Id", yyline, yycolumn));
    return new Symbol(sym.ID, yycolumn, yyline, yytext()); }



//------> Ingorados
[ \t\r\n\f ]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos
.           	{ main.Main.listaErrores.add(new utilities.ErrorClass("Léxico", yytext(), yyline, yycolumn));
//                System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);
}

//    System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);}

