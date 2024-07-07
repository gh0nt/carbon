package com.carbon.carbon.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbon.carbon.entities.AreasEntity;
import com.carbon.carbon.services.AreasService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path="Areas")
public class AreasController {
    @Autowired
    private AreasService areasService;


    @GetMapping
    public List<AreasEntity> getAreas(){
        return areasService.getAreas();
    }

  
    @PostMapping
    public void insertar(@RequestBody AreasEntity consulta){
        areasService.insertaroactualizar(consulta);
    }



    @DeleteMapping("/{id}")
    public void insertar(@PathVariable("id") Long id){
        areasService.borrar(id);
    }


 
    @GetMapping("/{id}")
    public Optional<AreasEntity> getArea(@PathVariable("id") Long id){
        return areasService.getArea(id);
    }

}


