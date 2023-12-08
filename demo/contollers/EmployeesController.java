package com.example.a.spring.into.contollers;

import com.example.a.spring.into.entities.Employee;
import com.example.a.spring.into.repositories.EmployeeRepository;
import com.example.a.spring.into.services.abstracts.EmployeeService;
import com.example.a.spring.into.services.dtos.employee.requests.AddEmployeeRequest;
import com.example.a.spring.into.services.dtos.employee.requests.DeleteEmployeeRequest;
import com.example.a.spring.into.services.dtos.employee.requests.UpdateEmployeeRequest;
import com.example.a.spring.into.services.dtos.employee.responses.GetListEmployeeResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeesController {
    private EmployeeService employeeService;
    public EmployeesController(EmployeeService employeeService){
        this.employeeService = employeeService; }

    @GetMapping
    public List<Employee> getByName(@RequestParam String name){
        return employeeService.getByName(name);
    }

    @GetMapping("dto")
    public List<GetListEmployeeResponse> getByNameDto(@RequestParam String name){
        return  employeeService.getByNameDto(name);
    }

    @PostMapping
    public void add(@RequestBody AddEmployeeRequest request){

        employeeService.add(request);

    }

    @DeleteMapping("{id}")
    public void delete(@RequestBody DeleteEmployeeRequest request){
        employeeService.delete(request);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateEmployeeRequest request){

        employeeService.update(request);

    }

}
