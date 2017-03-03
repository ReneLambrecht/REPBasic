package br.com.rene.model.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Rene
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pessoa",strategy = GenerationType.SEQUENCE)
    private long id;
   @NotNull(message = "nome não pode ser nulo")
   // @not
    protected String nome;
    private TipoPessoaType tipoPessoa;
    private TipoType tipo;

    private StatusType status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seq_endereco", nullable = false, insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Endereco enderecoEntrega;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seq_contato", nullable = false, insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Contato contato;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;
    private String caracteristica;

    public Pessoa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(long id) {
        this.id = id;
    }

    public Pessoa() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPessoaType getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoaType tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public TipoType getTipo() {
        return tipo;
    }

    public void setTipo(TipoType tipo) {
        this.tipo = tipo;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", tipoPessoa=" + tipoPessoa + ", tipo=" + tipo + ", status=" + status + ", enderecoEntrega=" + enderecoEntrega + ", contato=" + contato + ", dataCadastro=" + dataCadastro + ", caracteristica=" + caracteristica + '}';
    }
}
