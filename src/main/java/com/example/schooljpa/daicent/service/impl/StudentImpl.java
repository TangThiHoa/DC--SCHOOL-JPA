package com.example.schooljpa.daicent.service.impl;

import com.example.schooljpa.daicent.Repository.StudentRepository;
import com.example.schooljpa.daicent.model.Student;
import com.example.schooljpa.daicent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);

    }

    @Override
    public void remove(Long id) {
        studentRepository.deleteById(id);

    }
}
