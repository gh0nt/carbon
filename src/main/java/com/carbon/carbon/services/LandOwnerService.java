package com.carbon.carbon.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carbon.carbon.entities.LandOwnersEntity;
import com.carbon.carbon.repositories.LandOwnerRepository;

@Service
public class LandOwnerService {
    @Autowired
    LandOwnerRepository landOwnerRepository;

    public List<LandOwnersEntity> getLandOwners(){
        return landOwnerRepository.findAll();
    }

    public Optional<LandOwnersEntity> getLandOwner(Long id){
        return landOwnerRepository.findById(id);
    }

    public void insertaroactualizar(LandOwnersEntity landowner){
        landOwnerRepository.save(landowner);
    }

    public void borrar(Long id){
        landOwnerRepository.deleteById(id);
    }
}

