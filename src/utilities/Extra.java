package utilities;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static main.Main.sentenciasGraph;

public class Extra {


    public static LinkedList<String> funcionComplementariaArray(String stringLista) {
        String stringArreglo = stringLista.replaceAll("\"", "");
        Variable variable = main.Main.tablaSimbolos.get(stringLista);
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

    public static void crearGrafica( String titulo, JFreeChart grafica) {
        int contador = 1;
        int width = 800;
        int height = 600;

        File barChart ;
        do {

            String nombreArchivo = "graficas/" + titulo + (contador > 1 ? "_" + contador : "") +  ".jpeg";
            barChart = new File(nombreArchivo);
            contador++;
        } while (barChart.exists()); // Verificar si el archivo ya existe


        try {
            ChartUtilities.saveChartAsJPEG(barChart, grafica, width, height);
            Desktop.getDesktop().open(barChart);
        } catch (IOException ex) {
            Logger.getLogger("Grafica").log(Level.SEVERE, null, ex);
        }
    }
}
