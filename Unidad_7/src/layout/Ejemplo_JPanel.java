package layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Ejemplo_JPanel extends JFrame{

	JPanel panel1,panel2;
	
	public Ejemplo_JPanel() {
		
		panel1= new JPanel();
		panel1.setLayout(new GridLayout(3,3));
		for (int i = 1; i < 10; i++) {
			panel1.add(new JButton(""+i));
			
		}
		
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(panel1,BorderLayout.CENTER);
		panel2.add(new JButton("Cancelar"), BorderLayout.SOUTH);
		
		
		setLayout(new BorderLayout());
		add(panel2,BorderLayout.EAST);
		add(new JButton("Aceptar"),BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		Ejemplo_JPanel p= new Ejemplo_JPanel();
		p.setTitle("Varios paneles");
		p.setVisible(true);
		p.setSize(300, 200);
		p.setLocationRelativeTo(null);
		p.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
