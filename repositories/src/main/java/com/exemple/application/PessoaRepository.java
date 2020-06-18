package com.exemple.application;

import java.util.Collection;
import java.util.Optional;

public interface PessoaRepository {

    Optional<Pessoa> findById(Long id);

    Collection<Pessoa> findAll();
}
