package br.com.rene.model.bo;

import br.com.rene.model.pojo.PessoaJuridica;

/**
 *
 * @author Rene
 */
class PessoaJuridicaValidador implements Validador<PessoaJuridica> {

    @Override
    public void validador(PessoaJuridica o) throws Exception {
        System.out.println(o.getName() + '-' + getClass().getSimpleName());
    }
}
