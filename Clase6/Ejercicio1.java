package Clase6;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido al Programa de Tiago ");

        System.out.print("Ingrese la cantidad de palabras: ");
        int n = sc.nextInt();
        
        String[] palabras = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            palabras[i] = sc.next();
        }
        
        //palabras[i].matches("[a-zA-Z\\-]+")

        String palabraMasLarga = "";
        int caracteresValidos = 0;
        int caracteresValidosPalabraMasLarga = 0;
        
        for (String palabra : palabras) {
            for(int caracter = 0; caracter < palabra.length(); caracter++){
                if(String.valueOf(palabra.charAt(caracter)).matches("[a-zA-Z\\\\-]+")){
                    caracteresValidos++;
                }
            }
            if (caracteresValidos>caracteresValidosPalabraMasLarga) {
                palabraMasLarga=palabra;
                caracteresValidosPalabraMasLarga = caracteresValidos;
            }
        }
        
        System.out.println("La palabra más larga es: " + palabraMasLarga + ", con "+caracteresValidosPalabraMasLarga+" caracteres válidos");
    
        sc.close();
    }
    
}
