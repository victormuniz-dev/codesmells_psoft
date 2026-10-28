package refatorado;

public class EmailNotificationSender {

    public void send(String recipient, String message) {
        System.out.println("Enviando e-mail para: " + recipient);
        System.out.println("Mensagem: " + message);
    }
}
