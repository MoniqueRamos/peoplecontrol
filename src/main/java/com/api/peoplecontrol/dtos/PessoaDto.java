package com.api.peoplecontrol.dtos;

import com.api.peoplecontrol.models.Endereco;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

public class PessoaDto {

    @NotBlank
    private String nome;
    @NotBlank
    private Date dataDeNascimento;
    @NotBlank
    private List<Endereco> endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
}
