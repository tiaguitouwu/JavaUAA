package Parcial3.Ejercicio2.Clases;

public class Conejo extends Animal {
    private int idConejo;
    private int salto;
    private static int contTapiti; 


    public int getIdConejo() {
        return idConejo;
    }
    public void setIdConejo(int idConejo) {
        this.idConejo = idConejo;
    }
    public int getSalto() {
        return salto;
    }
    public void setSalto(int salto) {
        this.salto = salto;
    }
    public Conejo(int edad, String raza, int peso, String color, int salto) {
        super(edad, raza, peso, color);
        contTapiti++;
        this.idConejo = contTapiti;
        this.salto = salto;
    }
    public Conejo(int idConejo, int salto) {
        this.idConejo = idConejo;
        this.salto = salto;
    }
    public Conejo() {

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Conejo [idConejo=" + idConejo + ", salto=" + salto + "]");
        return sb.toString();
    }
    
    
}
