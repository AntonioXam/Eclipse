package ventanaficheros;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class leerficher extends JFrame implements ActionListener{

	/*programa que lea un archivo de texto y al dar a un boton lo muestre en un textarea*/
	
	private JTextArea area;
	private JScrollPane scpanel;
	private JButton boton;
	private JLabel label;
	
	public leerficher() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		area = new JTextArea(10, 30);
		area.setLineWrap(true);
		scpanel = new JScrollPane(area);
		add(scpanel);
		
		boton = new JButton("Leer");
		add(boton);
	    boton.addActionListener(this);
	    
	    label = new JLabel("");
	    add(label);
	    
		
	}
	public static void main(String[] args) {
		
		leerficher f = new leerficher();
		f.setResizable(false);
		f.setTitle("Leer archivo");
		f.setSize(400, 300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == boton) {

			if (!area.getText().isEmpty()) {
				label.setText("Borra el texto");
					
			
				} else {
					File f = new File("C:\\ProgramacionTXT\\textoguardado.txt");
					
					try {
						Scanner sc = new Scanner(f);
						while (sc.hasNextLine()) {
							String linea = sc.nextLine();
							area.append(linea + "\n");
						}
						sc.close();
					} catch (Exception e2) {
						label.setText("El sistema no encuentra el fichero");
					}
			}
				
			
			
			
		
            
		}

	}
}

