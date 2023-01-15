package com.api.peoplecontrol.services;

import com.api.peoplecontrol.models.Endereco;
import com.api.peoplecontrol.models.Pessoa;
import com.api.peoplecontrol.repositories.EnderecoRepository;
import com.api.peoplecontrol.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PessoaService {

    final PessoaRepository pessoaRepository;
    EnderecoRepository enderecoRepository;

    public PessoaService(PessoaRepository pessoaRepository, EnderecoRepository enderecoRepository) {
        this.pessoaRepository = pessoaRepository;
        this.enderecoRepository = enderecoRepository;
    }
    @Transactional
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> findById(UUID id){
        return pessoaRepository.findById(id);
    }

    public List<Endereco> findEnderecosByPessoaId(UUID pessoaId){
        return enderecoRepository.findAllByPessoaId(pessoaId);
    }
}
