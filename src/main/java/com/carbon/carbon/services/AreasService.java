package com.carbon.carbon.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carbon.carbon.entities.AreasEntity;
import com.carbon.carbon.repositories.AreasRepository;

@Service
public class AreasService {
    @Autowired
    AreasRepository areasRepository;

    public List<AreasEntity> getAreas(){
        return areasRepository.findAll();
    }

    public Optional<AreasEntity> getArea(Long id){
        return areasRepository.findById(id);
    }

    public void insertaroactualizar(AreasEntity area){
        areasRepository.save(area);
    }

    public void borrar(Long id){
        areasRepository.deleteById(id);
    }
}

