package br.com.rene.model.pojo;

import java.io.Serializable;

/**
 *
 * @author Rene
 */
public class PessoaFisica extends Pessoa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private GeneroType genero;
    private int CPF;

    public char getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
