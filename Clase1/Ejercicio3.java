import java.util.Scanner;

class Ejercicio3 {
    

    public static void main(String[] args) {
        String nombre, apellido, ci, carrera;
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Programa de Tiago - Ejercicio 3");

        System.out.println("*** Portal Alumno ***");

        System.out.println("Ingrese el nombre del alumno");
        nombre = sc.nextLine();

        System.out.println("Ingrese el apellido del alumno");
        apellido = sc.nextLine();

        System.out.println("Ingrese el nùmero de cédula del alumno");
        ci = sc.nextLine();

        System.out.println("Ingrese la carrera del alumno");
        carrera = sc.nextLine();

        System.out.println("Ingrese la edad del alumno");
        edad = sc.nextInt();


        System.out.printf("/// Datos del alumno ///"+"%n"+
                          "Nombre: "+nombre+"%n"+
                          "Apellido: "+apellido+"%n"+
                          "Número de Cédula: "+ci+"%n"+
                          "Edad: "+edad+"%n"+
                          "Carrera: "+carrera
        );




    }

}
