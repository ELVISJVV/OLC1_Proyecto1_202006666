
package main;

import GUI.AppView;


import java.io.StringReader;


public class Main {

    public static void main(String[] args) {
        System.out.println("Prueba");
        AppView view = new AppView();
        view.setVisible(true);

        String entrada = """
                23,5,,|6,
                7,8,9,,10
                """;

        // Generar Analizadores
        analizadores("src/compiler/", "Lexer.jflex", "Parser.cup");

        // Analizar
        analizar(entrada);
    }

    public static void analizadores(String ruta, String jflexFile, String cupFile) {
        try {
            String[] opcionesJflex = {ruta + jflexFile, "-d", ruta};
            jflex.Main.generate(opcionesJflex);

            String[] opcionesCup = {"-destdir", ruta, "-parser", "Parser", ruta + cupFile};
            java_cup.Main.main(opcionesCup);

        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }

    // Realizar Analisis
    public static void analizar(String entrada) {
        try {
            compiler.Lexer lexer = new compiler.Lexer(new StringReader(entrada));
            compiler.Parser parser = new compiler.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        }
    }
}


