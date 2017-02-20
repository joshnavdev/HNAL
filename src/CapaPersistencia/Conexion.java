
package CapaPersistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joshua
 */
public class Conexion {
    private Connection  conexion;

    public Conexion(String user, String password) {
        String url = "jdbc:sqlserver://LAPTOP-JOSHUA\\SQLJOSHUA;"
                    + "databaseName=HNAL";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado ");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error al conectar");
            System.out.println(e.getMessage());
        }
    }
    
    public Connection getConexion() {
        return conexion;
    }
}
