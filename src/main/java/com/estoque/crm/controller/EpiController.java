package com.estoque.crm.controller;

import com.estoque.crm.model.Epi;
import com.estoque.crm.repository.EpiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/epis")
public class EpiController {

    @Autowired
    private EpiRepository epiRepository;

    @GetMapping
    public List<Epi> listar(){
        return epiRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Epi adicionarEpi(@RequestBody Epi epi){
        return epiRepository.save(epi);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void removerEpi(@RequestBody Epi epi){
        epiRepository.delete(epi);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void atualizarEpi(@RequestBody Epi epi){
        epiRepository.save(epi);
    }

}