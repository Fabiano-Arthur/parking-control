package com.api.parkingcontrol.repositories;

import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.parkingcontrol.models.ParkingSpotModel;


public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    
}
