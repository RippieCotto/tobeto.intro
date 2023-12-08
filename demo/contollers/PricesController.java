package com.example.a.spring.into.contollers;

import com.example.a.spring.into.entities.Price;
import com.example.a.spring.into.repositories.PriceRepository;
import com.example.a.spring.into.services.abstracts.PriceService;
import com.example.a.spring.into.services.dtos.price.requests.AddPriceRequest;
import com.example.a.spring.into.services.dtos.price.requests.DeletePriceRequest;
import com.example.a.spring.into.services.dtos.price.requests.UpdatePriceRequest;
import com.example.a.spring.into.services.dtos.price.responses.GetListPriceResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/prices")
public class PricesController {

    private PriceService priceService;
    public PricesController(PriceService priceService){

        this.priceService = priceService;
    }

    @GetMapping public List<Price> getByName(@RequestParam String name){

        return priceService.getByName(name);
    }

    @GetMapping("dto")
    public List<GetListPriceResponse> getByNameDto(@RequestParam String name){
        return priceService.getByNameDto(name);

    }

    @PostMapping
    public void  add(@RequestBody AddPriceRequest request){
       priceService.add(request);
    }

    @DeleteMapping("{id}")
    public void delete(@RequestBody DeletePriceRequest request){
      priceService.delete(request);
    }

    @PutMapping("{id}")
    public  void update(@RequestBody UpdatePriceRequest request){
        priceService.update(request);

    }
}
