package com.example.a.spring.into.services.abstracts;

import com.example.a.spring.into.entities.RentingProtocol;
import com.example.a.spring.into.services.dtos.rentingProtocol.requests.AddRentingProtocolRequest;
import com.example.a.spring.into.services.dtos.rentingProtocol.requests.DeleteRentingProtocolRequest;
import com.example.a.spring.into.services.dtos.rentingProtocol.requests.UpdateRentingProtocolRequest;
import com.example.a.spring.into.services.dtos.rentingProtocol.responses.GetListRentingProtocolResponse;

import java.util.List;

public interface RentingProtocolService {
    void add(AddRentingProtocolRequest request);
    void delete(DeleteRentingProtocolRequest request);
    void update(UpdateRentingProtocolRequest request);

    List<GetListRentingProtocolResponse> getByNameDto(String name);

    List<RentingProtocol> getByName(String name);
}
