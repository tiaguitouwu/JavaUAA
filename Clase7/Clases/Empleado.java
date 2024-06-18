package Clase7.Clases;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private int contIdEmpleado;

    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
        super(nombre,genero,edad,direccion);
        contIdEmpleado++;
        this.idEmpleado = contIdEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(int idEmpleado, double sueldo) {
        super();
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }
    public Empleado(){

    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Empleado [idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "]");
        return sb.toString();
    }
    

    

}
