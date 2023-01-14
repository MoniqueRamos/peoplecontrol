package com.api.peoplecontrol.services;

import com.api.peoplecontrol.models.Endereco;
import com.api.peoplecontrol.repositories.EnderecoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EnderecoService {

    final
    EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }
    @Transactional
    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}
