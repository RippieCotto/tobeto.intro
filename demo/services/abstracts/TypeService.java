package com.example.a.spring.into.services.abstracts;

import com.example.a.spring.into.entities.Type;
import com.example.a.spring.into.services.dtos.type.requests.AddTypeRequest;
import com.example.a.spring.into.services.dtos.type.requests.DeleteTypeRequest;
import com.example.a.spring.into.services.dtos.type.requests.UpdateTypeRequest;
import com.example.a.spring.into.services.dtos.type.responses.GetListTypeResponse;

import java.util.List;

public interface TypeService {

    void add(AddTypeRequest request);
    void delete(DeleteTypeRequest request);
    void update(UpdateTypeRequest request);

    List<GetListTypeResponse> getByNameDto(String name);
    List<Type> getByName(String name);
}
