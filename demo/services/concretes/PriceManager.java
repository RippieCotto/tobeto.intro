package com.example.a.spring.into.services.concretes;

import com.example.a.spring.into.entities.Price;
import com.example.a.spring.into.repositories.PriceRepository;
import com.example.a.spring.into.services.abstracts.PriceService;
import com.example.a.spring.into.services.dtos.price.requests.AddPriceRequest;
import com.example.a.spring.into.services.dtos.price.requests.DeletePriceRequest;
import com.example.a.spring.into.services.dtos.price.requests.UpdatePriceRequest;
import com.example.a.spring.into.services.dtos.price.responses.GetListPriceResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceManager implements PriceService {

    private PriceRepository priceRepository;
    public PriceManager(PriceRepository priceRepository){
        this.priceRepository = priceRepository;
    }

    @Override
    public void add(AddPriceRequest request) {
        Price price = new Price();
        price.setHourlyFee(request.getHourlyFee());
        price.setDailyFee(request.getDailyFee());
        price.setMonthlyFee(request.getMonthlyFee());
        price.setName(request.getName());

        priceRepository.save(price);
    }

    @Override
    public void delete(DeletePriceRequest request) {
        Price priceToDelete = priceRepository.findById(request.getId()).orElseThrow();
        priceRepository.delete(priceToDelete);

    }

    @Override
    public void update(UpdatePriceRequest request) {
        Price priceToUpdate = priceRepository.findById(request.getId()).orElseThrow();
        priceToUpdate.setHourlyFee(request.getHourlyFee());
        priceToUpdate.setDailyFee(request.getDailyFee());
        priceToUpdate.setMonthlyFee(request.getMonthlyFee());
        priceToUpdate.setName(request.getName());

        priceRepository.save(priceToUpdate);

    }

    @Override
    public List<GetListPriceResponse> getByNameDto(String name) {
        return priceRepository.findByName(name);
    }

    @Override
    public List<Price> getByName(String name) {
        return priceRepository.findByNameStartingWith(name);
    }
}
