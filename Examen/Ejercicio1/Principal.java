package Examen.Ejercicio1;

import java.util.Scanner;


public class Principal{
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int inicioRango,finRango;
        String msjError="Valor inválido, intente nuevamente";


        System.out.println("Calculadora de suma de número impares dado un rango");

        System.out.println("Ingrese el inicio del rango (1-100)");
        inicioRango=sc.nextInt();

        
        while (inicioRango<=0 || inicioRango > 100) {
            System.out.println(msjError);

            inicioRango =sc.nextInt();
        }

        System.out.println("Ingrese el fin del rango (1-100), debe ser mayor o igual al inicio del rango");
        finRango = sc.nextInt();
        while (finRango>100 || finRango<inicioRango) {
            System.out.println(msjError); 

            finRango = sc.nextInt();
        }

        sc.close();

        SumaImpares sumaImpares = new SumaImpares(inicioRango,finRango);


        System.out.println("La sumatoria de los números ingresados en el rango de ["+inicioRango+" y "+finRango+"] es: "+sumaImpares.suma());


    }
}