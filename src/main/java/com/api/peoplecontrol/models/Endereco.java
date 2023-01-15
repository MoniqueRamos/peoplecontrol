package com.api.peoplecontrol.models;



import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name= "TB_ENDERECO")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "uuid-char")
    private UUID id_endereco;
    @Column(nullable = false)
    private String logradouro;
    @Column(nullable = false, length = 8)
    private String cep;
    @Column(nullable = false)
    private int numero;
    @Column(nullable = false)
    private String cidade;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    @JsonIgnore
    private Pessoa pessoa;

    public UUID getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(UUID id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
