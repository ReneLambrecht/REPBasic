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
@Table(name = "endereco")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_endereco", strategy = GenerationType.SEQUENCE)
    protected long id;
    @Column(name = "endereco_endereco")
    protected String endereco;
    @Column(name = "complemento_endereco")
    protected String complemento;
    @Column(name = "referencia_endereco")
    protected String referencia;
    @Column(name = "municipio_endereco")
    protected String municipio;
    @Column(name = "uf_endereco")
    protected String uf;
    @Column(name = "pais_endereco")
    protected String pais;
    @Column(name = "cep_endereco")
    protected int cep;

    public Endereco(long id, String endereco, String complemento, String referencia, String municipio, String UF, String pais, int CEP) {
        this.id = id;
        this.endereco = endereco;
        this.complemento = complemento;
        this.referencia = referencia;
        this.municipio = municipio;
        this.uf = UF;
        this.pais = pais;
        this.cep = CEP;
    }

    public Endereco(long id) {
        this.id = id;
    }

    public Endereco() {
    }

    public long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUF() {
        return uf;
    }

    public void setUF(String UF) {
        this.uf = UF;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCEP() {
        return cep;
    }

    public void setCEP(int CEP) {
        this.cep = CEP;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Endereco other = (Endereco) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", endereco=" + endereco + ", complemento=" + complemento + ", referencia=" + referencia + ", municipio=" + municipio + ", UF=" + uf + ", pais=" + pais + ", CEP=" + cep + '}';
    }
}
