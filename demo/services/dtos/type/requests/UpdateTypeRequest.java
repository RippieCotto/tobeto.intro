package com.example.a.spring.into.services.dtos.type.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateTypeRequest {
    @Positive(message = "id 0'dan büyük olmalıdır")
    private int id;
    @NotBlank(message = "Tip boş bırakılamaz")
    private String name;
}

