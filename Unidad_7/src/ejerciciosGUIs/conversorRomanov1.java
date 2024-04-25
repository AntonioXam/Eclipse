package ejerciciosGUIs;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class conversorRomanov1 extends JFrame implements ActionListener {
	
	
	//atributos
	
	private JTextField TextField1,TextField2;
	private JButton button;
	private JPanel panel;
	
	//constructor
	public conversorRomanov1() {

		TextField1= new JTextField(10);
		TextField2= new JTextField(10);
		button = new JButton("Convertir");
		button.addActionListener(this);

		panel= new JPanel();
		panel.setLayout(new GridLayout(2,3,15,5));
		panel.add(new JLabel("Nº Decimal:",JLabel.CENTER));
		panel.add(new JLabel(" "));
		panel.add(new JLabel("Nº Romano:",JLabel.CENTER));
		panel.add(TextField1);
		panel.add(button);
		panel.add(TextField2);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		add(panel);

	
	}
	
	private String decimalToRomanoString (int dato) {
		int d=dato;
		String s="";
		while (d>0) {
			if (d >= 1000) {
				s += "M";
				d -= 1000;
			} else if (d >= 900) {
				s += "CM";
				d -= 900;
			} else if (d >= 500) {
				s += "D";
				d -= 500;
			} else if (d >= 400) {
				s += "CD";
				d -= 400;
			} else if (d >= 100) {
				s += "C";
				d -= 100;
			} else if (d >= 90) {
				s += "XC";
				d -= 90;
			} else if (d >= 50) {
				s += "L";
				d -= 50;
			} else if (d >= 40) {
				s += "XL";
				d -= 40;
			} else if (d >= 10) {
				s += "X";
				d -= 10;
			} else if (d >= 9) {
				s += "IX";
				d -= 9;
			} else if (d >= 5) {
				s += "V";
				d -= 5;
			} else if (d >= 4) {
				s += "IV";
				d -= 4;
			} else if (d >= 1) {
				s += "I";
				d -= 1;
			}
			
		}
		return s;
	}
	
	

	public static void main(String[] args) {
		
		conversorRomanov1 c = new conversorRomanov1();
		c.pack();
		c.setTitle("Conversor Decimal > Romano");
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == button) {
				int num = Integer.parseInt(TextField1.getText());
				TextField2.setText(decimalToRomanoString(num));
			}
		} catch (Exception exception) {
			TextField2.setText("ERROR");
		}
		
	}

}
