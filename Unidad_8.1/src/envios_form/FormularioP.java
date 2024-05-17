package envios_form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.security.PublicKey;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField codigotxt;
	private JTextField nombretxt;
	private JTextField colortxt;
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
					FormularioP frame = new FormularioP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private ConexionP con;
	/**
	 * Create the frame.
	 */
	public FormularioP() {
		setTitle("PIEZAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce una nueva pieza:");
		lblNewLabel.setBounds(23, 40, 166, 14);
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
		lblNewLabel_1_1.setBounds(23, 119, 56, 14);
		contentPane.add(lblNewLabel_1_1);
		
		nombretxt = new JTextField();
		nombretxt.setColumns(10);
		nombretxt.setBounds(89, 116, 86, 20);
		contentPane.add(nombretxt);
		
		JLabel lblNewLabel_1_2 = new JLabel("Color:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(23, 157, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		colortxt = new JTextField();
		colortxt.setColumns(10);
		colortxt.setBounds(89, 154, 86, 20);
		contentPane.add(colortxt);
		
		JLabel lblNewLabel_1_3 = new JLabel("Peso:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(197, 119, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		pesoTXT = new JTextField();
		pesoTXT.setColumns(10);
		pesoTXT.setBounds(264, 116, 86, 20);
		contentPane.add(pesoTXT);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ciudad:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(197, 157, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		ciudadTxt = new JTextField();
		ciudadTxt.setColumns(10);
		ciudadTxt.setBounds(264, 154, 86, 20);
		contentPane.add(ciudadTxt);
		
		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.setBounds(60, 214, 118, 23);
		contentPane.add(botonGuardar);
		
		JButton botonBorrar = new JButton("Borrar");
		botonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==botonBorrar) {
					codigotxt.setText("");
					nombretxt.setText("");
					colortxt.setText("");
					pesoTXT.setText("");
					ciudadTxt.setText("");
				}
			}
		});
		botonBorrar.setBounds(216, 214, 118, 23);
		contentPane.add(botonBorrar);
		
		JLabel lblNewLabel_2 = new JLabel("Listado de piezas:");
		lblNewLabel_2.setBounds(29, 276, 118, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 318, 334, 134);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		con = new ConexionP();
		con.mostrarP(table);
		con.desconectar();
		
		
	}
}
