package com.example.a.spring.into.contollers;

import com.example.a.spring.into.entities.Car;
import com.example.a.spring.into.services.abstracts.CarService;
import com.example.a.spring.into.services.dtos.brand.responses.GetListBrandResponse;
import com.example.a.spring.into.services.dtos.car.requests.AddCarRequest;
import com.example.a.spring.into.services.dtos.car.requests.DeleteCarRequest;
import com.example.a.spring.into.services.dtos.car.requests.UpdateCarRequest;
import com.example.a.spring.into.services.dtos.car.responses.GetListCarResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarsController {
    private CarService carService;
    public CarsController(CarService carService){

        this.carService = carService;
    }

    /*@GetMapping
    public List<Car> getByName(@RequestParam String name){

        return carService.getByName(name);
    } */
    @GetMapping("dto")
    public List<GetListCarResponse> getByNameDto(@RequestParam String name){
        return carService.getByNameDto(name);
    }

    @PostMapping
    public void add(@RequestBody @Valid AddCarRequest request){

    carService.add(request);

    }

    @DeleteMapping("{id}")
    public void delete(@RequestBody DeleteCarRequest request){

        carService.delete(request);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateCarRequest request){
        carService.update(request);

    }

    @GetMapping
    public List<GetListCarResponse> getAll(){
        return carService.getAll();
    }

}
