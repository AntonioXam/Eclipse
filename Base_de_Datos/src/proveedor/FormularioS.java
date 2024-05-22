package proveedor;
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

public class FormularioS extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField codigotxt;
    private JTextField nombretxt;
    private JTextField ciudadTxt;
    private JTextField pesoTXT;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FormularioS frame = new FormularioS();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private ConexionS con;

    /**
     * Create the frame.
     */
    public FormularioS() {
        setTitle("PROVEEDOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 412, 524);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Introduce un nuevo proveedor:");
        lblNewLabel.setBounds(23, 40, 207, 14);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Código:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setBounds(23, 78, 46, 14);
        contentPane.add(lblNewLabel_1);

        codigotxt = new JTextField();
        codigotxt.setBounds(89, 75, 86, 20);
        contentPane.add(codigotxt);
        codigotxt.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_1.setBounds(197, 75, 56, 14);
        contentPane.add(lblNewLabel_1_1);

        nombretxt = new JTextField();
        nombretxt.setColumns(10);
        nombretxt.setBounds(263, 72, 86, 20);
        contentPane.add(nombretxt);

        JLabel lblNewLabel_1_3 = new JLabel("Estado:");
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_3.setBounds(23, 122, 46, 14);
        contentPane.add(lblNewLabel_1_3);

        pesoTXT = new JTextField();
        pesoTXT.setColumns(10);
        pesoTXT.setBounds(90, 119, 86, 20);
        contentPane.add(pesoTXT);

        JLabel lblNewLabel_1_4 = new JLabel("Ciudad:");
        lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_4.setBounds(197, 119, 46, 14);
        contentPane.add(lblNewLabel_1_4);

        ciudadTxt = new JTextField();
        ciudadTxt.setColumns(10);
        ciudadTxt.setBounds(264, 116, 86, 20);
        contentPane.add(ciudadTxt);

        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigo = codigotxt.getText();
                    String nombre = nombretxt.getText();
                    String estado = pesoTXT.getText();
                    String ciudad = ciudadTxt.getText();

                    // Comprobamos que los campos no estén vacíos
                    if (codigo.isEmpty() || nombre.isEmpty() || ciudad.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Los campos Código, Nombre y Ciudad no pueden estar vacíos", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        con = new ConexionS();
                        con.insertarS(codigo, nombre,estado, ciudad);
                        con.mostrarS(table);
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

        JLabel lblNewLabel_2 = new JLabel("Listado de proveedores:");
        lblNewLabel_2.setBounds(29, 276, 160, 14);
        contentPane.add(lblNewLabel_2);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 318, 334, 134);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        con = new ConexionS();
        con.mostrarS(table);
        con.desconectar();
    }

    public void limpiar() {
        codigotxt.setText("");
        nombretxt.setText("");
        pesoTXT.setText("");
        ciudadTxt.setText("");
    }
}