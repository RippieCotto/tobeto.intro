package com.example.a.spring.into.services.dtos.car.responses;

import com.example.a.spring.into.entities.Brand;
import com.example.a.spring.into.services.dtos.brand.responses.GetListBrandResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCarResponse {

    private int id;
    private int modelYear;
    private String name;
    private String numberPlate;
    private boolean isAvailable;
    //private Brand brand; //Yanlış bilerek. EntitiYLEri dışarı açma
    //private String brandName
    //private int brandId
    private GetListBrandResponse brand;


}
