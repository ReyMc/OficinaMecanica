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
public class Veiculo {
    private int id;
    private String modelo;
    private double kilometragem;
    private String placa;

    public Veiculo(int id, String modelo, double kilometragem, String placa) {
        this.id = id;
        this.modelo = modelo;
        this.kilometragem = kilometragem;
        this.placa = placa;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
