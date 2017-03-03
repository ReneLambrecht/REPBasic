package br.com.rene.model.pojo;

import java.io.Serializable;

/**
 *
 * @author Rene
 */
public class PessoaJuridica extends Pessoa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    
    private String razaoSocial;
    private long CNPJ;

    public PessoaJuridica(String nome) {
        super();
    }

    public PessoaJuridica() {
    }
    
    

    public String getName() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
