package com.example.a.spring.into.repositories;

import com.example.a.spring.into.entities.Price;
import com.example.a.spring.into.services.dtos.price.responses.GetListPriceResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Integer> {
    List<GetListPriceResponse> findByName(String name);

    List<Price> findByNameStartingWith(String name);
}
