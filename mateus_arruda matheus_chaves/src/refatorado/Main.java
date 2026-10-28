package refatorado;

public class Main {

    public static void main(String[] args) {
        EmailNotificationSender sender = new EmailNotificationSender();

        sender.send(
            "lucas@email.com",
            "Seu commit foi processado."
        );
    }
}
