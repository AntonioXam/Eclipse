package layout;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class horaHoy1 extends JFrame {

	//Componentes ventana
	//mostrar en ventana la hora actual
	
	private JLabel hora;
	
	//Constructor
	
	public horaHoy1() {

		hora = new JLabel();
		hora.setFont(new Font("Arial",Font.BOLD, 50));
		hora.setHorizontalAlignment(SwingConstants.CENTER);
		setLayout(new FlowLayout(FlowLayout.CENTER,25,25));
		add(hora);

	}
	
	//Metodo que devuelve la hora actual en formato hh:mm:ss
	
	public String horaActual() {

		Date d = new Date();
		GregorianCalendar c= new GregorianCalendar();
		c.setTime(d);
		
		String hora = "";
		int h, m, s;
		
		h = c.get(GregorianCalendar.HOUR_OF_DAY);
		m = c.get(GregorianCalendar.MINUTE);
		s = c.get(GregorianCalendar.SECOND);
	

		if (h < 10)
			hora += "0";
		hora += h + ":";
		if (m < 10)
			hora += "0";
		hora += m + ":";
		if (s < 10)
			hora += "0";
		hora += s;

		return hora;
	}
	
	//Metodo que actualiza la hora en la etiqueta
	
	public void actualizarHora() {
		hora.setText(horaActual());
	}
	
  
	
	
	public static void main(String[] args) {
		
		horaHoy1 ventana = new horaHoy1();
		ventana.setTitle("Hora Actual");
		ventana.setSize(300, 150);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

		while (true) {
			ventana.actualizarHora();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		

	}

}
