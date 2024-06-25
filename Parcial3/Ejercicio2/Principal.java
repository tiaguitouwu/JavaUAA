package Parcial3.Ejercicio2;

import java.util.Scanner;
import Parcial3.Ejercicio2.Clases.Conejo;
import Parcial3.Ejercicio2.Clases.Perro;
import Parcial3.Ejercicio2.Clases.Gato;

public class Principal {
    public static void main(String[] args) {
        Gato[] arrayMichi = new Gato[3];
        Perro[] arrayFirulais = new Perro[3];
        Conejo[] arrayTapiti = new Conejo[3];
        Scanner sc = new Scanner(System.in);
        
        String raza,color;
        int fechaNacimiento,edad,peso,cantidadAccion;

        System.out.println("Bienvenido al mejor programa");
        for(int i=0;i<3;i++){
            System.out.println("Ingrese los datos para el perrito "+(i+1));
            System.out.println("Fecha de nacimiento");
            fechaNacimiento = sc.nextInt();
            while(fechaNacimiento > 2023 || fechaNacimiento < 1050){
                System.out.println("Ingrese una fecha valida");
                fechaNacimiento = sc.nextInt();
            }
            edad = 2024-fechaNacimiento;
            System.out.println("Ingrese la raza del perrito");
            raza = sc.next();
            System.err.println("Ingrese el peso del perrito");
            peso = sc.nextInt();
            System.out.println("Ingrese el color del perrito");
            color = sc.next();
            System.out.println("Ingrese la cantidad de veces que ladra el perrito");
            cantidadAccion = sc.nextInt();
            arrayFirulais[i] = new Perro(edad,raza,peso,color,cantidadAccion);
        }

        for(int i=0;i<3;i++){
            System.out.println("Ingrese los datos para el michito "+(i+1));
            System.out.println("Fecha de nacimiento");
            fechaNacimiento = sc.nextInt();
            while(fechaNacimiento > 2023 || fechaNacimiento < 1050){
                System.out.println("Ingrese una fecha valida");
                fechaNacimiento = sc.nextInt();
            }
            edad = 2024-fechaNacimiento;
            System.out.println("Ingrese la raza del michito");
            raza = sc.next();
            System.err.println("Ingrese el peso del michito");
            peso = sc.nextInt();
            System.out.println("Ingrese el color del michito");
            color = sc.next();
            System.out.println("Ingrese la cantidad de veces que ronronea el michito");
            cantidadAccion = sc.nextInt();
            arrayMichi[i] = new Gato(edad,raza,peso,color,cantidadAccion);
        }

        for(int i=0;i<3;i++){
            System.out.println("Ingrese los datos para el tapiti "+(i+1));
            System.out.println("Fecha de nacimiento");
            fechaNacimiento = sc.nextInt();
            while(fechaNacimiento > 2023 || fechaNacimiento < 1050){
                System.out.println("Ingrese una fecha valida");
                fechaNacimiento = sc.nextInt();
            }
            edad = 2024-fechaNacimiento;
            System.out.println("Ingrese la raza del tapiti");
            raza = sc.next();
            System.err.println("Ingrese el peso del tapiti");
            peso = sc.nextInt();
            System.out.println("Ingrese el color del tapiti");
            color = sc.next();
            System.out.println("Ingrese la cantidad de veces que salta el tapiti");
            cantidadAccion = sc.nextInt();
            arrayTapiti[i] = new Conejo(edad,raza,peso,color,cantidadAccion);
        }

        for(int i = 0 ; i<3 ;i++){
            System.out.println("Perrito "+(i+1));
            System.out.println(arrayFirulais[i].toString());
            System.out.println("Gatito "+(i+1));
            System.out.println(arrayMichi[i].toString());
            System.out.println("Conejito "+(i+1));
            System.out.println(arrayTapiti[i].toString());
        }

        sc.close();

    }
}
