package ejeciciosJFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import componentes.campoTexto;

public class ej4 extends JFrame {

	
	
	public ej4() {
		
		setLayout(null);
		
		JLabel usuario = new JLabel("Usuario: ");
		usuario.setBounds(getBounds());
		
		
		JTextField textoUsuario = new JTextField();
		textoUsuario.setBounds(80, 40, 175, 25);
		
		
		JLabel contraseña = new JLabel("Contraseña: ");
		contraseña.setBounds(getBounds());
		
		
		JTextField textoContraseña = new JTextField();
		textoContraseña.setBounds(140, 60, 175, 80);
		
		
		add(usuario);
		add(contraseña);
		add(textoUsuario);
		add(textoContraseña);
		
	}
	
	public static void main(String[] args) {
	
		campoTexto c= new campoTexto();
		c.setTitle("Acceso");
		c.setBounds(300, 250,500, 350);
		c.setVisible(true);
		c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
