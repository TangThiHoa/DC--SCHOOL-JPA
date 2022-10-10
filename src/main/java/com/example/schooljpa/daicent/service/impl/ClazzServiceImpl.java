package com.example.schooljpa.daicent.service.impl;

import com.example.schooljpa.daicent.Repository.ClazzRepository;
import com.example.schooljpa.daicent.model.Clazz;
import com.example.schooljpa.daicent.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    ClazzRepository clazzRepository;

    @Override
    public List<Clazz> findAll() {
        return clazzRepository.findAll();
    }

    @Override
    public Optional<Clazz> findById(Long id) {
        return clazzRepository.findById(id);
    }

    @Override
    public void save(Clazz clazz) {
        clazzRepository.save(clazz);

    }

    @Override
    public void remove(Long id) {
        clazzRepository.deleteById(id);

    }
}
