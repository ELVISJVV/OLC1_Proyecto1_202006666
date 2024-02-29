package utilities;

import main.Main;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static main.Main.sentenciasGraph;
import static utilities.Extra.funcionComplementariaArray;

public class Instruction {

    public static void print(String message) {
        message = message.replaceAll("\"", "");
        Main.stringConsola += message + "\n";
        System.out.println(message);
    }


    public static void printArray(String titulo, String stringLista) {
        Main.stringConsola += "----------------------" + "\n";
        Main.stringConsola += titulo.replaceAll("\"", "") + "\n";
        Main.stringConsola += "----------------------" + "\n";

        LinkedList<String> linkedList = funcionComplementariaArray(stringLista);
        for (String elemento : linkedList) {
            Main.stringConsola += elemento + "\n";
        }
    }

    public static void graficarBarra() {
        int contador = 1;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        LinkedList<String> listaEjeX = funcionComplementariaArray(sentenciasGraph.get("ejeX"));
        LinkedList<String> listaEjeY = funcionComplementariaArray(sentenciasGraph.get("ejeY"));
        for (int i = 0; i < listaEjeX.size(); i++) {
            datos.addValue(Double.parseDouble(listaEjeY.get(i)), listaEjeX.get(i), listaEjeX.get(i));
        }

        JFreeChart grafica = ChartFactory.createBarChart(
                sentenciasGraph.get("titulo").replaceAll("\"", ""),
                sentenciasGraph.get("tituloX").replaceAll("\"", ""),
                sentenciasGraph.get("tituloY").replaceAll("\"", ""),
                datos,
                PlotOrientation.VERTICAL,
                true, true, true);
        int width = 800;
        int height = 600;

        File barChart ;
        do {
            // Crear el nombre completo del archivo
            String nombreArchivo = "graficas/" + sentenciasGraph.get("titulo").replaceAll("\"", "") + (contador > 1 ? "_" + contador : "") +  ".jpeg";
            barChart = new File(nombreArchivo);
            contador++;
        } while (barChart.exists()); // Verificar si el archivo ya existe


        try {
            ChartUtilities.saveChartAsJPEG(barChart, grafica, width, height);
            Desktop.getDesktop().open(barChart);
        } catch (IOException ex) {
            Logger.getLogger("BarChart").log(Level.SEVERE, null, ex);
        }
    }

}
