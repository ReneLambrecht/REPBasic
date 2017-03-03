package br.com.rene.model.pojo;

/**
 *
 * @author Rene
 */
public enum TipoType {
    
    CLIENTE(0),
    FORNECEDOR(1),
    REPRESENTANTE(2),
    TRANSPORTADORA(3),
    ASSISTENCIA(4);
    
    public int sequencia;
    
    private TipoType(int sequencia){
        this.sequencia = sequencia;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
    
}
