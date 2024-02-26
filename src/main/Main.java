
package main;

import GUI.AppView;



import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedList;



public class Main {

    public static String stringConsola;
    public static LinkedList<Object> listaErrores = new LinkedList<>();

    public static HashMap<String,Object>  tablaSimbolos = new HashMap<>();
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
        try {
            compiler.Lexer lexer = new compiler.Lexer(new StringReader(entrada));
            compiler.Parser parser = new compiler.Parser(lexer);
            parser.parse();


        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        }


  // recorrer linkedlis de errores
        for (Object error : listaErrores) {
            System.out.println(error);
        }



     }

}

