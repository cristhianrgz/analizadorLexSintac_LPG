/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;

/**
 *
 * @author criss
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLexicoLPG/src/codigo/lexer.flex";
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}  

