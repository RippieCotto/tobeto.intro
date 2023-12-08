package com.example.a.spring.into.services.abstracts;

import com.example.a.spring.into.entities.Price;
import com.example.a.spring.into.services.dtos.price.requests.AddPriceRequest;
import com.example.a.spring.into.services.dtos.price.requests.DeletePriceRequest;
import com.example.a.spring.into.services.dtos.price.requests.UpdatePriceRequest;
import com.example.a.spring.into.services.dtos.price.responses.GetListPriceResponse;

import java.util.List;

public interface PriceService {

    void add(AddPriceRequest request);
    void delete(DeletePriceRequest request);
    void update(UpdatePriceRequest request);

    List<GetListPriceResponse> getByNameDto(String name);

    List<Price> getByName(String name);
}
