package Clase8.Clases;

public class NotificacionSMS extends Notificacion {
    public NotificacionSMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS al " + getDestinatario() + ", " + getMensaje());
    }
}

