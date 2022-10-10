package com.example.schooljpa.daicent.Repository;

import com.example.schooljpa.daicent.model.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepository extends JpaRepository<Clazz,Long> {
}
