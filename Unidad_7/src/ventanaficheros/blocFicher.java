package ventanaficheros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class blocFicher extends JFrame {
	
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public blocFicher() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        // Configuración básica de la ventana
        setTitle("Editor de texto simple");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el área de texto
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Crear una barra de menú
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Archivo");
        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem saveItem = new JMenuItem("Guardar");
        JMenuItem exitItem = new JMenuItem("Salir");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Configurar el file chooser
        fileChooser = new JFileChooser();

        // Agregar funcionalidad para abrir archivos
        openItem.addActionListener(e -> openFile());

        // Agregar funcionalidad para guardar archivos
        saveItem.addActionListener(e -> saveFile());

        // Funcionalidad para salir de la aplicación
        exitItem.addActionListener(e -> System.exit(0));
    }

    private void openFile() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                textArea.read(reader, null);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFile() {
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                textArea.write(writer);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new blocFicher().setVisible(true);
        });
    }
}
