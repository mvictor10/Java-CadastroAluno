/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadastro.app.model;

import br.cadastro.app.abstracts.model.AbstractModel;

/**
 *
 * @author mvictor
 */
public class PessoaFisica extends AbstractModel{
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
