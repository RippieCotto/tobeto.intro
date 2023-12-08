package com.example.a.spring.into.services.dtos.brand.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UpdateBrandRequest {

    @NotNull
    int id;

    @NotBlank(message = "Marka adı boş bırakılamaz!")
    String name;
}
