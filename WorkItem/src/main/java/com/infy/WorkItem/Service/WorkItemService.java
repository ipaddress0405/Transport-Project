package com.infy.WorkItem.Service;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.infy.WorkItem.Entity.ftr_vehicle_workitem;
import com.infy.WorkItemDTO.TrackByUserDTO;
//import com.infy.WorkItem.Entity.ftr_workitems;
import com.infy.WorkItemDTO.VehicleDTO;
import com.infy.WorkItemDTO.WorkitemDTO;
import com.infy.WorkItemDTO.WorkitemVehicleDTO;


@Service
public interface WorkItemService {
     
	  
	List<WorkitemDTO> fetchWorkItemDetails();
	
	ftr_vehicle_workitem trackWorkitemByUser(Long userId);
	

	
	String allocateVehicle(String workitemId,List<VehicleDTO> vehicleDtoList);
}
