package Clase7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Clase7.Clases.Cliente;
import Clase7.Clases.Empleado;

public class Prueba {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();

        cliente1=cargarDatoCliente();
        cliente2=cargarDatoCliente();
        cliente3=cargarDatoCliente();

        System.out.println("Clientes cargados:");
        System.out.println("Cliente 1");
        System.out.println(cliente1);
        System.out.println("Cliente 2");
        System.out.println(cliente2);
        System.out.println("Cliente 3");
        System.out.println(cliente3);

        empleado1=cargarDatoEmpleado();
        empleado2=cargarDatoEmpleado();
        empleado3=cargarDatoEmpleado();

        System.out.println("Empleados cargados:");
        System.out.println("Empleado 1");
        System.out.println(empleado1);
        System.out.println("Empleado 2");
        System.out.println(empleado2);
        System.out.println("Empleado 3");
        System.out.println(empleado3);

        sc.close();
    }

    public static Cliente cargarDatoCliente(){
        Cliente cl = new Cliente();
        String nom, dir, fechaStr, vipStr;
        char sexo;
        int edad;
        Date fecha=null;
        boolean vip;

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy"); //generado por chatgpt

        System.out.println("Ingrese el nombre del Cliente");
        nom = sc.next();
        System.out.println("Ingrese el genero del Cliente");
        sexo = sc.next().charAt(0);
        System.out.println("Ingrese la edad del Cliente");
        edad = sc.nextInt();
        System.out.println("Ingrese la dirección del Cliente");
        dir = sc.next();
        System.out.println("Ingrese la fecha del registro");
        fechaStr = sc.next();
        try {
            fecha = formatoFecha.parse(fechaStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Es vip? S/N");
        vipStr = sc.next();
        if(vipStr == "S"){
            vip = true;
        }else{
            vip = false;
        }
        cl = new Cliente(nom,sexo,edad,dir,fecha,vip);
        return cl;
    }
    
    public static Empleado cargarDatoEmpleado(){
        Empleado emp = new Empleado();
        String nom, dir;
        char sexo;
        int edad;
        double sueldo;

        System.out.println("Ingrese el nombre del Empleado");
        nom = sc.next();
        System.out.println("Ingrese el genero del Empleado");
        sexo = sc.next().charAt(0);
        System.out.println("Ingrese la edad del Empleado");
        edad = sc.nextInt();
        System.out.println("Ingrese la dirección del Empleado");
        dir = sc.next();
        System.out.println("Ingrese el salario del Empleado");
        sueldo = sc.nextInt();

        emp = new Empleado(nom,sexo,edad,dir,sueldo);

        return emp;
    }
}
