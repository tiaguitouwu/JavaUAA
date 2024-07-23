package ExamenFinal.testbd.src.main.java.jjgr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {

    //private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc://localhost:3306/examen_final";
    private static final String USER = "root";
    private static final String PASS = "abcd1234";
    private Connection conectDB = null;

    public void conectarDB() throws SQLException {
         //Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            conectDB = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("\nCONEXION  EXITOSA");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void desconectarDB() throws SQLException {
        if (conectDB != null) {
            conectDB.close();
            System.out.println("\nDESCONEXION EXITOSA");
        } else {
            System.out.println("\nNO EXISTE CONEXION");
        }
    }

    private boolean validarConexion(){
        if (conectDB == null) {
            System.out.println("\nPRIMERAMENTE DEBE CONECTARSE A LA BASE DE DATOS");
            return true;
        }
        return false;
    }

    public void insertarPersona(Persona p) throws SQLException {
        if (validarConexion()) {
            return;
        }

        String sql = "INSERT "
                + "INTO examen_final.persona(cedula,nombre_completo, direccion, email, edad) "
                + "VALUES (?,?,?,?,?);";

        PreparedStatement ps = conectDB.prepareStatement(sql);
        ps.setString(1, p.getCedula());
        ps.setString(2, p.getNombreCompleto());
        ps.setString(3, p.getDireccion());
        ps.setString(4, p.getEmail());
        ps.setInt(5, p.getEdad());

        int resultado = ps.executeUpdate();

        if (resultado == 1) {
            System.out.println("\nINSERCION CORRECTA");
        } else {
            System.out.println("\nNO SE PUDO REALIZAR LA INSERCION");
        }
        ps.close();
    }

    public void actualizarPersona(Persona p) throws SQLException {
        if (validarConexion()) {
            return;
        }

        String sql = "UPDATE examen_final.persona SET nombre_completo = ?, direccion=?, email=?, edad = ? WHERE cedula=?;";

        PreparedStatement ps = conectDB.prepareStatement(sql);
        ps.setString(1, p.getNombreCompleto());
        ps.setString(2, p.getDireccion());
        ps.setString(3, p.getEmail());
        ps.setInt(4, p.getEdad());

        int resultado = ps.executeUpdate();

        System.out.println("\nSE ACTUALIZARON " + resultado + " REGISTROS");
        ps.close();
    }

    public void eliminarPersona(Persona p) throws SQLException {
        if (validarConexion()) {
            return;
        }

        String sql = "DELETE FROM examen_final.persona WHERE cedula=?;";

        PreparedStatement ps = conectDB.prepareStatement(sql);
        ps.setString(1, p.getCedula());
        int resultado = ps.executeUpdate();

        if (resultado == 0) {
            System.out.println("LA CEDULA " + p.getCedula() + " NO FORMA PARTE DE LA DB");
        } else {
            System.out.println("SE ELIMINARON " + resultado + " REGISTROS");
        }
        ps.close();
    }

    public void consultarPersona() throws SQLException {
        if (validarConexion()) {
            return;
        }

        String sql = "SELECT * FROM examen_final.persona;";

        Statement st = conectDB.createStatement();
        ResultSet rs = st.executeQuery(sql);

        int contador = 0;
        System.out.println("\nLOS VALORES RECUPERADOS SON:");
        while (rs.next()) {

            System.out.println("Cedula: " + rs.getString("cedula") +
                    "\tNombre: " + rs.getString("nombre_completo") +
                    "\tDireccion: " + rs.getString("direccion") +
                    "\tEmail: " + rs.getString("email") +
                    "\tEdad: " + rs.getInt("edad"));

        }
        System.out.println("\nLA CANTIDAD DE REGISTRO RECUPERADOS ES DE " + contador);
        st.close();
    }
}
