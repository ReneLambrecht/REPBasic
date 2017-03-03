package br.com.rene.model.pojo;

import br.com.rene.util.Coluna;
import br.com.rene.util.ValidacaoException;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Rene
 */
@Entity
@Table(name = "iten")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cod_item", nullable = false)
    private String codigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "und_unidade_item", nullable = false, insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Unidade undUnidade;

    @Column(name = "nome_item", nullable = false)
    private String nome;

    @Column(name = "tipo_item")
    private String tipo = "Não Definido";

    @Column(name = "vendido_item")
    private boolean vendido;

    @Column(name = "ativo_item")
    private boolean ativo;

    @ManyToMany(fetch = FetchType.LAZY) //LAZY define que os dados podem ser obtidos por pesquisa
    @JoinTable(name = "iten_ped_compra", joinColumns = {@JoinColumn(name = "cod_item")},
            inverseJoinColumns = {@JoinColumn(name = "cod_pedido_compra")})
    @Cascade(CascadeType.ALL)
    private Collection<PedidoCompra> pedidoComrpa;

    public Collection<PedidoCompra> getPedidoComrpa() {
        return pedidoComrpa;
    }

    public Item() {
        this.undUnidade = new Unidade();
    }

    public Item(String codigo, Unidade unidade, String nome, String tipo, boolean vendido, boolean ativo) {
        this.undUnidade = unidade;
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.vendido = vendido;
        this.ativo = ativo;
    }

    @Coluna(nome = "Item", posicao = 0)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Coluna(nome = "Und", posicao = 1)
    public Unidade getUndUnidade() {
        return undUnidade;
    }

    public void setUndUnidade(Unidade undUnidade) {
        this.undUnidade = undUnidade;
    }

    @Coluna(nome = "Nome", posicao = 3)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Coluna(nome = "Tipo", posicao = 4)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Coluna(nome = "Item", posicao = 5)
    public boolean getVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    @Coluna(nome = "Ativo", posicao = 6)
    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void validar() throws ValidacaoException {
        if (this.codigo == null || this.codigo.equals("")) {
            throw new ValidacaoException("Campo codigo deve ter valor");
        }
        if (this.undUnidade.getCod() == null || this.undUnidade.getCod().equals("")) {
            throw new ValidacaoException("Campo unidade deve ter valor");
        }
        if (this.nome == null || this.nome.equals("")) {
            throw new ValidacaoException("Campo nome deve ter valor");
        }
    }
}
