package com.example.a.spring.into.contollers;


import com.example.a.spring.into.entities.Color;
import com.example.a.spring.into.repositories.ColorRepository;
import com.example.a.spring.into.services.abstracts.ColorService;
import com.example.a.spring.into.services.dtos.color.requests.AddColorRequest;
import com.example.a.spring.into.services.dtos.color.requests.DeleteColorRequest;
import com.example.a.spring.into.services.dtos.color.requests.UpdateColorRequest;
import com.example.a.spring.into.services.dtos.color.responses.GetListColorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/colors")
public class ColorsController {

    private ColorService colorService;
    public ColorsController(ColorService colorService){

        this.colorService = colorService;
    }

    @GetMapping
    public List<Color>getByName(@RequestParam String name){

        return colorService.getByName(name);
    }

    @GetMapping("dto")
    public List<GetListColorResponse> getByNameDto(@RequestParam String name)  {

        return colorService.getByNameDto(name);
    }

    @PostMapping
    public void add(@RequestBody AddColorRequest request){
        colorService.add(request);
    }

    @DeleteMapping("{id}")
    public void delete(@RequestBody DeleteColorRequest request){
       colorService.delete(request);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateColorRequest request){
      colorService.update(request);
    }

}
