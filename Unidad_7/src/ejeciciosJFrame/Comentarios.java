package ejeciciosJFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Comentarios extends JFrame{

	private JLabel mensaje;
	private JTextArea area;
	private JScrollPane scpanel;
	
	
	public Comentarios() {
		setLayout(null);
		
		mensaje= new JLabel("Escribe tus comentarios:");
		mensaje.setBounds(10, 10, 150, 25);
		add(mensaje);
		
		area= new JTextArea();
		area.setLineWrap(true);
		
		scpanel= new JScrollPane(area);
		scpanel.setBounds(10, 40, 225, 150);
		add(scpanel);
				
	}
	
	public static void main(String[] args) {
		Comentarios v= new Comentarios();
		v.setVisible(true);
		v.setTitle("Comentarios");
		v.setSize(300, 250);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
