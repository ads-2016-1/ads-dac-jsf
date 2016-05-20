/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac;


import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jederson
 */
@Named
@RequestScoped

public class Controlador implements Serializable{
     
    private Pessoa pessoa = new Pessoa();
    private PessoaService service = new PessoaService();
    
    public String redirect(){
           return "home.xhtml";
    }  
    
    public String salvar(){
        service.salvar(pessoa);
        return "home.xhtml";
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public List<Pessoa> todos(){
        return service.todos();
    }
    
    
    
    
}
