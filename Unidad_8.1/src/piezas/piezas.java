package piezas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class piezas {

	private Connection conexion= null;
	
	
	private String nombreDB="C:\\envios\\S-P-SP";
	
	private String driver="org.hsqldb.jdbcDriver";
	
	private String url="jdbc:hsqldb:file:" + nombreDB;
	
	
	public Connection obtenerconexion() {
		try {
			if (conexion==null) {
				Class.forName(driver);
				conexion = DriverManager.getConnection(url);
				System.out.println("Conexion establecida correctamente");
			}
		} catch (Exception e) {
			System.out.println("Error al establecer la conexión");
		}
		return conexion;
	}
	
	
	public void desconectar() {
		try {
			conexion.close();
		} catch (Exception e) {
			System.out.println("Error al cerrar la conexión");
		}
	}
	
	
	public void mostrar() {
		
		try {
			String consulta = "SELECT * from P";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			
			while (rs.next()) {
				System.out.print("\n"+ rs.getString("pn"));
				System.out.print("\t"+ rs.getString("pnombre"));
				System.out.print("\t"+ rs.getString("color"));
				System.out.print("\t"+ rs.getInt("peso"));
				System.out.print("\t"+ rs.getString("ciudad"));
				
			}
			st.close();
			rs.close();
		
		} catch (SQLException e) {
			System.out.println("Error en la consulta");
		}
	}
}
