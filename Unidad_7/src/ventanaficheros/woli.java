package ventanaficheros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class woli extends JFrame implements ActionListener{

	JButton boton;
	JTextField texto1;
	JLabel label;

	public woli() {

		setLayout(null);

		texto1 = new JTextField();
		texto1.setBounds(80, 30, 130, 30);
		add(texto1);

		boton = new JButton("Traduccion");
		boton.setBounds(80, 100, 130, 30);
		add(boton);
		boton.addActionListener(this);

		label = new JLabel("");
		label.setBounds(80, 160, 200, 30);
		add(label);

	}

	public static void main(String[] args) {

		woli w = new woli();
		w.setResizable(false);
		w.setTitle("Traducir");
		w.setSize(300,250);
		w.setLocationRelativeTo(null);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==boton) {
			if(texto1.getText().isBlank())
				label.setText("Introduce una palabra");
			else {
				try {
					String word = texto1.getText();
					File f =  new File("C:\\ProgramacionTXT\\dictionary.txt");
					boolean encontrado = false;

					Scanner s = new Scanner(f);

					while (s.hasNext() && !encontrado) {
						String linea = s.nextLine();
						String palabra = linea.substring(0, linea.indexOf('='));
						if(word.compareToIgnoreCase(palabra) == 0) {
							String traduccion = linea.substring(linea.indexOf('=')+1);
							label.setText(traduccion);
							encontrado = true;
						}
					}
					s.close();

					if(!encontrado)
						label.setText("La palabra no se encuentra en el diccionario");
				} catch (Exception e1) {
					label.setText(e1.getMessage());
				}

			}
		}

	}

}
