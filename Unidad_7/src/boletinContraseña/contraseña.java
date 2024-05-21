package boletinContraseña;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class contraseña extends JFrame {

	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuariotxt;
	private JPasswordField contratxt;
	private JPasswordField contratxtconfi;

	/**
	 * Main de la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contraseña frame = new contraseña();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creando el frame
	 */
	public contraseña() {
		setTitle("Fortaleza de contraseñas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 372);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Menú");
		menuBar.add(mnNewMenu);

		
		JMenuItem mntmNewMenuItem = new JMenuItem("Requisitos");
		
		
		//Botón para abrir ventana secundaria de los requisitos
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Ventana secundaria
				requisitos req = new requisitos();
				req.setVisible(true);
				req.setLocationRelativeTo(null);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		
		//Botón con la acción de salir de la ventana
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==mntmNewMenuItem_1) {
					System.exit(0);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(75, 32, 128, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setBounds(75, 90, 171, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Confirmar contraseña:");
		lblNewLabel_2.setBounds(75, 147, 194, 14);
		contentPane.add(lblNewLabel_2);

		usuariotxt = new JTextField();
		usuariotxt.setBounds(75, 59, 208, 20);
		contentPane.add(usuariotxt);
		usuariotxt.setColumns(10);

		
		JButton btnNewButton = new JButton("Comprobar");
		
		// Boton con la acción de comprobar
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
					String usuario = usuariotxt.getText();
					String contra = contratxt.getText();
					String contraconfi = contratxtconfi.getText();

					//Comprobar que el usuario no esté vacio
					if (usuario.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Debes introducir un login de usuario", "Aviso", JOptionPane.WARNING_MESSAGE);
					}

					//Comproborar que contraseña no está vacio
					else if (contra.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Debes introducir una contraseña", "Aviso", JOptionPane.WARNING_MESSAGE);
					}

					//Comprobar que confirmar contraseña no está vacio
					else if (contraconfi.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Debes confirmar la contraseña", "Aviso", JOptionPane.WARNING_MESSAGE);
					}
					
					//Comprobar que las contraseñas no coinciden
					else if (!contra.equals(contraconfi)){
						JOptionPane.showMessageDialog(null, "No coinciden las contraseñas introducidas", "Error", JOptionPane.ERROR_MESSAGE);

					}

					//Comprobar que la contraseña no tenga menos de 8 caracteres
					else if (contraconfi.length()<8){
						JOptionPane.showMessageDialog(null, "La contraseña debe tener más de 8 caracteres", "Contraseña no válida", JOptionPane.WARNING_MESSAGE);
					}

					//Comprobar que la contraseña no tenga más de 24 caracteres
					else if (contraconfi.length()>24){
						JOptionPane.showMessageDialog(null, "La contraseña debe tener un máximo de 24 caracteres", "Contraseña no válida", JOptionPane.WARNING_MESSAGE);
					}

					//Comprobar que la contraseña no "Contenga" el nombre de usuario
					else if (contraconfi.contains(usuario)){
						JOptionPane.showMessageDialog(null, "La contraseña la contraseña no puede contener el login del usario", "Contraseña no válida", JOptionPane.WARNING_MESSAGE);
					}
					// comprobar que contenga al menos una minuscula
				    else if (contraconfi.equals(contraconfi.toUpperCase())){
                        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra minúscula", "Contraseña no válida", JOptionPane.WARNING_MESSAGE);
					}
					
					// comprobar que contenga al menos una mayuscula
					else if (contraconfi.equals(contraconfi.toLowerCase())) {
						JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayúscula",
								"Contraseña no válida", JOptionPane.WARNING_MESSAGE);
					}
					
					//comprobar que contenga al menos un numero
					else if (!contraconfi.matches(".*\\d.*")) {
						JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un número",
								"Contraseña no válida", JOptionPane.WARNING_MESSAGE);
					}

					// Mensaje que la contraseña cumple todos los requisitos
					else {
						JOptionPane.showMessageDialog(null, "La contraseña cumple los requisitos", "Contraseña válida",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}

		});
		btnNewButton.setBounds(75, 229, 103, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Limpiar");
		
		//Botón limpiar con la acción de limpar (borrar todos los textfields)
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_1) {
					usuariotxt.setText("");
					contratxt.setText("");
					contratxtconfi.setText("");
				}
			}
		});
		btnNewButton_1.setBounds(194, 229, 89, 23);
		contentPane.add(btnNewButton_1);

		contratxt = new JPasswordField();
		contratxt.setBounds(75, 115, 208, 20);
		contentPane.add(contratxt);

		contratxtconfi = new JPasswordField();
		contratxtconfi.setBounds(75, 172, 208, 20);
		contentPane.add(contratxtconfi);
	}

	
}
