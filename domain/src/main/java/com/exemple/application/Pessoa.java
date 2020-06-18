package com.exemple.application;

import java.time.LocalDateTime;


public class Pessoa {
    private Long id;
    private String nome;
    private Integer idade;
    private LocalDateTime criacao;

    public Pessoa(Long id, String nome, Integer idade, LocalDateTime criacao) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.criacao = criacao;
    }

    public Pessoa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDateTime getCriacao() {
        return criacao;
    }

    public void setCriacao(LocalDateTime criacao) {
        this.criacao = criacao;
    }
}
