package utilities;

import main.Main;

public class Expression {

    public static String Suma(String a, String b){
        Main.stringConsola += "Suma: " + a + " + " + b + " = " + (Integer.parseInt(a) + Integer.parseInt(b)) + "\n";
    return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
