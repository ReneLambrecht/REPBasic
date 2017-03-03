package br.com.rene.model.pojo;

import br.com.rene.util.Coluna;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Rene
 */

@Entity
@Table(name = "pedido_compra")
public class PedidoCompra implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name = "cod_ped_compra", nullable = false)
    private int codigo;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "data_lanc_ped_compra", nullable = true)
    private Date dataLancamento;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_clifor", insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
   // @Column(name = "id_fornecedor", nullable = true)
    private ClienteFornecedor idFornecedor;
    
    @ManyToMany( fetch = FetchType.LAZY) //LAZY define que os dados podem ser obtidos por pesquisa
   @JoinTable(name = "iten_ped_compra", joinColumns ={@JoinColumn(name = "cod_ped_compra")},
            inverseJoinColumns = {@JoinColumn(name = "cod_item")})
    @Cascade(CascadeType.ALL)
    private Collection <Item> item;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "data_ent_ped_compra", nullable = false)
    private Date dataEntrega;
    
    @Column(name = "status_ped_compra", nullable = true)
    private String status;
    
     public PedidoCompra() {
    }

    public PedidoCompra(int codigo, Date dataLancamento, ClienteFornecedor idFornecedor, Collection<Item> item, Date dataEntrega, String status) {
        this.codigo = codigo;
        this.dataLancamento = dataLancamento;
        this.idFornecedor = idFornecedor;
        this.item = item;
        this.dataEntrega = dataEntrega;
        this.status = status;
    }
    
  @Coluna(nome = "Nº Doc",posicao = 0) 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //TIPOS DE FORMATAÇÃO
    //Moeda
    //@Coluna(nome="Preço", posicao=0, formato="R$ %,#.2f")
    //Data
    // @Coluna(nome="Data Lanç", posicao=2, formato="%1$td/%1$tm/%1$tY")
    
    
    @Coluna(nome="Data Lanç", posicao=2, formato="%1$td/%1$tm/%1$tY")
    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public ClienteFornecedor getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(ClienteFornecedor idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Collection<Item> getItem() {
        return item;
    }

    public void setItem(Collection<Item> item) {
        this.item = item;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
