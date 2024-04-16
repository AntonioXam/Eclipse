package ejeciciosJFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class ej1 {

	public static void main(String[] args) {
		
		JFrame v= new JFrame();
		
		JLabel etiqueta = new JLabel("Antonio Ibañez");
		v.getContentPane().add(etiqueta); 
		v.setSize(300, 100);
		v.setTitle("Mi nombre");
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		

	}

}
