package Examen.Ejercicio1;

public class SumaImpares {
    
    int inicioRango, finRango, sumaImpares;

    public int getInicioRango() {
        return inicioRango;
    }

    public void setInicioRango(int inicioRango) {
        this.inicioRango = inicioRango;
    }

    public int getFinRango() {
        return finRango;
    }

    public void setFinRango(int finRango) {
        this.finRango = finRango;
    }

    public int getSumaImpares() {
        return sumaImpares;
    }

    public void setSumaImpares(int sumaImpares) {
        this.sumaImpares = sumaImpares;
    }

    public SumaImpares(int inicioRango, int finRango) {
        this.inicioRango = inicioRango;
        this.finRango = finRango;
    }

    public SumaImpares(){}

    public int suma(){

        for(int i=this.inicioRango; i <= this.finRango; i++){
            if (i % 2 != 0) {
                this.sumaImpares= this.sumaImpares + i;
            }
        } 

        return this.sumaImpares;
    }


}
