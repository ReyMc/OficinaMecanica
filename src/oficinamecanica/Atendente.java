package oficinamecanica;

import java.util.UUID;

public class Atendente extends Funcionario{
    private String id = UUID.randomUUID().toString();
    private String funcao;

    public Atendente(String funcao) {
        this.funcao = funcao;
    }

    public Atendente() {}

    public String getId() {
        return id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Atendente{" +
                "id='" + id + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}
