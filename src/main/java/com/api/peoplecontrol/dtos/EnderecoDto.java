package com.api.peoplecontrol.dtos;

import com.api.peoplecontrol.models.Pessoa;

import javax.validation.constraints.NotBlank;

public class EnderecoDto {

    @NotBlank
    private String logradouro;
    @NotBlank
    private int cep;
    @NotBlank
    private int numero;
    @NotBlank
    private String cidade;
    @NotBlank
    private Pessoa pessoa;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
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
