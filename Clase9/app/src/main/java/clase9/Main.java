package clase9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Establecer conexión con la base de datos MySQL
            String url = "jdbc:mysql://localhost:3306/bd_uaa";
            String username = "root";
            String password = "admin";
            connection = DriverManager.getConnection(url, username, password);

            // Realizar operaciones con la base de datos
            System.out.println("Conexión exitosa");
            // Cerrar la conexión
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

