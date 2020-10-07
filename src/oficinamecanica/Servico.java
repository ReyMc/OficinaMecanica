package oficinamecanica;

import java.util.Arrays;
import java.util.UUID;

public class Servico {
    private String id = UUID.randomUUID().toString();
    private Funcionario responsavel;
    private boolean status;
    private double preco;
    private String tipo;
    private Veiculo veiculo;
    private ItemServico itemServico[];

    public Servico(Funcionario responsavel, boolean status, double preco, String tipo, Veiculo veiculo, ItemServico[] itemServico) {
        this.responsavel = responsavel;
        this.status = status;
        this.preco = preco;
        this.tipo = tipo;
        this.veiculo = veiculo;
        this.itemServico = itemServico;
    }

    public Servico() {}

    public String getId() {
        return id;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public ItemServico[] getItemServico() {
        return itemServico;
    }

    public void setItemServico(ItemServico[] itemServico) {
        this.itemServico = itemServico;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id='" + id + '\'' +
                ", responsavel=" + responsavel +
                ", status=" + status +
                ", preco=" + preco +
                ", tipo='" + tipo + '\'' +
                ", veiculo=" + veiculo +
                ", itemServico=" + Arrays.toString(itemServico) +
                '}';
    }
}
