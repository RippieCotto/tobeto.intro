package com.example.a.spring.into.services.dtos.customer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCustomerResponse {
    private String name;
    private String lastName;
    private String phone;
    private String eMail;
}
