package com.carbon.carbon.services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carbon.carbon.entities.EvaluatorEntity;
import com.carbon.carbon.repositories.EvaluatorRepository;

@Service
public class EvaluatorService {
    @Autowired
    EvaluatorRepository evaluatorRepository;

    public List<EvaluatorEntity> getEvaluadores(){
        return evaluatorRepository.findAll();
    }

    public Optional<EvaluatorEntity> getEvaluador(Long id){
        return evaluatorRepository.findById(id);
    }

    public void insertaroactualizar(EvaluatorEntity evaluador){
        evaluatorRepository.save(evaluador);
    }

    public EvaluatorEntity ValidarLogin(String usuario, String password){
        System.out.println(evaluatorRepository.findByLogin(usuario, password));
        return evaluatorRepository.findByLogin(usuario, password);

    }

    public void borrar(Long id){
        evaluatorRepository.deleteById(id);
    }
}

