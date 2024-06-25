package Parcial3.Ejercicio2.Clases;

public class Gato extends Animal{
    private int idGato;
    private int ronroneo;
    private static int contMichi;

    public int getIdGato() {
        return idGato;
    }
    public void setIdGato(int idGato) {
        this.idGato = idGato;
    }
    public int getRonroneo() {
        return ronroneo;
    }
    public void setRonroneo(int ronroneo) {
        this.ronroneo = ronroneo;
    }
    public Gato(int edad, String raza, int peso, String color, int ronroneo) {
        super(edad, raza, peso, color);
        contMichi++;
        this.idGato = contMichi;
        this.ronroneo = ronroneo;
    }
    public Gato(int idGato, int ronroneo) {
        this.idGato = idGato;
        this.ronroneo = ronroneo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Gato [idGato=" + idGato + ", ronroneo=" + ronroneo + "]");
        return sb.toString();
    }   


    
}
