package ventanaficheros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class fecher2 extends JFrame implements ActionListener{

	JLabel label;
	JTextArea area;
	JScrollPane scpanel;
	JButton boton;

	public fecher2() {

		setLayout(null);

		label = new JLabel("TEXTO: ");
		label.setBounds(20, 230, 200, 25);
		add(label);

		area = new JTextArea();
		area.setLineWrap(true);

		scpanel = new JScrollPane(area);
		scpanel.setBounds(20, 20, 800, 800);
		add(scpanel);

		boton = new JButton("BOTON");
		boton.setBounds(920, 190, 100, 25);
		add(boton);
		boton.addActionListener(this);

	}

	public static void main(String[] args) {

		fecher2 f = new fecher2();
		// f.setResizable(false);
		f.setSize(300,400);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==boton) {
			if(!area.getText().isBlank())
				label.setText("Borra el texto");
			else {
				String cad = "";
				File fil = new File("C:\\ProgramacionTXT\\rc.txt");
				try {
					Scanner sc = new Scanner(fil);
					while(sc.hasNextLine()) {
						cad = cad+sc.nextLine()+"\n";
					}
					area.setText(cad);
					sc.close();
				} catch (Exception e1) {
					label.setText("Error");

				}
			}


		}

	}

}
