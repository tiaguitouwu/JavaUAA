import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Ejercicio4{

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);//Se utiliza para leer caracteres
        BufferedReader br = new BufferedReader(isr);//Se utiliza para recuperar info del inputStreamReader

        String nombre, apellido, ci, carrera;
        int edad;

        System.out.println("Bienvenido al Programa de Tiago - Ejercicio 4");

        System.out.println("*** Portal Alumno ***");

        System.out.println("Ingrese el nombre del alumno");
        nombre = br.readLine();

        System.out.println("Ingrese el apellido del alumno");
        apellido = br.readLine();

        System.out.println("Ingrese el nùmero de cédula del alumno");
        ci = br.readLine();

        System.out.println("Ingrese la carrera del alumno");
        carrera = br.readLine();

        System.out.println("Ingrese la edad del alumno");
        edad = Integer.parseInt(br.readLine());


        System.out.printf("/// Datos del alumno ///"+"%n"+
                          "Nombre: "+nombre+"%n"+
                          "Apellido: "+apellido+"%n"+
                          "Número de Cédula: "+ci+"%n"+
                          "Edad: "+edad+"%n"+
                          "Carrera: "+carrera
        );


    }

}