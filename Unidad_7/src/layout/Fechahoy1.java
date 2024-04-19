package layout;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Fechahoy1 extends JFrame{

	private JLabel fecha;
	
	public Fechahoy1() {
		
		fecha= new JLabel();
		fecha.setFont(new Font("Arial",Font.BOLD, 50));
		fecha.setHorizontalAlignment(SwingConstants.CENTER);
		
		setLayout(new BorderLayout(0,0));
		add(fecha,BorderLayout.CENTER);
		
	}
	
	public String FechaActual() {
		
		Date d = new Date();
		GregorianCalendar c= new GregorianCalendar();
		c.setTime(d);
		
		
		int dia=c.get(Calendar.DAY_OF_MONTH);
		int mes= c.get(Calendar.MONTH)+1;
		int anio=c.get(Calendar.YEAR);
		return null;
		
	
	}
	
	public static void main(String[] args) {
		
		

	}

}
