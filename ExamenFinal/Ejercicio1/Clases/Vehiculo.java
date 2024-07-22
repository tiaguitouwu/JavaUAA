public abstract class Vehiculo implements Contribuyente {
    String martricula;
    String marca;
    String modelo;
    int anhofabricacion;

    public abstract void calcularImpuesto();

    public abstract void realizarMantenimiento();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Vehiculo{matricula="+martricula+", marca="+marca+", modelo"+modelo+" anhofabricacion="+anhofabricacion+"}";
    }
    
}
