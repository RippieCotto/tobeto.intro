package com.example.a.spring.into.services.dtos.rentingProtocol.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AddRentingProtocolRequest {

    private String name;
    @NotNull(message = "Tarih Giriniz!")
    private LocalDate rentDate;

    @NotNull(message = "Dönüş Tarihi Giriniz!")
    private LocalDate returnDate;
}
