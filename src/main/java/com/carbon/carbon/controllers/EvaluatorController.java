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
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carbon.carbon.entities.EvaluatorEntity;
import com.carbon.carbon.services.EvaluatorService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path="Evaluator")
public class EvaluatorController {
    @Autowired
    private EvaluatorService evaluatorService;


    @GetMapping("/")
    public List<EvaluatorEntity> getEvaluadores(){
        return evaluatorService.getEvaluadores();
    }

  
    @PostMapping
    public void insertar(@RequestBody EvaluatorEntity consulta){
        evaluatorService.insertaroactualizar(consulta);
    }

    @GetMapping("/Login")
    public EvaluatorEntity ValidarLogin(@RequestParam("usuario") String usuario, @RequestParam("password") String password){
    return evaluatorService.ValidarLogin(usuario, password);
    }


    @DeleteMapping("/{id}")
    public void insertar(@PathVariable("id") Long id){
        evaluatorService.borrar(id);
    }


 
    @GetMapping("/{id}")
    public Optional<EvaluatorEntity> getEvaluador(@PathVariable("id") Long id){
        return evaluatorService.getEvaluador(id);
    }

    

}


