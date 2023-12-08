package com.example.a.spring.into.services.concretes;

import com.example.a.spring.into.entities.Employee;
import com.example.a.spring.into.repositories.EmployeeRepository;
import com.example.a.spring.into.services.abstracts.EmployeeService;
import com.example.a.spring.into.services.dtos.employee.requests.AddEmployeeRequest;
import com.example.a.spring.into.services.dtos.employee.requests.DeleteEmployeeRequest;
import com.example.a.spring.into.services.dtos.employee.requests.UpdateEmployeeRequest;
import com.example.a.spring.into.services.dtos.employee.responses.GetListEmployeeResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeRepository employeeRepository;
    public EmployeeManager(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void add(AddEmployeeRequest request) {
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setLastName(request.getLastName());
        employee.setPhone(request.getPhone());
        employee.setEMail(request.getEMail());
        employee.setDepartment(request.getDepartment());
        employee.setTitle(request.getTitle());
        employee.setSalary(request.getSalary());

    }

    @Override
    public void delete(DeleteEmployeeRequest request) {
        Employee employeeToDelete = employeeRepository.findById(request.getId()).orElseThrow();
        employeeRepository.delete(employeeToDelete);

    }

    @Override
    public void update(UpdateEmployeeRequest request) {
        Employee employeeToUpdate = employeeRepository.findById(request.getId()).orElseThrow();
        employeeToUpdate.setName(request.getName());
        employeeToUpdate.setLastName(request.getLastName());
        employeeToUpdate.setPhone(request.getPhone());
        employeeToUpdate.setEMail(request.getEMail());
        employeeToUpdate.setDepartment(request.getDepartment());
        employeeToUpdate.setTitle(request.getTitle());
        employeeToUpdate.setSalary(request.getSalary());

        employeeRepository.save(employeeToUpdate);

    }

    @Override
    public List<GetListEmployeeResponse> getByNameDto(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public List<Employee> getByName(String name) {
        return employeeRepository.findByNameStartingWith(name);
    }
}
