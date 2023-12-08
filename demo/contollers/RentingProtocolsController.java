package com.example.a.spring.into.contollers;

import com.example.a.spring.into.entities.RentingProtocol;
import com.example.a.spring.into.repositories.RentingProtocolRepository;
import com.example.a.spring.into.services.abstracts.RentingProtocolService;
import com.example.a.spring.into.services.dtos.rentingProtocol.requests.AddRentingProtocolRequest;
import com.example.a.spring.into.services.dtos.rentingProtocol.requests.DeleteRentingProtocolRequest;
import com.example.a.spring.into.services.dtos.rentingProtocol.requests.UpdateRentingProtocolRequest;
import com.example.a.spring.into.services.dtos.rentingProtocol.responses.GetListRentingProtocolResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/renting_protocols")
public class RentingProtocolsController {
    private RentingProtocolService rentingProtocolService;
    public RentingProtocolsController(RentingProtocolService rentingProtocolService){
        this.rentingProtocolService = rentingProtocolService;
    }

    @GetMapping
    public List<RentingProtocol> getByName(@RequestParam String name){

        return rentingProtocolService.getByName(name);
    }

    @GetMapping("dto")
    public List<GetListRentingProtocolResponse> getByNameDto(@RequestParam String name){
        return rentingProtocolService.getByNameDto(name);
    }

    @PostMapping
    public void add(@RequestBody AddRentingProtocolRequest request){
        rentingProtocolService.add(request);

    }

        @DeleteMapping("{id}")
        public void delete(@RequestBody DeleteRentingProtocolRequest request){

        rentingProtocolService.delete(request);
        }

        @PutMapping("{id}")
    public void update(@RequestBody UpdateRentingProtocolRequest request){
        rentingProtocolService.update(request);


        }

}
