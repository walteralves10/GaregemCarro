/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import model.Cliente;

/**
 *
 * @author walte
 */
public abstract class ClientePrototype {

    protected String documento;
    protected String nome;
    protected String email;
    protected int sexo;

    public abstract void salvarCliente();//inserir
    //public abstract void limparCliente();
    public abstract Cliente buscarCliente(String temp);//select
    
    public abstract ClientePrototype clonarCliente();

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

}
