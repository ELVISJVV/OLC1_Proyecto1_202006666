package utilities;

import java.util.LinkedList;

public class Variable {
    private String cadena;
    private LinkedList<String> lista;

    private String nombre;
    private String tipo;
    private String valor;
    private int fila;
    private int columna;


    public Variable(String nombre, String tipo, String cadena, int fila, int columna) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cadena = cadena;
        this.fila = fila;
        this.columna = columna;
    }

    public Variable(String nombre, String tipo, LinkedList<String>  lista, int fila, int columna, boolean esVariable) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.lista = lista;
        this.fila = fila;
        this.columna = columna;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String getCadena() {
        return cadena;
    }

    public LinkedList<String> getLista() {
        return lista;
    }

    public String toString() {
        return "Variable: " + nombre + " de tipo " + tipo + " con valor " + valor + " en la línea " + fila + " y columna " + columna;
    }

    public String toStringHTML() {
        return "<tr><td>" + nombre + "</td><td>" + tipo + "</td><td>" + valor + "</td><td>" + fila + "</td><td>" + columna + "</td></tr>";
    }




}
