package br.com.rene.model.bo;

import br.com.rene.model.pojo.PessoaFisica;

/**
 *
 * @author Rene
 */
class PessoaFisicaValidador implements Validador<PessoaFisica> {

    @Override
    public void validador(PessoaFisica t) throws Exception {
        System.out.println(t.getName() + '-' + getClass().getSimpleName());
    }
}