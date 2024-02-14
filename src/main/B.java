import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class B {
    private static JFrame frame;
    private static JTabbedPane tabbedPane;
    private static int fileCounter = 1;
    private static File currentFile; // Guardar la referencia al archivo actual

    public static void main(String[] args) {
        frame = new JFrame("Editor Básico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        tabbedPane = new JTabbedPane();

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Archivo");

        JMenuItem newItem = new JMenuItem("Nuevo");
        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewTab("Nuevo archivo " + fileCounter++);
            }
        });

        JMenuItem openItem = new JMenuItem("Abrir");
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(frame);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    if (selectedFile != null) {
                        openFile(selectedFile);
                    }
                }
            }
        });

        JMenuItem saveItem = new JMenuItem("Guardar");
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveCurrentFile(); // Guardar automáticamente sin preguntar la ruta
            }
        });

        JMenuItem closeItem = new JMenuItem("Eliminar pestaña");
        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                if (selectedIndex != -1) {
                    tabbedPane.remove(selectedIndex);
                }
            }
        });

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(closeItem);
        menuBar.add(fileMenu);

        // Botón para guardar automáticamente sin preguntar la ruta
        JButton saveButton = new JButton("Guardar");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveCurrentFile();
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setJMenuBar(menuBar);
        frame.add(tabbedPane);
        frame.setVisible(true);
    }

    private static void addNewTab(String title) {
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        tabbedPane.addTab(title, scrollPane);
    }

    private static void openFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            addNewTab(file.getName());
            int lastIndex = tabbedPane.getTabCount() - 1;
            JScrollPane scrollPane = (JScrollPane) tabbedPane.getComponentAt(lastIndex);
            JTextArea textArea = (JTextArea) scrollPane.getViewport().getView();
            textArea.setText(content.toString());
            currentFile = file; // Guardar la referencia al archivo actual
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveFile(JTextArea textArea, File file) {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(textArea.getText());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void saveCurrentFile() {
        int selectedIndex = tabbedPane.getSelectedIndex();
        if (selectedIndex != -1) {
            JScrollPane scrollPane = (JScrollPane) tabbedPane.getComponentAt(selectedIndex);
            JTextArea textArea = (JTextArea) scrollPane.getViewport().getView();
            if (currentFile != null) {
                saveFile(textArea, currentFile);
            } else {
                saveFileAs(textArea);
            }
        }
    }

    private static void saveFileAs(JTextArea textArea) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(frame);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            saveFile(textArea, file);
            currentFile = file; // Actualizar la referencia al archivo actual
        }
    }
}
