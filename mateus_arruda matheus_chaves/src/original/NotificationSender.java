package original;

public abstract class NotificationSender {

    public abstract void send(String recipient, String message);

    // Funcionalidade especulativa: não existe requisito para configurar tentativas.
    public void configureRetry(int attempts) {
        System.out.println("Configurando tentativas: " + attempts);
    }
}
