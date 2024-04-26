package itemListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class cambioColoresCombo extends JFrame implements ItemListener {

	private JComboBox<String> jComboBox;
	
	public cambioColoresCombo() {
		
		setLayout(null);
		
		jComboBox= new JComboBox<String>();
		jComboBox.setBounds(50, 20, 150, 25);
		jComboBox.addItem("");
		jComboBox.addItem("rojo");
		jComboBox.addItem("azul");
		jComboBox.addItem("verde");
		jComboBox.addItem("amarillo");
		add(jComboBox);
		jComboBox.addItemListener(this);
	
	}
	
	
	public static void main(String[] args) {
		

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource()==jComboBox) {
			String selecionado = (String)jComboBox.getSelectedItem();
			
			
		}
		
	}

}
