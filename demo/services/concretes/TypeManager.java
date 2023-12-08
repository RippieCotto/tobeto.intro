package com.example.a.spring.into.services.concretes;

import com.example.a.spring.into.entities.Type;
import com.example.a.spring.into.repositories.TypeRepository;
import com.example.a.spring.into.services.abstracts.TypeService;
import com.example.a.spring.into.services.dtos.type.requests.AddTypeRequest;
import com.example.a.spring.into.services.dtos.type.requests.DeleteTypeRequest;
import com.example.a.spring.into.services.dtos.type.requests.UpdateTypeRequest;
import com.example.a.spring.into.services.dtos.type.responses.GetListTypeResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeManager implements TypeService {

    private TypeRepository typeRepository;
    public TypeManager(TypeRepository typeRepository){
        this.typeRepository = typeRepository;
    }

    @Override
    public void add(AddTypeRequest request) {
        Type type = new Type();
        type.setName(request.getName());

        typeRepository.save(type);

    }

    @Override
    public void delete(DeleteTypeRequest request) {
        Type typeToDelete = typeRepository.findById(request.getId()).orElseThrow();

        typeRepository.delete(typeToDelete);

    }

    @Override
    public void update(UpdateTypeRequest request) {

        Type typeToUpdate = typeRepository.findById(request.getId()).orElseThrow();
        typeToUpdate.setName(request.getName());

        typeRepository.save(typeToUpdate);

    }

    @Override
    public List<GetListTypeResponse> getByNameDto(String name) {
        return typeRepository.findByName(name);
    }

    @Override
    public List<Type> getByName(String name) {
        return typeRepository.findByNameStartingWith(name);
    }
}
