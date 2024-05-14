package designer;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cifrarydescifrar extends JFrame implements ActionListener {

	/*programa una contraseña y al pulsar un boton la cifre a rot 13 y al pulsar otro  la muestre descifrada*/
	
	//atributos
	private JLabel contraseña;
	private JTextField pass;
	private JButton cifrar;
	private JLabel cifrada;
	private JButton descifrar;
	private JLabel descifrada;
	private JPanel panel;
	
	
	
	
	
	//constructor
	
	public cifrarydescifrar() {
		
		panel = new JPanel();
		panel.setLayout( new GridLayout(3,2,20,20));
		contraseña = new JLabel("Contraseña: ");
		pass = new JTextField(10);
		cifrar = new JButton("Cifrar");
		cifrar.addActionListener(this);
		cifrada = new JLabel("Contraseña cifrada");
		cifrada.setVisible(false);
		descifrar = new JButton("Descifrar");
		descifrar.addActionListener(this);
		descifrada = new JLabel("Contraseña descifrada");
		descifrada.setVisible(false);
		
		
		
		panel.add(contraseña);
		panel.add(pass);
		panel.add(cifrar);
		panel.add(cifrada);
		panel.add(descifrar);
		panel.add(descifrada);
		
		
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		
		add(panel);
		
		
		
		
	}
		
	public String sustitucion(int clave) {

		String contraseña=pass.getText();
		String criptograma="";
		for (int i = 0; i < contraseña.length(); i++) {
			if (contraseña.charAt(i)>='A' && contraseña.charAt(i)<='Z') {
				int caracter=contraseña.charAt(i)+clave;
				if ((char)caracter>'Z') 
					caracter-=26;
				criptograma+=(char)caracter;
			}
			//controlar de la 'a' a la 'z' y que sea circular 
			else if (contraseña.charAt(i)>='a' && contraseña.charAt(i)<='z') {
				int caracter=contraseña.charAt(i)+clave;
				if ((char)caracter>'z') 
					caracter-=26; //restando a la z para volver a emprezar
				criptograma+=(char)caracter;
			}
			else
				criptograma+=contraseña.charAt(i);		// dejar los otros caracteres fuera del rango igual
				
		}
		return criptograma;

	}
	
	
	//método descifrar mensaje rot 13
	
	public String DescifrarSustitucion(int clave) {

		String mensaje=pass.getText();
		String criptograma="";
		for (int i = 0; i < mensaje.length(); i++) {
			if (mensaje.charAt(i)>='A' && mensaje.charAt(i)<='Z') {
				int caracter=mensaje.charAt(i)-clave;
				if ((char)caracter<'A') 
					caracter+=26; //sumando A la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			//controlar de la 'a' a la 'z' y que sea circular 
			else if (mensaje.charAt(i)>='a' && mensaje.charAt(i)<='z') {
				int caracter=mensaje.charAt(i)-clave;
				if ((char)caracter<'a') 
					caracter+=26; //sumando a la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			else
				criptograma+=mensaje.charAt(i);		// dejar los otros caracteres fuera del rango igual

		}
		return criptograma;

	}
	
	
	
	public static void main(String[] args) {
		
		cifrarydescifrar c = new cifrarydescifrar();
		c.setSize(300, 300);
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setVisible(true);
		c.setTitle("Cifrar y Descifrar");
		c.setLocationRelativeTo(null);
		
		
	}
	
	

	
	



	@Override
	public void actionPerformed(ActionEvent e) {
		// cifar y descifrar
		if (e.getSource() == cifrar) {
            cifrada.setVisible(true);
            pass.setText(sustitucion(13));
            }
		else if (e.getSource() == descifrar) {
			descifrada.setVisible(true);
            pass.setText(DescifrarSustitucion(13));
        
		}
		
		}
		
	}

	
	
		
		
	
