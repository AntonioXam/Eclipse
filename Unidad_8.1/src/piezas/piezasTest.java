package piezas;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class piezasTest extends JFrame {

	
	public piezasTest() {
		setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		
		
		DefaultTableModel modelo = new DefaultTableModel();
		String atributos[]= {"Código","Nombre","Color","Peso","Ciudad" };
		modelo.setColumnIdentifiers(atributos);
		
		JTable tabla = new JTable();
		tabla.setModel(modelo);
		
		JScrollPane sc = new JScrollPane(tabla);
		add(sc);
		
		piezas p = new piezas();
		p.obtenerconexion();
		p.mostrarTabla(modelo);
		p.desconectar();

	}

	public static void main(String[] args) {
		
		piezasTest pTest = new piezasTest();
		pTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pTest.setTitle("PIEZAS");
		pTest.pack();
		pTest.setVisible(true);
		pTest.setLocationRelativeTo(null);
	}

}
