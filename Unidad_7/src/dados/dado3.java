package dados;



import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;



public class dado3 extends JFrame implements ActionListener {

	//Componentes ventana
	
	
	private JButton boton;
	
	//Constructor
	
	public dado3() {
		
	
		
		//Creamos el boton y su listener
		boton= new JButton("?");
		boton.setFont(new Font("Comic Sans MS",Font.BOLD,100));
		boton.addActionListener(this);
		
		
		//Añadimos los componentes a la ventana
		setLayout(new GridLayout(1,0));
		add(boton);
		
	}
	public static void main(String[] args) {
		//Creacion de la ventana en el main
		dado3 ventana = new dado3();
		ventana.setTitle("Dado3");
		ventana.setSize(250, 250);
		ventana.setResizable(false);
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
			case 1: boton.setText("1");; break;
			case 2: boton.setText("2"); break;
			case 3: boton.setText("3"); break;
			case 4: boton.setText("4"); break;
			case 5: boton.setText("5"); break;
			case 6: boton.setText("6"); break;
				
			
			}
		}
		
	}

}
