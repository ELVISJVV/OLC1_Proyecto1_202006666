package utilities;

import main.Main;

import java.util.LinkedList;

public class Instruction {

    public static void print(String message) {
        message = message.replaceAll("\"", "");
        Main.stringConsola += message + "\n";
        System.out.println(message);
    }


    public static void printArray(String titulo, String idLista) {
        Main.stringConsola += "----------------------" + "\n";
        Main.stringConsola += titulo.replaceAll("\"", "") + "\n";
        Main.stringConsola += "----------------------" + "\n";

        String stringArreglo = idLista;
        Variable variable = (Variable) main.Main.tablaSimbolos.get(idLista);
        if (variable != null) {
            stringArreglo = variable.obtenerValor().toString();
        }

        LinkedList<String> linkedList = Extra.convertirALinkedlist(stringArreglo);

        for (String elemento : linkedList) {
            Main.stringConsola += elemento + "\n";
        }
    }
}
