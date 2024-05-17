package proveedor;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class proveedorTest extends JFrame {

	 public proveedorTest() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		
		
		DefaultTableModel modelo = new DefaultTableModel();
		String atributos[]= {"Código","Nombre","Estado","Ciudad" };
		modelo.setColumnIdentifiers(atributos);
		
		JTable tabla = new JTable();
		tabla.setModel(modelo);
		
		JScrollPane sc = new JScrollPane(tabla);
		add(sc);
		
		proveedor p = new proveedor();
		p.obtenerconexion();
		p.mostrarTabla(modelo);
		p.desconectar();
		

	}
	public static void main(String[] args) {
		proveedorTest pTest = new proveedorTest();
		pTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pTest.setTitle("PROVEEDORES");
		pTest.pack();
		pTest.setVisible(true);
		pTest.setLocationRelativeTo(null);

	}

}
