package codigo;
import java_cup.runtime.Symbol;

/* SECCION DE DECLARACIONES DE JFLEX */ 
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
Lm=[a-z]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
COMA = ","
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

/* EXPRESIONES REGULARES VALIDAS PARA CADENAS */

%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */

<YYINITIAL> "\"" {return new Symbol(sym.Comillas, yychar, yyline, yytext());}
<YYINITIAL> "," {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* OPERADORES NUMÉRICOS */
<YYINITIAL> "++"  {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}
<YYINITIAL> "--" {return new Symbol(sym.Op_decremento, yychar, yyline, yytext());}
<YYINITIAL> "+" {return new Symbol(sym.Suma, yychar, yyline, yytext());}
<YYINITIAL> "-" {return new Symbol(sym.Resta, yychar, yyline, yytext());}
<YYINITIAL> "*" {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
<YYINITIAL> "/" {return new Symbol(sym.Division, yychar, yyline, yytext());}
<YYINITIAL> "%" {return new Symbol(sym.Modulo, yychar, yyline, yytext());}
<YYINITIAL> "**" {return new Symbol(sym.Exponente, yychar, yyline, yytext());}

/* OPERADORES NUMÉRICOS */
<YYINITIAL> "||" {return new Symbol(sym.Or, yychar, yyline, yytext());}
<YYINITIAL> "&&" {return new Symbol(sym.And, yychar, yyline, yytext());}
<YYINITIAL> "!" {return new Symbol(sym.Not, yychar, yyline, yytext());}

/* OPERADORES RELACIONALES */
<YYINITIAL> ">" {return new Symbol(sym.Mayorque, yychar, yyline, yytext());}
<YYINITIAL> "<" {return new Symbol(sym.Menorque, yychar, yyline, yytext());}
<YYINITIAL> ">=" {return new Symbol(sym.MayorIgual, yychar, yyline, yytext());}
<YYINITIAL> "<=" {return new Symbol(sym.MenorIgual, yychar, yyline, yytext());}
<YYINITIAL> "!=" {return new Symbol(sym.Diferente, yychar, yyline, yytext());}
<YYINITIAL> "==" {return new Symbol(sym.Igualque, yychar, yyline, yytext());}
<YYINITIAL> "=" {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* OTROS SIMBOLOS*/
<YYINITIAL> "(" {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}
<YYINITIAL> ")" {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}
<YYINITIAL> "[" {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}
<YYINITIAL> "]" {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}
<YYINITIAL> "{" {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}
<YYINITIAL> "}" {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}
<YYINITIAL> ":=" {return new Symbol(sym.Definicion, yychar, yyline, yytext());}
<YYINITIAL> ";" {return new Symbol(sym.Pycoma, yychar, yyline, yytext());}
<YYINITIAL> ":" {return new Symbol(sym.Dospuntos, yychar, yyline, yytext());}
<YYINITIAL> "." {return new Symbol(sym.Punto, yychar, yyline, yytext());}

/* Numero */
<YYINITIAL> ("(-"{D}+")")|{D}+|[0-9]+[.][0-9]+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
<YYINITIAL> "inicio" {return new Symbol(sym.Inicio, yychar, yyline, yytext());}
<YYINITIAL> "programa" {return new Symbol(sym.Programa, yychar, yyline, yytext());}
<YYINITIAL> "fin" {return new Symbol(sym.Fin, yychar, yyline, yytext());}
<YYINITIAL> "montar" {return new Symbol(sym.Montar, yychar, yyline, yytext());}
<YYINITIAL> "LLDG" {return new Symbol(sym.LLDG, yychar, yyline, yytext());}
<YYINITIAL> "mostrar" {return new Symbol(sym.Mostrar, yychar, yyline, yytext());}
<YYINITIAL> "dibujar" {return new Symbol(sym.Dibujar, yychar, yyline, yytext());}
<YYINITIAL> "si" {return new Symbol(sym.Si, yychar, yyline, yytext());}
<YYINITIAL> "sino" {return new Symbol(sym.Sino, yychar, yyline, yytext());}
<YYINITIAL> "hacer" {return new Symbol(sym.Hacer, yychar, yyline, yytext());}
<YYINITIAL> "mientras" {return new Symbol(sym.Mientras, yychar, yyline, yytext());}
<YYINITIAL> "modelo" {return new Symbol(sym.Modelo, yychar, yyline, yytext());}
<YYINITIAL> "imprimir" {return new Symbol(sym.Imprimir, yychar, yyline, yytext());}
<YYINITIAL> "obtener" {return new Symbol(sym.Obtener, yychar, yyline, yytext());}
<YYINITIAL> "orden_principal" {return new Symbol(sym.Orden_principal, yychar, yyline, yytext());}
<YYINITIAL> "LLDGconoSol" {return new Symbol(sym.LLDGconoSol, yychar, yyline, yytext());}
<YYINITIAL> "LLDGconoLin" {return new Symbol(sym.LLDGconoLin, yychar, yyline, yytext());}
<YYINITIAL> "LLDGcuboSol" {return new Symbol(sym.LLDGcuboSol, yychar, yyline, yytext());}
<YYINITIAL> "LLDGcuboLin" {return new Symbol(sym.LLDGcuboLin, yychar, yyline, yytext());}
<YYINITIAL> "LLDGesferaSol" {return new Symbol(sym.LLDGesferaSol, yychar, yyline, yytext());}
<YYINITIAL> "LLDGesferaLin" {return new Symbol(sym.LLDGesferaLin, yychar, yyline, yytext());}
<YYINITIAL> "LGrectanSol" {return new Symbol(sym.LGrectanSol, yychar, yyline, yytext());}
<YYINITIAL> "LGrectanLin" {return new Symbol(sym.LGrectanLin, yychar, yyline, yytext());}
<YYINITIAL> "LGrotar" {return new Symbol(sym.LGrotar, yychar, yyline, yytext());}
<YYINITIAL> "LGlimpiarBuffer" {return new Symbol(sym.LGlimpiarBuffer, yychar, yyline, yytext());}
<YYINITIAL> "LGlimpiarBufferColor" {return new Symbol(sym.LGlimpiarBufferColor, yychar, yyline, yytext());}
<YYINITIAL> "color_Buffer_Bit" {return new Symbol(sym.color_Buffer_Bit, yychar, yyline, yytext());}
<YYINITIAL> "profundidad_Buffer_Bit" {return new Symbol(sym.profundidad_Buffer_Bit, yychar, yyline, yytext());}
<YYINITIAL> "acumulacion_Buffer_Bit" {return new Symbol(sym.acumulacion_Buffer_Bit, yychar, yyline, yytext());}
<YYINITIAL> "plantilla_Buffer_Bit" {return new Symbol(sym.plantilla_Buffer_Bit, yychar, yyline, yytext());}
<YYINITIAL> "LGModoPoligono" {return new Symbol(sym.LGModoPoligono, yychar, yyline, yytext());}
<YYINITIAL> "LGMaterial" {return new Symbol(sym.LGMaterial, yychar, yyline, yytext());}
<YYINITIAL> "LGColor" {return new Symbol(sym.LGColor, yychar, yyline, yytext());}
<YYINITIAL> "LGVertice" {return new Symbol(sym.LGVertice, yychar, yyline, yytext());}
<YYINITIAL> "LGEmpezar" {return new Symbol(sym.LGEmpezar, yychar, yyline, yytext());}
<YYINITIAL> "LGTerminar" {return new Symbol(sym.LGTerminar, yychar, yyline, yytext());}
<YYINITIAL> "LG_Puntos" {return new Symbol(sym.LG_Puntos, yychar, yyline, yytext());}
<YYINITIAL> "LG_Lineas" {return new Symbol(sym.LG_Lineas, yychar, yyline, yytext());}
<YYINITIAL> "LG_Linea_Lin" {return new Symbol(sym.LG_Linea_Lin, yychar, yyline, yytext());}
<YYINITIAL> "LG_Linea_Ciclo" {return new Symbol(sym.LG_Linea_Ciclo, yychar, yyline, yytext());}
<YYINITIAL> "LG_Triangulos" {return new Symbol(sym.LG_Triangulos, yychar, yyline, yytext());}
<YYINITIAL> "LG_Triangulo_Lin" {return new Symbol(sym.LG_Triangulo_Lin, yychar, yyline, yytext());}
<YYINITIAL> "LG_Triangulo_Abanico" {return new Symbol(sym.LG_Triangulo_Abanico, yychar, yyline, yytext());}
<YYINITIAL> "LG_Cuadrado" {return new Symbol(sym.LG_Cuadrado, yychar, yyline, yytext());}
<YYINITIAL> "LG_Cuadrado_Lin" {return new Symbol(sym.LG_Cuadrado_Lin, yychar, yyline, yytext());}
<YYINITIAL> "LG_Poligono" {return new Symbol(sym.LG_Poligono, yychar, yyline, yytext());}
<YYINITIAL> "LGModoMatriz" {return new Symbol(sym.LGModoMatriz, yychar, yyline, yytext());}
<YYINITIAL> "LG_Vista_Modelo" {return new Symbol(sym.LG_Vista_Modelo, yychar, yyline, yytext());}
<YYINITIAL> "LG_Proyeccion" {return new Symbol(sym.LG_Proyeccion, yychar, yyline, yytext());}
<YYINITIAL> "LG_Textura" {return new Symbol(sym.LG_Textura, yychar, yyline, yytext());}
<YYINITIAL> "LG_Color" {return new Symbol(sym.LG_Color, yychar, yyline, yytext());}
<YYINITIAL> "LGMatrizOrtografica" {return new Symbol(sym.LGMatrizOrtografica, yychar, yyline, yytext());}
<YYINITIAL> "LGMatrizPerspectiva" {return new Symbol(sym.LGMatrizPerspectiva, yychar, yyline, yytext());}
<YYINITIAL> "LGMatrizIdentidad" {return new Symbol(sym.LGMatrizIdentidad, yychar, yyline, yytext());}
<YYINITIAL> "LGVer" {return new Symbol(sym.LGVer, yychar, yyline, yytext());}
<YYINITIAL> "LGVolverAMostrar" {return new Symbol(sym.LGVolverAMostrar, yychar, yyline, yytext());}
<YYINITIAL> "LGModoVisualizacion" {return new Symbol(sym.LGModoVisualizacion, yychar, yyline, yytext());}
<YYINITIAL> "LGPosicionVentanaInicio" {return new Symbol(sym.LGPosicionVentanaInicio, yychar, yyline, yytext());}
<YYINITIAL> "LGTamañoVentanaInicio" {return new Symbol(sym.LGTamañoVentanaInicio, yychar, yyline, yytext());}
<YYINITIAL> "LGCrearVentana" {return new Symbol(sym.LGCrearVentana, yychar, yyline, yytext());}
<YYINITIAL> "LGMostrarFuncion" {return new Symbol(sym.LGMostrarFuncion, yychar, yyline, yytext());}
<YYINITIAL> "LGRemodeladoFuncion" {return new Symbol(sym.LGRemodeladoFuncion, yychar, yyline, yytext());}
<YYINITIAL> "LGLazoPrincipal" {return new Symbol(sym.LGLazoPrincipal, yychar, yyline, yytext());}
<YYINITIAL> "LGMatrizOrtografica2D" {return new Symbol(sym.LGMatrizOrtografica2D, yychar, yyline, yytext());}
<YYINITIAL> "LGVentana" {return new Symbol(sym.LGVentana, yychar, yyline, yytext());}
<YYINITIAL> "LGEjecucionLineas" {return new Symbol(sym.LGEjecucionLineas, yychar, yyline, yytext());}
<YYINITIAL> "LG_RGBA" {return new Symbol(sym.LG_RGBA, yychar, yyline, yytext());}
<YYINITIAL> "LG_RGB" {return new Symbol(sym.LG_RGB, yychar, yyline, yytext());}
<YYINITIAL> "LG_Indice" {return new Symbol(sym.LG_Indice, yychar, yyline, yytext());}
<YYINITIAL> "LG_Solo" {return new Symbol(sym.LG_Solo, yychar, yyline, yytext());}
<YYINITIAL> "LG_Doble" {return new Symbol(sym.LG_Doble, yychar, yyline, yytext());}
<YYINITIAL> "LG_Acumulacion" {return new Symbol(sym.LG_Acumulacion, yychar, yyline, yytext());}
<YYINITIAL> "LG_Alfa" {return new Symbol(sym.LG_Alfa, yychar, yyline, yytext());}
<YYINITIAL> "LG_Profundo" {return new Symbol(sym.LG_Profundo, yychar, yyline, yytext());}
<YYINITIAL> "LG_Plantilla" {return new Symbol(sym.LG_Plantilla, yychar, yyline, yytext());}
<YYINITIAL> "LG_MuestreoMultiple" {return new Symbol(sym.LG_MuestreoMultiple, yychar, yyline, yytext());}
<YYINITIAL> "LG_Estereo" {return new Symbol(sym.LG_Estereo, yychar, yyline, yytext());}
<YYINITIAL> "LG_Luminosa" {return new Symbol(sym.LG_Luminosa, yychar, yyline, yytext());}
<YYINITIAL> "cad" {return new Symbol(sym.Cad, yychar, yyline, yytext());}
<YYINITIAL> "bool" {return new Symbol(sym.Bool, yychar, yyline, yytext());}
<YYINITIAL> "ent" {return new Symbol(sym.Ent, yychar, yyline, yytext());}
<YYINITIAL> "numDec" {return new Symbol(sym.NumDec, yychar, yyline, yytext());}
<YYINITIAL> "numDecL" {return new Symbol(sym.NumDecL, yychar, yyline, yytext());}
<YYINITIAL> "elemento" {return new Symbol(sym.Elemento, yychar, yyline, yytext());}

<YYINITIAL> {Lm}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* ERRORES PARA EL LENGUAJE */
. {return new Symbol(sym.ERROR, yychar, yyline, yytext());}



