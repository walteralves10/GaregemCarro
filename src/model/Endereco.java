/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controler.EnderecoPrototype;
import java.sql.ResultSet;

/**
 *
 * @author walte
 */
public class Endereco extends EnderecoPrototype {

    public Endereco(Endereco e) {
        this.bairro = e.bairro;
        this.complemento = e.complemento;
        this.fk_documento = e.fk_documento;
        this.numero = e.numero;
        this.rua = e.rua;
        //this.id_endereco = e.id_endereco;
    }

    public Endereco(String bairro, String comp, String fk_doc, int num, String r /*int id*/) {
        this.bairro = bairro;
        this.complemento = comp;
        this.fk_documento = fk_doc;
        this.numero = num;
        this.rua = r;
        //this.id_endereco = id;
    }

    public Endereco() {
        bairro = "";
        complemento = "";
        fk_documento = "";
        numero = 0;
        rua = "";
        id_endereco = 0;
    }

    @Override
    public void salvarEndereco() {
        String sql = "INSERT INTO endereco (fk_documento, rua, complemento, numero, bairro) VALUES (?,?,?,?,?)";
        MySQLDAO.executeQuery(sql, this.fk_documento, this.rua, this.complemento, this.numero, this.bairro);
    }

    @Override
    public Endereco buscarEndereco(String temp) {
        Endereco obj = null;
        
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from endereco");
        try {
            while (rs.next()) {
                obj = (new Endereco(
                        rs.getString("bairro"), 
                        rs.getString("complemento"),
                        rs.getString("fk_documento"),
                        rs.getInt("numero"),
                        rs.getString("rua")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }

    @Override
    public EnderecoPrototype clonarEndereco() {
        return new Endereco(this);
    }

}
