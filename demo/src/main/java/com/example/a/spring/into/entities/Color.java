package com.example.a.spring.into.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "colors")
@Entity
public class Color {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "color")
    private String name;

    @OneToMany(mappedBy = "color")
    private List<Car> cars;
}
