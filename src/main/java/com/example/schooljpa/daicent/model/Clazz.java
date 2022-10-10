package com.example.schooljpa.daicent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "clazz")
public class Clazz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;

    public Clazz(String name, Unit unit) {
        this.name = name;
        this.unit = unit;
    }

    public Clazz(Long id) {
        this.id = id;
    }
}
