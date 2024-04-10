package Ejemplos;

import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class holaMundoVentana {

	public static void main(String[] args) {
		
		JFrame ventana= new JFrame("Ventanica");
		
		JLabel etiqueta = new JLabel("Hola mundo!!!");
		ventana.getContentPane().add(etiqueta); 
		
		ventana.setSize(300,100);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
