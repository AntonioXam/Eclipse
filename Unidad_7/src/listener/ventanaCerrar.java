package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ventanaCerrar extends JFrame implements ActionListener {
	
	JButton boton;
	
	public ventanaCerrar() {
		setLayout(null);
		boton= new JButton("Cerrar");
		boton.setBounds(40, 40, 100, 25);
		add(boton);
		boton.addActionListener(this);
	}

	public static void main(String[] args) {
		
		ventanaCerrar v= new ventanaCerrar();
		v.setVisible(true);
		v.setSize(200, 150);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			System.exit(0);
		}
	}

}
