package com.example.a.spring.into.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Table(name = "employees")
@Entity
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "national_id")
    private int nationalId;

    @Column(name = "department")
    private String department;

    @Column(name = "title")
    private String title;

    @Column(name = "hiring_date")
    private LocalDate hiringDate;

    @Column(name = "leaving_date")
    private LocalDate leavingDate;

    @Column(name = "salary")
    private double salary;

    @OneToMany(mappedBy = "employee")
    private List<RentingProtocol> rentingProtocol;

}
