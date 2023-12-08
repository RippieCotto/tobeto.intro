package com.example.a.spring.into.services.dtos.rentingProtocol.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListRentingProtocolResponse {
    private String name;
    private LocalDate rentDate;
    private LocalDate returnDate;
}
