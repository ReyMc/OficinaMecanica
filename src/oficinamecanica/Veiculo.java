/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecanica;

import java.util.UUID;

/**
 *
 * @author goiar
 */
public class Veiculo {
    private String id = UUID.randomUUID().toString();
    private String modelo;
    private double kilometragem;
    private String placa;

    public Veiculo(String modelo, double kilometragem, String placa) {
        this.modelo = modelo;
        this.kilometragem = kilometragem;
        this.placa = placa;
    }
    public Veiculo() {}
    
    public String getId() {
        return id;
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

    @Override
    public String toString() {
        return "Veiculo{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometragem=" + kilometragem +
                ", placa='" + placa + '\'' +
                '}';
    }
}
