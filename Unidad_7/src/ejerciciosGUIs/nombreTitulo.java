
package ejerciciosGUIs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class nombreTitulo extends JFrame implements ActionListener {

	//ventana con campo de texto y boton al pulsar aparezca en el titulo de la ventana
	private JButton boton;
	private JTextField campotexto;
	private JLabel user;
	
	
	
	//constructor
	public nombreTitulo() {
		
		setLayout(new FlowLayout());
		
		
		user=new JLabel("Nombre: ");
		add(user);
		campotexto=new JTextField();
		campotexto.setColumns(20);
		add(campotexto);
		boton=new JButton("Aceptar");
		boton.addActionListener(this);
		add(boton);
		
		
		
	}
	
	public static void main(String[] args) {
		nombreTitulo l = new nombreTitulo();
		l.setSize(350, 150);
		l.setLocationRelativeTo(null);
		l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			String nombre = campotexto.getText();
		setTitle(nombre);
		}
		
		
	}
}
