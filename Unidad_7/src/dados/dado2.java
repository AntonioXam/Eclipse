package dados;


import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class dado2 extends JFrame implements ActionListener {

	//Componentes ventana
	
	private JLabel tirada;
	private JButton boton;
	
	//Constructor
	
	public dado2() {
		
	tirada= new JLabel(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\uno.png"));
		
		//Creamos el boton y su listener
		boton= new JButton("Tirar dado");
		boton.addActionListener(this);
		
		
		//Añadimos los componentes a la ventana
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		add(tirada);
		add(boton);
		
	}
	public static void main(String[] args) {
		//Creacion de la ventana en el main
		dado2 ventana = new dado2();
		ventana.setTitle("Dado2");
		ventana.setSize(250, 250);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}
	
	// action listnener agregar al boton la funcion de aleatorio
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			int num = (int) (Math.random() * 6) + 1;
			switch (num) {
			case 1: tirada.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\uno.png")); break;
			case 2: tirada.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\dos.png")); break;
			case 3: tirada.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\tres.png")); break;
			case 4: tirada.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\cuatro.png")); break;
			case 5: tirada.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\cinco.png")); break;
			case 6: tirada.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\seis.png")); break;
				
			
			}
		}
		
	}

}
