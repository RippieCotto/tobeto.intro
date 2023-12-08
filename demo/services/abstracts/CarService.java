package com.example.a.spring.into.services.abstracts;

import com.example.a.spring.into.entities.Car;
import com.example.a.spring.into.services.dtos.car.requests.AddCarRequest;
import com.example.a.spring.into.services.dtos.car.requests.DeleteCarRequest;
import com.example.a.spring.into.services.dtos.car.requests.UpdateCarRequest;
import com.example.a.spring.into.services.dtos.car.responses.GetListCarResponse;

import java.util.List;

public interface CarService {

    void add(AddCarRequest request);
    void delete(DeleteCarRequest request);
    void update(UpdateCarRequest request);

    List<GetListCarResponse> getByNameDto(String name);

    List<Car> getByName(String name);

    List<GetListCarResponse> getAll();


}
