package com.example.a.spring.into.services.dtos.color.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddColorRequest {

    @NotBlank(message = "Renk giriniz!")
    private String name;
}
