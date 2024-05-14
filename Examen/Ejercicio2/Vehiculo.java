package Examen.Ejercicio2;

public class Vehiculo {
    
    String marca,modelo,matricula,tipo;
    int añoFabricacion;

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    public Vehiculo(String marca, String modelo, String matricula, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
    }

    public Vehiculo(String marca, String modelo, String matricula, String tipo, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.tipo = tipo;
        this.añoFabricacion = añoFabricacion;
    }

    public int verificarAntiguedad(int añoActual){
        int antiguedad = añoActual - this.añoFabricacion;
        return antiguedad;
    }


    

    
    






}
