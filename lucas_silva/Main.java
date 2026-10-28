// Main.java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ficheiros = List.of("Main.java", "Autor.java");

        // 1. Executando o CÓDIGO SUJO
        ProcessadorSujo sujo = new ProcessadorSujo();
        sujo.ProcessarSujo("Lucas", "lucas@email.com", "commit-123", ficheiros, "22:00");

        System.out.println(); // Linha em branco para separar

        // 2. Executando o CÓDIGO REFATORADO
        Autor autor = new Autor("Lucas", "lucas@email.com", "commit-123", ficheiros, "22:00");
        ProcessadorRefatorado refatorado = new ProcessadorRefatorado();
        refatorado.processarCommit(autor);
    }
}