package com.example.schooljpa.daicent.Repository;

import com.example.schooljpa.daicent.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School,Long> {
}
