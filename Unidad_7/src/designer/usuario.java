package designer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class usuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JPasswordField textField_2;
	private JLabel lblNewLabel_4;
	private JPasswordField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuario frame = new usuario();
					frame.setLocationRelativeTo(null);
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
	public usuario() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 435);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Abrir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
						textField.setText(reader.readLine());
						textField_1.setText(reader.readLine());
						textField_2.setText(reader.readLine());
						textField_3.setText(reader.readLine());
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Error al abrir el archivo", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			
			
			
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Guardar como");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					try (FileWriter writer = new FileWriter(file)) {
						writer.write(textField.getText() + "\n");
						writer.write(textField_1.getText() + "\n");
						writer.write(textField_2.getText() + "\n");
						writer.write(textField_3.getText() + "\n");
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Salir");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce tu usuario:");
		lblNewLabel.setBounds(156, 33, 128, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(82, 91, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(169, 88, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setBounds(92, 133, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 130, 160, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Contraseña:");
		lblNewLabel_3.setBounds(68, 176, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JPasswordField();
		textField_2.setBounds(169, 173, 160, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Contraseña de nuevo:");
		lblNewLabel_4.setBounds(26, 211, 149, 28);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JPasswordField();
		textField_3.setBounds(169, 215, 160, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Guardar el usuario en Un fichero en C:/ProgramacionTXT/usuarios.txt
				
			                    
			                    
			    
				try {
					FileWriter fichero = null;
					//comprobamos que los campos no esten vacios
					if (textField.getText().equals("") || textField_1.getText().equals("")
							|| textField_2.getText().equals("") || textField_3.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos");
						return;
					}
					//comprobamos que las contraseñas sean iguales
					if (!textField_2.getText().equals(textField_3.getText())) {
						JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
						return;
					}
					//comprobamos que el email tenga @
					if (!textField_1.getText().contains("@")) {
						JOptionPane.showMessageDialog(null, "El email no es correcto");
						return;
					}
					
					//que no deje guardar si las contraseñas no son iguales
				    fichero = new FileWriter("C:/ProgramacionTXT/usuarios.txt",true);
				    fichero.write(textField.getText()+","+textField_1.getText()+","+textField_2.getText()+"\n");
				    fichero.close();
				    JOptionPane.showMessageDialog(null, "Usuario guardado correctamente");
				    textField.setText("");
				    textField_1.setText("");
				    textField_2.setText("");
				    textField_3.setText("");
				    
				    } catch (IOException e1) {
				    	JOptionPane.showMessageDialog(null, "error al guardar el usuario");
				    	e1.printStackTrace();
				    	}
				}
			
					
			
				
				
				
			
		});
		btnNewButton.setBounds(295, 304, 86, 40);
		contentPane.add(btnNewButton);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnBorrar.setBounds(73, 304, 86, 40);
		contentPane.add(btnBorrar);
	}
}
