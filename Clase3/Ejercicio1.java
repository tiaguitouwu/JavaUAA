package Clase3;

import java.util.Scanner;

public class Ejercicio1{
    public static Scanner sc = new Scanner(System.in);
    public static String errorInvalid = "Valor no válido, intente nuevamente";

    public static void main(String[] args) {
        float pesoSandia;

        System.out.println("Bienvenido al Programa de Tiago - Ejercicio 1");

        System.out.println("Ingrese el valor de la sandía");
        pesoSandia = sc.nextFloat();
        while (pesoSandia<=0 || pesoSandia>2000) {
            System.out.println(errorInvalid);
            System.out.println("Ingrese el valor de la sandía");
            pesoSandia = sc.nextFloat();
        }
        System.out.println((pesoSandia/2) % 2 == 0 ? "Si es posible partir en partes pares" : "No es posible partir en partes pares");

        sc.close();
    }
}

