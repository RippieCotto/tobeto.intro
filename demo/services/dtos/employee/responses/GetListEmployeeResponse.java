package com.example.a.spring.into.services.dtos.employee.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListEmployeeResponse {
    private String name;
    private String lastName;
    private String phone;
    private String eMail;
    private String department;
    private String title;
    private double salary;
}
