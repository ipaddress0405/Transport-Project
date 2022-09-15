package com.infy.WorkItem.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.WorkItem.Entity.ftr_vehicle_workitem;
import com.infy.WorkItem.Entity.ftr_workitems;
import com.infy.WorkItem.Repository.WorkitemRepository;
import com.infy.WorkItem.Service.WorkItemService;
import com.infy.WorkItemDTO.TrackByUserDTO;
import com.infy.WorkItemDTO.VehicleDTO;
import com.infy.WorkItemDTO.WorkitemDTO;
import com.infy.WorkItemDTO.WorkitemDriverVehicleDTO;


@RestController
@RequestMapping("/ftr")
public class WorkItemController {
  
	
	@Autowired
	 private WorkItemService workitemService;
	
	@GetMapping("/workitems")
	public ResponseEntity<List<WorkitemDTO>> fetchWorkItemDetails()
	{
		List<WorkitemDTO> details=workitemService.fetchWorkItemDetails();
	      return new ResponseEntity(details,HttpStatus.OK);
	}
	
	@GetMapping("/workitems/managed-user/{userId}")
    public ResponseEntity <ftr_vehicle_workitem> trackWorkitemByUser(@Valid @PathVariable Long userId)
	{

		ftr_vehicle_workitem detailsbyuser=workitemService.trackWorkitemByUser(userId);
	      return new ResponseEntity(detailsbyuser,HttpStatus.OK);
		
	}
	

	@PostMapping("/workitems/managed-vehicle/{workitemId}")
	public ResponseEntity<String>allocateVehicle(@Valid @PathVariable String workitemId,@RequestBody List<VehicleDTO> vehicleDtoList)
	{
		//System.out.print("hello");
		String s=workitemService.allocateVehicle(workitemId,vehicleDtoList);
		return new ResponseEntity<String> (s,HttpStatus.ACCEPTED);
		
	}
	
	
}

