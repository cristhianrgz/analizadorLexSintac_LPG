/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author criss
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLS_LPG/src/codigo/lexer.flex";
        String ruta2 = "C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLS_LPG/src/codigo/LexerCup.flex";
        String rutaS [] = {"-parser","Sintactico","C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLS_LPG/src/codigo/Sintactico.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    
    public static void generar(String ruta1, String ruta2, String rutaS []) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLS_LPG/src/codigo/sym.java");
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLS_LPG/sym.java"),
                Paths.get("C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLS_LPG/src/codigo/sym.java")
        );
        
        Path rutaSin = Paths.get("C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLS_LPG/src/codigo/Sintactico.java");
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLS_LPG/Sintactico.java"),
                Paths.get("C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLS_LPG/src/codigo/Sintactico.java")
        );
    }
}  

