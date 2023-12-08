package com.example.a.spring.into.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "brands")
@Entity
@Getter
@Setter
public class Brand {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand")//değişken ismi tablodaki değil
    @JsonIgnore //sonsuz döngüyü engellemek için //JSON infinite recursion
     private List<Car> cars;

    //one-to-many ilişkide list olan değişlen
    //@onetomany
    //direkt class olan değişken @manytoone

}
