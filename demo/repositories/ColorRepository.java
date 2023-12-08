package com.example.a.spring.into.repositories;

import com.example.a.spring.into.entities.Color;
import com.example.a.spring.into.services.dtos.color.responses.GetListColorResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColorRepository extends JpaRepository<Color, Integer> {
    List<GetListColorResponse> findByName(String name);

    List<Color> findByNameStartingWith(String name);


}
