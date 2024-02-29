package utilities;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static main.Main.sentenciasGraph;
import static main.Main.stringConsola;

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
            java.io.FileWriter fileWriter = new java.io.FileWriter("reportes/" + nombre);
            fileWriter.write(contenido);
            fileWriter.close();
            File archivo = new File("reportes/" + nombre);
            Desktop.getDesktop().open(archivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void crearGrafica(String titulo, JFreeChart grafica) {
        int contador = 1;
        int width = 800;
        int height = 600;

        File barChart;
        do {

            String nombreArchivo = "graficas/" + titulo + (contador > 1 ? "_" + contador : "") + ".jpeg";
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


    public static void encontrarFrecuencias(double[] values, String titulo) {
        HashMap<Double, Integer> frequencyMap = getDoubleIntegerHashMap(values);

        int frecuenciaAbsoluta = 0;
        DecimalFormat percentFormat = new DecimalFormat("0%");
        stringConsola += "\t" + titulo + "\n";
        stringConsola += "-----------------------------------------------------------------------------" + "\n";
        stringConsola += "Valor\tFb\tFa\tFr\n";
        stringConsola += "-----------------------------------------------------------------------------" + "\n";
        for (double num : values) {

            if (frequencyMap.containsKey(num)) {
                double frecuenciaRelativa = (double) frequencyMap.get(num) / values.length;

                String formattedRelativeFrequency = percentFormat.format(frecuenciaRelativa);
                frecuenciaAbsoluta += frequencyMap.get(num);
                stringConsola += String.format("%.1f\t%d\t%d\t%s\n", num, frequencyMap.get(num), frecuenciaAbsoluta, formattedRelativeFrequency);

                frequencyMap.remove(num);

            }
        }

        stringConsola += "-----------------------------------------------------------------------------" + "\n";
        stringConsola += "Totales\t" + frecuenciaAbsoluta + "\t" + frecuenciaAbsoluta + "\t100%\n";
        stringConsola += "-----------------------------------------------------------------------------" + "\n";
    }

    private static HashMap<Double, Integer> getDoubleIntegerHashMap(double[] numbers) {
        HashMap<Double, Integer> frequencyMap = new HashMap<>();
        for (double num : numbers) {

            int currentFrequency = frequencyMap.getOrDefault(num, 0);
            int updatedFrequency = currentFrequency + 1;
            frequencyMap.put(num, updatedFrequency);
        }
        return frequencyMap;
    }
}
