package com.example.a.spring.into.services.abstracts;

import com.example.a.spring.into.entities.Customer;
import com.example.a.spring.into.services.dtos.customer.requests.AddCustomerRequest;
import com.example.a.spring.into.services.dtos.customer.requests.DeleteCustomerRequest;
import com.example.a.spring.into.services.dtos.customer.requests.UpdateCustomerRequest;
import com.example.a.spring.into.services.dtos.customer.responses.GetListCustomerResponse;

import java.util.List;

public interface CustomerService {

    void add(AddCustomerRequest request);

    void delete(DeleteCustomerRequest request);

    void update(UpdateCustomerRequest request);

    List<GetListCustomerResponse> getByNameDto(String name);

    List<Customer> getByName(String name);
}
