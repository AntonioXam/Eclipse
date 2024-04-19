package listener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class colores extends JFrame implements ActionListener {

	JButton azul,rojo,verde,amarillo;

	public colores() {

		setLayout(null);

		azul= new JButton("Azul");
		azul.setBounds(145, 40, 100, 25);
		add(azul);
		azul.addActionListener(this);

		rojo= new JButton("Rojo");
		rojo.setBounds(25, 40, 100, 25);
		add(rojo);
		rojo.addActionListener(this);

		verde= new JButton("Verde");
		verde.setBounds(25, 80, 100, 25);
		add(verde);
		verde.addActionListener(this);

		amarillo = new JButton("Amarillo");
		amarillo.setBounds(145, 80, 100, 25);
		add(amarillo);
		amarillo.addActionListener(this);
	}




	public static void main(String[] args) {
		colores v= new colores();
		v.setTitle("Colores");
		v.setVisible(true);
		v.setSize(280,200);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == azul) 
			getContentPane().setBackground(Color.blue);

		if (e.getSource() == rojo) 
			getContentPane().setBackground(Color.red);
		
		if (e.getSource() == verde) 
			getContentPane().setBackground(Color.green);
		
		if (e.getSource() == amarillo) 
			getContentPane().setBackground(Color.yellow);


	}
}
