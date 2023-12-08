package com.example.a.spring.into.repositories;

import com.example.a.spring.into.entities.Type;
import com.example.a.spring.into.services.dtos.type.responses.GetListTypeResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type, Integer> {
    List<GetListTypeResponse> findByName(String name);

    List<Type> findByNameStartingWith(String name);
}
