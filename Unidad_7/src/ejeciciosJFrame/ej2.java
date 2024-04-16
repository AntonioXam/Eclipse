package ejeciciosJFrame;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

import componentes.ventana_RadioButton;

public class ej2 extends JFrame {
	
	JRadioButton radiomayor,radiomenor;
	ButtonGroup botones;
	
	
	public ej2() {
		
		setLayout(null);
		
	botones= new ButtonGroup();
		
	radiomayor= new JRadioButton("Mayor de edad");
	radiomayor.setBounds(20, 25, 150, 25);
	botones.add(radiomayor);
	radiomenor= new JRadioButton("Menor de edad");
	radiomenor.setBounds(170, 25, 150, 25);
	botones.add(radiomenor);
		
		
		
		add(radiomayor);
		add(radiomenor);
	}

	public static void main(String[] args) {
		
		 ej2 v= new ej2();
		 v.setTitle("Edad");
		v.setBounds(10, 10, 310, 120);
		 v.setLocationRelativeTo(null);
		 v.setVisible(true);
		 v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
