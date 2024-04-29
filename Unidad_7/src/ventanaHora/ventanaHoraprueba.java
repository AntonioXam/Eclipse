package ventanaHora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;

public class ventanaHoraprueba extends JFrame implements ActionListener {

	private JLabel horaJLabel;
	private JButton btnHora;
	
	
	public ventanaHoraprueba() {
		setLayout(new FlowLayout(1, 10, 10));

		horaJLabel = new JLabel(hora());
		add(horaJLabel);
		horaJLabel.setFont(new Font("Arial", Font.BOLD, 50));
		horaJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
	    btnHora = new JButton("Pulsar ver hora actual");
	            add(btnHora);
	            btnHora.addActionListener(this);
		
		
	}
	
	public  String hora() {
		
		Date d = new Date();
		GregorianCalendar c= new GregorianCalendar();
		c.setTime(d);
		
		int hora=c.get(GregorianCalendar.HOUR_OF_DAY);
		int minutos=c.get(GregorianCalendar.MINUTE);
		int segundos=c.get(GregorianCalendar.SECOND);
		
		String formato="";
		if (hora < 10)
			formato += "0";
		formato += hora;
		formato += ":";
		if (minutos < 10)
			formato += "0";
		formato += minutos;
		formato += ":";
		if (segundos < 10)
			formato += "0";
		formato += segundos;
		
		return formato;
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ventanaHoraprueba ventana = new ventanaHoraprueba();
		ventana.hora();
		ventana.setVisible(true);
		ventana.pack();
		ventana.setTitle("Hora");
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnHora) {
		    horaJLabel.setText(hora());
			
				
		}
	}

}
