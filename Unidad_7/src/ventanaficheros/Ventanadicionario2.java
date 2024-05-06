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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventanadicionario2 extends JFrame implements ActionListener{
	/*programa que lea un texto que contiene un diccionario con tradcucciones en ingles y espanol y al dar a un boton lo muestre en un textarea*/





	private JLabel label;
	JButton boton;
	private JTextField campoField;

	public Ventanadicionario2() {


		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

		label = new JLabel("Introduce una palabra");
		add(label);

		campoField = new JTextField(20);
		add(campoField);

		boton = new JButton("Traducir");
		add(boton);
		boton.addActionListener(this);
	}


	public static void main(String[] args) {

		Ventanadicionario2 v = new Ventanadicionario2();
		v.setTitle("Diccionario");
		v.setSize(300, 300);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		v.setResizable(false);




	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/* traducir ahora de español a ingles*/
		if(e.getSource()==boton) {
            if(campoField.getText().isBlank())
                label.setText("Introduce una palabra");
            else {
                try {
                    String word = campoField.getText();
                    File f =  new File("C:\\ProgramacionTXT\\dictionary.txt");
                    boolean encontrado = false;

                    Scanner s=new Scanner(f);
                    while (s.hasNextLine() && !encontrado) {
                        String linea = s.nextLine();
                        String palabra=linea.substring(linea.indexOf('=')+1);
                        if (word.compareToIgnoreCase(palabra)==0) { 
                            String traduccion=linea.substring(0,linea.indexOf('='));
                            label.setText("La traducción en inglés: "+traduccion);
                            encontrado=true;
                        }
                    }
                    s.close();

                    if (!encontrado) {
                    	 label.setText("No se ha encontrado en dictionary");
                    }

                } catch (FileNotFoundException e1) {
                	 label.setText("Se ha producido un error en el archivo");
                }

            }
        }

	}
}
