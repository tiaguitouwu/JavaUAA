package Modelo;
import java.util.Scanner;

public class Camion extends Vehiculo{
    static Scanner sc = new Scanner(System.in); 
    private static int ID;
    private int capacidadCarga;
    private String tipoCabina;

    public static int getID() {
        return ID;
    }
    public static void setID(int iD) {
        ID = iD;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabinda) {
        this.tipoCabina = tipoCabinda;
    }

    public Camion(String martricula, String marca, String modelo, int anhofabricacion, int capacidadCarga,
            String tipoCabina) {
        super(martricula, marca, modelo, anhofabricacion);
        this.capacidadCarga = capacidadCarga;
        this.tipoCabina = tipoCabina;
    }

    public Camion(){}

    @Override
    public void calcularImpuesto (){
        System.out.println("El impuesto de este vehículo es:"+(800+(capacidadCarga*0.05)));
    }

    @Override
    public void realizarMantenimiento(){
        System.out.println("Este vehículo requiere de mantemiento cada 1 mes");
    }

    @Override
    public String toString() {
        return "Camion [id="+ID+",capacidadCarga=" + capacidadCarga + ", tipoCabinda=" + tipoCabina + super.toString()+"]";
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

        System.out.println("Capacidad Carga:");
        this.setCapacidadCarga(sc.nextInt());

        sc.nextLine();

        System.out.println("Tipo Cabina:");
        this.setTipoCabina(sc.nextLine());

        ID++;
    }
    
}
