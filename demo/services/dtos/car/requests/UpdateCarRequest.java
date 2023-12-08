package com.example.a.spring.into.services.dtos.car.requests;

import com.example.a.spring.into.entities.Brand;
import com.example.a.spring.into.entities.Color;
import com.example.a.spring.into.entities.Type;
import lombok.Data;

@Data
public class UpdateCarRequest {
    private int id;
    private int modelYear;
    private String name;
    // private Brand brand_id;
    private String numberPlate;
    // private Type type_id;
    // private Color color_id;
    private boolean isAvailable;
}
