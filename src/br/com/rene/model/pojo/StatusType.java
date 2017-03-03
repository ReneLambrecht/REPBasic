package br.com.rene.model.pojo;

/**
 *
 * @author Rene
 */
public enum StatusType {
    
    SELECIONAR(0),
    ATIVO(1),
    INATIVO(2),
    BLOQUEIO_FINANCEIRO(3);
    
    public int descricao;

    private StatusType(int descricao) {
        this.descricao = descricao;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }
}
