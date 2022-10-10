package com.example.schooljpa.daicent.service.impl;

import com.example.schooljpa.daicent.Repository.SchoolRepository;
import com.example.schooljpa.daicent.model.School;
import com.example.schooljpa.daicent.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    SchoolRepository schoolRepository;

    @Override
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @Override
    public Optional<School> findById(Long id) {
        return schoolRepository.findById(id);
    }

    @Override
    public void save(School school) {
        schoolRepository.save(school);

    }

    @Override
    public void remove(Long id) {
        schoolRepository.deleteById(id);

    }
}
