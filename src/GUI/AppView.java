package GUI;

import main.Main;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import static utilities.Reporte.*;

public class AppView extends javax.swing.JFrame {

    private static int fileCounter = 1;
    private static JFrame frame;

    public AppView() {
        initComponents();
        this.setTitle("DataForge");
        this.setResizable(false);
        setLocationRelativeTo(null);// posicion de la ventana en el centro
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        scrollPane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnNewFile = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        btnDeleteTab = new javax.swing.JButton();
        btnSaveFile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaConsola = new javax.swing.JTextArea();
        btnRun = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollPane.setViewportView(jTextArea1);

        tabbedPane.addTab("Archivo.df", scrollPane);

        btnNewFile.setBackground(new java.awt.Color(255, 204, 51));
        btnNewFile.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 13)); // NOI18N
        btnNewFile.setText("Nuevo Archivo");
        btnNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFileActionPerformed(evt);
            }
        });

        btnOpenFile.setBackground(new java.awt.Color(255, 204, 51));
        btnOpenFile.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 13)); // NOI18N
        btnOpenFile.setText("Abrir Archivo");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnDeleteTab.setBackground(new java.awt.Color(255, 204, 51));
        btnDeleteTab.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 13)); // NOI18N
        btnDeleteTab.setText("Eliminar Pestaña");
        btnDeleteTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTabActionPerformed(evt);
            }
        });

        btnSaveFile.setBackground(new java.awt.Color(255, 204, 51));
        btnSaveFile.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 13)); // NOI18N
        btnSaveFile.setText("Guardar Archivo");
        btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFileActionPerformed(evt);
            }
        });

        textAreaConsola.setColumns(20);
        textAreaConsola.setRows(5);
        jScrollPane2.setViewportView(textAreaConsola);

        btnRun.setBackground(new java.awt.Color(255, 204, 51));
        btnRun.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 13)); // NOI18N
        btnRun.setText("Ejecutar");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        btnReports.setBackground(new java.awt.Color(255, 204, 51));
        btnReports.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 13)); // NOI18N
        btnReports.setText("Reportes");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        jLabel1.setText("Consola");

        jLabel2.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        jLabel2.setText("Entrada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNewFile)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpenFile)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteTab))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnRun)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnReports))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewFile)
                    .addComponent(btnOpenFile)
                    .addComponent(btnSaveFile)
                    .addComponent(btnDeleteTab)
                    .addComponent(btnRun)
                    .addComponent(btnReports))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        String userDir = System.getProperty("user.dir");
        fileChooser.setCurrentDirectory(new File(userDir));
        int returnValue = fileChooser.showOpenDialog(frame);
        // APPROVE_OPTION sirve para verificar si se seleccionó un archivo

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // obtener la ruta del archivo 
            File selectedFile = fileChooser.getSelectedFile();
            if (selectedFile != null) {

                openFile(selectedFile);
            }
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed


    private void btnDeleteTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTabActionPerformed
        int selectedIndex = tabbedPane.getSelectedIndex();
        if (selectedIndex != -1) {
            tabbedPane.remove(selectedIndex);
        }
    }//GEN-LAST:event_btnDeleteTabActionPerformed

    private void btnNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFileActionPerformed
        addNewTab("Archivo" + fileCounter++ + ".df");        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewFileActionPerformed

    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        int selectedIndex = tabbedPane.getSelectedIndex();
        if (selectedIndex != -1) {
            JScrollPane scrollPane1 = (JScrollPane) tabbedPane.getComponentAt(selectedIndex);
            JTextArea textArea = (JTextArea) scrollPane1.getViewport().getView();
            System.out.println(textArea);
            saveFile(textArea, tabbedPane.getTitleAt(selectedIndex));

        }
    }//GEN-LAST:event_btnSaveFileActionPerformed

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        int selectedIndex = tabbedPane.getSelectedIndex();

        textAreaConsola.setText("");
//        System.out.println(selectedIndex);
        if (selectedIndex != -1) {
            Component selectedComponent = tabbedPane.getComponentAt(selectedIndex);
            if (selectedComponent instanceof JScrollPane scrollPane1) {
                Component viewport = scrollPane1.getViewport().getView();
                if (viewport instanceof JTextArea textArea) {
                    String text = textArea.getText();
//                    System.out.println(text);
                    Main.analizar(text);

                    textAreaConsola.setText(Main.stringConsola);
                }
            }
        }
    }//GEN-LAST:event_btnRunActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
//        Main.analizadores("src/compiler/", "Lexer.jflex", "Parser.cup");
        crearReporteTokens();
        crearReporteErrores();
        crearReporteTablaSimbolos();

    }//GEN-LAST:event_btnReportsActionPerformed

    // functions
    private void addNewTab(String title) {

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane1 = new JScrollPane(textArea);

        tabbedPane.addTab(title, scrollPane1);
    }

    /**
     * @param args the command line arguments
     */
    private void openFile(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            addNewTab(file.getName());
            int lastIndex = tabbedPane.getTabCount() - 1;
            JScrollPane scrollPane1 = (JScrollPane) tabbedPane.getComponentAt(lastIndex);
            JTextArea textArea = (JTextArea) scrollPane1.getViewport().getView();
            textArea.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveFile(JTextArea textArea, String fileName) {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(fileName));
        String userDir = System.getProperty("user.dir");
        fileChooser.setCurrentDirectory(new File(userDir));

        int returnValue = fileChooser.showSaveDialog(frame);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.print(textArea.getText());

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        "Su archivo no se ha guardado",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteTab;
    private javax.swing.JButton btnNewFile;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextArea textAreaConsola;
    // End of variables declaration//GEN-END:variables
}
