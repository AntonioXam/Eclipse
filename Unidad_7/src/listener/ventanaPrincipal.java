package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class ventanaPrincipal extends JFrame implements ActionListener {

	
	private JLabel label;
	private JButton boton;
	
	
	public ventanaPrincipal() {
		
		setLayout(null);
		
		label= new JLabel("Esta es la ventana principal");
		label.setBounds(35, 30, 200, 30);
		add(label);
		
		boton= new JButton("Haz clic aquí");
		boton.setBounds(40, 80, 150, 30);
		add(boton);
		boton.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		ventanaPrincipal v= new ventanaPrincipal();
		v.setVisible(true);
		v.setSize(250, 200);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			ventanaSecundaria sec = new ventanaSecundaria(this,true);
			sec.setVisible(true);
		}
		
	}

}
