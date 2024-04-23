package Clase2.Ejercicio1y2;

public class Persona {
    
    private String nombre;
    private String apellido;
    private char sexo;
    private String cedula;
    private int edad;
    private String profesion;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Persona(){
        //Constructor Vacío
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }

    public Persona(String nombre, String apellido, char sexo, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.cedula = cedula;
    }
    
    public Persona(String nombre, String apellido, char sexo, String cedula, int edad, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.cedula = cedula;
        this.edad = edad;
        this.profesion = profesion;
    }

    

    


}
