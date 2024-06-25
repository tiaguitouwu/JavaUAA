package Parcial3.Ejercicio2.Clases;

public class Animal {
    private int edad;
    private String raza;
    private int peso;
    private String color;
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Animal(int edad, String raza, int peso, String color) {
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
        this.color = color;
    }
    public Animal() {
    }
    @Override
    public String toString() {
        return "Animal [edad=" + edad + ", raza=" + raza + ", peso=" + peso + ", color=" + color + "]";
    }
    
}
