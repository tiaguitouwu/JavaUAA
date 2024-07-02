package Clase8;

import Clase8.Clases.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases hijas
        Notificacion enviarEmail = new NotificacionEmail("email@example.com", "\n--> Este es un mensaje de email.");
        Notificacion enviarSMS = new NotificacionSMS("123-456-7890", "\n--> Este es un mensaje de SMS.");
        Notificacion enviarMensajeInstagram = new NotificacionInstagram("usuario123", "\n--> Este es un mensaje enviado por Instagram");
        Notificacion RealizarLlamada = new NotificacionLlamada("0991389313", "\n--> Este es una llamada.");
        Notificacion enviarFacebookMessenger = new NotificacionFacebook("TiagoMartínez", "\n--> Este es un mensaje a Facebook Messenger.");

        // Enviar las notificaciones
        enviarEmail.enviar();
        enviarSMS.enviar();
        enviarMensajeInstagram.enviar();
        RealizarLlamada.enviar();
        enviarFacebookMessenger.enviar();
    }
}
