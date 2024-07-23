package Modelo;
import java.util.Scanner;

public class Auto extends Vehiculo {
    static Scanner sc = new Scanner(System.in);
    private static int ID;
    private int numeroPuertas;
    private String tipoCombustible;

    public static int getID() {
        return ID;
    }
    public static void setID(int iD) {
        ID = iD;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void calcularImpuesto (){
        System.out.println("El impuesto de este vehículo es:"+(500+(numeroPuertas*50)));
    }

    @Override
    public void realizarMantenimiento(){
        System.out.println("Este vehículo requiere de mantemiento cada 1 año");
    }

    public Auto(String martricula, String marca, String modelo, int anhofabricacion, int numeroPuertas, String tipoCombustible) {
        super(martricula, marca, modelo, anhofabricacion);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public Auto(){}

    @Override
    public String toString() {
        return "Auto [id="+ID+",numeroPuertas=" + numeroPuertas + ", tipoCombustible=" + tipoCombustible + super.toString() +"]";
    }

    public void cargarDatos() {
        int anho;

        System.out.println("Martricula:");
        this.martricula = sc.nextLine();

        System.out.println("Marca:");
        this.setMarca(sc.nextLine());

        System.out.println("Modelo:");
        this.setModelo(sc.nextLine());

        System.out.println("Año fabricación:");
        do{
            anho = sc.nextInt();
        
            if (anho > 2024 || anho < 1980){
                System.out.println("El año no puede ser mayor a 2024 ni menor a 1980, Intente nuevamente");
            }
        } while(anho > 2024 || anho < 1980);
        this.setAnhofabricacion(anho);

        System.out.println("Cantidad Puertas:");
        this.setNumeroPuertas(sc.nextInt());

        sc.nextLine();

        System.out.println("Tipo Combustible:");
        this.setTipoCombustible(sc.nextLine());

        ID++;

    }
}
    
