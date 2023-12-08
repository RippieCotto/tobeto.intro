package com.example.a.spring.into.services.abstracts;

import com.example.a.spring.into.entities.Employee;
import com.example.a.spring.into.services.dtos.employee.requests.AddEmployeeRequest;
import com.example.a.spring.into.services.dtos.employee.requests.DeleteEmployeeRequest;
import com.example.a.spring.into.services.dtos.employee.requests.UpdateEmployeeRequest;
import com.example.a.spring.into.services.dtos.employee.responses.GetListEmployeeResponse;

import java.util.List;

public interface EmployeeService {

    void add(AddEmployeeRequest request);

    void delete(DeleteEmployeeRequest request);

    void update(UpdateEmployeeRequest request);

    List<GetListEmployeeResponse> getByNameDto(String name);

    List<Employee> getByName(String name);
}
