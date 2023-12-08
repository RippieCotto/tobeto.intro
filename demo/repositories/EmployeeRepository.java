package com.example.a.spring.into.repositories;

import com.example.a.spring.into.entities.Employee;
import com.example.a.spring.into.services.dtos.employee.responses.GetListEmployeeResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<GetListEmployeeResponse> findByName(String name);
    List<Employee> findByNameStartingWith(String name);
}
