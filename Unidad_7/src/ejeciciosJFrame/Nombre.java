package ejeciciosJFrame;

import javax.swing.JLabel;

import javax.swing.*;

public class Nombre extends JFrame {

	private JLabel label;
	
		public Nombre() {
			setLayout(null);
			label= new JLabel("Federico García");
			label.setBounds(0, 15, 150, 30);
			add(label);
			
		}
		
	public static void main(String[] args) {
		Nombre v= new Nombre();
		v.setTitle("Mi nombre");
		v.setSize(300, 100);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		

	}

}
