package Clase2.Ejercicio1y2;

import java.util.Scanner;

public class principal2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Programa de Tiago - Ejercicio 2");

        System.out.println("Registra a una Persona");
        System.out.println("Ingrese el Nombre");
        String nombre = sc.next();
        System.out.println("Ingrese el Apellido");
        String apellido = sc.next();
        System.out.println("Ingrese el Sexo || (M) Masculino (F) Femenino");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese el Número de Cédula");
        String ci = sc.next();
        System.out.println("Ingrese la Edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese la Profesión");
        String profesion = sc.next();

        Persona ps = new Persona(nombre,apellido,sexo,ci,edad,profesion);

        System.out.println("¡¡¡Persona Registrada!!!");

        System.out.println("*********************");

        System.out.println("|| Persona ||");
        System.out.println("Nombre: " + ps.getNombre());
        System.out.println("Apellido: " + ps.getApellido());
        System.out.println("Sexo: " + ps.getSexo());
        System.out.println("C.I.:" + ps.getCedula());
        System.out.println("Edad: " + ps.getEdad());
        System.out.println("Profesion: " + ps.getProfesion());


    }
}
