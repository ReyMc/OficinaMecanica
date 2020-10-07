package oficinamecanica;

import java.util.UUID;

public class ItemServico {
    private String id = UUID.randomUUID().toString();
    private String descricao;
    private boolean finalizada;
    private double preco;

    public ItemServico(String descricao, boolean finalizada, double preco) {
        this.descricao = descricao;
        this.finalizada = finalizada;
        this.preco = preco;
    }

    public ItemServico() {
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ItemServico{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                ", finalizada=" + finalizada +
                ", preco=" + preco +
                '}';
    }
}
