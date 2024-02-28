package utilities;

public class GraphBar {
    private String titulo;
    private String ejeX;
    private String ejeY;
    private String tituloX;
    private String tituloY;


    public GraphBar(String titulo, String ejeX, String ejeY, String tituloX, String tituloY) {
        this.titulo = titulo;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.tituloX = tituloX;
        this.tituloY = tituloY;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getEjeX() {
        return ejeX;
    }

    public String getEjeY() {
        return ejeY;
    }

    public String getTituloX() {
        return tituloX;
    }

    public String getTituloY() {
        return tituloY;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void  setEjeX(String ejeX) {
        this.ejeX = ejeX;
    }

    public void  setEjeY(String ejeY) {
        this.ejeY = ejeY;
    }

    public void  setTituloX(String tituloX) {
        this.tituloX = tituloX;
    }

    public void  setTituloY(String tituloY) {
        this.tituloY = tituloY;
    }
}
