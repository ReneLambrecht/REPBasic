package br.com.rene.model.pojo;

import br.com.rene.util.Coluna;
import br.com.rene.util.ValidacaoException;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rene
 */
@Entity
@Table(name = "unidade")
public class Unidade implements Serializable {
    
    private static final long serialVersionUID = 1L;
        
    @Id
    @Column(name = "cod_unidade",length = 5, nullable = false)
    private String cod;
    @Column(name = "desc_unidade",length = 20, nullable = false)
    private String descricao;

    public Unidade() {
    }

    public Unidade(String cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }
    
    @Coluna(nome = "Und", posicao = 0)
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    @Coluna(nome = "Descrição", posicao = 1)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void validar() throws ValidacaoException {
        if (this.cod == null || this.cod.equals("")) {
            throw new ValidacaoException("Campo unidade deve ter valor");
        }
        if (this.cod.length()>5) {
            throw new ValidacaoException("Campo unidade excede o maximo de caracter (5)");
        }
         if (this.descricao == null || this.descricao.equals("")) {
              throw new ValidacaoException("Campo descrição deve ter valor");
         }
          if (this.descricao.length()>20) {
              throw new ValidacaoException("Campo descrição excede o maximo de caracter (20)");
         }
    }
}
