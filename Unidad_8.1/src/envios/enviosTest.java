package envios;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class enviosTest extends JFrame {

	 public enviosTest() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		
		
		DefaultTableModel modelo = new DefaultTableModel();
		String atributos[]= {"Proveedor","Piezas","Cantidad"};
		modelo.setColumnIdentifiers(atributos);
		
		JTable tabla = new JTable();
		tabla.setModel(modelo);
		
		JScrollPane sc = new JScrollPane(tabla);
		add(sc);
		
		envios e = new envios();
		e.obtenerconexion();
		e.mostrarTabla(modelo);
		e.desconectar();
		

	}
	public static void main(String[] args) {
		enviosTest eTest = new enviosTest();
		eTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eTest.setTitle("ENVIOS");
		eTest.pack();
		eTest.setVisible(true);
		eTest.setLocationRelativeTo(null);

	}

}