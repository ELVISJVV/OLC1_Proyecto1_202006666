package utilities;

import main.Main;

public class Expression {

    public static String Suma(String izq, String der){

        // Casteamos los valores
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);

        // Calculamos la suma
        double resultado = val1 + val2;

        Main.stringConsola += "Suma: " + izq + " + " + der + " = " + resultado + "\n";
        //Devolvemos un String con el resultado

        return String.valueOf(resultado);

    }
}
