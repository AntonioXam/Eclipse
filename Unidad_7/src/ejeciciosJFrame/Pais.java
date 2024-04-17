package ejeciciosJFrame;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Pais extends JFrame{

	private JLabel nombre,pais;
	private JTextField campo;
	private JComboBox combo;
	
	public Pais() {
		setLayout(null);
		
		nombre = new JLabel("Nombre y apellidos: ");
		nombre.setBounds(10, 10, 150, 25);
		add(nombre);
		
		campo= new JTextField();
		campo.setBounds(10, 40, 150, 30);
		add(campo);
		
		pais= new JLabel("Indica tu país de origen: ");
		pais.setBounds(10, 80, 150, 25);
		add(pais);
		
		combo= new JComboBox();
		combo.setBounds(10, 110, 150, 30);
		combo.addItem("España");
		combo.addItem("Francia");
		combo.addItem("Italia");
		combo.addItem("Alemania");
		add(combo);
		
	}
	public static void main(String[] args) {
		Pais v = new Pais();
		v.setVisible(true);
		v.setSize(225, 275);
		v.setLocationRelativeTo(null);
		v.setTitle("País");
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
