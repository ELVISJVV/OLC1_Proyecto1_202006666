package utilities;

import java.util.Arrays;
import java.util.LinkedList;
public class Extra {

    public static  LinkedList<String> convertirALinkedlist (String stringLista) {
        String[] elementosString = stringLista.substring(1, stringLista.length() - 1).split(", ");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(elementosString));
    return linkedList;
    }


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


}
