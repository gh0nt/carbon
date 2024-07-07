package com.carbon.carbon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.carbon.carbon.entities.LandOwnersEntity;

@Repository
public interface LandOwnerRepository extends JpaRepository<LandOwnersEntity, Long>{

}


