package mercado;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private PerfilConta perfil;
    private List<Endereco> enderecos;

    public Cliente(String nome, String cpf, PerfilConta perfil, List<Endereco> enderecos) {
        this.nome = nome;
        this.cpf = cpf;
        this.perfil = (perfil != null) ? perfil : new PerfilStandard();
        this.enderecos = (enderecos != null) ? enderecos : new ArrayList<>();
    }

    public PerfilConta getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilConta perfil) {
        this.perfil = (perfil != null) ? perfil : new PerfilStandard();
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
