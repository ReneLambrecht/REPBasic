package br.com.rene.model.pojo;

/**
 *
 * @author Rene
 */
public enum TipoPessoaType {
    
    PESSOA_FISICA(0),
    PESSOA_JURIDICA(1);
    
    public int sequencia;
    
    private TipoPessoaType(int sequencia){
        this.sequencia = sequencia;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
    
}
