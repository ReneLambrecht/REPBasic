package br.com.rene.model.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Rene
 */
@Entity
@Table(name = "contato")
public class Contato implements Serializable{
    
     private static final long serialVersionUID = 1L;
     
    @Id
    @SequenceGenerator(name = "seq_contato", sequenceName = "seq_contato_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pessoa", strategy = GenerationType.SEQUENCE)
    protected long id;
    @Column(name = "nome_contato",nullable = false, length = 50 )
    protected String nome;
    @Column(name = "telefone_contato")
    protected long telefone;
    @Column(name = "celular_contato")
    protected long celular;
    @Column(name = "email_contato")
    protected String email;
    @Column(name = "observacao_contato")
    protected String observacao;

    public Contato(long id, String nome, long telefone, long celular, String email, String observacao) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.observacao = observacao;
    }

    public Contato(String nome) {
        this.nome = nome;
    }

    public Contato() {
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contato other = (Contato) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", observacao=" + observacao + '}';
    }
    
}
