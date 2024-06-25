package Parcial3.Ejercicio2.Clases;

public class Perro extends Animal {
    private int idPerro;
    private int ladrido;
    private static int contFirulais;

    public int getIdPerro() {
        return idPerro;
    }
    public void setIdPerro(int idPerro) {
        this.idPerro = idPerro;
    }
    public int getLadrido() {
        return ladrido;
    }
    public void setLadrido(int ladrido) {
        this.ladrido = ladrido;
    }
    public Perro(int edad, String raza, int peso, String color, int ladrido) {
        super(edad, raza, peso, color);
        contFirulais++;
        this.idPerro = contFirulais;
        this.ladrido = ladrido;
    }
    public Perro(int idPerro, int ladrido) {
        this.idPerro = idPerro;
        this.ladrido = ladrido;
    }
   public Perro(){

   }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Perro [idPerro=" + idPerro + ", ladrido=" + ladrido + "]");
        return sb.toString();
    }
    
}
