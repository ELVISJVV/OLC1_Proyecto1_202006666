package utilities;

public class Token {
    private String lexema   ;
    private String tiṕo;
    private int fila;
    private int columna;

    public Token(String lexema, String tipo, int fila, int columna) {
        this.lexema = lexema;
        this.tiṕo = tipo;
        this.fila = fila;
        this.columna = columna;
    }

    public String getLexema() {
        return lexema;
    }

    public String getTipo() {
        return tiṕo;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String toString() {
        return "Tipo: " + tiṕo + " con el lexema " + lexema + " en la línea " + fila + " y columna " + columna;
    }

    public String toStringHTML() {
        return "<tr><td>" + tiṕo + "</td><td>" + lexema + "</td><td>" + fila + "</td><td>" + columna + "</td></tr>";
    }
}
