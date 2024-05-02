package boletin1enCasa;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ejer1 extends JFrame implements ActionListener {
		/*Implementa una ventana con tres botones enumerados del 1 al 3, de forma que cuando presiones un
botón, aparezca el número escrito en letras en el título de la ventana. Haz uso del Layout Manager
adecuado para que, si con el ratón modificas las dimensiones de la ventana, el tamaño de los botones
se ajusten al ancho/alto de ésta.*/
	
	private JButton boton1, boton2, boton3;
	
	
	public ejer1() {
		setLayout(new GridLayout(1,1,5,5));
		
		boton1 = new JButton("1");
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("2");
		add(boton2);
		boton2.addActionListener(this);
		
		boton3 = new JButton("3");
		add(boton3);
		boton3.addActionListener(this);
		
		
		
	
	}
	
	
	
	public static void main(String[] args) {
		ejer1 ventana = new ejer1();
		ventana.setSize(300, 200);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == boton1) {
			setTitle("Uno");
		}
		if (e.getSource() == boton2) {
			setTitle("Dos");
		}
		if (e.getSource() == boton3) {
			setTitle("Tres");
		}
		
	}

}
