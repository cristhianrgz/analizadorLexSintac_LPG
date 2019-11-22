package codigo;
import static codigo.token.*;

/* SECCION DE DECLARACIONES DE JFLEX */ 
%%
%class lexer
%type token
%line
%char
%column
L=[a-zA-Z_]+
Lm=[a-z]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
public String lexeme;
guardarInfoCod c = new guardarInfoCod();
%}

/* EXPRESIONES REGULARES VALIDAS PARA CADENAS */

%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}


/* Salto de linea */

<YYINITIAL> "\n"  {c.linea=yyline;lexeme=yytext();return SaltoLinea; }

/* Comillas */

<YYINITIAL> "\"" {c.linea=yyline;lexeme=yytext();return Comillas; }

/* OPERADORES NUMÉRICOS */
<YYINITIAL> "++"  {c.linea=yyline;lexeme=yytext();return Op_incremento; }

<YYINITIAL> "--" {c.linea=yyline;lexeme=yytext(); return Op_decremento; }

<YYINITIAL> "+" {c.linea=yyline;lexeme=yytext(); return Suma; }

<YYINITIAL> "-" {c.linea=yyline;lexeme=yytext(); return Resta; }

<YYINITIAL> "*" {c.linea=yyline;lexeme=yytext(); return Multiplicacion; }

<YYINITIAL> "/" {c.linea=yyline;lexeme=yytext(); return Division; }

<YYINITIAL> "%" {c.linea=yyline;lexeme=yytext(); return Modulo; }

<YYINITIAL> "**" {c.linea=yyline;lexeme=yytext(); return Exponente; }

/* OPERADORES NUMÉRICOS */
<YYINITIAL> "||"  {c.linea=yyline; lexeme=yytext(); return Or; }

<YYINITIAL> "&&"  {c.linea=yyline; lexeme=yytext(); return And; }

<YYINITIAL> "!"  {c.linea=yyline; lexeme=yytext(); return Not; }

/* OPERADORES RELACIONALES */
<YYINITIAL> ">" {c.linea=yyline;lexeme=yytext(); return Mayorque; }

<YYINITIAL> "<" {c.linea=yyline;lexeme=yytext(); return Menorque; }

<YYINITIAL> ">=" {c.linea=yyline;lexeme=yytext(); return MayorIgual; }

<YYINITIAL> "<=" {c.linea=yyline;lexeme=yytext(); return MenorIgual; }

<YYINITIAL> "!=" {c.linea=yyline;lexeme=yytext(); return Diferente; }

<YYINITIAL> "==" {c.linea=yyline;lexeme=yytext(); return Igualque; }

<YYINITIAL> "=" {c.linea=yyline;lexeme=yytext(); return Igual; }

/* OTROS SIMBOLOS*/
<YYINITIAL> "(" {c.linea=yyline;lexeme=yytext(); return Parentesis_a; }

<YYINITIAL> ")" {c.linea=yyline;lexeme=yytext(); return Parentesis_c; }

<YYINITIAL> "[" {c.linea=yyline;lexeme=yytext(); return Corchete_a; }

<YYINITIAL> "]" {c.linea=yyline;lexeme=yytext(); return Corchete_c; }

<YYINITIAL> "{" {c.linea=yyline;lexeme=yytext(); return Llave_a; }

<YYINITIAL> "}" {c.linea=yyline;lexeme=yytext(); return Llave_c; }

<YYINITIAL> ":=" {c.linea=yyline;lexeme=yytext(); return Definicion; }

<YYINITIAL> ";" {c.linea=yyline;lexeme=yytext(); return P_coma; }

<YYINITIAL> "," {c.linea=yyline;lexeme=yytext(); return Coma; }

<YYINITIAL> ":" {c.linea=yyline;lexeme=yytext(); return Dospuntos; }

<YYINITIAL> "." {c.linea=yyline;lexeme=yytext(); return Punto; }

/* Numero */
<YYINITIAL> ("(-"{D}+")")|{D}+|[0-9]+[.][0-9]+ {c.linea=yyline;lexeme=yytext(); return Numero; }

<YYINITIAL> "inicio" {c.linea=yyline;lexeme=yytext(); return Inicio; }
<YYINITIAL> "programa" {c.linea=yyline;lexeme=yytext(); return Programa; }
<YYINITIAL> "fin" {c.linea=yyline;lexeme=yytext(); return Fin; }
<YYINITIAL> "montar" {c.linea=yyline;lexeme=yytext(); return Montar; }
<YYINITIAL> "LLDG" {c.linea=yyline;lexeme=yytext(); return LLDG; }
<YYINITIAL> "mostrar" {c.linea=yyline;lexeme=yytext(); return Mostrar; }
<YYINITIAL> "dibujar" {c.linea=yyline;lexeme=yytext(); return Dibujar; }
<YYINITIAL> "si" {c.linea=yyline;lexeme=yytext(); return Si; }
<YYINITIAL> "sino" {c.linea=yyline;lexeme=yytext(); return Sino; }
<YYINITIAL> "hacer" {c.linea=yyline;lexeme=yytext(); return Hacer; }
<YYINITIAL> "mientras" {c.linea=yyline;lexeme=yytext(); return Mientras; }
<YYINITIAL> "modelo" {c.linea=yyline;lexeme=yytext(); return Modelo; }
<YYINITIAL> "imprimir" {c.linea=yyline;lexeme=yytext(); return Imprimir; }
<YYINITIAL> "obtener" {c.linea=yyline;lexeme=yytext(); return Obtener; }
<YYINITIAL> "orden_principal" {c.linea=yyline;lexeme=yytext(); return Orden_principal; }
<YYINITIAL> "LLDGconoSol" {c.linea=yyline;lexeme=yytext(); return LLDGconoSol; }
<YYINITIAL> "LLDGconoLin" {c.linea=yyline;lexeme=yytext(); return LLDGconoLin; }
<YYINITIAL> "LLDGcuboSol" {c.linea=yyline;lexeme=yytext(); return LLDGcuboSol; }
<YYINITIAL> "LLDGcuboLin" {c.linea=yyline;lexeme=yytext(); return LLDGcuboLin; }
<YYINITIAL> "LLDGesferaSol" {c.linea=yyline;lexeme=yytext(); return LLDGesferaSol; }
<YYINITIAL> "LLDGesferaLin" {c.linea=yyline;lexeme=yytext(); return LLDGesferaLin; }
<YYINITIAL> "LLDGrectanSol" {c.linea=yyline;lexeme=yytext(); return LLDGrectanSol; }
<YYINITIAL> "LLDGrectanLin" {c.linea=yyline;lexeme=yytext(); return LLDGrectanLin; }
<YYINITIAL> "LGrotar" {c.linea=yyline;lexeme=yytext(); return LGrotar; }
<YYINITIAL> "LGlimpiarBuffer" {c.linea=yyline;lexeme=yytext(); return LGlimpiarBuffer; }
<YYINITIAL> "LGlimpiarBufferColor" {c.linea=yyline;lexeme=yytext(); return LGlimpiarBufferColor; }
<YYINITIAL> "color_Buffer_Bit" {c.linea=yyline;lexeme=yytext(); return Color_Buffer_Bit; }
<YYINITIAL> "profundidad_Buffer_Bit" {c.linea=yyline;lexeme=yytext(); return Profundidad_Buffer_Bit; }
<YYINITIAL> "acumulacion_Buffer_Bit" {c.linea=yyline;lexeme=yytext(); return Acumulacion_Buffer_Bit; }
<YYINITIAL> "plantilla_Buffer_Bit" {c.linea=yyline;lexeme=yytext(); return Plantilla_Buffer_Bit; }
<YYINITIAL> "LGModoPoligono" {c.linea=yyline;lexeme=yytext(); return LGModoPoligono; }
<YYINITIAL> "LGMaterial" {c.linea=yyline;lexeme=yytext(); return LGMaterial; }
<YYINITIAL> "LGColor" {c.linea=yyline;lexeme=yytext(); return LGColor; }
<YYINITIAL> "LGVertice" {c.linea=yyline;lexeme=yytext(); return LGVertice; }
<YYINITIAL> "LGEmpezar" {c.linea=yyline;lexeme=yytext(); return LGEmpezar; }
<YYINITIAL> "LGTerminar" {c.linea=yyline;lexeme=yytext(); return LGTerminar; }
<YYINITIAL> "LG_Puntos" {c.linea=yyline;lexeme=yytext(); return LG_Puntos; }
<YYINITIAL> "LG_Lineas" {c.linea=yyline;lexeme=yytext(); return LG_Lineas; }
<YYINITIAL> "LG_Linea_Lin" {c.linea=yyline;lexeme=yytext(); return LG_Linea_Lin; }
<YYINITIAL> "LG_Linea_Ciclo" {c.linea=yyline;lexeme=yytext(); return LG_Linea_Ciclo; }
<YYINITIAL> "LG_Triangulos" {c.linea=yyline;lexeme=yytext(); return LG_Triangulos; }
<YYINITIAL> "LG_Triangulo_Lin" {c.linea=yyline;lexeme=yytext(); return LG_Triangulo_Lin; }
<YYINITIAL> "LG_Triangulo_Abanico" {c.linea=yyline;lexeme=yytext(); return LG_Triangulo_Abanico; }
<YYINITIAL> "LG_Cuadrado" {c.linea=yyline;lexeme=yytext(); return LG_Cuadrado; }
<YYINITIAL> "LG_Cuadrado_Lin" {c.linea=yyline;lexeme=yytext(); return LG_Cuadrado_Lin; }
<YYINITIAL> "LG_Poligono" {c.linea=yyline;lexeme=yytext(); return LG_Poligono; }
<YYINITIAL> "LGModoMatriz" {c.linea=yyline;lexeme=yytext(); return LGModoMatriz; }
<YYINITIAL> "LG_Vista_Modelo" {c.linea=yyline;lexeme=yytext(); return LG_Vista_Modelo; }
<YYINITIAL> "LG_Proyeccion" {c.linea=yyline;lexeme=yytext(); return LG_Proyeccion; }
<YYINITIAL> "LG_Textura" {c.linea=yyline;lexeme=yytext(); return LG_Textura; }
<YYINITIAL> "LG_Color" {c.linea=yyline;lexeme=yytext(); return LG_Color; }
<YYINITIAL> "LGMatrizOrtografica" {c.linea=yyline;lexeme=yytext(); return LGMatrizOrtografica; }
<YYINITIAL> "LGMatrizPerspectiva" {c.linea=yyline;lexeme=yytext(); return LGMatrizPerspectiva; }
<YYINITIAL> "LGMatrizIdentidad" {c.linea=yyline;lexeme=yytext(); return LGMatrizIdentidad; }
<YYINITIAL> "LGVer" {c.linea=yyline;lexeme=yytext(); return LGVer; }
<YYINITIAL> "LGVolverAMostrar" {c.linea=yyline;lexeme=yytext(); return LGVolverAMostrar; }
<YYINITIAL> "LGModoVisualizacion" {c.linea=yyline;lexeme=yytext(); return LGModoVisualizacion; }
<YYINITIAL> "LGPosicionVentanaInicio" {c.linea=yyline;lexeme=yytext(); return LGPosicionVentanaInicio; }
<YYINITIAL> "LGTamañoVentanaInicio" {c.linea=yyline;lexeme=yytext(); return LGTamañoVentanaInicio; }
<YYINITIAL> "LGCrearVentana" {c.linea=yyline;lexeme=yytext(); return LGCrearVentana; }
<YYINITIAL> "LGMostrarFuncion" {c.linea=yyline;lexeme=yytext(); return LGMostrarFuncion; }
<YYINITIAL> "LGRemodeladoFuncion" {c.linea=yyline;lexeme=yytext(); return LGRemodeladoFuncion; }
<YYINITIAL> "LGLazoPrincipal" {c.linea=yyline;lexeme=yytext(); return LGLazoPrincipal; }
<YYINITIAL> "LGMatrizOrtografica2D" {c.linea=yyline;lexeme=yytext(); return LGMatrizOrtografica2D; }
<YYINITIAL> "LGVentana" {c.linea=yyline;lexeme=yytext(); return LGVentana; }
<YYINITIAL> "LGEjecucionLineas" {c.linea=yyline;lexeme=yytext(); return LGEjecucionLineas; }
<YYINITIAL> "LG_RGBA" {c.linea=yyline;lexeme=yytext(); return LG_RGBA; }
<YYINITIAL> "LG_RGB" {c.linea=yyline;lexeme=yytext(); return LG_RGB; }
<YYINITIAL> "LG_Indice" {c.linea=yyline;lexeme=yytext(); return LG_Indice; }
<YYINITIAL> "LG_Solo" {c.linea=yyline;lexeme=yytext(); return LG_Solo; }
<YYINITIAL> "LG_Doble" {c.linea=yyline;lexeme=yytext(); return LG_Doble; }
<YYINITIAL> "LG_Acumulacion" {c.linea=yyline;lexeme=yytext(); return LG_Acumulacion; }
<YYINITIAL> "LG_Alfa" {c.linea=yyline;lexeme=yytext(); return LG_Alfa; }
<YYINITIAL> "LG_Profundo" {c.linea=yyline;lexeme=yytext(); return LG_Profundo; }
<YYINITIAL> "LG_Plantilla" {c.linea=yyline;lexeme=yytext(); return LG_Plantilla; }
<YYINITIAL> "LG_MuestreoMultiple" {c.linea=yyline;lexeme=yytext(); return LG_MuestreoMultiple; }
<YYINITIAL> "LG_Estereo" {c.linea=yyline;lexeme=yytext(); return LG_Estereo; }
<YYINITIAL> "LG_Luminosa" {c.linea=yyline;lexeme=yytext(); return LG_Luminosa; }
<YYINITIAL> "cad" {c.linea=yyline;lexeme=yytext(); return Cad; }
<YYINITIAL> "bool" {c.linea=yyline;lexeme=yytext(); return Bool; }
<YYINITIAL> "ent" {c.linea=yyline;lexeme=yytext(); return Ent; }
<YYINITIAL> "numDec" {c.linea=yyline;lexeme=yytext(); return NumDec; }
<YYINITIAL> "numDecL" {c.linea=yyline;lexeme=yytext(); return NumDecL; }
<YYINITIAL> "elemento" {c.linea=yyline;lexeme=yytext(); return Elemento; }

<YYINITIAL> {Lm}({L}|{D})* {c.linea=yyline;lexeme=yytext(); return Identificador; }


/* ERRORES PARA EL LENGUAJE */
. {c.linea=yyline;lexeme=yytext(); return ERROR; }


