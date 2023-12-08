package com.example.a.spring.into.services.dtos.rentingProtocol.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateRentingProtocolRequest {

    @Positive(message = "id 0'dan büyük olmalıdır.")
    private int id;
    private String name;
    @NotNull(message = "Tarih Giriniz!")
    private LocalDate rentDate;

    @NotNull(message = "Dönüş Tarihi Giriniz!")
    private LocalDate returnDate;
}
