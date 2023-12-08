package com.example.a.spring.into.services.concretes;

import com.example.a.spring.into.entities.Brand;
import com.example.a.spring.into.entities.Car;
import com.example.a.spring.into.repositories.CarRepository;
import com.example.a.spring.into.services.abstracts.BrandService;
import com.example.a.spring.into.services.abstracts.CarService;
import com.example.a.spring.into.services.dtos.car.requests.AddCarRequest;
import com.example.a.spring.into.services.dtos.car.requests.DeleteCarRequest;
import com.example.a.spring.into.services.dtos.car.requests.UpdateCarRequest;
import com.example.a.spring.into.services.dtos.car.responses.GetListCarResponse;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarManager implements CarService {


        private CarRepository carRepository;

        public CarManager(CarRepository carRepository){

            this.carRepository = carRepository;
        }

        private BrandService brandService;
        public void BrandManager(BrandService brandService){
            this.brandService = brandService;

        }

    @Override
    public void add(AddCarRequest request) {

            if(carRepository.existsCarByNumberPlate(request.getNumberPlate())){

                throw new RuntimeException("Aynı plaka ile birden fazla araç eklenemez!");
            }

        Car car = new Car();
        car.setModelYear(request.getModelYear());
        car.setName(request.getName());
        // car.setBrand(request.getBrand_id());
        car.setNumberPlate(request.getNumberPlate());
        //car.setType(request.getType_id());
        //car.setColor(request.getColor_id());
        car.setAvailable(true);

        //FK alanlar => FK alıp, veritabanında ilgili objeyi set ederiz
        Brand brand = brandService.getById(request.getBrandId());
        car.setBrand(brand);

        carRepository.save(car);
    }

    @Override
    public void delete(DeleteCarRequest request) {
        Car carToDelete = carRepository.findById(request.getId()).orElseThrow();
        carRepository.delete(carToDelete);

    }

    @Override
    public void update(UpdateCarRequest request) {
            Car carToUpdate = carRepository.findById(request.getId()).orElseThrow();
            carToUpdate.setModelYear(request.getModelYear());
            carToUpdate.setName(request.getName());
            //carToUpdate.setBrand(request.getBrand_id());
            carToUpdate.setNumberPlate(request.getNumberPlate());
            //carToUpdate.setType(request.getType_id());
            //carToUpdate.setColor(request.getColor_id());

            carRepository.save(carToUpdate);





    }

   // @Query("Select new com.example.a.spring.into.services.dtos.car.responses.GetListCarResponse(c.modelName) FROM Car c WHERE c.modelName= :modelName")
    @Override
    public List<GetListCarResponse> getByNameDto(String name) {
        return carRepository.findByName(name);
    }

    @Override
    public List<Car> getByName(String name) {

            return carRepository.findByNameStartingWith(name);
    }

    @Override
    public List<GetListCarResponse> getAll() {
        return carRepository.getAll();
    }
}
