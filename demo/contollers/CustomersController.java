package com.example.a.spring.into.contollers;


import com.example.a.spring.into.entities.Customer;
import com.example.a.spring.into.repositories.CustomerRepository;
import com.example.a.spring.into.services.abstracts.CustomerService;
import com.example.a.spring.into.services.dtos.car.requests.AddCarRequest;
import com.example.a.spring.into.services.dtos.car.requests.UpdateCarRequest;
import com.example.a.spring.into.services.dtos.customer.requests.AddCustomerRequest;
import com.example.a.spring.into.services.dtos.customer.requests.DeleteCustomerRequest;
import com.example.a.spring.into.services.dtos.customer.requests.UpdateCustomerRequest;
import com.example.a.spring.into.services.dtos.customer.responses.GetListCustomerResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomersController {

    private CustomerService customerService;
    public CustomersController(CustomerService customerService){

        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getByName(@RequestParam String name){


        return customerService.getByName(name);
    }

    @GetMapping("dto")
    public List<GetListCustomerResponse> getByNameDto(@RequestParam String name){
        return customerService.getByNameDto(name);
    }

    @PostMapping
    public void add(@RequestBody AddCustomerRequest request){

    customerService.add(request);

    }

    @DeleteMapping("{id}")
    public void delete(@RequestBody DeleteCustomerRequest request){
      customerService.delete(request);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateCustomerRequest request){

    customerService.update(request);

    }
}
