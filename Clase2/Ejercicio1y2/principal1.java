package Clase2.Ejercicio1y2;

public class principal1 {
    
    public static void main(String[] args) {

        System.out.println("Bienvenido al Programa de Tiago - Ejercicio 1");

        Persona ps1 = new Persona("NombrePersona1","ApellidoPersona1",1);
        ps1.setSexo('M');
        ps1.setCedula("111111");
        ps1.setProfesion("ProfesionPersona1");

        Persona ps2 = new Persona("NombrePersona2","ApellidoPersona2","ProfesionPersona2");
        ps2.setSexo('F');
        ps2.setCedula("222222");
        ps2.setEdad(2);

        Persona ps3 = new Persona("NombrePersona3","ApellidoPersona3",'M',"333333");
        ps3.setEdad(3);
        ps3.setProfesion("ProfesionPersona3");

        Persona ps4 = new Persona("NombrePersona4","ApellidoPersona4",'M',"444444",1,"ProfesionPersona4");

        System.out.println("Personas Registradas");

        System.out.println("*********************");

        System.out.println("Persona 1");
        System.out.println("Nombre: " + ps1.getNombre());
        System.out.println("Apellido: " + ps1.getApellido());
        System.out.println("Sexo: " + ps1.getSexo());
        System.out.println("C.I.:" + ps1.getCedula());
        System.out.println("Edad: " + ps1.getEdad());
        System.out.println("Profesion: " + ps1.getProfesion());

        System.out.println("*********************");

        System.out.println("Persona 2");
        System.out.println("Nombre: " + ps2.getNombre());
        System.out.println("Apellido: " + ps2.getApellido());
        System.out.println("Sexo: " + ps2.getSexo());
        System.out.println("C.I.:" + ps2.getCedula());
        System.out.println("Edad: " + ps2.getEdad());
        System.out.println("Profesion: " + ps2.getProfesion());

        System.out.println("*********************");

        System.out.println("Persona 3");
        System.out.println("Nombre: " + ps3.getNombre());
        System.out.println("Apellido: " + ps3.getApellido());
        System.out.println("Sexo: " + ps3.getSexo());
        System.out.println("C.I.:" + ps3.getCedula());
        System.out.println("Edad: " + ps3.getEdad());
        System.out.println("Profesion: " + ps3.getProfesion());

        System.out.println("*********************");

        System.out.println("Persona 4");
        System.out.println("Nombre: " + ps4.getNombre());
        System.out.println("Apellido: " + ps4.getApellido());
        System.out.println("Sexo: " + ps4.getSexo());
        System.out.println("C.I.:" + ps4.getCedula());
        System.out.println("Edad: " + ps4.getEdad());
        System.out.println("Profesion: " + ps4.getProfesion());




    }

}
