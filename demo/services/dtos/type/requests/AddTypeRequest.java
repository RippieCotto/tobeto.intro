package com.example.a.spring.into.services.dtos.type.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddTypeRequest {
    @NotBlank(message = "Tip boş bırakılamaz")
    private String name;
}
