/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica;

/**
 *
 * @author goiar
 */
public class Servico {
    private int id;
    private Funcionario responsavel;
    private boolean status;
    private double preço; 
    private String tipo;
    private Veiculo veiculo;
    private ItemServico itemServico[];

    public Servico(int id, Funcionario responsavel, boolean status, double preço, String tipo, Veiculo veiculo, ItemServico[] itemServico) {
        this.id = id;
        this.responsavel = responsavel;
        this.status = status;
        this.preço = preço;
        this.tipo = tipo;
        this.veiculo = veiculo;
        this.itemServico = itemServico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
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
    
    
}
