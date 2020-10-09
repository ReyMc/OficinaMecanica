package oficinamecanica;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Servico {
    private String id = UUID.randomUUID().toString();
    private Funcionario responsavel;
    private boolean status;
    private double precoTotal;
    private String tipo;
    private Veiculo veiculo;
    private List<ItemServico> itemServicos = new ArrayList<ItemServico>();


    public Servico(Funcionario responsavel, boolean status, double preco, String tipo, Veiculo veiculo) {
        this.responsavel = responsavel;
        this.status = status;
        this.precoTotal = preco;
        this.tipo = tipo;
        this.veiculo = veiculo;
    }

    public Servico() {}

    public boolean addItemServico(ItemServico itemParaAdd){
        return this.itemServicos.add(itemParaAdd);
    }

    /*public ItemServico encontraItemServico(String descricao){
        for(var item : this.itemServicos){
            if(item.getDescricao().contains(descricao)){
                return item;
            }
        }
        return null;
    }

    public double getTotal(){
        double total = 0;
        for(var item : this.itemServicos){
            total += item.getPreco();
        }
        return total;
    }*/

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

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
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

    public List<ItemServico> getItemServico() {
        return itemServicos;
    }

    public void setItemServico(List<ItemServico> itemServicos) {
        this.itemServicos = itemServicos;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id='" + id + '\'' +
                ", responsavel=" + responsavel +
                ", status=" + status +
                //", precoTotal=" + this.getTotal() +
                ", tipo='" + tipo + '\'' +
                ", veiculo=" + veiculo +
                ", itemServicos=" + itemServicos +
                '}';
    }
}
