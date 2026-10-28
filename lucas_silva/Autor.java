import java.util.List; 
public class Autor{
	private String nome; 
	private String email; 
	private String idCommit; 
	private List<String> files; 
	private String time; 
	
	// Construtor: recebe todos os dados de uma vez ao criar o objeto 
	public Autor(String autor, String email, String idCommit , List<String> ficheirosModificado, String time){
		this.nome = autor; 
		this.email = email; 
		this.idCommit = idCommit; 
		this.files = ficheirosModificado; 
		this.time = time; 
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getIdCommit() {
		return idCommit;
	}

	public List<String> getFiles() {
		return files;
	}

	public String getTime() {
		return time;
	}
}
	

	
