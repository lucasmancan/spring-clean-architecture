package com.exemple.application;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class PessoaController {

    private final BuscarPessoa buscarPessoa;
    private final BuscarPessoas buscarPessoas;

    public PessoaController(BuscarPessoa buscarPessoa, BuscarPessoas buscarPessoas) {
        this.buscarPessoa = buscarPessoa;
        this.buscarPessoas = buscarPessoas;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Pessoa get(@PathVariable Long id){
        return buscarPessoa.buscarPessoa(id);
    }

    @GetMapping
    @ResponseBody
    public Collection<Pessoa> getAll(){
        return buscarPessoas.buscarPessoas();
    }
}
