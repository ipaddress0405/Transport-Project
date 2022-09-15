package com.infy.WorkItem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.WorkItem.Entity.ftr_vehicle_workitem;

@Repository
public interface VehicleRepository extends JpaRepository<ftr_vehicle_workitem,String> {

}
