package original;

public class Main {

    public static void main(String[] args) {
        NotificationSender sender = new EmailNotificationSender();

        sender.send(
            "lucas@email.com",
            "Seu commit foi processado."
        );
    }
}
