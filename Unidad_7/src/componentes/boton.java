package componentes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class boton extends JFrame {

	JButton boton;
	
	
	public boton() {
		
		setLayout(null);
		
		boton = new JButton("BOTÓN");
		boton.setBounds(100,30,100,60);
		add(boton);
		
	}
	
	public static void main(String[] args) {
		 
		boton b = new boton();
		b.setTitle("Ejemplo botón");
		b.setSize(300,150);
		b.setLocationRelativeTo(null);
		b.setVisible(true);
		b.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
