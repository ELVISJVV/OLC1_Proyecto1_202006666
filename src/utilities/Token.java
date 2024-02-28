package utilities;

public class Token {
    private String lexema   ;
    private String tipo;
    private int fila;
    private int columna;

    public Token(String lexema, String tipo, int fila, int columna) {
        this.lexema = lexema;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
    }

    public String getLexema() {
        return lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String toString() {
        return "Tipo: " + tipo + " con el lexema " + lexema + " en la línea " + fila + " y columna " + columna;
    }

    public String toStringHTML() {
        return "<tr><td>" + tipo + "</td><td>" + lexema + "</td><td>" + fila + "</td><td>" + columna + "</td></tr>";
    }
}
