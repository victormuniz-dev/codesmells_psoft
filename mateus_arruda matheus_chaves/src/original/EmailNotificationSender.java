package original;

public class EmailNotificationSender extends NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Enviando e-mail para: " + recipient);
        System.out.println("Mensagem: " + message);
    }
}
