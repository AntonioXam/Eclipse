package proveedor;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class proveedor {

	private Connection conexion = null;
	
	private String nombreDB="C:/esepe/envios";
	
	private String driver="org.hsqldb.jdbcDriver";
	
	private String url="jdbc:hsqldb:file:" + nombreDB;
	
	
	public Connection obtenerconexion() {
		try {
			if (conexion == null) {
				Class.forName(driver);
				conexion = DriverManager.getConnection(url, "sa", "");
			
			}
			
		} catch ( Exception e) {
			JOptionPane.showMessageDialog(null, "Error en la conexión", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return conexion;
	}
	
	
	
	
	public void desconectar() {
		try {
			conexion.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error al cerrar la conexión","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void mostrar() {
		
		try {
			String consulta = "SELECT * from S";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			
			while (rs.next()) {
				System.out.print("\n"+ rs.getString("sn"));
				System.out.print("\t"+ rs.getString("snombre"));
				System.out.print("\t"+ rs.getInt("estado"));
				System.out.print("\t"+ rs.getString("ciudad"));
				
			}
			st.close();
			rs.close();
		
		} catch (SQLException e) {
			System.out.println("Error en la consulta");
		}
	}
	
public void mostrarTabla(DefaultTableModel t) {
		
		try {
			String consulta = "SELECT * from S";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			Object[] fila = new Object[t.getColumnCount()];
			
			while (rs.next()) {
				fila[0]= rs.getString("sn");
				fila[1]= rs.getString("snombre");
				fila[2]= rs.getInt("estado");
				fila[3]= rs.getString("ciudad");
				t.addRow(fila);
				
			}
			st.close();
			rs.close();
		
		} catch (SQLException e) {
			System.out.println("Error en la consulta");
		}
	}



}




