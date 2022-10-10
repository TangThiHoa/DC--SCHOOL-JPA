package com.example.schooljpa.daicent.service;

import java.util.List;
import java.util.Optional;

public interface IGeneral<T> {
    List<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}
