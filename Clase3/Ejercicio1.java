package Clase3;

import java.util.Scanner;

public class Ejercicio1{
    public static Scanner sc = new Scanner(System.in);
    public static String errorInvalid = "Valor no válido, intente nuevamente";

    private static int validarnumero(){
        int valorpar = sc.nextInt();
        while (valorpar % 2 != 0) {
            System.out.println(errorInvalid);
            valorpar = sc.nextInt();
        }
        return valorpar;
    }
    public static void main(String[] args) {
        float pesoSandia;
        //Los número pares pertenecen al con junto de números naturales por lo que se utiliza int
        int pesoPartir,pesoPartir2;
        System.out.println("Ingrese el valor de la sandía");
        pesoSandia = sc.nextFloat();

        while (pesoSandia<=0 || pesoSandia>2000) {
        System.out.println(errorInvalid);
        System.out.println("Ingrese el valor de la sandía");
        pesoSandia = sc.nextFloat();
        }

        System.out.println("Ingrese el primer valor en el que desea partir la sandía (Debe ser par)");
        pesoPartir=validarnumero();
        System.out.println("Ingrese el segundo valor en el que desea partir la sandía");
        pesoPartir2=validarnumero();

        System.out.println(pesoSandia-(pesoPartir+pesoPartir2) >= 0 ? "Si es posible partir" : "No es posible partir");
    }
}

