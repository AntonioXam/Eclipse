package designer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CrearContraseñaymostrarla extends JFrame implements ActionListener {

	/*programa que pida un nombre de usuario y genere una contraseña aleatoria con una mayuscula y un numero y la guarde en un fichero*/

	//atributos
	private JLabel usuario;;
	private JTextField user;
	private JButton guardar;
	private int longitud=8;
	private JLabel guardado;





	//constructor

	public CrearContraseñaymostrarla() {

		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

		usuario = new JLabel("Usuario: ");
		add(usuario);

		user = new JTextField(20);
		add(user);

		guardar = new JButton("Guardar");
		add(guardar);
		guardar.addActionListener(this);

		guardado = new JLabel("Contraseña guardada");
		add(guardado);
		guardado.setVisible(false);






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


		CrearContraseñaymostrarla cc = new CrearContraseñaymostrarla();
		cc.setSize(300, 300);
		cc.setVisible(true);
		cc.setTitle("Crear Contraseña");
		cc.setLocationRelativeTo(null);
		cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//guardar en un fichero
		
		String nombre = user.getText();
		String contraseña = generarPassword();
		try {
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\ProgramacionTXT\\contraseñas.txt",true));
            pw.println(nombre + ":" + contraseña);
            pw.close();
            guardado.setVisible(true);
        } catch (Exception e2) {
		
	}
}

	}

