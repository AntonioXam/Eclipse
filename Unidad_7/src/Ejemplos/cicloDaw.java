package Ejemplos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class cicloDaw extends JFrame {

	public cicloDaw() {
		setTitle("Vega Media");
		JLabel label = new JLabel("CFGS en Desarrollo de aplicaciones Web");
		add(label);
	}
	
public static void main(String[] args) {
		
		cicloDaw app = new cicloDaw();
		app.pack();
		app.setLocationRelativeTo(null);
		app.setVisible(true);
		app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
