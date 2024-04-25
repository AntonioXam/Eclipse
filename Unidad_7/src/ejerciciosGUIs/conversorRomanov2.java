package ejerciciosGUIs;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class conversorRomanov2 extends JFrame implements ActionListener {
	
	
	//atributos
	
	private JTextField TextField1,TextField2;
	private JButton button;
	private JPanel panel;
	private JLabel label1,label2,label3;
	private JPanel panel1,panel2,panel3;
	
	//constructor
	public conversorRomanov2() {

	//creamos panel 1 a la izquierda
	 label1 = new JLabel("Nº DECIMAL",JLabel.CENTER);
	 TextField1 = new JTextField(10);
	 
	 panel1= new JPanel();
	 panel1.setLayout(new GridLayout(0,1,0,10));
	 panel1.add(label1);
	 panel1.add(TextField1);
	 
	 //creamos panel2 boton con imagen
	 button= new JButton(new ImageIcon("C:\\Users\\ibane\\OneDrive\\Documentos\\Eclipse\\img\\flecha.png"));
	 button.setContentAreaFilled(false);
	 button.setBorder(null);
	 button.addActionListener(this);
	 
	 panel2= new JPanel();
	 panel2.setLayout(new GridLayout(0,1,5,5));
	 panel2.add(button);
	 
	 //creamos panel3 a la derecha
	 label2 = new JLabel("Nº ROMANO",JLabel.CENTER);
	 TextField2 = new JTextField(10);
	 
	 panel3=new JPanel();
	 panel3.setLayout(new GridLayout(0,1,0,10));
	 panel3.add(label2);
	 panel3.add(TextField2);
	 
	 
	 //añadimos los paneles a la ventana
	 setLayout(new FlowLayout(FlowLayout.CENTER,20,40));
	 add(panel1);
	 add(panel2);
	 add(panel3);
	 
	 

	
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
		
		conversorRomanov2 c = new conversorRomanov2();
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
