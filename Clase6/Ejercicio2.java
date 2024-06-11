package Clase6;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Programa de Tiago ");

        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = sc.nextLine();

        System.out.print("Ingrese la oración donde se buscará: ");
        String texto = sc.nextLine();

        int repeticiones = 0;
        for (int i = 0; i <= texto.length() - palabra.length(); i++) {
            if (texto.substring(i, i + palabra.length()).equals(palabra)) {
                repeticiones++;
            }
        }
        System.out.println("La cadena '" + palabra + "' se repite " + repeticiones + " veces en la cadena '" + texto + "'.");

        sc.close();
    }

}
