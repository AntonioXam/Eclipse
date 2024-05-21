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
     * Launch the application.
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

    private ConexionSP con;

    /**
     * Create the frame.
     */
    public FormularioSP() {
        setTitle("ENVIOS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 412, 524);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Introduce un nuevo envio:");
        lblNewLabel.setBounds(23, 40, 207, 14);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Código Proveedor:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setBounds(23, 78, 111, 14);
        contentPane.add(lblNewLabel_1);

        codigotxt = new JTextField();
        codigotxt.setBounds(144, 75, 86, 20);
        contentPane.add(codigotxt);
        codigotxt.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Código Piezas:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_1.setBounds(23, 119, 111, 14);
        contentPane.add(lblNewLabel_1_1);

        nombretxt = new JTextField();
        nombretxt.setColumns(10);
        nombretxt.setBounds(144, 116, 86, 20);
        contentPane.add(nombretxt);

        JLabel lblNewLabel_1_3 = new JLabel("Cantidad:");
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_3.setBounds(23, 161, 74, 14);
        contentPane.add(lblNewLabel_1_3);

        pesoTXT = new JTextField();
        pesoTXT.setColumns(10);
        pesoTXT.setBounds(144, 158, 86, 20);
        contentPane.add(pesoTXT);

        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigos = codigotxt.getText();
                    String codigop = nombretxt.getText();
                    String cantidad = pesoTXT.getText();
                    

                    // Comprobamos que los campos no estén vacíos
                    if (codigos.isEmpty() || codigop.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Los campos Código-S y Código-P no pueden estar vacíos", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
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
        botonGuardar.setBounds(60, 214, 118, 23);
        contentPane.add(botonGuardar);

        JButton botonBorrar = new JButton("Borrar");
        botonBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        botonBorrar.setBounds(216, 214, 118, 23);
        contentPane.add(botonBorrar);

        JLabel lblNewLabel_2 = new JLabel("Listado de envios:");
        lblNewLabel_2.setBounds(29, 276, 160, 14);
        contentPane.add(lblNewLabel_2);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 318, 334, 134);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        con = new ConexionSP();
        con.mostrarSP(table);
        con.desconectar();
    }

    public void limpiar() {
        codigotxt.setText("");
        nombretxt.setText("");
        pesoTXT.setText("");
        
    }
}