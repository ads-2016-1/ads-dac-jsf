/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jederson
 */
public class PessoaService {

    public void salvar(Pessoa pessoa) {
        
    }
    
    public List<Pessoa> todos(){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Raul Seixas"));
        pessoas.add(new Pessoa("Bob Marley"));
        return pessoas;
    }
    
}
