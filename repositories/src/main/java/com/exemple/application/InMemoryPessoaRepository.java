package com.exemple.application;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

public class InMemoryPessoaRepository implements PessoaRepository{

    final HashMap<Long, Pessoa> db = new HashMap<>();

    public InMemoryPessoaRepository() {
        db.put(1L, new Pessoa(1L, "", 23, LocalDateTime.now()));
        db.put(2L, new Pessoa(1L, "", 23, LocalDateTime.now()));
        db.put(3L, new Pessoa(1L, "", 23, LocalDateTime.now()));
        db.put(4L, new Pessoa(1L, "", 23, LocalDateTime.now()));
        db.put(5L, new Pessoa(1L, "", 23, LocalDateTime.now()));
        db.put(6L, new Pessoa(1L, "", 23, LocalDateTime.now()));
        db.put(7L, new Pessoa(1L, "", 23, LocalDateTime.now()));
        db.put(8L, new Pessoa(1L, "", 23, LocalDateTime.now()));
        db.put(9L, new Pessoa(1L, "", 23, LocalDateTime.now()));
    }

    @Override
    public Optional<Pessoa> findById(Long id) {
        return Optional.of(db.get(id));
    }

    @Override
    public Collection<Pessoa> findAll() {
        return db.values();
    }
}
