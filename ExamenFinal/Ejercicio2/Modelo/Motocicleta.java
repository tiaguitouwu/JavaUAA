package Modelo;
import java.util.Scanner;

public class Motocicleta extends Vehiculo{
    
    static Scanner sc = new Scanner(System.in);
    private static int ID;
    private int cilindrada;
    private String tipoMotor;

    public static int getID() {
        return ID;
    }
    public static void setID(int iD) {
        ID = iD;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void calcularImpuesto (){
        System.out.println("El impuesto de este vehículo es:"+(300+(cilindrada*0.1)));
    }

    @Override
    public void realizarMantenimiento(){
        System.out.println("Este vehículo requiere de mantemiento cada 6 meses");
    }

    public Motocicleta(String martricula, String marca, String modelo, int anhofabricacion, int cilindrada,
            String tipoMotor) {
        super(martricula, marca, modelo, anhofabricacion);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public Motocicleta(){}

    @Override
    public String toString() {
        return "Motocicleta [id="+ID+", cilindrada=" + cilindrada + ", tipoMotor=" + tipoMotor + super.toString() +"]";
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

        System.out.println("Cilindrada:");
        this.setCilindrada(sc.nextInt());

        sc.nextLine();

        System.out.println("Tipo Motor:");
        this.setTipoMotor(sc.nextLine());

        ID++;

    }

}
