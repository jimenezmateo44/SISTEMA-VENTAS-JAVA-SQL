package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
    //Conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ventas", "root", "one1two2three3");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local "+ e);
        }
        return null;
    }
}
