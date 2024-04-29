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
		
		cambioColoresCombo ccc = new cambioColoresCombo();
		ccc.setSize(300, 300);
		ccc.setLayout(null);
		ccc.setVisible(true);
		ccc.setLocationRelativeTo(null);
		ccc.setTitle("Cambio de Colores");
		ccc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource()==jComboBox) {
			String selecionado = (String)jComboBox.getSelectedItem();
			
			switch (selecionado) {
			case "rojo":
				getContentPane().setBackground(java.awt.Color.RED);
				break;
				case "azul":
					getContentPane().setBackground(java.awt.Color.BLUE);
					break;
					case "verde":
						getContentPane().setBackground(java.awt.Color.GREEN);
						break;
					case "amarillo":
						getContentPane().setBackground(java.awt.Color.YELLOW);
						break;
						
			}
			
		}
		
	}

}
