package com.carbon.carbon.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carbon.carbon.entities.AreasAsignadasEntity;

import com.carbon.carbon.repositories.AreasAsignadasRepository;

@Service
public class AreasAsignadasService {
    @Autowired
    AreasAsignadasRepository areasAsignadasRepository;

    public List<AreasAsignadasEntity> getAreasAsignadas(){
        return areasAsignadasRepository.findAll();
    }

    public Optional<AreasAsignadasEntity> getAreaAsignada(Long id){
        return areasAsignadasRepository.findById(id);
    }

    public List<AreasAsignadasEntity> getAreasUsuario(Long id_usuario){
        return areasAsignadasRepository.findareas(id_usuario);

    }

    public void insertaroactualizar(AreasAsignadasEntity areaasignada){
        areasAsignadasRepository.save(areaasignada);
    }

    public void borrar(Long id){
        areasAsignadasRepository.deleteById(id);
    }
}

