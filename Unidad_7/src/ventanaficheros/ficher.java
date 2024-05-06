package ventanaficheros;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ficher extends JFrame implements ActionListener{

	/*Progama que lea un textfield y al pulsar un boton lo guarde en un archivo de texto*/
	
	private JTextField texto;
	private JButton boton;
	private JLabel label,label2;
	
	public ficher() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		label2 = new JLabel("Introduce un texto: ");
		add(label2);
		
		texto = new JTextField(20);
		add(texto);
		
		boton = new JButton("Guardar");
		add(boton);
		boton.addActionListener(this);
		
		label = new JLabel("");
		add(label);
		
		
	}
	public static void main(String[] args) {
		
		ficher f = new ficher();
		f.setResizable(false);
		f.setTitle("Guardar texto");
		f.setSize(300, 200);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==boton) {
            if(texto.getText().isBlank())
                label.setText("Introduce un texto");
            else {
                try {
                    String text = texto.getText();
                    FileWriter fw = new FileWriter("C:\\ProgramacionTXT\\textoguardado.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println(text);
                    pw.close();
                    label.setText("Texto guardado");
                    
                } catch (Exception e2) {
                    label.setText("Error al guardar el texto");
                }
            }
		
		}
	}
}
		
	


