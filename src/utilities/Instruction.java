package utilities;

import main.Main;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static main.Main.sentenciasGraph;
import static utilities.Extra.crearGrafica;
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


        crearGrafica(sentenciasGraph.get("titulo").replaceAll("\"", ""), grafica);

        sentenciasGraph.clear();
    }


    public static void graficarPie() {

        DefaultPieDataset dataset = new DefaultPieDataset();
        LinkedList<String> listaLabel = funcionComplementariaArray(sentenciasGraph.get("label"));
        LinkedList<String> listaValues = funcionComplementariaArray(sentenciasGraph.get("values"));
        for (int i = 0; i < listaValues.size(); i++) {
            dataset.setValue(listaLabel.get(i), Double.parseDouble(listaValues.get(i)));
        }


        JFreeChart grafica =
                ChartFactory.createPieChart(sentenciasGraph.get("titulo").replaceAll("\"", ""), dataset);

        crearGrafica(sentenciasGraph.get("titulo").replaceAll("\"", ""), grafica);

        sentenciasGraph.clear();
    }

    public static void graficarLinea() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        LinkedList<String> listaEjeX = funcionComplementariaArray(sentenciasGraph.get("ejeX"));
        LinkedList<String> listaEjeY = funcionComplementariaArray(sentenciasGraph.get("ejeY"));
        for (int i = 0; i < listaEjeX.size(); i++) {
            datos.addValue(Double.parseDouble(listaEjeY.get(i)), "GRÁFICA", listaEjeX.get(i));
        }

        JFreeChart grafica = ChartFactory.createLineChart(
                sentenciasGraph.get("titulo").replaceAll("\"", ""),
                sentenciasGraph.get("tituloX").replaceAll("\"", ""),
                sentenciasGraph.get("tituloY").replaceAll("\"", ""),
                datos);

        crearGrafica(sentenciasGraph.get("titulo").replaceAll("\"", ""), grafica);
        sentenciasGraph.clear();


    }

    public static void graficarHistograma(){

        LinkedList<String> listaValues = funcionComplementariaArray(sentenciasGraph.get("values"));
//        convertir linkedlist a double[]
        double[] values = new double[listaValues.size()];
        for (int i = 0; i < listaValues.size(); i++) {
            values[i] = Double.parseDouble(listaValues.get(i));
        }

        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Frecuencia de los Datos", values, 20);

        JFreeChart histogram = ChartFactory.createHistogram(sentenciasGraph.get("titulo").replaceAll("\"", ""),
                "Datos", "Frecuencia", dataset,
                PlotOrientation.VERTICAL,
                true, true, true);

        crearGrafica(sentenciasGraph.get("titulo").replaceAll("\"", ""), histogram);
        sentenciasGraph.clear();
    }
}
