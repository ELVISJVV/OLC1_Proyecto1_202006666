package utilities;

import main.Main;

import java.util.LinkedList;

public class Instruction {

    public static void print(String message) {
        message = message.replaceAll("\"", "");
        Main.stringConsola += message + "\n";
        System.out.println(message);
    }


    public static void printArray(String titulo, String stringLista) {
        Main.stringConsola += "----------------------" + "\n";
        Main.stringConsola += titulo.replaceAll("\"", "") + "\n";
        Main.stringConsola += "----------------------" + "\n";

        LinkedList<String> linkedList = Extra.funcionComplementariaArray(stringLista);
        for (String elemento : linkedList) {
            Main.stringConsola += elemento + "\n";
        }
    }
}
