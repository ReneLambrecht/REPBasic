package br.com.rene.model.pojo;

import br.com.rene.util.ValidacaoException;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Rene
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_usuario")
    private Integer codigo;

    @Column(name = "nome_usuario", nullable = false)
    private String nome;

    @Column(name = "logim_usuario",unique = true,nullable = false)
    private String logim;

    @Column(name = "senha_usuario",nullable = false)
    private String senha;

    @Transient
    private String repitaSenha;

    public Usuario() {
    }

    public Usuario(Integer codigo, String nome, String senha, String logim, String repitaSenha) {
        this.codigo = codigo;
        this.nome = nome;
        this.senha = senha;
        this.repitaSenha = repitaSenha;
        this.logim = logim;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRepitaSenha() {
        return repitaSenha;
    }

    public void setRepitaSenha(String repitaSenha) {
        this.repitaSenha = repitaSenha;
    }

    public String getLogim() {
        return logim;
    }

    public void setLogim(String logim) {
        this.logim = logim;
    }

    public void validar() throws ValidacaoException {
        if (this.nome == null || this.nome.equals("")) {
            throw new ValidacaoException("Campo nome deve ter valor");
        }
        if (this.logim == null || this.logim.equals("")) {
            throw new ValidacaoException("Campo logim deve ter valor");
        }
        if (this.senha == null || this.senha.equals("")) {
            throw new ValidacaoException("Campo senha deve ter valor");
        }
        if (this.repitaSenha == null || this.repitaSenha.equals("")) {
            throw new ValidacaoException("Campo repita senha deve ter valor");
        }
        if (this.senha.equals(this.repitaSenha)) {
        } else {
            throw new ValidacaoException("Campo repita senha deve ser igual a senha");
        }
    }
}
