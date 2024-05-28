package Envios;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//Clase para conectar con la BD

public class ConexionSP {

	private Connection conexion = null;    
	private String nombreDB = "C:/envios/S-P-SP";
	private String driver = "org.hsqldb.jdbcDriver";
	private String url = "jdbc:hsqldb:file:" + nombreDB;
	private String user = "SA";
	private String password = "";

	/**
	 * Método conexión con la BD
	 */
	public ConexionSP() {
		try {
			if (conexion == null) {
				Class.forName(driver);
				conexion = DriverManager.getConnection(url, user, password);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido establecer la conexión con la BD", "Error de conexión", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Método para desconectar la BD
	 */
	public void desconectar() {
		try {
			if (conexion != null && !conexion.isClosed()) {
				conexion.close();
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al cerrar la conexión con la BD", "Error de conexión", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Método para visualizar un tabla en el formulario a traves de una consulta
	 * @param t Modelo por defecto de la tabla
	 * Creación de un objeto fila y recorrerlo para mostrar los datos de la Tabla a traves de la consulta
	 */
	public void mostrarSP(JTable t) {
		try {
			String consulta = "SELECT * FROM SP";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);

			DefaultTableModel modelo = new DefaultTableModel();
			String atributos[] = {"Proveedor", "Pieza", "Cantidad"};
			modelo.setColumnIdentifiers(atributos);

			while (rs.next()) {
				Object[] fila = new Object[3];
				fila[0] = rs.getString("sn");
				fila[1] = rs.getString("pn");
				fila[2] = rs.getInt("cant");

				modelo.addRow(fila);
			}

			t.setModel(modelo);
			st.close();
			rs.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla", "Error en la consulta", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Método para insertar datos en la tabla
	 * @param cods Código del Proveedor
	 * @param codp Código de las Piezas
	 * @param cant Cantidad de las Pîezas
	 */
	public void insertarSP(String cods, String codp, String cant) {
		try {
			String sql = "INSERT INTO SP VALUES (?, ?, ?);";
			PreparedStatement pStatement = conexion.prepareStatement(sql);


			pStatement.setString(1, cods);

			pStatement.setString(2, codp);

			//Si la cantidad esta vacia se establece en NULL
			if (cant.isEmpty()) {
				pStatement.setString(3, null);
			} else {
				pStatement.setInt(3, Integer.parseInt(cant));
			}

			pStatement.executeUpdate();

			pStatement.close();

			// Mostramos un aviso sobre si los datos están correctos.
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Datos incorrectos.\nComprueba que el código tenga 3 dígitos o caracteres, no esté duplicado\n y exista en la BD", "Error al insertar el registro en la BD", JOptionPane.ERROR_MESSAGE);

		}
	}
}
