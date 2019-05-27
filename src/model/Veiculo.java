/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controler.VeiculoPrototype;

/**
 *
 * @author rezende
 */
public class Veiculo extends VeiculoPrototype{
    
    public Veiculo(Veiculo v){
        this.placa = v.placa;
        this.anoModelo = v.anoModelo;
        this.tipoVeiculo = v.tipoVeiculo;
        this.combustivel = v.combustivel;
        this.chassi = v.chassi;
        this.cor = v.cor;
        this.modelo = v.modelo;
        this.municipio = v.municipio;
        this.precoVenda = v.precoVenda;
    }
    
    public Veiculo(){
        placa = "";
        anoModelo = 0;
        tipoVeiculo = 0;
        combustivel = 0;
        chassi = "";
        cor = "";
        modelo = "";
        municipio = "";
        precoVenda = 0.0;
    }

    @Override
    public void salvarVeiculo() {
        
    }


    @Override
    public void buscarVeiculo(String temp) {
        
    }

    @Override
    public VeiculoPrototype clonarVeiculo() {
        return new Veiculo(this);
    }
    
}
