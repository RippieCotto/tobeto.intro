package com.example.a.spring.into.services.dtos.price.responses;

import com.example.a.spring.into.entities.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListPriceResponse {
    private Car id;
    private double hourlyFee;
    private double dailyFee;
    private double monthlyFee;
    private String name;
}
