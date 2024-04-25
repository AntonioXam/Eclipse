package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
		
		setLayout(new FlowLayout(FlowLayout.CENTER,25,25));
		add(fecha);
		
	}
	
	public String FechaActual() {
		
		Date d = new Date();
		GregorianCalendar c= new GregorianCalendar();
		c.setTime(d);
		
		
		int dia=c.get(Calendar.DAY_OF_MONTH);
		int diasem= c.get(Calendar.DAY_OF_WEEK);
		int mes= c.get(Calendar.MONTH)+1;
		int anio=c.get(Calendar.YEAR);
		
		
		
		//formato de la fecha en dd/mm/aaaa con 0 delante
		
		String fecha="";
		
		switch (diasem) {
		case Calendar.SUNDAY: fecha="Domingo "; break;
		case Calendar.MONDAY: fecha="Lunes "; break;
		case Calendar.TUESDAY: fecha="Martes "; break;
		case Calendar.WEDNESDAY: fecha="Miercoles "; break;
		case Calendar.THURSDAY: fecha="Jueves "; break;
		case Calendar.FRIDAY: fecha="Viernes "; break;
		case Calendar.SATURDAY: fecha="Sabado "; break;
		
		}
		if (dia < 10)
			fecha+="0";
		fecha+=dia;
		fecha+="/";
		if (mes < 10)
			fecha += "0";
		fecha+=mes;
		fecha+="/";
		fecha+=anio;
		return fecha;
		
		
	
	}
	
	
	
	public static void main(String[] args) {
		Fechahoy1 f = new Fechahoy1();
		f.fecha.setText(f.FechaActual());
		f.setTitle("Fecha de Hoy");
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
