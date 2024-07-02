package Clase8.Clases;

public class NotificacionFacebook extends Notificacion {
    public NotificacionFacebook(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje a Facebook Messenger al usuario: " + getDestinatario() + ": " + getMensaje());
    }
}
