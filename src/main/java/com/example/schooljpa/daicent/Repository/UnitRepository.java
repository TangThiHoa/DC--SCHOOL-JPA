package com.example.schooljpa.daicent.Repository;

import com.example.schooljpa.daicent.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit,Long> {
}
