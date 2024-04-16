package ejeciciosJFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import componentes.textArea;

public class ej3 extends JFrame {
	JTextArea area;
	JScrollPane scpanel;
	JLabel etiqueta;
	
	public ej3() {
		
		setLayout(null);
		
		
		area = new JTextArea();
		area.setLineWrap(true);
		
		scpanel = new JScrollPane(area);
		scpanel.setBounds(80, 150, 225, 150);
		add(scpanel);
		
		
	}
	
	public static void main(String[] args) {
		textArea t = new textArea();
		JLabel e= new JLabel("Escribe tus comentarios:");
		t.getContentPane().add(e);
		
		
		e.setBounds(30, -10, 150, 50);
		t.setTitle("Comentarios");
		t.setBounds(20, 20, 330, 250);
		t.setLocationRelativeTo(null);
		t.setVisible(true);
		t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
