/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jederson
 */
@Named
@RequestScoped
public class Controlador {
        
    private Pessoa pessoa = new Pessoa();
    private PessoaService service;
    
    public String salvar(){
        //service.salvar(pessoa);
        return "home.xhtml";
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    
    
}
