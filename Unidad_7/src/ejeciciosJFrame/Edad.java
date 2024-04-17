package ejeciciosJFrame;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class Edad extends JFrame {

	private ButtonGroup botones;
	private JRadioButton mayor,menor;
	
	public Edad() {
		setLayout(null);
		
		botones=new ButtonGroup();
		mayor=new JRadioButton("Mayor de edad");
		menor= new JRadioButton("Menor de edad",true);
		mayor.setBounds(10, 30, 120, 25);
		menor.setBounds(150, 30, 120, 25);
		botones.add(mayor);
		botones.add(menor);
		
		
		add(mayor);
		add(menor);
	}
	public static void main(String[] args) {
		Edad v= new Edad();
		v.setTitle("Edad");
		v.setVisible(true);
		v.setSize(300,120);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
