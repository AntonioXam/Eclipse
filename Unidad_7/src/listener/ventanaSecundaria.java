package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class ventanaSecundaria extends JDialog implements ActionListener {

	private JButton boton;
	private JLabel label;
	
	
	public ventanaSecundaria(ventanaPrincipal parent, boolean modal) {
		super (parent,modal);
		
		setLayout(null);
		setBounds(0,0,250,200);
		setLocationRelativeTo(null);
		
		label= new JLabel("Esta es la ventana secundaria");
		label.setBounds(35, 30, 200, 30);
		add(label);
		
		boton = new JButton("Volver");
		boton.setBounds(40, 80, 150, 30);
		add(boton);
		boton.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			setVisible(false);
		}
		
	}

}
