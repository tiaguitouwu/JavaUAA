import java.util.Scanner;


class Ejercicio2{

    public static void main(String[] args) {
        int int1, int2, int3, int4, int5;
        float float1, float2, float3, float4, float5;
        String str1, str2, str3, str4, str5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Programa de Tiago - Ejercicio 2");

        System.out.println("Ingrese 5 palabras");

        str1 = sc.nextLine();
        str2 = sc.nextLine();
        str3 = sc.nextLine();
        str4 = sc.nextLine();
        str5 = sc.nextLine();

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

        System.out.printf("1º Palabra Ingresada "+str1+"%n"+
                          "2º Palabra Ingresada "+str2+"%n"+
                          "3º Palabra Ingresada "+str3+"%n"+
                          "4º Palabra Ingresada "+str4+"%n"+
                          "5º Palabra Ingresada "+str5+"%n"
        );

        System.out.println("------------------------");

        System.out.printf("1º Número Entero Ingresado "+int1+"%n"+
                          "2º Número Entero Ingresado "+int2+"%n"+
                          "3º Número Entero Ingresado "+int3+"%n"+
                          "4º Número Entero Ingresado "+int4+"%n"+
                          "5º Número Entero Ingresado "+int5+"%n"
        );

        System.out.println("------------------------");

        System.out.printf("1º Número Flotante Ingresado "+float1+"%n"+
                          "2º Número Flotante Ingresado "+float2+"%n"+
                          "3º Número Flotante Ingresado "+float3+"%n"+
                          "4º Número Flotante Ingresado "+float4+"%n"+
                          "5º Número Flotante Ingresado "+float5+"%n"
        );
    }
}