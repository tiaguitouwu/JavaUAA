package Principal;
import Modelo.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Auto[] autos = new Auto[3];
        Motocicleta[] motos = new Motocicleta[3];
        Camion[] camiones = new Camion[3];
        int opcion;
        do{
            System.out.println("\n==================");
            System.out.println("**MENU OPCIONES**");
            System.out.println("1- Insertar Datos Automovil");
            System.out.println("2- Insertar Datos Motocicleta");
            System.out.println("3- Insertar Datos Camiones");
            System.out.println("0- Salir");
            System.out.println("==================\n");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    try {
                        for( int i =0;i<3;i++){
                            System.out.println("Auto #"+(i+1));
                            autos[i] = new Auto(); 
                            autos[i].cargarDatos();
                            System.out.println(autos[i].toString());
                            autos[i].calcularImpuesto();
                            autos[i].realizarMantenimiento();
                        }   
                    } catch (InputMismatchException e) {
                        System.err.println("Dato introducido inválido");
                    }
                break;
                case 2:
                    try {
                        for( int i =0;i<3;i++){
                            System.out.println("Moto #"+(i+1));
                            motos[i] = new Motocicleta(); 
                            motos[i].cargarDatos();
                            System.out.println(motos[i].toString());
                            motos[i].calcularImpuesto();
                            motos[i].realizarMantenimiento();
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Dato introducido inválido");
                    }
                break;
                case 3:
                    try {
                        for( int i =0;i<3;i++){
                            System.out.println("Camion #"+(i+1));
                            camiones[i] = new Camion(); 
                            camiones[i].cargarDatos();
                            System.out.println(camiones[i].toString());
                            camiones[i].calcularImpuesto();
                            camiones[i].realizarMantenimiento();
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Dato introducido inválido");
                    }
                break;
                case 0:
                    System.out.println("Programa Finalizado =D");
                break;
            }
        }while (opcion != 0);
    }
}
