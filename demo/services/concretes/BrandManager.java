package com.example.a.spring.into.services.concretes;

import com.example.a.spring.into.entities.Brand;
import com.example.a.spring.into.repositories.BrandRepository;
import com.example.a.spring.into.services.abstracts.BrandService;
import com.example.a.spring.into.services.dtos.brand.requests.AddBrandRequest;
import com.example.a.spring.into.services.dtos.brand.requests.DeleteBrandRequest;
import com.example.a.spring.into.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.a.spring.into.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository){
        this.brandRepository = brandRepository; //DI
    }

    @Override
    public void add(AddBrandRequest request) {
        //iş akışı çalıştıktan sonra..

        if(request.getName().length() < 3)
            throw new RuntimeException("Marka ismi 3 Handeden küçük olamaz!");

        Brand brand = new Brand();
        brand.setName(request.getName());
        brandRepository.save(brand);
    }

    @Override
    public List<Brand> getByName(String name) {

        return brandRepository.findByNameStartingWith(name);
    }

    @Override
    public List<GetListBrandResponse> getByNameDto(String name) {
      /*  List<Brand> brands = brandRepository.findByNameStartingWith(name);

        List<GetListBrandResponse> dtos = new ArrayList<>();
        for (Brand brand: brands) {
            dtos.add(new GetListBrandResponse(brand.getName()));
        } */
       // return brandRepository.findByName(name);
        /* brandRepository.findAll().stream()
        .filter((brand) -> brand.getName.equals(name))
        .map((brand)-> new GetListBrandResponse(brand.getId(), brand.getName()))
        .toList();
        * */


        return brandRepository.findByNameStartingWith(name).stream().map((brand) -> {
            return  new GetListBrandResponse(brand.getId(), brand.getName());
        }).toList();
    }


    @Override
    public void delete(DeleteBrandRequest request) {
        Brand brandToDelete = brandRepository.findById(request.getId()).orElseThrow();
        brandRepository.delete(brandToDelete);
    }

    @Override
    public void update(UpdateBrandRequest request) {
        Brand brandToUpdate = brandRepository.findById(request.getId()).orElseThrow();
        brandToUpdate.setName(request.getName());
        brandRepository.save(brandToUpdate);

    }

    @Override
    public Brand getById(int id){
        return brandRepository.findById(id).orElseThrow();
    }
}
