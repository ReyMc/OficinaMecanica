package oficinamecanica;

import java.util.UUID;

public class Funcionario {
    private String id = UUID.randomUUID().toString();
    private String nome;
    private String setor;

    public Funcionario(int id, String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public Funcionario() {}

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }
}
