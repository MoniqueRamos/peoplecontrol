package com.api.peoplecontrol.services;

import com.api.peoplecontrol.models.Pessoa;
import com.api.peoplecontrol.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PessoaService {

    final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
    @Transactional
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }
}
