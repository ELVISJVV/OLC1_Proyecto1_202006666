package utilities;

import java.awt.*;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
public class Extra {


    public static LinkedList<String> funcionComplementariaArray(String stringLista) {
        String stringArreglo = stringLista.replaceAll("\"", "");
        Variable variable = (Variable) main.Main.tablaSimbolos.get(stringLista);
        if (variable != null) {
            stringArreglo = variable.obtenerValor().toString().replaceAll("\"", "");
        }

        String[] elementosString = stringArreglo.substring(1, stringArreglo.length() - 1).split(", ");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(elementosString));
        return linkedList;

    }

    public static void escribirArchivo(String nombre, String contenido) {
        try {
            java.io.FileWriter fileWriter = new java.io.FileWriter("reportes/"+nombre);
            fileWriter.write(contenido);
            fileWriter.close();
            File archivo = new File("reportes/"+nombre);
            Desktop.getDesktop().open(archivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
