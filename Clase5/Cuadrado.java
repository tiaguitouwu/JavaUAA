package Clase5;

public class Cuadrado {
    double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double perimetro(){
        return lado*4;
    }
    public double area(){
        return lado*lado;
    }
}
