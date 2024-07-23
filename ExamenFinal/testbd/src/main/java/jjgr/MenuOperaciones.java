package ExamenFinal.testbd.src.main.java.jjgr;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuOperaciones {

    private Scanner entrada = new Scanner(System.in);
    private int opcion;
    private Persona persona = new Persona();

    public void menuOpciones() throws ClassNotFoundException, SQLException {

        do {
            System.out.println("\n==================");
            System.out.println("**MENU OPCIONES**");
            System.out.println("1- Conectar DB");
            System.out.println("2- Agregar persona");
            System.out.println("3- Actualizar persona");
            System.out.println("4- Eliminar persona");
            System.out.println("5- Listar persona");
            System.out.println("0- Salir");
            System.out.println("==================\n");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    persona.conectarse();
                    break;
                case 2:
                    persona.cargarDatosPersona();
                    break;
                case 3:
                    persona.actualizarDatosPersona();
                    break;
                case 4:
                    persona.eliminarDatosPersona();
                    break;
                case 5:
                    persona.listarDatosPersona();
                    break;
                case 0:
                    persona.desconectarse();
                    break;
            }

        } while (opcion != 0);

    }



}
