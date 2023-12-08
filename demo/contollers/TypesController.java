package com.example.a.spring.into.contollers;

import com.example.a.spring.into.entities.Type;
import com.example.a.spring.into.repositories.TypeRepository;
import com.example.a.spring.into.services.abstracts.TypeService;
import com.example.a.spring.into.services.dtos.type.requests.AddTypeRequest;
import com.example.a.spring.into.services.dtos.type.requests.DeleteTypeRequest;
import com.example.a.spring.into.services.dtos.type.requests.UpdateTypeRequest;
import com.example.a.spring.into.services.dtos.type.responses.GetListTypeResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/types")
public class TypesController {
    private TypeService typeService;
    public TypesController(TypeService typeService){

        this.typeService = typeService;
    }

    @GetMapping
    public List<Type> getByName(@RequestParam String name){
        return typeService.getByName(name);
    }

    @GetMapping("dto")
    public List<GetListTypeResponse> getByNameDto(@RequestParam String name){
        return typeService.getByNameDto(name);
    }

    @PostMapping
    public void add(@RequestBody AddTypeRequest request){
        typeService.add(request);
    }

    @DeleteMapping("{id}")
    public void delete(@RequestBody DeleteTypeRequest request){
       typeService.delete(request);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateTypeRequest request){
      typeService.update(request);
    }
}
