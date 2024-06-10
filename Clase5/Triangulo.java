package Clase5;

public class Triangulo {
    double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangulo() {
    }

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimetro (){
        return a+b+c;
    }

    public double area (){
        //se utiliza la fórmula bxh/2, que sugiere que el triangulo es equilatero o rectangulo,
        //por lo que se pueden hallar la base y la altura sin intervención del usuario
        double base=0,altura=0;

        if(a==b && a==c){ //Triangulo equilatero
            base = a/2;
            altura = Math.sqrt(Math.pow(b, 2) - Math.pow(base,2));
        }
        else{//Triangulo Rectangulo
            if (a>b && a>c){
                base = b;
                altura = c;
            }else if(b>a && b>c){
                base = a;
                altura = c;
            }else if(c>a && c>b){
                base = b;
                altura = a;
            }
        }

        return (base*altura)/2; //Medio area de un rectangulo!
    }

    


    
}
