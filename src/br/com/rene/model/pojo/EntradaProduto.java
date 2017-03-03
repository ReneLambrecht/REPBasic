/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rene.model.pojo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author PLASMAT
 */
//@Entity
//@Table(name = "compra")
public class EntradaProduto implements Serializable {
    
    //@Id
   // @Column(name = "doc_compra", nullable = false)
    private int docCompra;

    //@Temporal(TemporalType.DATE)
    //@Column(name = "data_compra")
    private Date dataCompra;
    
     //@ManyToMany(fetch = FetchType.LAZY)
   // @JoinTable(name="item_compra", joinColumns = {@JoinColumn(name="doc_compra")}, 
          //  inverseJoinColumns = {@JoinColumn(name="cod_item")})
   // @Cascade(CascadeType.ALL)
   // private Collection <Item> item;
     
    //@Column(name = "fornec_compra",nullable = false)
    private ClienteFornecedor fornecedor;
    
   
    
    public EntradaProduto(int docCompra, Date dataCompra, ClienteFornecedor fornecedor, Collection<Item> item) {
        this.docCompra = docCompra;
        this.dataCompra = dataCompra;
        this.fornecedor = fornecedor;
    }
    
    public EntradaProduto(){
        this.fornecedor = new ClienteFornecedor();
    }

    public int getDocCompra() {
        return docCompra;
    }

    public void setDocCompra(int docCompra) {
        this.docCompra = docCompra;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public ClienteFornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(ClienteFornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    
}

   


