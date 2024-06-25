package Parcial3.Ejercicio1;

import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

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
            palabraInvertida = invertirPalabra(vectorString[i]);
            if(vectorString[i].toLowerCase().trim().equals(palabraInvertida)){
                vectorPalindromas[j] = vectorString[i];
                j++; 
            }
        }

        imprimir(j,vectorPalindromas);

    }

    public static void imprimir(int j, String[] vectorPalindromas){
        if(j > 0 ){
            System.out.println("Existen "+j+" palabras palindromas");
            for(int i = 0; i < j;i++){
                System.out.println((i+1)+"°-"+vectorPalindromas[i]);
            }
        }else{
            System.out.println("No existe palabras palindromas");
        }
    }

    public static String invertirPalabra(String palabra){
        palabra = palabra.toLowerCase().trim();
        String palabraInvertida = "";
        char caracter;
        
        for (int i = palabra.length() - 1; i >= 0; i--) {
            caracter = palabra.charAt(i);
            palabraInvertida += caracter;
        }

        return palabraInvertida;
    }
    
}
