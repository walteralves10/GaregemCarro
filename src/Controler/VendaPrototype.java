/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

/**
 *
 * @author rezende
 */
public abstract class VendaPrototype {
    
    protected String fk_placa;
    protected String fk_documento;
    protected double valorFinal;
    protected int parcela;
    
    public abstract void salvarVenda();//inserir
    //public abstract void limparVenda();
    public abstract void buscarVenda(String temp);//select
    
    public abstract VendaPrototype clonarVenda();
    
        public String getFk_documento() {
        return fk_documento;
    }

    public void setFk_documento(String fk_documento) {
        this.fk_documento = fk_documento;
    }

    public String getFk_placa() {
        return fk_placa;
    }

    public void setFk_placa(String fk_placa) {
        this.fk_placa = fk_placa;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }
}
