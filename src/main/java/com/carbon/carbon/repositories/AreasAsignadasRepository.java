package com.carbon.carbon.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carbon.carbon.entities.AreasAsignadasEntity;



@Repository

public interface AreasAsignadasRepository extends JpaRepository<AreasAsignadasEntity, Long>{
    @Query(value="select a.* from areasasignadas a where a.id_usuario = :id_usuario", nativeQuery=true)
    List<AreasAsignadasEntity> findareas(@Param("id_usuario") Long id_usuario);
 
}
