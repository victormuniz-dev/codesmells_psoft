package mercado;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private boolean premium;
    private boolean estudante;
    private List<Endereco> enderecos;

    public Cliente(String nome, String cpf, boolean premium, boolean estudante, List<Endereco> enderecos) {
        this.nome = nome;
        this.cpf = cpf;
        this.premium = premium;
        this.estudante = estudante;
        this.enderecos = (enderecos != null) ? enderecos : new ArrayList<>();
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public void addEndereco(Endereco endereco) {
        if (endereco != null) {
            this.enderecos.add(endereco);
        }
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
