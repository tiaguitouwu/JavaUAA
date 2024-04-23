package Clase2.Ejercicio3;

public class Operacion {
    
    private float num1;
    private float num2;
    private float num3;
    private float num4;


    public float getNum1() {
        return num1;
    }
    public void setNum1(float num1) {
        this.num1 = num1;
    }
    public float getNum2() {
        return num2;
    }
    public void setNum2(float num2) {
        this.num2 = num2;
    }
    public float getNum3() {
        return num3;
    }
    public void setNum3(float num3) {
        this.num3 = num3;
    }
    public float getNum4() {
        return num4;
    }
    public void setNum4(float num4) {
        this.num4 = num4;
    }

    public Operacion() {
        
    }

    public Operacion(float num1, float num2, float num3, float num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
    


    public float suma(){
        float resultado;
        resultado = this.num1 + this.num2 + this.num3 + this.num4;
        return resultado;
    }

    public float resta(){
        float resultado;
        resultado = this.num1 - this.num2 - this.num3 - this.num4;
        return resultado;
    }

    public float multiplicacion(){
        float resultado;
        resultado = this.num1 * this.num2 * this.num3 * this.num4;
        return resultado;
    }

    public float division(){
        float resultado;
        resultado = this.num1 / this.num2 / this.num3 / this.num4;
        return resultado;
    }
    

     




}
