package ejerciciosGUIs;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BuscarPalabra extends JFrame implements ActionListener {
	/*Realiza una aplicación que permita buscar una palabra en un texto. Para ello, debemos poder
introducir un texto en un control de tipo JTextArea, y una palabra en un JTextField. Al presionar
un botón, nos mostrará en el título de la ventana si el texto contiene o no la palabra
introducida.*/

	private JLabel texto, palabra;
	private JTextArea area;
	private JScrollPane scpanel;
	private JTextField campo;
	private JButton boton;

	public BuscarPalabra() {

		setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

		texto = new JLabel("Escribe el texto: ");
		add(texto);

		area = new JTextArea(6, 37);
		area.setLineWrap(true);
		scpanel = new JScrollPane(area);
		add(scpanel);


		palabra = new JLabel("Palabra a buscar: ");
		add(palabra);

		campo = new JTextField(15);
		add(campo);

		boton = new JButton("Buscar");
		add(boton);
		boton.addActionListener(this);

	}
	public static void main(String[] args) {

		BuscarPalabra ventana = new BuscarPalabra();
		ventana.setSize(465, 230);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String texto = area.getText();
		String palabra = campo.getText();

		if (palabra.length() == 0) {
			setTitle("No has introducido ninguna palabra.");
		} else {
			if (texto.indexOf(palabra)==-1) {
				setTitle("La palabra no se encuentra en el texto.");
			} else {
				setTitle("La palabra se encuentra en el texto.");
			}
		}

	}

}
