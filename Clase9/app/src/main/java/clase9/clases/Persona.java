
package clase9.clases;
import java.sql.SQLException;
import java.util.Scanner;


public class Persona extends ClaseBase {
    private String cedula;
    private String nombreCompleto;
    private String direccion;
    private String email;
    private Integer edad;
    private Scanner entrada = new Scanner(System.in);

    public Persona() {
    }

    public Persona(String cedula, String nombreCompleto, String direccion, String email, Integer edad) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", email=" + email + ", edad=" + edad + '}';
    }

    public void cargarDatosPersona() throws SQLException {

        System.out.println("Cedula:");
        this.setCedula(entrada.nextLine());

        System.out.println("Nombre:");
        this.setNombreCompleto(entrada.nextLine());

        System.out.println("Edad:");
        this.setEdad(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Direccion:");
        this.setDireccion(entrada.nextLine());

        System.out.println("Email:");
        this.setEmail(entrada.nextLine());

        baseDeDatos.insertarPersona(this);
    }

    public void actualizarDatosPersona() throws SQLException {
        System.out.println("Cedula:");
        this.setCedula(entrada.nextLine());

        System.out.println("Direccion:");
        this.setDireccion(entrada.nextLine());

        System.out.println("Email:");
        this.setEmail(entrada.nextLine());

        baseDeDatos.actualizarPersona(this);
    }

    public void eliminarDatosPersona() throws SQLException {
        System.out.println("Cedula:");
        this.setCedula(entrada.nextLine());

        baseDeDatos.eliminarPersona(this);
    }

    public void listarDatosPersona() throws SQLException {
        baseDeDatos.consultarPersona();
    }

    public void buscarPersonaPorCI() throws SQLException{
        System.err.println("Cedula:");
        this.setCedula(entrada.next());
        baseDeDatos.consultarPersonaPorCedula(this.cedula);
    }

}
