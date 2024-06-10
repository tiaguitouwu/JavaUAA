package Clase5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Triangulo trian = new Triangulo();
        Cuadrado cuad = new Cuadrado();
        Rectangulo rec = new Rectangulo();

        System.out.println("Bienvenido al Programa de Tiago ");
        //TRIANGULO
        System.out.println("Prueba de Perímetro y Área de un Triángulo");
        System.out.println("Ingrese los lados del triángulo");
        System.out.println("Lado A");
        trian.setA(ingresarDato());
        System.out.println("Lado B");
        trian.setB(ingresarDato());
        System.out.println("Lado C");
        trian.setC(ingresarDato());

        System.out.println("El perímetro del triángulo es "+trian.perimetro());
        System.out.println("El área del triángulo es "+String.format("%.2f", trian.area()));
        

        //CUADRADO
        System.out.println("Prueba de Perímetro y Área del Cuadrado");
        System.out.println("Ingresa el valor de los lados del cuadrado");
        cuad.setLado(ingresarDato());

        System.out.println("El perímetro del cuadrado es "+cuad.perimetro());
        System.out.println("El área del cuadrado es "+String.format("%.2f", cuad.area()));


        //RECTANGULO
        System.out.println("Prueba de Perímetro y Área del Rectángulo");
        System.out.println("Ingresa el valor el largo del rectángulo");
        rec.setLargo(ingresarDato());
        System.out.println("Ingresa el valor el largo del rectángulo");
        rec.setAncho(ingresarDato());

        System.out.println("El perímetro del rectángulo es "+rec.perimetro());
        System.out.println("El área del rectángulo es "+String.format("%.2f", rec.area()));


        

        sc.close();
    }

    public static double ingresarDato(){
        double num=0;
        while (true) {
            try {
                num = sc.nextDouble();
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Solo se admiten números!");
                sc.next(); // Limpiar la entrada incorrecta
            }
        }
        return num;
    }
}
