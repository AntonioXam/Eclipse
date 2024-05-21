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

public class ConexionSP {

    private Connection conexion = null;    
    private String nombreDB = "C:/esepe/envios";
    private String driver = "org.hsqldb.jdbcDriver";
    private String url = "jdbc:hsqldb:file:" + nombreDB;
    private String user = "SA";
    private String password = "";

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

    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión con la BD", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarSP(JTable t) {
        try {
            String consulta = "SELECT * FROM SP";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(consulta);

            DefaultTableModel modelo = new DefaultTableModel();
            String atributos[] = {"CódigoS", "CódigoP", "Cantidad"};
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

    public void insertarSP(String cods, String codp, String cant) {
        try {
            String sql = "INSERT INTO SP VALUES (?, ?, ?);";
            PreparedStatement pStatement = conexion.prepareStatement(sql);

            pStatement.setString(1, cods);
            pStatement.setString(2, codp);
            
			if (cant.isEmpty()) {
				pStatement.setString(3, null);
			} else {
				pStatement.setInt(3, Integer.parseInt(cant));
			}
            
            pStatement.executeUpdate();
            pStatement.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos.\nComprueba que el código tiene 3 dígitos o caracteres y no está duplicado", "Error al insertar el registro en la BD", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El campo Peso debe ser un número", "Error en el formato del peso", JOptionPane.ERROR_MESSAGE);
        }
    }
}
