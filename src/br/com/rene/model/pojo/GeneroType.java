package br.com.rene.model.pojo;

/**
 *
 * @author Rene
 */
public enum GeneroType {

    M("Masculino"), F("Femenino");

    public String descricao;
    

    private GeneroType(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
