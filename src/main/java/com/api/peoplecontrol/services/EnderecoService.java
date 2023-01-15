package com.api.peoplecontrol.services;

import com.api.peoplecontrol.models.Endereco;
import com.api.peoplecontrol.models.Pessoa;
import com.api.peoplecontrol.repositories.EnderecoRepository;
import com.api.peoplecontrol.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class EnderecoService {

    final
    EnderecoRepository enderecoRepository;
    PessoaRepository pessoaRepository;

    public EnderecoService(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository) {
        this.enderecoRepository = enderecoRepository;
        this.pessoaRepository = pessoaRepository;

    }
    @Transactional
    public Endereco save(Endereco endereco, UUID id) {
        Optional<Pessoa> pessoa =  pessoaRepository.findById(id);
        if(pessoa.isPresent()) {
            endereco.setPessoa(pessoa.get());
        }
        return enderecoRepository.save(endereco);
    }
}
