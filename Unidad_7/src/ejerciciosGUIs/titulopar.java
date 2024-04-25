package ejerciciosGUIs;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class titulopar extends JFrame implements ActionListener {
	
	//atributos
	
	private JLabel jLabel;
	private JButton jButton;
	private JTextField jField;
	
	//contructor
	
	public titulopar() {
		
		setLayout(new FlowLayout());
		
		jLabel=new JLabel("Introduce número entero: ");
		add(jLabel);
		jField=new JTextField();
		jField.setColumns(5);
		add(jField);
		jButton=new JButton("Par o Impar");
		add(jButton);
		jButton.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		titulopar t = new titulopar();
		t.setSize(300, 150);
		t.setLocationRelativeTo(null);
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// comprueba si el numero es par o impar
		try {
			if (e.getSource() == jButton) {
			int num = Integer.parseInt(jField.getText());
			if (num % 2 == 0) {
				setTitle("PAR");
			} else {
				setTitle("IMPAR");
			}
		}
		} catch (Exception exception) {
			setTitle("ERROR");
		}
		
		
	}

}
