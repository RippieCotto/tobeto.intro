package com.example.a.spring.into.repositories;

import com.example.a.spring.into.entities.Customer;
import com.example.a.spring.into.services.dtos.customer.responses.GetListCustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<GetListCustomerResponse> findByName(String name);

    List<Customer> findByNameStartingWith(String name);
}
