package com.carbon.carbon.repositories;

import com.carbon.carbon.entities.EvaluatorEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface EvaluatorRepository extends JpaRepository<EvaluatorEntity, Long>{
    
    @Query(value="select e.* from evaluadores e where e.usuario = :usuario and e.password = :password", nativeQuery=true)
    EvaluatorEntity findByLogin(@Param("usuario") String usuario, @Param("password") String password);
 
}
