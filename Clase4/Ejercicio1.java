package Clase4;

public class Ejercicio1 {
    public static void main(String[] args) {
        int arreglo[] = {87, 60, 94, 100, 83, 78, 85, 91, 76, 87}, impares[] = new int[arreglo.length / 2], c = 0,aux=0;

        for (int i = 1; i < arreglo.length; i += 2) {
        //Como se sabe que siempre son las posiciones impares se utiliza el salto de 2 en 2 empezando desde el 1, ej= 1,3,5,7.. etc
            impares[c++] = arreglo[i];
        }

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar arreglo[j] y arreglo[j + 1]
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector original ordenado: ");
        for (int i = 0; i<arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }
        
        System.out.println("");

        System.out.println("Vector con valores de posiciones impares: ");
        for (int i = 0; i<impares.length; i++) {
            System.out.print(impares[i]+" ");
        }
    }
}