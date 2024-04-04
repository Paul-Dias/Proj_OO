import java.util.List;

interface INotificador {
    void enviar(String mensagem, String destinatario);
}

class NotificadorEmail implements INotificador {
    @Override
    public void enviar(String mensagem, String destinatario) {
        // Lógica para enviar e-mail
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
    }
}

class AdaptadorSMS implements INotificador {
    @Override
    public void enviar(String mensagem, String numero) {
        // Lógica para adaptar o envio de SMS
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }
}

class AdaptadorPush implements INotificador {
    @Override
    public void enviar(String mensagem, String idDispositivo) {
        // Lógica para adaptar o envio de notificação push
        System.out.println("Enviando notificação push para dispositivo " + idDispositivo + ": " + mensagem);
    }
}

public class Main {
    public static void main(String[] args) {
        // Demonstração de uso

        // E-mail
        INotificador notificadorEmail = new NotificadorEmail();
        notificadorEmail.enviar("Olá! Este é um e-mail de teste.", "exemplo@email.com");

        // SMS (utilizando adaptador)
        INotificador adaptadorSMS = new AdaptadorSMS();
        adaptadorSMS.enviar("Olá! Este é um SMS de teste.", "+1234567890");

        // Notificação push (utilizando adaptador)
        INotificador adaptadorPush = new AdaptadorPush();
        adaptadorPush.enviar("Olá! Esta é uma notificação push de teste.", "ID123456");
    }
}
