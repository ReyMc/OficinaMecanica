package oficinamecanica;

import java.util.UUID;

public class Mecanico extends Funcionario{

    private String id = UUID.randomUUID().toString();
    private String funcao;

    public Mecanico(String id, String funcao) {
        this.id = id;
        this.funcao = funcao;
    }

    public Mecanico() {}

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
        return "Mecanico{" +
                "id='" + id + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}
