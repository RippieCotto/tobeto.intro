package com.example.a.spring.into.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "brands")
@Entity
public class Brand {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand")//değişken ismi tablodaki değil
    private List<Car> cars;

    //one-to-many ilişkide list olan değişlen
    //@onetomany
    //direkt class olan değişken @manytoone

}
