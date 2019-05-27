/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rezende
 */
public class AutomovelBEAN {
    
    private String placa;
    private int anoModelo;
    private int tipoVeiculo;
    private int combustivel;
    private String chassi;
    private String cor;
    private String modelo;        
    private String municipio;
    private double precoVenda;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(int tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
}
