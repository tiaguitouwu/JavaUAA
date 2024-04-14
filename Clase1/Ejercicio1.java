import java.util.Scanner;


class Ejercicio1{

    public static void main(String[] args) {
        int int1, int2, int3, int4, int5;
        float float1, float2, float3, float4, float5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Programa de Tiago - Ejercicio 1");

        System.out.println("Ingrese 5 números enteros");

        int1 = sc.nextInt(); //No se puede validar :(
        int2 = sc.nextInt();
        int3 = sc.nextInt();
        int4 = sc.nextInt();
        int5 = sc.nextInt();

        System.out.println("Ingrese 5 números tipo flotante (Con decimales)");

        float1 = sc.nextFloat();
        float2 = sc.nextFloat();
        float3 = sc.nextFloat();
        float4 = sc.nextFloat();
        float5 = sc.nextFloat();

        System.out.println("*********************");
        System.out.println("Valores Ingresados");
        System.out.println("*********************");

        System.out.println("1º Número Entero Ingresado "+int1);
        System.out.println("2º Número Entero Ingresado "+int2);
        System.out.println("3º Número Entero Ingresado "+int3);
        System.out.println("4º Número Entero Ingresado "+int4);
        System.out.println("5º Número Entero Ingresado "+int5);

        System.out.println("------------------------");

        System.out.println("1º Número Flotante Ingresado "+float1);
        System.out.println("2º Número Flotante Ingresado "+float2);
        System.out.println("3º Número Flotante Ingresado "+float3);
        System.out.println("4º Número Flotante Ingresado "+float4);
        System.out.println("5º Número Flotante Ingresado "+float5);

    }
}