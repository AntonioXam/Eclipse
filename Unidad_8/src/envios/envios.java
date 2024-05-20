package envios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class envios {

    private Connection conexion = null;

    private String nombreDB = "C:\\database\\esepep";

    private String driver = "org.hsqldb.jdbcDriver";

    private String url = "jdbc:hsqldb:file:" + nombreDB;
    
    

    public Connection obtenerconexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName(driver);
                conexion = DriverManager.getConnection(url, "sa", "");
                System.out.println("Conexión establecida.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }

    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrar() {
        Connection conn = obtenerconexion();
        if (conn == null) {
            System.out.println("No se pudo establecer la conexión.");
            return;
        }
        String consulta = "SELECT * FROM S";
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(consulta)) {

            while (rs.next()) {
                System.out.print("\n" + rs.getString("sn"));
                System.out.print("\t" + rs.getString("snombre"));
                System.out.print("\t" + rs.getInt("estado"));
                System.out.print("\t" + rs.getString("ciudad"));
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public void mostrarTabla(DefaultTableModel t) {
        Connection conn = obtenerconexion();
        if (conn == null) {
            System.out.println("No se pudo establecer la conexión.");
            return;
        }
        String consulta = "SELECT * FROM SP";
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(consulta)) {

            Object[] fila = new Object[t.getColumnCount()];

            while (rs.next()) {
                fila[0] = rs.getString("sn");
                fila[1] = rs.getString("snombre");
                fila[2] = rs.getInt("estado");
                fila[3] = rs.getString("ciudad");
                t.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        envios proveedor = new envios();
        proveedor.obtenerconexion();
        proveedor.mostrar();
        proveedor.desconectar();
    }
}