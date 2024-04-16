package componentes;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ventana_CheckBox extends JFrame{

		JCheckBox check1,check2;
	
	
	public ventana_CheckBox() {
		
		setLayout(null);
		
		
		check1= new JCheckBox("Pulsa para activar");
		check2 =new JCheckBox("Pulsa para desactivar",true);
		check1.setBounds(60, 20, 150, 25);
		check2.setBounds(60, 60, 150, 25);
		add(check1);
		add(check2);
	}

	public static void main(String[] args) {
		ventana_CheckBox c= new ventana_CheckBox();
		
		c.setTitle("Ejemplo Checkbox");
		c.setBounds(100, 100, 300, 150);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
