package com.carbon.carbon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carbon.carbon.entities.AreasEntity;

@Repository
public interface AreasRepository extends JpaRepository<AreasEntity, Long>{

}



