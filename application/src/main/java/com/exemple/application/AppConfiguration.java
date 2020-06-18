package com.exemple.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    private final PessoaRepository repository = new InMemoryPessoaRepository();

    @Bean
    public BuscarPessoa buscarPessoa() {
        return new BuscarPessoa(repository);
    }

    @Bean
    public BuscarPessoas buscarPessoas() {
        return new BuscarPessoas(repository);
    }
}
