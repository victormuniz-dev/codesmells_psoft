public class ProcessadorRefatorado {
    
    //SOLUÇÃO: o método recebe apena 1 parâmetro (o objeto Autor)
    public  void processarCommit(Autor autor){
        System.out.println("--- CÓDIGO REFATORADO ---");
        System.out.println("Processado commit do autor: " + autor.getNome());
        System.out.println("Email: " + autor.getEmail());
        System.out.println("ID do commit: " + autor.getIdCommit());
        System.out.println("Ficheiros modificados: " + autor.getFiles());
        System.out.println("Hora: " + autor.getTime());
    }
}
