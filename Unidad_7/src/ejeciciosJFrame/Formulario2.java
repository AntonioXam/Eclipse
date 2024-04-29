package ejeciciosJFrame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario2 extends JFrame {

	public Formulario2() {
		
		setLayout(new GridLayout(4, 2, 10, 10));
		
		add(new JLabel("Nombre de usuario: ", JLabel.RIGHT));
		add(new JTextField(""));
		add(new JLabel("Correo electrónico: ", JLabel.RIGHT));
		add(new JTextField(""));
		add( new JLabel("Indica tu pais de origen: ", JLabel.RIGHT));
		String[] paises = {"España", "México", "Argentina", "Colombia", "Chile", "Perú", "Venezuela", "Uruguay", "Paraguay", "Ecuador"};
		add(new JComboBox(paises));
		add(new JCheckBox("Acepto las condiciones de uso"));
		add(new JButton("Aceptar"));
		
	}
	public static void main(String[] args) {
			
		Formulario2 formulario2 = new Formulario2();
		formulario2.setVisible(true);
		formulario2.pack();
		formulario2.setResizable(false);
		formulario2.setLocationRelativeTo(null);
		formulario2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario2.setTitle("Formulario 2");

	}

}
