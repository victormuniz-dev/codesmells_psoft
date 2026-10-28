import java.util.List;

public class ProcessadorSujo {
    //PROBLEMA: lista longa de parâmetros(5 parâmetros soltos)
    public void ProcessarSujo(String nome, String email, String idCommit, List<String> files, String time ){
        System.out.println("---CÓDIGO SUJO ---");
        System.out.println("Processando commit do autor: " + nome);
        System.out.println("Email: " + email);
        System.out.println("ID do Commit: " + idCommit);
        System.out.println("Ficheiros modificados: " + files);
        System.out.println("Hora: " + time);
    }
}
