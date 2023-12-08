package com.example.a.spring.into.services.concretes;

import com.example.a.spring.into.entities.RentingProtocol;
import com.example.a.spring.into.repositories.RentingProtocolRepository;
import com.example.a.spring.into.services.abstracts.RentingProtocolService;
import com.example.a.spring.into.services.dtos.rentingProtocol.requests.AddRentingProtocolRequest;
import com.example.a.spring.into.services.dtos.rentingProtocol.requests.DeleteRentingProtocolRequest;
import com.example.a.spring.into.services.dtos.rentingProtocol.requests.UpdateRentingProtocolRequest;
import com.example.a.spring.into.services.dtos.rentingProtocol.responses.GetListRentingProtocolResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentingProtocolManager implements RentingProtocolService {

    private RentingProtocolRepository rentingProtocolRepository;
    public RentingProtocolManager(RentingProtocolRepository rentingProtocolRepository){
        this.rentingProtocolRepository = rentingProtocolRepository;
    }

    @Override
    public void add(AddRentingProtocolRequest request) {
        RentingProtocol rentingProtocol = new RentingProtocol();
        rentingProtocol.setName(request.getName());
        rentingProtocol.setRentDate(request.getRentDate());
        rentingProtocol.setReturnDate(request.getReturnDate());

        rentingProtocolRepository.save(rentingProtocol);

    }

    @Override
    public void delete(DeleteRentingProtocolRequest request) {
        RentingProtocol rentingProtocolToDelete = rentingProtocolRepository.findById(request.getId()).orElseThrow();
        rentingProtocolRepository.delete(rentingProtocolToDelete);

    }

    @Override
    public void update(UpdateRentingProtocolRequest request) {
        RentingProtocol rentingProtocolToUpdate = rentingProtocolRepository.findById(request.getId()).orElseThrow();
        rentingProtocolToUpdate.setName(request.getName());
        rentingProtocolToUpdate.setRentDate(request.getRentDate());
        rentingProtocolToUpdate.setReturnDate(request.getReturnDate());

        rentingProtocolRepository.save(rentingProtocolToUpdate);

    }

    @Override
    public List<GetListRentingProtocolResponse> getByNameDto(String name) {
        return rentingProtocolRepository.findByName(name);
    }

    @Override
    public List<RentingProtocol> getByName(String name) {
        return rentingProtocolRepository.findByNameStartingWith(name);
    }
}
