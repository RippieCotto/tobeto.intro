package com.example.a.spring.into.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "customers")
@Entity
@Getter
@Setter
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "national_id")
    private int nationalId;

    @Column(name = "driving_license_no")
    private int drivingLicenseNo;

    @OneToMany(mappedBy = "customer")
    private List<RentingProtocol> rentingProtocol;
}
