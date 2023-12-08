package com.example.a.spring.into.services.abstracts;

import com.example.a.spring.into.entities.Color;
import com.example.a.spring.into.services.dtos.color.requests.AddColorRequest;
import com.example.a.spring.into.services.dtos.color.requests.DeleteColorRequest;
import com.example.a.spring.into.services.dtos.color.requests.UpdateColorRequest;
import com.example.a.spring.into.services.dtos.color.responses.GetListColorResponse;

import java.util.List;

public interface ColorService {

    void add(AddColorRequest request);

    void delete(DeleteColorRequest request);

    void update(UpdateColorRequest request);

    List<GetListColorResponse> getByNameDto(String name);

    List<Color> getByName(String name);
}
