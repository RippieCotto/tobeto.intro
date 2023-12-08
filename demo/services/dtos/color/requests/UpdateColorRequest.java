package com.example.a.spring.into.services.dtos.color.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateColorRequest {

    @Positive(message = "id 0'dan büyük olmalıdır!")
    int id;
    @NotBlank(message = "Renk giriniz!")
    private String name;
}
