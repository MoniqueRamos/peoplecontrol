package com.api.peoplecontrol.controllers;

import com.api.peoplecontrol.dtos.PessoaDto;
import com.api.peoplecontrol.models.Endereco;
import com.api.peoplecontrol.models.Pessoa;
import com.api.peoplecontrol.services.PessoaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {

        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<Object> savePessoa(@RequestBody @Valid PessoaDto pessoaDto){
        var pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaDto, pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.save(pessoa));
    }

    public ResponseEntity<List<Pessoa>> getAllPessoa(){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePessoa(@PathVariable(value="id") UUID id, @RequestBody @Valid PessoaDto pessoaDto){
        Optional<Pessoa> pessoaOptional = pessoaService.findById(id);
        if(!pessoaOptional.isPresent()){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada");
        }
        var pessoa = pessoaOptional.get();
        pessoa.setNome(pessoaDto.getNome());
        pessoa.setDataDeNascimento(pessoaDto.getDataDeNascimento());


        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.save(pessoa));
    }
}
