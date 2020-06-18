package com.exemple.application;

public class BuscarPessoa {

    private final PessoaRepository pessoaRepository;

    public BuscarPessoa(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa buscarPessoa(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }
}
