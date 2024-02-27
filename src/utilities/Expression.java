package utilities;

import main.Main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class Expression {

    public static String Suma(String izq, String der){

        // Casteamos los valores
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);

        // Calculamos la suma
        double resultado = val1 + val2;


        //Devolvemos un String con el resultado

        return String.valueOf(resultado);

    }

    public static String Resta(String izq, String der) {

        // Casteamos los valores
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);

        // Calculamos la resta
        double resultado = val1 - val2;

        //Devolvemos un String con el resultado
        return String.valueOf(resultado);
    }

    public static String Multiplicacion(String izq, String der) {

        // Casteamos los valores
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);

        // Calculamos la multiplicacion
        double resultado = val1 * val2;

        //Devolvemos un String con el resultado
        return String.valueOf(resultado);
    }

    public static String Division(String izq, String der) {

        // Casteamos los valores
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);

        // Calculamos la division
        double resultado = val1 / val2;

        //Devolvemos un String con el resultado
        return String.valueOf(resultado);
    }

    public static String Modulo(String izq, String der) {

        // Casteamos los valores
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);

        // Calculamos el modulo
        double resultado = val1 % val2;

        //Devolvemos un String con el resultado
        return String.valueOf(resultado);
    }

    public static String Media(String stringLista) {
 LinkedList<String> linkedList = Extra.funcionComplementariaArray(stringLista);
        double suma = 0;

        for (String valor :linkedList) {
            suma += Double.parseDouble(valor);
        }
        double resultado = suma / linkedList.size();
        return String.valueOf(resultado);
    }

    public static String Max(String stringLista) {
        LinkedList<String> linkedList = Extra.funcionComplementariaArray(stringLista);
        double maximo = Double.parseDouble(linkedList.get(0));

        for (String valor : linkedList) {
            if (Double.parseDouble(valor) > maximo) {
                maximo = Double.parseDouble(valor);
            }
        }
        return String.valueOf(maximo);
    }

    public static String Min(String stringLista) {
        LinkedList<String> linkedList = Extra.funcionComplementariaArray(stringLista);
        double minimo = Double.parseDouble(linkedList.get(0));

        for (String valor : linkedList) {
            if (Double.parseDouble(valor) < minimo) {
                minimo = Double.parseDouble(valor);
            }
        }
        return String.valueOf(minimo);
    }

    public static String Mediana(String stringLista) {
        LinkedList<String> linkedList = Extra.funcionComplementariaArray(stringLista);
        LinkedList<Double> doubleList = new LinkedList<>();
        for (String valor : linkedList) {
            doubleList.add(Double.parseDouble(valor));
        }

        Collections.sort(doubleList);
        int n = doubleList.size();
        double median;


        if (n % 2 == 0) {

            median = ((doubleList.get(n / 2)) + (doubleList.get((n -1)/2 )) )/ 2;
        } else {
            median =(doubleList.get(n / 2));
        }
        return String.valueOf(median);
    }

    public static String Moda(String stringLista) {
        LinkedList<String> linkedList = Extra.funcionComplementariaArray(stringLista);
        LinkedList<Double> doubleList = new LinkedList<>();
        for (String valor : linkedList) {
            doubleList.add(Double.parseDouble(valor));
        }

        Collections.sort(doubleList);
        int n = doubleList.size();
        double moda = doubleList.getFirst();
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (Objects.equals(doubleList.get(j), doubleList.get(i))) {
                    count++;
                }
            }
            if (count > maxCount) {
                moda = doubleList.get(i);
                maxCount = count;
            }
        }
        return String.valueOf(moda);
    }

    public static String Varianza(String stringLista) {
        LinkedList<String> linkedList = Extra.funcionComplementariaArray(stringLista);
        LinkedList<Double> doubleList = new LinkedList<>();

        double media = Double.parseDouble(Media(stringLista));
        for (String valor : linkedList) {
            doubleList.add(Double.parseDouble(valor));
        }

        double sumaCuadradosDiferencias = 0.0;
        for (double numero : doubleList) {
            sumaCuadradosDiferencias += Math.pow(numero - media, 2);
        }

        int cantidadNumeros = doubleList.size();

        return String.valueOf( sumaCuadradosDiferencias / (cantidadNumeros - 1));

    }
}
