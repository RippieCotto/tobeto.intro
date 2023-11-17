package com.example.a.spring.into.entities;

import jakarta.persistence.*;

import java.util.List;

//ORM => Object Relation Mapping
@Table(name = "cars") //Annotiation Bir tabloya karşılık gelir ve bu tablonun adı cars'dır
@Entity               //Annotiation Bu class bie entitydir
public class Car
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

    @Column(name = "model_year")
    private int modelYear;

    @Column(name = "model_name")
    private String modelName;


    @Column(name = "number_plate")
    private String numberPlate;

    @Column(name = "is_available")
    private boolean isAvailable;


    //TODO: ilişkisel tabloların alanlarını eklemek

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @OneToMany(mappedBy = "car")
    private List<Price> price;

    @OneToMany(mappedBy = "car")
    private List<RentingProtocol> rentingProtocol;


}
