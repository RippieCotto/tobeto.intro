package com.example.a.spring.into.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "renting_protocols")
@Entity
public class RentingProtocol {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "rent_date")
    private LocalDate rentDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "price_id")
    private Price price;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;




}
