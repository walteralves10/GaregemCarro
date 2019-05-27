/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import model.Endereco;

/**
 *
 * @author walte
 */
public abstract class EnderecoPrototype {
    
    protected String fk_documento;
    protected String rua;
    protected String complemento;
    protected int numero;
    protected String bairro;
    protected int id_endereco;
    
    public abstract void salvarEndereco();//inserir
    //public abstract void limparEndereco();
    public abstract Endereco buscarEndereco(String temp);//select
    
    public abstract EnderecoPrototype clonarEndereco();    

    public String getFk_documento() {
        return fk_documento;
    }

    public void setFk_documento(String fk_documento) {
        this.fk_documento = fk_documento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }
    
    
    
}
