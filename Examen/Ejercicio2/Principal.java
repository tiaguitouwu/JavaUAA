package Examen.Ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int añoActual,añoFabricacion,autoViejo=0;
        String msjString = "El año de fabricación no puede ser mayor al año actual",
        marcaVehMsg = "Ingrese la marca del vehículo",
        modeloVehMsg = "Ingrese el modelo del vehículo",
        matriculaVehMsg = "Ingrese la matricula del vehículo",
        tipoVehMsg = "Ingrese el tipo del vehículo",
        añoFabricacionVehMsg = "Ingrese el año de fabricación del vehículo",
        marca,modelo,matricula,tipo;



        Vehiculo veh1 = new Vehiculo();
        Vehiculo veh2 = new Vehiculo();
        Vehiculo veh3 = new Vehiculo();
        Vehiculo veh4 = new Vehiculo();
        Vehiculo veh5 = new Vehiculo();



        System.out.println("DATOS DE VEHÍCULOS");

        System.out.println("Ingrese el año actual");
        añoActual = sc.nextInt();

        while (añoActual <= 0) {
            System.out.println("Dato inválido, intente nuevamente");
            añoActual = sc.nextInt();
        }

        for(int i = 0; i<5;i++){

            System.out.println("Ingrese la información del vehículo "+(i+1));

            System.out.println(marcaVehMsg);
            marca = sc.next();
            
            System.out.println(modeloVehMsg);
            modelo = sc.next();
            
            System.out.println(matriculaVehMsg);
            matricula = sc.next();
            
            System.out.println(tipoVehMsg);
            tipo = sc.next();

            System.out.println(añoFabricacionVehMsg);
            añoFabricacion = sc.nextInt();

            while (añoFabricacion>añoActual) {
                System.out.println(msjString);
                añoFabricacion = sc.nextInt();
            }

            if(añoActual-añoFabricacion > 30){
                autoViejo++;
            }

            switch (i) {
                case 0:
                    veh1.setMarca(marca);
                    veh1.setModelo(modelo);
                    veh1.setMatricula(matricula);
                    veh1.setTipo(tipo);
                    veh1.setAñoFabricacion(añoFabricacion);
                    break;
                case 1:
                    veh2.setMarca(marca);
                    veh2.setModelo(modelo);
                    veh2.setMatricula(matricula);
                    veh2.setTipo(tipo);
                    veh2.setAñoFabricacion(añoFabricacion);
                    break;
                case 2:
                    veh3.setMarca(marca);
                    veh3.setModelo(modelo);
                    veh3.setMatricula(matricula);
                    veh3.setTipo(tipo);
                    veh3.setAñoFabricacion(añoFabricacion);
                    break;
                case 3:
                    veh4.setMarca(marca);
                    veh4.setModelo(modelo);
                    veh4.setMatricula(matricula);
                    veh4.setTipo(tipo);
                    veh4.setAñoFabricacion(añoFabricacion);
                    break;
                case 4:
                    veh5.setMarca(marca);
                    veh5.setModelo(modelo);
                    veh5.setMatricula(matricula);
                    veh5.setTipo(tipo);
                    veh5.setAñoFabricacion(añoFabricacion);
                    break;
            }

        }
        sc.close();

        System.out.println("Vehículo 1");
        System.out.printf("Marca: "+veh1.getMarca()+"%n"+
                          "Modelo "+veh1.getModelo()+"%n"+
                          "Matricula "+veh1.getMatricula()+"%n"+
                          "Tipo "+veh1.getTipo()+"%n"+
                          "Antiguedad "+veh1.verificarAntiguedad(añoActual)+" años %n"
        );

        System.out.println("Vehículo 2");
        System.out.printf("Marca: "+veh2.getMarca()+"%n"+
                          "Modelo "+veh2.getModelo()+"%n"+
                          "Matricula "+veh2.getMatricula()+"%n"+
                          "Tipo "+veh2.getTipo()+"%n"+
                          "Antiguedad "+veh2.verificarAntiguedad(añoActual)+" años %n"
        );
        System.out.println("Vehículo 3");
        System.out.printf("Marca: "+veh3.getMarca()+"%n"+
                          "Modelo "+veh3.getModelo()+"%n"+
                          "Matricula "+veh3.getMatricula()+"%n"+
                          "Tipo "+veh3.getTipo()+"%n"+
                          "Antiguedad "+veh3.verificarAntiguedad(añoActual)+" años %n"
        );
        System.out.println("Vehículo 4");
        System.out.printf("Marca: "+veh4.getMarca()+"%n"+
                          "Modelo "+veh4.getModelo()+"%n"+
                          "Matricula "+veh4.getMatricula()+"%n"+
                          "Tipo "+veh4.getTipo()+"%n"+
                          "Antiguedad "+veh4.verificarAntiguedad(añoActual)+" años %n"
        );
        System.out.println("Vehículo 5");
        System.out.printf("Marca: "+veh5.getMarca()+"%n"+
                          "Modelo "+veh5.getModelo()+"%n"+
                          "Matricula "+veh5.getMatricula()+"%n"+
                          "Tipo "+veh5.getTipo()+"%n"+
                          "Antiguedad "+veh5.verificarAntiguedad(añoActual)+" años %n"
        );

        System.out.println("Existen "+autoViejo+" con más de 30 años");
        System.out.println("Se contabilizaron "+(5-autoViejo)+" con menos de 30 años");

        


    }
}
