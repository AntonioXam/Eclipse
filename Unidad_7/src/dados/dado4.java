package dados;




import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;



public class dado4 extends JFrame implements ActionListener {

	//Componentes ventana
	
	
	private JButton boton;
	
	//Constructor
	
	public dado4() {
		
	
		
		//Creamos el boton y su listener
		boton= new JButton(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\dadoint.png"));
		boton.addActionListener(this);
		
		
		//Añadimos los componentes a la ventana
		setLayout(new GridLayout(1,0));
		add(boton);
		
	}
	public static void main(String[] args) {
		//Creacion de la ventana en el main
		dado4 ventana = new dado4();
		ventana.setTitle("Dado4");
		ventana.setSize(325, 325);
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
			case 1: boton.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\dado1.png")); break;
			case 2: boton.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\dado2.png")); break;
			case 3: boton.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\dado3.png")); break;
			case 4: boton.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\dado4.png")); break;
			case 5: boton.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\dado5.png")); break;
			case 6: boton.setIcon(new ImageIcon("C:\\Users\\AntonioI\\Documents\\Eclipse\\img\\dados\\dado6.png")); break;
				
			
			}
		}
		
	}

}
