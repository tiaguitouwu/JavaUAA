package Modelo;

import Interfaz.Contribuyente;

public abstract class Vehiculo implements Contribuyente {
    protected String martricula;
    protected String marca;
    protected String modelo;
    protected int anhofabricacion;

    public String getMartricula() {
        return martricula;
    }
    public void setMartricula(String martricula) {
        this.martricula = martricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnhofabricacion() {
        return anhofabricacion;
    }
    public void setAnhofabricacion(int anhofabricacion) {
        this.anhofabricacion = anhofabricacion;        
    }
    public Vehiculo(String martricula, String marca, String modelo, int anhofabricacion) {
        this.martricula = martricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anhofabricacion = anhofabricacion;
    }

    public Vehiculo(){}

    public abstract void calcularImpuesto();

    public abstract void realizarMantenimiento();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Vehiculo{matricula="+martricula+", marca="+marca+", modelo"+modelo+" anhofabricacion="+anhofabricacion+"}";
    }
    
}
