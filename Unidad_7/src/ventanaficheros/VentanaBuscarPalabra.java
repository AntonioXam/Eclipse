package ventanaficheros;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaBuscarPalabra extends JFrame implements ActionListener{

	/*Programa que busque en un archivo de texto una palabra*/


	private JLabel label;
	private JButton button;
	private JTextField textField;

	public VentanaBuscarPalabra() {

		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

		label = new JLabel("Introduce una palabra");
		add(label);

		textField = new JTextField(10);
		add(textField);

		button = new JButton("Pulsa para buscar");
		add(button);
		button.addActionListener(this);

	}
	public static void main(String[] args) {

		VentanaBuscarPalabra v = new VentanaBuscarPalabra();
		v.setSize(400, 200);
		v.setTitle("Buscar palabra");
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button) {
			if(textField.getText().isBlank())
				label.setText("Introduce una palabra");
			else {
				try {
					String word = textField.getText();
					File f =  new File("C:\\ProgramacionTXT\\wordlist.txt");
					boolean encontrado = false;

					Scanner s = new Scanner(f);
					while(s.hasNext() && !encontrado) {
						String linea = s.nextLine();
						if(word.compareToIgnoreCase(linea)==0)
							encontrado = true;
					}
					s.close();

					if(encontrado)
						label.setText("La palabra "+word+" se encuentra en Worldlist");
					else
						label.setText("La palabra "+word+" no se encuentra en Wordlist");

				} catch (FileNotFoundException e1) {
					label.setText("Error con el archivo especificado");
				}
			}
		}

	}

}





