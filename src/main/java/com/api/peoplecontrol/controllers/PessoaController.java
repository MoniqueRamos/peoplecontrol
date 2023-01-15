package com.api.peoplecontrol.controllers;

import com.api.peoplecontrol.dtos.PessoaDto;
import com.api.peoplecontrol.models.Pessoa;
import com.api.peoplecontrol.services.PessoaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
}
