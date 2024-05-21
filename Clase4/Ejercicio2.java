package Clase4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arregloA[][] = new int[3][3], arregloB[][] = new int[3][3],suma[][] = new int[3][3];

        System.out.println("Ingrese los valores para A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A(" + i + ")(" + j + "): ");
                arregloA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ingrese los valores para B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B(" + i + ")(" + j + "): ");
                arregloB[i][j] = scanner.nextInt();
                suma[i][j] = arregloA[i][j] + arregloB[i][j];
            }
        }
        
        System.out.println("A:");
        for (int i = 0; i < arregloA.length; i++) {
            for (int j = 0; j < arregloA[i].length; j++) {
                System.out.print(arregloA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("B:");
        for (int i = 0; i < arregloB.length; i++) {
            for (int j = 0; j < arregloB[i].length; j++) {
                System.out.print(arregloB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma de A y B:");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
