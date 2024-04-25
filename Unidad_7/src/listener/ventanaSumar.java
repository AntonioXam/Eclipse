package listener;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventanaSumar extends JFrame implements ActionListener {

	//sumar dos numeros y mostrar resultado en el titulo
	
	//atributos
	private JTextField num1,num2;
	private JButton sumar;
	private JLabel mas;
	
	//constructor
	public ventanaSumar() {

		setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
		
		
		num1 = new JTextField(5);
		add(num1);
		
		mas = new JLabel("+");
		add(mas);
		
		num2 = new JTextField(5);
		add(num2);
		
		sumar = new JButton("Sumar");
		add(sumar);
		sumar.addActionListener(this);
		
		
	}
	
	
	
	public static void main(String[] args) {
		//ventasumar numeros y resultado en el titulo
		ventanaSumar v = new ventanaSumar();
		v.setTitle("Suma de dos números");
		v.pack();
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// sumar dos numeros y mostrar resultado en el titulo
		try {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			setTitle("Resultado: " + (n1 + n2));
		} catch (Exception e2) {
			setTitle("Error");
		}
		
	}

}
