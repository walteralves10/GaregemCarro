/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controler.VendaPrototype;

/**
 *
 * @author rezende
 */
public class Venda extends VendaPrototype{
    
    public Venda(Venda venda){
        this.fk_documento = venda.fk_documento;
        this.fk_placa = venda.fk_placa;
        this.parcela = venda.parcela;
        this.valorFinal = venda.valorFinal;
    }
    
    public Venda(){
        fk_documento = "";
        this.fk_placa = "";
        this.parcela = 0;
        this.valorFinal = 0.0;
    }
    
    @Override
    public void salvarVenda() {
        
    }



    @Override
    public void buscarVenda(String temp) {
        
    }

    @Override
    public VendaPrototype clonarVenda() {
        return new Venda(this);
    }

    
}
