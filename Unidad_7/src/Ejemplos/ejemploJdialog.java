package Ejemplos;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

public class ejemploJdialog {

	public static void main(String[] args) {


		JDialog v= new JDialog();
		v.setTitle("Ejemplo JDialog");
		v.setSize(300,150);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	}

}