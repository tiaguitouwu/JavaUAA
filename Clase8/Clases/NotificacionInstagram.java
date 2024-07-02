package Clase8.Clases;

public class NotificacionInstagram extends Notificacion {
    public NotificacionInstagram(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje a Instagram al usuario: " + getDestinatario() + ": " + getMensaje());
    }
}
