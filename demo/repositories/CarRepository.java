package com.example.a.spring.into.repositories;

import com.example.a.spring.into.entities.Car;
import com.example.a.spring.into.services.dtos.brand.responses.GetListBrandResponse;
import com.example.a.spring.into.services.dtos.car.responses.GetListCarResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    List<GetListCarResponse> findByName(String name);

    List<Car> findByNameStartingWith(String name);

    @Query("Select new com.example.a.spring.into.services.dtos.car.responses.GetListCarResponse" +
            "(c.id, c.modelYear, new com.example.a.spring.into.services.dtos.car.responses.GetListCarResponse(b.id, b.name) )" +
            " FROM Car c INNER JOIN c.brand b")
    List<GetListCarResponse> getAll();

    boolean existsCarByNumberPlate(String numberPlate);
}
