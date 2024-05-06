package ventanaficheros;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Agenda extends JFrame implements ActionListener {
	/* Convertir agenda a modo ventana Swing y guardar en un fichero*/
	
	JButton boton;
	JTextField texto1;
	JTextField texto2;
	JLabel label,label2,label3;
	
	public Agenda() {

		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		
		label2 = new JLabel("Introduce un nombre");
		add(label2);
		
		
		texto1 = new JTextField(20);
		add(texto1);
		
		label3 = new JLabel("Introduce un telefono");
		add(label3);
		
		texto2 = new JTextField(20);
		add(texto2);
		
		boton = new JButton("Guardar");
		add(boton);
			
		boton.addActionListener(this);	
		
		label = new JLabel("");
		add(label);
		
		
		

	}
	
	public static void main(String[] args) {

		Agenda a = new Agenda();
		
		a.setTitle("Agenda");
		a.setResizable(false);
		a.setSize(430, 200);
		a.setLocationRelativeTo(null);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==boton) {
            if(texto1.getText().isBlank() || texto2.getText().isBlank())
                label.setText("Introduce un nombre y un telefono");
            else {
                try {
                    String nombre = texto1.getText();
                    String telefono = texto2.getText();
                    File f =  new File("C:\\ProgramacionTXT\\agenda.txt");
                    FileWriter fw = new FileWriter(f, true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println(nombre + " " + telefono);
                    pw.close();
                    label.setText("Guardado");
                } catch (Exception e2) {
                    label.setText("Error");
                }
            }
        }
    }
		
	}


