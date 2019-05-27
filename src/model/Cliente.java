/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controler.ClientePrototype;
import java.sql.ResultSet;

/**
 *
 * @author rezende
 */
public class Cliente extends ClientePrototype {

    public Cliente(Cliente cliente) {
        this.documento = cliente.documento;
        this.email = cliente.email;
        this.nome = cliente.nome;
        this.sexo = cliente.sexo;
    }

    public Cliente() {
        documento = "";
        email = "";
        nome = "";
        sexo = 0;
    }
    
    public Cliente(String doc, String email, String nome, int sexo) {
        documento = doc;
        this.email = email;
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public void salvarCliente() {
        MySQLDAO.getConnection();
        String sql = "INSERT INTO clientes (documento, nome, email, sexo) VALUES (?,?,?,?)";
        MySQLDAO.executeQuery(sql, this.documento, this.nome, this.email, this.sexo);
    }

    @Override
    public Cliente buscarCliente(String temp) {
        Cliente obj = null;
        
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from clientes");
        try {
            while (rs.next()) {
                obj = (new Cliente(
                        rs.getString("documento"), 
                        rs.getString("email"),
                        rs.getString("nome"),
                        rs.getInt("sexo")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }

    @Override
    public ClientePrototype clonarCliente() {
        return new Cliente(this);
    }

}


/*

public ArrayList<DadosPessoaBEAN> findAllPessoas(DadosPessoaBEAN pessoa){
        return listaPessoas("SELECT * FROM dados_pessoa WHERE idpessoa=?", pessoa);
    }
    
    private ArrayList<DadosPessoaBEAN> listaPessoas(String sql, DadosPessoaBEAN pessoa){
        ArrayList<DadosPessoaBEAN> lista = new ArrayList<DadosPessoaBEAN>();
        
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(sql, pessoa.getId());
        try {
            while(rs.next()){
                lista.add(new DadosPessoaBEAN(rs.getString("nomepessoa"), rs.getInt("idadepessoa"), rs.getString("sexopessoa")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lista;
    }


*/