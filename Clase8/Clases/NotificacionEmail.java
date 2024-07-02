package Clase8.Clases;

public class NotificacionEmail extends Notificacion {
    public NotificacionEmail(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando email a " + getDestinatario() + ": " + getMensaje());
    }
}
