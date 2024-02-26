package utilities;

import main.Main;

public class Instruction {

    public static void print(String message) {
        message = message.replaceAll("\"", "");
        Main.stringConsola += message + "\n";
        System.out.println(message);
    }
}
