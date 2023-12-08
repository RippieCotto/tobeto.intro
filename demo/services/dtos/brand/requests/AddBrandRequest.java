package com.example.a.spring.into.services.dtos.brand.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddBrandRequest {

    @NotBlank(message = "Marka boş bırakılamaz!")
    private String name;
}
