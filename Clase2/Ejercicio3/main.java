package Clase2.Ejercicio3;

import java.util.Scanner;

public class main {

    /**
     * @param args
     */
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);


        Float num1, num2, num3, num4, resultado = (float) 0;

        System.out.println("Bienvenido al Programa de Tiago - Ejercicio 3");

        System.out.println("Ingrese 4 números (Enter entre cada número)");
        System.out.println("1° Número:");
        num1 = sc.nextFloat();
        System.out.println("2° Número:");
        num2 = sc.nextFloat();
        System.out.println("3° Número:");
        num3 = sc.nextFloat();
        System.out.println("4° Número:");
        num4 = sc.nextFloat();

        Operacion op = new Operacion(num1,num2,num3,num4);


        System.out.println("Ingrese la operación a realizarse || (S) Suma, (R) Resta, (M) Multiplicación, (D) División ||");
        String Operacion = sc.next();

        switch (Operacion) {
            case "S":
                Operacion= "suma";
                resultado = op.suma();
                System.out.println("El resultado de la operación " + Operacion + " es: "+resultado);
                break;
            case "R":
                Operacion= "resta";
                resultado = op.resta();
                System.out.println("El resultado de la operación " + Operacion + " es: "+resultado);
                break;
            case "M":
                Operacion= "multiplicación";    
                resultado = op.multiplicacion();
                System.out.println("El resultado de la operación " + Operacion + " es: "+resultado);
                break;
            case "D":
                Operacion= "división";
                resultado = op.division();
                System.out.println("El resultado de la operación " + Operacion + " es: "+resultado);
                break;
            default:
                System.out.println("Operación Inválida");
                break;
        }

        


    }
    

    
}
