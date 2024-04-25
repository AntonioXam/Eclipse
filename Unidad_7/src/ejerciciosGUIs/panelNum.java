package ejerciciosGUIs;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class panelNum extends JFrame implements ActionListener{

	private JButton[] numeros;

	public panelNum() {
		numeros = new JButton[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new JButton(String.valueOf(i));
			numeros[i].setFont(new Font("Arial",Font.BOLD,25));
			numeros[i].addActionListener(this);
			
		}
		
		setLayout(new GridLayout(4,3,2,2));
		add(numeros[7]);
		add(numeros[8]);
		add(numeros[9]);
		add(numeros[4]);
		add(numeros[5]);
		add(numeros[6]);
		add(numeros[1]);
		add(numeros[2]);
		add(numeros[3]);
		add(new JLabel("")); //boton vacio)
		add(numeros[0]);
		add(new JLabel("")); //boton vacio)
		
			
	}


	public static void main(String[] args) {
		panelNum panel = new panelNum();
		panel.setTitle("Pulsa un botón");
		panel.setSize(280, 350);
		panel.setVisible(true);
		panel.setLocationRelativeTo(null);
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		if (e.getSource() == numeros[0]) 
			setTitle("CERO");
		if (e.getSource() == numeros[1])
			setTitle("UNO");
		if (e.getSource() == numeros[2])
			setTitle("DOS");
		if (e.getSource() == numeros[3])
			setTitle("TRES");
		if (e.getSource() == numeros[4])
			setTitle("CUATRO");
		if (e.getSource() == numeros[5])
			setTitle("CINCO");
		if (e.getSource() == numeros[6])
			setTitle("SEIS");
		if (e.getSource() == numeros[7])
			setTitle("SIETE");
		if (e.getSource() == numeros[8])
			setTitle("OCHO");
		if (e.getSource() == numeros[9])
			setTitle("NUEVE");
		
		
		}

	}


