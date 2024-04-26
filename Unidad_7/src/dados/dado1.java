package dados;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class dado1 extends JFrame implements ActionListener {

	//Componentes ventana
	
	private JLabel tirada;
	private JButton boton;
	
	//Constructor
	
	public dado1() {
		
		//Creamos la etiqueta que contendrá el número correspondiente a la tirada del dado
		tirada= new JLabel("?");
		tirada.setHorizontalAlignment(SwingConstants.CENTER);
		tirada.setFont(new Font("Comic Sans MS",Font.BOLD,100));
		
		//Creamos el boton y su listener
		boton= new JButton("Tirar dado");
		boton.addActionListener(this);
		
		
		//Añadimos los componentes a la ventana
		setLayout(new BorderLayout(0,0));
		add(tirada,BorderLayout.CENTER);
		add(boton,BorderLayout.SOUTH);
		
		
	}
	public static void main(String[] args) {
		//Creacion de la ventana en el main
		dado1 ventana = new dado1();
		ventana.setTitle("Dado1");
		ventana.setSize(300, 300);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}
	
	// action listnener agregar al boton la funcion de aleatorio
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			int num = (int) (Math.random() * 6) + 1;
			switch (num) {
			case 1: tirada.setText("1"); break;
			case 2: tirada.setText("2"); break;
			case 3: tirada.setText("3"); break;
			case 4: tirada.setText("4"); break;
			case 5: tirada.setText("5"); break;
			case 6: tirada.setText("6"); break;
				
			
			}
		}
		
	}

}
