
package main;

import GUI.AppView;
import utilities.ErrorClass;
import utilities.GraphBar;
import utilities.Token;
import utilities.Variable;


import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedList;




public class Main {

    public static String stringConsola;
    public static LinkedList<ErrorClass> listaErrores = new LinkedList<>();
    public static LinkedList<Token> listaTokens = new LinkedList<>();
    public static HashMap<String, Variable>  tablaSimbolos = new HashMap<>();

    public static HashMap<String, String>  sentenciasGraph = new HashMap<>();

    public static GraphBar graphBar = new GraphBar("", "", "", "", "");

    public static void main(String[] args) {
        System.out.println("Funcionando...");
        AppView view = new AppView();
       view.setVisible(true);



        String entrada = """
                    PROGRAM
                     console::print = "Hola Mundo"," a" , "adad", "ADAD",56,"ada",2,2END;  ! Esto es un   áéíoúAÁÉÍÓÚ Ñ ñcomentario 676
                    console::print = SUM(3,8.9),"hoáéíoúAÁÉÍÓÚ Ñ ñ6455.o078rdla" END;
                      <! Esto es
                       un comentario Multilínea !>
                    console::print = SUM(3,SUM(1,2)) end;
                         ! Esto es un comentario de una sola línea
                    END PROGRAM<! Esto es un c
                      999999

                      áéíoúAÁÉÍÓÚ Ñ ñ
                      !ADadad<<<!

                      omentario  Multilínea !>

                  """;

        // Generar Analizadores
//      analizadores("src/compiler/", "Lexer.jflex", "Parser.cup");
//        analizar(entrada);
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
        stringConsola = "";
        listaErrores.clear();
        listaTokens.clear();
        tablaSimbolos.clear();
        sentenciasGraph.clear();
        try {
            compiler.Lexer lexer = new compiler.Lexer(new StringReader(entrada));
            compiler.Parser parser = new compiler.Parser(lexer);
            parser.parse();


        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        }


  // recorrer linkedlis de errores
//        for (Object error : listaErrores) {
//            System.out.println(error);
//        }

//        for (Object token : listaTokens) {
//            System.out.println(token);
//        }

//        for (String key : tablaSimbolos.keySet()) {
//            Object value = tablaSimbolos.get(key);
//            utilities.Variable variable = (utilities.Variable) main.Main.tablaSimbolos.get(key);
//
//            System.out.println(key + ": " + variable.obtenerValor());
//            System.out.println("Tipo: " + variable.getTipo());
//            System.out.println("Fila: " + variable.getFila());
//            System.out.println("Columna: " + variable.getColumna());
//        }



     }

}

