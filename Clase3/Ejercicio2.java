package Clase3;

import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valoresIngresados = new int[10];

        System.out.println("Bienvenido al Programa de Tiago - Ejercicio 2");

        for(int i=0; i<10;i++){
            System.out.println("Ingrese el valor N°"+(i+1));
            valoresIngresados[i] = sc.nextInt();
        }
        for (int y = 0 ; y <10; y++) {
            System.out.println(valoresIngresados[y]%2==0 ? "El número "+valoresIngresados[y]+" es multiplo de 2" 
                                                         : "El número "+valoresIngresados[y]+" no es multiplo de 2");
        }
        
        sc.close();
    }
}