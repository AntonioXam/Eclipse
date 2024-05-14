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

public class CifrarMensaje extends JFrame implements ActionListener {

	/*programa pida un usuario y contraseña y la cifre a rot 13 y la guarde en un fichero*/

	//atributos
	private JLabel usuario;;
	private JTextField user;
	private JButton crifrarContraseña;
	private int longitud=8;
	private JLabel contrasena;
	private JTextField pass;
	private JPanel panel;
	private JLabel contraseñaguardada;
	private JButton descifrar;
	private JLabel mensajeDescifrado;
	





	//constructor

	public CifrarMensaje() {

		
	//ordenados en dos columnas
		
	panel = new JPanel();
	panel.setLayout(new GridLayout(4, 2,20,20));
	usuario = new JLabel("Usuario: ");
	user = new JTextField(10);
	contrasena = new JLabel("Contraseña: ");
	pass = new JTextField(10);
	crifrarContraseña = new JButton("Cifrar Contraseña");
	crifrarContraseña.addActionListener(this);
	contraseñaguardada = new JLabel("Contraseña cifrada y guardada");
	contraseñaguardada.setVisible(false);
	descifrar = new JButton("Descifrar");
	descifrar.addActionListener(this);
	mensajeDescifrado = new JLabel("Contraseña descifrada");
	mensajeDescifrado.setVisible(false);
	

	
	panel.add(usuario);
	panel.add(user);
	panel.add(contrasena);
	panel.add(pass);
	panel.add(crifrarContraseña);
	panel.add(contraseñaguardada);	
	panel.add(descifrar);
	panel.add(mensajeDescifrado);

	
	setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
	add(panel);


	}

	//métodos cifrar mensaje rot 13
	
	public String sustitucion(int clave) {

		String contraseña=pass.getText();
		String criptograma="";
		for (int i = 0; i < contraseña.length(); i++) {
			if (contraseña.charAt(i)>='A' && contraseña.charAt(i)<='Z') {
				int caracter=contraseña.charAt(i)+clave;
				if ((char)caracter>'Z') 
					caracter-=26;
				criptograma+=(char)caracter;
			}
			//controlar de la 'a' a la 'z' y que sea circular 
			else if (contraseña.charAt(i)>='a' && contraseña.charAt(i)<='z') {
				int caracter=contraseña.charAt(i)+clave;
				if ((char)caracter>'z') 
					caracter-=26; //restando a la z para volver a emprezar
				criptograma+=(char)caracter;
			}
			else
				criptograma+=contraseña.charAt(i);		// dejar los otros caracteres fuera del rango igual
				
		}
		return criptograma;

	}
	
	
	//método descifrar mensaje rot 13
	
	public String DescifrarSustitucion(int clave) {

		String mensaje=pass.getText();
		String criptograma="";
		for (int i = 0; i < mensaje.length(); i++) {
			if (mensaje.charAt(i)>='A' && mensaje.charAt(i)<='Z') {
				int caracter=mensaje.charAt(i)-clave;
				if ((char)caracter<'A') 
					caracter+=26; //sumando A la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			//controlar de la 'a' a la 'z' y que sea circular 
			else if (mensaje.charAt(i)>='a' && mensaje.charAt(i)<='z') {
				int caracter=mensaje.charAt(i)-clave;
				if ((char)caracter<'a') 
					caracter+=26; //sumando a la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			else
				criptograma+=mensaje.charAt(i);		// dejar los otros caracteres fuera del rango igual

		}
		return criptograma;

	}
	




	public static void main(String[] args) {


		CifrarMensaje cc = new CifrarMensaje();
		cc.setSize(380, 220);
		cc.setVisible(true);
		cc.setTitle("cifrar Contraseña");
		cc.setLocationRelativeTo(null);
		cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//mostrar la contraseña cifrada y luego poder descifrarla
		
		if (e.getSource() == crifrarContraseña) {
            contraseñaguardada.setVisible(true);
            pass.setText(sustitucion(13));
            try {
                FileWriter fichero = new FileWriter("contraseña.txt");
                PrintWriter pw = new PrintWriter(fichero);
                pw.println(pass.getText());
                fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
		
		if (e.getSource() == descifrar) {
			            mensajeDescifrado.setVisible(true);
            pass.setText(DescifrarSustitucion(13));
        }
		
		
		}
	}

		
		

