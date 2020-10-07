package oficinamecanica;

public class Atendente {
    private int id;
    private String funcao;

    public Atendente(int id, String funcao) {
        this.id = id;
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
}
