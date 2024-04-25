package listener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class mostrarSaludos extends JFrame implements ActionListener {

	private JButton boton1, boton2;
	private JTextField texto;

	public mostrarSaludos() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		texto = new JTextField(20);
		add(texto);
		
		boton1 = new JButton("Di hola");
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("Di adiós");
		add(boton2);
		boton2.addActionListener(this);
		
		
		

	}


	public static void main(String[] args) {
		/*Confeccionar una ventana que muestre en un campo de texto los mensajes “¡Hola!” o “¡Adiós!”
		en función del botón que se presione.*/
		mostrarSaludos v = new mostrarSaludos();
		v.setTitle("Saludar o despedirse");
		v.setVisible(true);
		v.setSize(300, 200);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			if (e.getSource() == boton1) {
				texto.setText("¡Hola!");
			}
			if (e.getSource() == boton2) {
				texto.setText("¡Adiós!");
			}
		

	}
}
