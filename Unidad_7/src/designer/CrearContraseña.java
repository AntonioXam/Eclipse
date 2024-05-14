package designer;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrearContraseña extends JFrame implements ActionListener {

	/*programa que pida un nombre de usuario y genere una contraseña aleatoria con una mayuscula y un numero y la guarde en un fichero*/

	//atributos
	private JLabel usuario;;
	private JTextField user;
	private JButton crearContraseña;
	private int longitud=8;
	private JLabel contrasena;
	private JTextField pass;
	private JPanel panel;
	private JLabel contraseñaguardada;





	//constructor

	public CrearContraseña() {

		
	//ordenados en dos columnas
		
	panel = new JPanel();
	panel.setLayout(new GridLayout(4, 2,20,20));
	usuario = new JLabel("Usuario: ");
	user = new JTextField(10);
	contrasena = new JLabel("Contraseña: ");
	pass = new JTextField(10);
	crearContraseña = new JButton("Crear Contraseña");
	crearContraseña.addActionListener(this);
	contraseñaguardada = new JLabel("Contraseña guardada");
	contraseñaguardada.setVisible(false);
	panel.add(usuario);
	panel.add(user);
	panel.add(contrasena);
	panel.add(pass);
	panel.add(crearContraseña);
	panel.add(contraseñaguardada);
	
	
	
	setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
	add(panel);


	}

	//métodos	

	public String generarPassword() {
		
		StringBuffer p = new StringBuffer();
		int tombola;
		for (int i = 0; i < longitud; i++) {
			// para generar el num del 1 al 3, y que elija qué generar
			tombola = (int) (Math.random() * 3 + 1);
			if (tombola == 1)
				// Genera letra minúscula 'a'....'z' (97...122)
				p.append((char) (97 + Math.random() * 26));

			else if (tombola == 2)
				// Genera letra mayuscula 'A'...'Z'(65...90)
				p.append((char) (65 + Math.random() * 26));
			else
				// Genera número 0 al 9 (48...57)
				p.append((char) (48 + Math.random() * 10));
		}
		return p.toString();

	}



	public static void main(String[] args) {


		CrearContraseña cc = new CrearContraseña();
		cc.setSize(380, 220);
		cc.setVisible(true);
		cc.setTitle("Crear Contraseña");
		cc.setLocationRelativeTo(null);
		cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//crear contraseña en textfield contraseña
		
		if (e.getSource() == crearContraseña) {
			pass.setText(generarPassword());
			try {
				FileWriter fw = new FileWriter("C:\\ProgramacionTXT\\contraseñasmostradas.txt", true);
				PrintWriter pw = new PrintWriter(fw);
				pw.println("Usuario: " + user.getText() + " Contraseña: " + pass.getText());
				contraseñaguardada.setVisible(true);
				pw.close();
			} catch (Exception ex) {
				System.out.println("Error al escribir en el fichero");
			}
		
		
	}
}

	}

