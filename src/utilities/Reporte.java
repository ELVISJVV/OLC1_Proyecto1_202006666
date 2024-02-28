package utilities;

public class Reporte {

    public static void crearReporteTokens(){
        int contador = 1;
        String reporte = "<!DOCTYPE html>\n" +
                "<html lang=\"es\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Reporte de Tokens</title>\n" +
                "    <style>\n" +
                "        table {\n" +
                "            width: 100%;\n" +
                "            border-collapse: collapse;\n" +
                "        }\n" +
                "        th, td {\n" +
                "            border: 1px solid black;\n" +
                "            padding: 15px;\n" +
                "            text-align: left;\n" +
                "        }\n" +
                "        th {\n" +
                "            background-color: #4CAF50;\n" +
                "            color: white;\n" +
                "        }\n" +
                "        caption {\n" +
                "            font-size: 30px;\n" +
                "            font-weight: bold;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <table border=\"1\">\n" +
                "<caption>Reporte de Tokens</caption>\n" +
                "            <th>#</th>\n" +
                "            <th>Lexema</th>\n" +
                "            <th>Tipo</th>\n" +
                "            <th>Línea</th>\n" +
                "            <th>Columna</th>\n" ;


        for (Token token : main.Main.listaTokens) {
            reporte +=
                    "        <tr>\n" +
                    "<td>" + contador++ + "</td>\n" +
                            "<td>" + token.getLexema() + "</td>\n" +
                    "<td>" + token.getTipo() + "</td>\n" +
                    "<td>" + token.getFila() + "</td>\n" +
                    "<td>" + token.getColumna() + "</td>\n" +
                    "        </tr>\n";
        }


        reporte +=  "    </table>\n" +
                "</body>\n" +
                "</html>";

        Extra.escribirArchivo("ReporteTokens.html", reporte);
    }


    public static void crearReporteErrores() {
        int contador = 1;
        String reporte = "<!DOCTYPE html>\n" +
                "<html lang=\"es\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Reporte de Errores</title>\n" +
                "    <style>\n" +
                "        table {\n" +
                "            width: 100%;\n" +
                "            border-collapse: collapse;\n" +
                "        }\n" +
                "        th, td {\n" +
                "            border: 1px solid black;\n" +
                "            padding: 15px;\n" +
                "            text-align: left;\n" +
                "        }\n" +
                "        th {\n" +
                "            background-color: #4CAF50;\n" +
                "            color: white;\n" +
                "        }\n" +
                "        caption {\n" +
                "            font-size: 30px;\n" +
                "            font-weight: bold;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <table border=\"1\">\n" +
                "<caption>Reporte de Errores</caption>\n" +
                "            <th>#</th>\n" +
                "            <th>Tipo</th>\n" +
                    "            <th>Lexema</th>\n" +
                "            <th>Línea</th>\n" +
                "            <th>Columna</th>\n";

        for (ErrorClass error : main.Main.listaErrores) {
            reporte +=
                    "        <tr>\n" +
                            "<td>" + contador++ + "</td>\n" +
                            "<td>" + error.getTipo() + "</td>\n" +
                            "<td>" + error.getLexema() + "</td>\n" +
                            "<td>" + error.getLinea() + "</td>\n" +
                            "<td>" + error.getColumna() + "</td>\n" +
                            "        </tr>\n";
        }

        reporte += "    </table>\n" +
                "</body>\n" +
                "</html>";

        Extra.escribirArchivo("ReporteErrores.html", reporte);
    }


    public static void crearReporteTablaSimbolos() {

        int contador = 1;
        String reporte = "<!DOCTYPE html>\n" +
                "<html lang=\"es\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Reporte de Tabla de Símbolos</title>\n" +
                "    <style>\n" +
                "        table {\n" +
                "            width: 100%;\n" +
                "            border-collapse: collapse;\n" +
                "        }\n" +
                "        th, td {\n" +
                "            border: 1px solid black;\n" +
                "            padding: 15px;\n" +
                "            text-align: left;\n" +
                "        }\n" +
                "        th {\n" +
                "            background-color: #4CAF50;\n" +
                "            color: white;\n" +
                "        }\n" +
                "        caption {\n" +
                "            font-size: 30px;\n" +
                "            font-weight: bold;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <table border=\"1\">\n" +
                "<caption>Reporte de Tabla de Símbolos</caption>\n" +
                "            <th>#</th>\n" +
                "            <th>Nombre</th>\n" +
                "            <th>Tipo</th>\n" +
                "            <th>Valor</th>\n" +
                "            <th>Línea</th>\n" +
                "            <th>Columna</th>\n";

        for (String key : main.Main.tablaSimbolos.keySet()) {
            Variable variable = main.Main.tablaSimbolos.get(key);
            reporte +=
                    "        <tr>\n" +
                            "<td>" + contador++ + "</td>\n" +
                            "<td>" + key + "</td>\n" +
                            "<td>" + variable.getTipo() + "</td>\n" +
                            "<td>" + variable.obtenerValor() + "</td>\n" +
                            "<td>" + variable.getFila() + "</td>\n" +
                            "<td>" + variable.getColumna() + "</td>\n" +
                            "        </tr>\n";

        }

        reporte += "    </table>\n" +
                "</body>\n" +
                "</html>";

        Extra.escribirArchivo("ReporteTablaSimbolos.html", reporte);
    }

}
