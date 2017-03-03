package br.com.rene.model.bo;

import br.com.rene.model.pojo.Pessoa;
import br.com.rene.model.pojo.PessoaFisica;
import br.com.rene.model.pojo.PessoaJuridica;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rene
 * @param <T>
 */
    
    public class ValidatorStrategy<T>{
    Map<Class, Validador> map = null;

    public ValidatorStrategy(){

        // Cadastro dos vários tipos de validadores
        // para cara tipo de entidade.
        map = new HashMap<>();
        map.put(Pessoa.class, new PessoaValidador());
        map.put(PessoaFisica.class, new PessoaFisicaValidador());
        map.put(PessoaJuridica.class, new PessoaJuridicaValidador());
    }

    public Validador get(Class objectType){
        return map.get(objectType);
    }
}
