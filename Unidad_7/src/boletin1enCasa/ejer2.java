package boletin1enCasa;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ejer2 extends JFrame implements ActionListener {

	/* Realiza una aplicación que muestre la tabla de multiplicar de un número entre 1 y 10 que pueda
introducir el usuario. Debes controlar los posibles errores en la introducción del número.*/
	
	private JLabel numero;
	private JTextField campo;
	private JButton boton;
	private JTextArea area;
	
	public ejer2() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		
		numero = new JLabel("Número");
		add(numero);
		
		campo = new JTextField(10);
		add(campo);
		
		boton = new JButton("Generar tabla");
		add(boton);
		boton.addActionListener(this);
		
		area = new JTextArea(11, 26);
		add(area);
		
		
		
		

		

	}
	public static void main(String[] args) {
		
		ejer2 ventana = new ejer2();
		ventana.setSize(320, 300);
		ventana.setTitle("Tabla de multiplicar");
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int num = 0;
		try {
			num = Integer.parseInt(campo.getText());
			if (num < 1 || num > 10) {
				area.setText("El número debe estar entre 1 y 10");
			} else {
				area.setText("");
				for (int i = 1; i <= 10; i++) {
					area.append(num + " x " + i + " = " + (num * i) + "\n");
				
				}
			}
		} catch (NumberFormatException e1) {
			area.setText("Introduce un número válido");
		}
	}

}
