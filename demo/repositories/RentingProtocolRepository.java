package com.example.a.spring.into.repositories;

import com.example.a.spring.into.entities.RentingProtocol;
import com.example.a.spring.into.services.dtos.rentingProtocol.responses.GetListRentingProtocolResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentingProtocolRepository extends JpaRepository<RentingProtocol, Integer> {

    List<GetListRentingProtocolResponse> findByName(String name);

    List<RentingProtocol> findByNameStartingWith(String name);
}
