package utilities;

import java.util.LinkedList;

public class Variable {
    private String cadena;
    private LinkedList<String> lista;

    public Variable(String cadena) {
        this.cadena = cadena;
    }

    public Variable(LinkedList<String> lista) {
        this.lista = lista;
    }

    public String obtenerCadena() {
        return cadena;
    }

    public LinkedList<String> obtenerLista() {
        return lista;
    }
}
