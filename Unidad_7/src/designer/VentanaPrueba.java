package designer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class VentanaPrueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrueba frame = new VentanaPrueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agenda");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(262, 11, 162, 62);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(241, 101, 172, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(241, 144, 172, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(241, 228, 172, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(241, 270, 172, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setBounds(173, 104, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("dirección:");
		lblNewLabel_2.setBounds(173, 147, 58, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Población:");
		lblNewLabel_3.setBounds(173, 231, 61, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo:");
		lblNewLabel_4.setBounds(173, 273, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(122, 315, 89, 44);
		contentPane.add(btnNewButton);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(textField.getText().isBlank() || textField_1.getText().isBlank() || textField_2.getText().isBlank() || textField_3.getText().isBlank())
                    lblNewLabel.setText("Introduce todos los datos");
                else {
                    FileWriter fw = null;
                    PrintWriter pw = null;
                    try {
                        fw = new FileWriter ("C:\\ProgramacionTXT\\AgendaNueva.txt",true);
                        pw = new PrintWriter(fw);
                        pw.println(textField.getText());
                        pw.println(textField_1.getText());
                        pw.println(textField_2.getText());
                        pw.println(textField_3.getText());
                        pw.println(textField_4.getText());
                        
                        lblNewLabel.setText("Guardado");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }finally {
                        try {
                            if(fw!=null)
                                fw.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
			}
			});
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(421, 315, 102, 44);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_2_1 = new JLabel("Teléfono:");
		lblNewLabel_2_1.setBounds(173, 189, 58, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(241, 186, 172, 20);
		contentPane.add(textField_4);
	}
}
	
