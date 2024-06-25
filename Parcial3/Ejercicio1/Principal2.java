package Parcial3.Ejercicio1;

import java.util.Scanner;


public class Principal2 {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        ClasePrincipal2 metodos = new ClasePrincipal2();

        System.out.println("Ingrese la cantidad de elementos que se permitira ingresar");
        int n = sc.nextInt();
        while (n<=0) {
            System.out.println("Ingrese un número mayor a 0");
            n = sc.nextInt();
        }
        String[] vectorString = new String[n], vectorPalindromas = new String[n];
        String palabraInvertida="";

        for(int i=0;i < n;i++){
            System.out.println("Ingrese la palabra "+(i+1)+" (Máximo 10 caracteres)");
            vectorString[i] = sc.next();
            
            while(vectorString[i].trim().length()==0){
                //si al eliminar todos los espacios se queda con una longuitud de 0 se entiende que solo se inserto espacio blancos
                System.out.println("Por favor, inserte algo de texto");
                vectorString[i] = sc.next();
            }

            while(vectorString[i].length()>10){
                System.out.println("La palabra solo puede tener 10 caracteres máximos, Intente Nuevamente");
                vectorString[i] = sc.next();
            }
        }
        
        int j=0;//Contar palbras palindromas
        for(int i=0; i<vectorString.length;i++){
            palabraInvertida = metodos.invertirPalabra(vectorString[i]);
            if(vectorString[i].toLowerCase().trim().equals(palabraInvertida)){
                vectorPalindromas[j] = vectorString[i];
                j++; 
            }
        }

        metodos.imprimir(j,vectorPalindromas);

    }

    
}
