package clase9.clases;

import java.sql.SQLException;

public abstract class ClaseBase {

    protected BaseDeDatos baseDeDatos = new BaseDeDatos();

    public void conectarse() throws ClassNotFoundException, SQLException {
        baseDeDatos.conectarDB();
    }

    public void desconectarse() throws SQLException {
        baseDeDatos.desconectarDB();
    }

    public abstract String toString();
}