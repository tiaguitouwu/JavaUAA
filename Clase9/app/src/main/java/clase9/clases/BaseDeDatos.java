package clase9.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {

    //private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bd_uaa";
    private static final String USER = "root";
    private static final String PASS = "admin";
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
                + "INTO bd_uaa.persona(cedula, nombre_completo, direccion, email, edad) "
                + "VALUES (?, ?, ?, ?, ?);";

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

        String sql = "UPDATE bd_uaa.persona SET direccion=?, email=? WHERE cedula=?;";

        PreparedStatement ps = conectDB.prepareStatement(sql);
        ps.setString(1, p.getDireccion());
        ps.setString(2, p.getEmail());
        ps.setString(3, p.getCedula());

        int resultado = ps.executeUpdate();

        System.out.println("\nSE ACTUALIZARON " + resultado + " REGISTROS");
        ps.close();
    }

    public void eliminarPersona(Persona p) throws SQLException {
        if (validarConexion()) {
            return;
        }

        String sql = "DELETE FROM bd_uaa.persona WHERE cedula=?;";

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

        String sql = "SELECT cedula, nombre_completo, direccion, email, edad FROM bd_uaa.persona;";

        Statement st = conectDB.createStatement();
        ResultSet rs = st.executeQuery(sql);

        int contador = 0;
        System.out.println("\nLOS VALORES RECUPERADOS SON:");
        while (rs.next()) {
            contador++;

            System.out.println("Cedula: " + rs.getString("cedula") +
                    "\tNombre: " + rs.getString("nombre_completo") +
                    "\tDireccion: " + rs.getString("direccion") +
                    "\tEmail: " + rs.getString("email") +
                    "\tEdad: " + rs.getInt("edad"));

        }
        System.out.println("\nLA CANTIDAD DE REGISTRO RECUPERADOS ES DE " + contador);
        st.close();
    }

    public void consultarPersonaPorCedula(String ci) throws SQLException {
        if (validarConexion()) {
            return;
        }

        

        String sql = "SELECT cedula, nombre_completo, direccion, email, edad FROM bd_uaa.persona where cedula = ? ;";

        PreparedStatement ps = conectDB.prepareStatement(sql);
        ps.setString(1, ci);
        
        ResultSet rs = ps.executeQuery();

        rs.next();

        System.out.println("Estos son los registros para la cédula "+ci);


        System.out.println("Cedula: " + rs.getString("cedula") +
                    "\tNombre: " + rs.getString("nombre_completo") +
                    "\tDireccion: " + rs.getString("direccion") +
                    "\tEmail: " + rs.getString("email") +
                    "\tEdad: " + rs.getInt("edad"));

    }
}
