package ventanaFecha;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class mayorFecha extends JFrame implements ActionListener{

	private JLabel lblDia,lblMes,lblAnio;
	private JTextField txtDia,txtMes,txtAnio;
	private JButton btnAceptar;
	private JTextField MayorMenor;
	
	
	
	
	public mayorFecha() {

		setLayout(new FlowLayout(1, 10, 10));
		
		lblDia = new JLabel("Dia");
		add(lblDia);
		
		txtDia = new JTextField(2);
		add(txtDia);
		
		lblMes = new JLabel("Mes");
		add(lblMes);
		
		txtMes = new JTextField(2);
		add(txtMes);
		
		lblAnio = new JLabel("Año");
		add(lblAnio);
		
		txtAnio = new JTextField(4);
		add(txtAnio);
		
		btnAceptar = new JButton("Aceptar");
		add(btnAceptar);
		btnAceptar.addActionListener(this);
		
		MayorMenor = new JTextField(50);
		MayorMenor.setEditable(false);
		add(MayorMenor);
		
		
		

		
		

	}
	
	
	
	public static void main(String[] args) {
		
		mayorFecha ventana = new mayorFecha();
		ventana.pack();
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setTitle("Mayor o menor de edad");
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			int dia = Integer.parseInt(txtDia.getText());
			int mes = Integer.parseInt(txtMes.getText());
			int anio = Integer.parseInt(txtAnio.getText());

			Fecha intro = new Fecha(dia, mes, anio);
			Fecha f = new Fecha();

			int edad = f.getYear() - anio;
			if (mes > f.getMonth() || (mes == f.getMonth() && dia > f.getDay())) {
				edad--;
			}

			if (!intro.isValid()) {
				MayorMenor.setText("La fecha introducida no corresponde a una fecha correcta");
			}
			if (intro.isValid()) {
				if (edad >= 18)
					MayorMenor.setText("La persona nacida el " + intro.getDay() + " de " + intro.getMonth() + " de "
							+ intro.getYear() + " es MAYOR DE EDAD");
				else
					MayorMenor.setText("La persona nacida el " + intro.getDay() + " de " + intro.getMonth() + " de "
							+ intro.getYear() + " es MENOR DE EDAD");
			}
		}
		
	}
}

