package com.infy.WorkItem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.WorkItem.Entity.vehicleEntity;

public interface AllocateVehicle extends JpaRepository<vehicleEntity,String> {
	
	

}
