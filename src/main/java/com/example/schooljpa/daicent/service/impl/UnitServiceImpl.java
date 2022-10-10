package com.example.schooljpa.daicent.service.impl;

import com.example.schooljpa.daicent.Repository.UnitRepository;
import com.example.schooljpa.daicent.model.Unit;
import com.example.schooljpa.daicent.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitServiceImpl implements UnitService {
    @Autowired
    UnitRepository unitRepository;
    @Override
    public List<Unit> findAll() {
        return unitRepository.findAll();
    }

    @Override
    public Optional<Unit> findById(Long id) {
        return unitRepository.findById(id);
    }

    @Override
    public void save(Unit unit) {
        unitRepository.save(unit);

    }

    @Override
    public void remove(Long id) {
        unitRepository.deleteById(id);

    }
}
