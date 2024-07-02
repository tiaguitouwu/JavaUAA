package Clase8.Clases;

public class NotificacionLlamada extends Notificacion {
    public NotificacionLlamada(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Realizando llamada a " + getDestinatario() + ", para enviar el mensaje " + getMensaje());
    }
}
