package com.alura.imersao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repository;

    @GetMapping("/linguagens")
    public List<Linguagem> obeterLingugens() {
        return repository.findAll();
    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
        repository.save(linguagem);
        return linguagem;
    }
}
