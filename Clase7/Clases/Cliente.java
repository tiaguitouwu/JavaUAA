package Clase7.Clases;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contIdCliente;

    //Constructor que recibe todos los parámetros
    public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip) {
        super(nombre,genero,edad,direccion);
        contIdCliente++;
        this.idCliente = contIdCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public Cliente(){

    }

    public Cliente(int idCliente){
        this.idCliente = idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Cliente [idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + "]");
        return sb.toString();
    }    
}
