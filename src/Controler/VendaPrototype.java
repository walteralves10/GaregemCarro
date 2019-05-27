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
    
    public abstract void salvar();//inserir
    public abstract void limpar();
    public abstract void buscar(String temp);//select
    
    public abstract VendaPrototype clonar();
}
