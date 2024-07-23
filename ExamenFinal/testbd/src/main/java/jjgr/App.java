package ExamenFinal.testbd.src.main.java.jjgr;

import java.sql.SQLException;

public class App {
    
    public static void main(String[] args)  {

        MenuOperaciones op = new MenuOperaciones();
        try {
            op.menuOpciones();
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }
}
