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
import org.springframework.web.bind.annotation.RestController;

import com.carbon.carbon.entities.AreasAsignadasEntity;
import com.carbon.carbon.services.AreasAsignadasService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path="AreasAsignadas")
public class AreasAsignadasController {
    @Autowired
    private AreasAsignadasService areasAsignadasService;


    @GetMapping("/")
    public List<AreasAsignadasEntity> getAreasAsignadas(){
        return areasAsignadasService.getAreasAsignadas();
    }

    @GetMapping("/Usuario")
    public List<AreasAsignadasEntity> getAreasUsuario(@RequestParam("id_usuario") Long id_usuario){
    return areasAsignadasService.getAreasUsuario(id_usuario);
    }

    @PostMapping
    public void insertar(@RequestBody AreasAsignadasEntity consulta){
        areasAsignadasService.insertaroactualizar(consulta);
    }



    @DeleteMapping("/{id}")
    public String insertar(@PathVariable("id") Long id){
        areasAsignadasService.borrar(id);
        return "ok";
    }


 
    @GetMapping("/{id}")
    public Optional<AreasAsignadasEntity> getAreaAsignada(@PathVariable("id") Long id){
        return areasAsignadasService.getAreaAsignada(id);
    }

}
