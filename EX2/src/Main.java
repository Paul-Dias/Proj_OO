import java.util.List;

interface INotificador {
    void enviar(String mensagem, String destinatario);
}

class NotificadorEmail implements INotificador {
    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando e-mail" + destinatario + ": " + mensagem);
    }
}

class NotificadorSMS {
    void enviarSMS(String mensagem, String destinatario) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}

class AdaptadorSMS extends NotificadorSMS implements INotificador {
    @Override
    public void enviar(String mensagem, String destinatario) {
        enviarSMS(mensagem, destinatario);
    }
}

class NotificadorPush {
    void enviarPush(String mensagem, String idDestinatario) {
        System.out.println("Enviando PUSH para " + idDestinatario + ": " + mensagem);
    }
}

class AdaptadorPush extends NotificadorPush implements INotificador {
    @Override
    public void enviar(String mensagem, String idDestinatario) {
        enviarPush(mensagem, idDestinatario);
    }
}


public class Main {
    public static void main(String[] args) {
        // Demonstração de usos


        INotificador notificadorEmail = new NotificadorEmail();
        notificadorEmail.enviar("Olá! Mundo e-mail.", "paulo@email.com");

        INotificador adaptadorSMS = new AdaptadorSMS();
        adaptadorSMS.enviar("Olá! Mundo SMS.", "561416146");

        INotificador adaptadorPush = new AdaptadorPush();
        adaptadorPush.enviar("Olá! Mundo push.", "1515165");
    }
}
