package componentes;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class textArea extends JFrame {

	JTextArea area;
	JScrollPane scpanel;
	
	
	public textArea() {
		
		setLayout(null);
		
		
		area = new JTextArea();
		area.setLineWrap(true);
		
		scpanel = new JScrollPane(area);
		scpanel.setBounds(30, 30, 225, 150);
		add(scpanel);
	}
	
	public static void main(String[] args) {
		textArea t = new textArea();
		t.setTitle("Ejemplo JTextArea");
		t.setBounds(10, 10, 300, 250);
		t.setLocationRelativeTo(null);
		t.setVisible(true);
		t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
