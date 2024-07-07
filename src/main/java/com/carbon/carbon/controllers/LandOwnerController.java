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

import com.carbon.carbon.entities.LandOwnersEntity;
import com.carbon.carbon.services.LandOwnerService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path="LandOwners")
public class LandOwnerController {
    @Autowired
    private LandOwnerService landOwnerService;


    @GetMapping
    public List<LandOwnersEntity> getLandOwners(){
        return landOwnerService.getLandOwners();
    }

  
    @PostMapping
    public void insertar(@RequestBody LandOwnersEntity consulta){
        landOwnerService.insertaroactualizar(consulta);
    }



    @DeleteMapping("/{id}")
    public void insertar(@PathVariable("id") Long id){
        landOwnerService.borrar(id);
    }


 
    @GetMapping("/{id}")
    public Optional<LandOwnersEntity> getLandOwner(@PathVariable("id") Long id){
        return landOwnerService.getLandOwner(id);
    }

}

