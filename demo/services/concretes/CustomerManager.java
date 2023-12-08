package com.example.a.spring.into.services.concretes;

import com.example.a.spring.into.entities.Customer;
import com.example.a.spring.into.repositories.CustomerRepository;
import com.example.a.spring.into.services.abstracts.CustomerService;
import com.example.a.spring.into.services.dtos.customer.requests.AddCustomerRequest;
import com.example.a.spring.into.services.dtos.customer.requests.DeleteCustomerRequest;
import com.example.a.spring.into.services.dtos.customer.requests.UpdateCustomerRequest;
import com.example.a.spring.into.services.dtos.customer.responses.GetListCustomerResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    private CustomerRepository customerRepository;
    public CustomerManager(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void add(AddCustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setLastName(request.getLastName());
        customer.setPhone(request.getPhone());
        customer.setEMail(request.getEMail());

        customerRepository.save(customer);

    }

    @Override
    public void delete(DeleteCustomerRequest request) {
        Customer customerToDelete = customerRepository.findById(request.getId()).orElseThrow();
        customerRepository.delete(customerToDelete);

    }

    @Override
    public void update(UpdateCustomerRequest request) {
        Customer customerToUpdate = customerRepository.findById(request.getId()).orElseThrow();
        customerToUpdate.setName(request.getName());
        customerToUpdate.setLastName(request.getLastName());
        customerToUpdate.setPhone(request.getPhone());
        customerToUpdate.setEMail(request.getEMail());

        customerRepository.save(customerToUpdate);

    }

    @Override
    public List<GetListCustomerResponse> getByNameDto(String name) {
        return customerRepository.findByName(name);
    }

    @Override
    public List<Customer> getByName(String name) {
        return customerRepository.findByNameStartingWith(name);
    }
}
