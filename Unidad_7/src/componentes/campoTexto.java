package componentes;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class campoTexto extends JFrame {

	
	JLabel mensaje;
	JTextField texto;
	
	public campoTexto() {
		
		setLayout(null);
		
		mensaje = new JLabel("Usuario: ");
		mensaje.setBounds(20, 40, 100, 25);
		add(mensaje);
		
		texto = new JTextField();
		texto.setBounds(80, 40, 175, 25);
		add(texto);
	}
	
	public static void main(String[] args) {
	
		campoTexto c= new campoTexto();
		c.setTitle("Ejemplo JTextField");
		c.setBounds(300, 250,300, 150);
		c.setVisible(true);
		c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
