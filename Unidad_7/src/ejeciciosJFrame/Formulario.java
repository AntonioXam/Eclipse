package ejeciciosJFrame;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Formulario extends JFrame {

	private JLabel usuario,pass;
	private JTextField campo1,campo2;
	private JCheckBox check;
	private JButton boton;
	
	
	public Formulario() {
		setLayout(null);
		usuario= new JLabel("Usuario: ");
		usuario.setBounds(20, 20, 100, 25);
		add(usuario);
		
		campo1= new JTextField();
		campo1.setBounds(100, 20, 175, 25);
		add(campo1);
		
		pass= new JLabel("Contraseña: ");
		pass.setBounds(20, 60, 100, 25);
		add(pass);
		
		campo2= new JTextField();
		campo2.setBounds(100, 60, 175, 25);
		add(campo2);
		
		check= new JCheckBox("Recordar usuario");
		check.setBounds(95, 100, 150, 25);
		add(check);
		
		boton= new JButton("Entrar");
		boton.setBounds(120, 140, 120, 25);
		add(boton);
	}
	public static void main(String[] args) {
		Formulario v = new Formulario();
		v.setVisible(true);
		v.setSize(350, 225);
		v.setLocationRelativeTo(null);
		v.setTitle("Acceso");
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
