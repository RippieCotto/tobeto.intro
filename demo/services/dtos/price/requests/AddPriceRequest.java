package com.example.a.spring.into.services.dtos.price.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddPriceRequest {
    @Min(value = 50, message = "Saatlik ücret 50'den büyük olmalıdır. ")
    private double hourlyFee;

    @Min(value = 600, message = "Günlük ücret 600'den küçük olamaz!")
    private double dailyFee;

    @Min(value = 1500, message = "Aylık ücret 1500'den büyük olmalıdır.")
    private double monthlyFee;
    private String name;
}
