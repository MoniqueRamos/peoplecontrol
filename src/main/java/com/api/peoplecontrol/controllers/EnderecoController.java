package com.api.peoplecontrol.controllers;

import com.api.peoplecontrol.dtos.EnderecoDto;
import com.api.peoplecontrol.models.Endereco;
import com.api.peoplecontrol.repositories.EnderecoRepository;
import com.api.peoplecontrol.services.EnderecoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    final EnderecoService enderecoService;
    public EnderecoController(EnderecoService enderecoService, EnderecoRepository enderecoRepository) {
        this.enderecoService = enderecoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveEndereco(@RequestBody @Valid EnderecoDto enderecoDto){
        var endereco = new Endereco();
        BeanUtils.copyProperties(enderecoDto, endereco);
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.save(endereco, enderecoDto.getPessoaId()));
    }
}
