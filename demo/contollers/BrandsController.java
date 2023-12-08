package com.example.a.spring.into.contollers;

import com.example.a.spring.into.entities.Brand;
import com.example.a.spring.into.services.abstracts.BrandService;
import com.example.a.spring.into.services.dtos.brand.requests.AddBrandRequest;
import com.example.a.spring.into.services.dtos.brand.requests.DeleteBrandRequest;
import com.example.a.spring.into.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.a.spring.into.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Single Responsibility
@RestController
@RequestMapping("api/brands")
public class BrandsController {
//manager bağımlılığını yüklemem gerek
    //Dependency Injection
    //Bağımlılıklar Daima Soyut Nesneler Üzerinden
    private BrandService brandService; //Burada soyut olan kullanılmalı

    public BrandsController(BrandService brandService){
        this.brandService = brandService; //Dependency Injection bu
    }


    @PostMapping
    public void add(@RequestBody AddBrandRequest request){
        //Gelen işi managere yönlendir
        brandService.add(request);

    }

    @GetMapping
    public List<Brand> getByName(@RequestParam String name){
       return brandService.getByName(name);
    }

    @GetMapping("dto")
    public List<GetListBrandResponse> getByNameDto(@RequestParam String name){
        return brandService.getByNameDto(name);
    }

    @DeleteMapping("{id}")
    public void delete(@RequestBody DeleteBrandRequest request){
        brandService.delete(request);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateBrandRequest request){
        brandService.update(request);
    }

    //Gelen isteği kontrol etmek ve yönlendirmek

        /*update
        // en az 5 entity için CRUD operasyonları olşturulması



        //DTO => Data Transfer Object : Veri Transfer Nesnesi
        // entitylerin direkt dışarıya açılması yanlış
        //UsefForListingDTO=> Verinin bazı istenilen özelliklerini göstermeye yarar

    // Request - Response Pattern
    //Her request ve response özeldir her birine özel DTO oluşturmak gerekir

    //AddBrandRequest Dto
    //AddBrandResponse Dto

    //GetBrandResponse
    //GetAllBrandResponse

    //Business => Services Katmanı

    //DTO Tanımlamaları, validasyon, iş kuralları, CCC(loglama ,Cacheleme), mapping*/

    }

