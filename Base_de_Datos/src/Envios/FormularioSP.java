package Envios;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioSP extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField codigotxt;
    private JTextField nombretxt;
    private JTextField pesoTXT;
    private JTable table;

    /**
     * Ejecutando la apliación
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FormularioSP frame = new FormularioSP();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //Atributo para conectar con la BD en la tabla SP
    private ConexionSP con;

    /**
     * Creando la Ventana
     */
    public FormularioSP() {
        setTitle("ENVIOS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 448, 524);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Introduce un nuevo envio:");
        lblNewLabel.setBounds(23, 40, 207, 14);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Proveedor:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setBounds(23, 110, 111, 14);
        contentPane.add(lblNewLabel_1);

        codigotxt = new JTextField();
        codigotxt.setBounds(95, 104, 74, 26);
        contentPane.add(codigotxt);
        codigotxt.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Piezas:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_1.setBounds(23, 164, 111, 14);
        contentPane.add(lblNewLabel_1_1);

        nombretxt = new JTextField();
        nombretxt.setColumns(10);
        nombretxt.setBounds(95, 161, 74, 23);
        contentPane.add(nombretxt);

        JLabel lblNewLabel_1_3 = new JLabel("Cantidad:");
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_3.setBounds(203, 164, 74, 14);
        contentPane.add(lblNewLabel_1_3);

        pesoTXT = new JTextField();
        pesoTXT.setColumns(10);
        pesoTXT.setBounds(295, 158, 74, 26);
        contentPane.add(pesoTXT);

        /**
         * Método del botón "Guardar" que comprueba si los campos del formulario estan vacios e inserta los datos en la BD
         */
        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigos = codigotxt.getText();
                    String codigop = nombretxt.getText();
                    String cantidad = pesoTXT.getText();
                    

                    // Comprobamos que los campos no estén vacíos
                    if (codigos.isEmpty() || codigop.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Los campos Proveedor y Piezas  no pueden estar vacíos", "Error", JOptionPane.ERROR_MESSAGE);
                        
                     
                    } else {
                    	
                    // Conexion con la base de datos mostrando la tabla e insertando lo introducido en el formulario
                        con = new ConexionSP();
                        con.insertarSP(codigos,codigop,cantidad);
                        con.mostrarSP(table);
                        con.desconectar();
                        limpiar();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Los valores introducidos no son correctos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        botonGuardar.setBounds(95, 214, 118, 23);
        contentPane.add(botonGuardar);

       
        /**
         * Botón para limpiar los campos del formulario
         */
        JButton botonBorrar = new JButton("Borrar");
        botonBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        
        
        
        botonBorrar.setBounds(251, 214, 118, 23);
        contentPane.add(botonBorrar);

        JLabel lblNewLabel_2 = new JLabel("Listado de envios:");
        lblNewLabel_2.setBounds(29, 276, 160, 14);
        contentPane.add(lblNewLabel_2);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 301, 362, 159);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        //Llamada a la Clase para la conexión con la BD en la tabla SP
        con = new ConexionSP();
        con.mostrarSP(table);
        con.desconectar();
    }

    
   
    //Método para borrar los campos del formulario
    public void limpiar() {
        codigotxt.setText("");
        nombretxt.setText("");
        pesoTXT.setText("");
        
    }
}