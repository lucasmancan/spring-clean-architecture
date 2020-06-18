package com.exemple.application;

import java.util.Collection;

public class BuscarPessoas {

    private final PessoaRepository pessoaRepository;

    public BuscarPessoas(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Collection<Pessoa> buscarPessoas() {
        return pessoaRepository.findAll();
    }
}
