package ventanaficheros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class fecher extends JFrame implements ActionListener{
	
	JLabel label;
	JTextField texto;
	JButton boton;

	public fecher() {

		setLayout(null);
		
		label = new JLabel("TEXTO: ");
		label.setBounds(20, 40, 200, 25);
		add(label);
		
		texto = new JTextField();
		texto.setBounds(20, 100, 100, 25);
		add(texto);
		
		boton = new JButton("BOTON");
		boton.setBounds(60, 130, 100, 25);
		add(boton);
		boton.addActionListener(this);

	}

	public static void main(String[] args) {

		fecher f = new fecher();
		f.setResizable(false);
		f.setSize(300,400);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==boton) {
			if(texto.getText().isBlank())
				label.setText("Introduce un texto");
			else {
				FileWriter fw = null;
				PrintWriter pw = null;
				try {
					fw = new FileWriter ("C:\\ProgramacionTXT\\rc.txt",true);
					pw = new PrintWriter(fw);
					String cad = texto.getText();
					pw.println(cad);
					
				} catch (IOException e1) {
					label.setText("Error");
				}finally {
					try {
						if(fw!=null)
							fw.close();
					} catch (Exception e2) {
						label.setText("Error2");
					}
				}
			}
			
			
		}
		
	}

}
