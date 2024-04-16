package componentes;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ventana_ComboBox extends JFrame {

	JComboBox combo;
	
	
	public ventana_ComboBox() {
		
		setLayout(null);
		
		combo= new JComboBox();
		combo.setBounds(10, 10, 120, 20);
		combo.addItem("Rojo");
		combo.addItem("Verde");
		combo.addItem("Azul");
		combo.addItem("Amarillo");
		combo.addItem("Negro");
		combo.addItem("Blanco");
		combo.addItem("Naranja");
		add(combo);
	}
	public static void main(String[] args) {
		ventana_ComboBox v= new ventana_ComboBox();
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		v.setTitle("Ejemplo COMBOBOX");
		v.setBounds(10, 10, 320, 150);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
	}

}
