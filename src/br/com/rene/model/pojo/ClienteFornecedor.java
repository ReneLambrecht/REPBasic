package br.com.rene.model.pojo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rene
 */

@Entity
@Table(name = "cliente_fornecedor")
public class ClienteFornecedor implements Serializable  {
    
   @Id
   @GeneratedValue 
   @Column(name = "codigo_clifor",nullable = false)
    private int codigo;
   
    @Column(name = "razao_social",nullable = false)
    private String razaoSocial;
    
    @Column(nullable = false)
    private String cpfcnpj;
    
  //  @OneToMany(mappedBy = "cliente_fornecedor", fetch = FetchType.LAZY)
   // @Cascade(CascadeType.SAVE_UPDATE)
   // private Collection <Item> item;
    
    public ClienteFornecedor() {
        
    }
    
     public ClienteFornecedor(int codigo, String razaoSocial, String cpfcnpj, Collection<Item> item) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.cpfcnpj = cpfcnpj;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }
}
