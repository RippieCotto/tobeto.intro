package com.example.a.spring.into.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "prices")
@Entity
@Getter
@Setter
public class Price {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hourly_fee")
    private double hourlyFee;

    @Column(name = "daily_fee")
    private double dailyFee;

    @Column(name = "monthly_fee")
    private double monthlyFee;


    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @OneToMany(mappedBy = "price")
    private List<RentingProtocol> rentingProtocol;


}
