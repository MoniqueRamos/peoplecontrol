package com.api.peoplecontrol.dtos;


import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class EnderecoDto {

    @NotBlank
    private String logradouro;
    private String cep;
    private int numero;
    @NotBlank
    private String cidade;

    private Boolean principal;

    private UUID pessoaId;

    public EnderecoDto() {
        principal = false;
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

    public UUID getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(UUID pessoaId) {
        this.pessoaId = pessoaId;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }
}
