package ejerciciosGUIs;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventanaMulti extends JFrame implements ActionListener {

	private JTextField num1,num2,res;
	private JLabel por,igual;
	private JButton boton;

	public ventanaMulti() {

		setLayout(new FlowLayout(FlowLayout.CENTER,30,30));

		num1 = new JTextField(5);
		add(num1);

		por = new JLabel("X");
		add(por);

		num2 = new JTextField(5);
		add(num2);

		igual = new JLabel("=");
		add(igual);

		res = new JTextField(5);
		add(res);

		boton = new JButton("Multiplicar");
		add(boton);
		boton.addActionListener(this);



	}

	public static void main(String[] args) {
		ventanaMulti v = new ventanaMulti();
		v.setTitle("Multiplicación de dos números");
		v.pack();
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			// multiplica dos numeros y muestra resultado
			if (e.getSource() == boton) {
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				int resultado = n1 * n2;
				res.setText(String.valueOf(resultado));
			}
		} catch (Exception exception) {
			res.setText("ERROR");
		}


	}

}
