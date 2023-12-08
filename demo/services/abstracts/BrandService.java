package com.example.a.spring.into.services.abstracts;

import com.example.a.spring.into.entities.Brand;
import com.example.a.spring.into.services.dtos.brand.requests.AddBrandRequest;
import com.example.a.spring.into.services.dtos.brand.requests.DeleteBrandRequest;
import com.example.a.spring.into.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.a.spring.into.services.dtos.brand.responses.GetListBrandResponse;

import java.util.List;

public interface BrandService {
    void add(AddBrandRequest request);
    List<Brand> getByName(String name);
    List<GetListBrandResponse> getByNameDto(String name);

    Brand getById(int id);



    void delete(DeleteBrandRequest request);

    void update(UpdateBrandRequest request);
}

