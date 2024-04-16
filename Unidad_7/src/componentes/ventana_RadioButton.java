package componentes;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class ventana_RadioButton extends JFrame {

	JRadioButton radio1,radio2;
	ButtonGroup grupoBotones;
	
	
	public ventana_RadioButton() {
		
		setLayout(null);
		
		grupoBotones= new ButtonGroup();
		
		radio1=new JRadioButton("Hombre");
		radio1.setBounds(50, 20, 100, 25);
		grupoBotones.add(radio1);
		radio2=new JRadioButton("Mujer",true);
		radio2.setBounds(50, 60, 100, 25);
		grupoBotones.add(radio2);
		
		
		
		add(radio1);
		add(radio2);
	}
	public static void main(String[] args) {
		 ventana_RadioButton v= new ventana_RadioButton();
		 v.setTitle("Ejemplo RADIO BUTTON");
		 v.setBounds(10, 10, 330, 150);
		 v.setLocationRelativeTo(null);
		 v.setVisible(true);
		 v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
