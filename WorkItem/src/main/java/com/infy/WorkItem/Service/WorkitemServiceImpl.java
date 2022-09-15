package com.infy.WorkItem.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.infy.WorkItem.Entity.ftr_vehicle_workitem;
import com.infy.WorkItem.Entity.ftr_workitems;
import com.infy.WorkItem.Entity.vehicleEntity;
import com.infy.WorkItem.Repository.AllocateVehicle;
import com.infy.WorkItem.Repository.VehicleRepository;
import com.infy.WorkItem.Repository.WorkitemRepository;
import com.infy.WorkItemDTO.TrackByUserDTO;
import com.infy.WorkItemDTO.VehicleDTO;
import com.infy.WorkItemDTO.WorkitemDTO;
import com.infy.WorkItemDTO.WorkitemVehicleDTO;

import ch.qos.logback.core.net.SyslogOutputStream;
import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Component
public class WorkitemServiceImpl implements WorkItemService {

	@Autowired
	private WorkitemRepository repo;
	
	@Autowired
	VehicleRepository vehiclerepo; 
	
	@Autowired
	private AllocateVehicle arepo;
	
	@Autowired
     private ModelMapper mapper;
	
	@Override
	public List<WorkitemDTO> fetchWorkItemDetails() {
		
		List<ftr_workitems>l=repo.findAll();
		List<WorkitemDTO> ls=l.stream().map(m->mapper.map(m, WorkitemDTO.class)).collect(Collectors.toList());
		return ls;
	}

	
	@Override
	public ftr_vehicle_workitem trackWorkitemByUser(Long userId) {
		System.out.println("helodvdfvfv f");
        Optional<ftr_workitems> l=repo.findById(userId);
        System.out.println(l.isPresent());
	    ftr_workitems ftr=l.get();
	    System.out.println(ftr.getWorkitemId());
		Optional<ftr_vehicle_workitem> res=vehiclerepo.findById(ftr.getWorkitemId());
		System.out.println(res.isPresent());
	     return res.get(); 
		}

	
	

	@Override
	public String allocateVehicle(String workitemId, List<VehicleDTO> vehicleDtoList) {
		
		Optional<ftr_vehicle_workitem> ftrw =vehiclerepo.findById(workitemId);
		if(ftrw.isPresent())
		{
			
			return "Vehicle Already Allocated";
		}
		
		System.out.println(vehicleDtoList);
		System.out.println(vehicleDtoList.get(0).getVehicle_number());
		Optional <vehicleEntity> v=arepo.findById(vehicleDtoList.get(0).getVehicle_number());
		
		if(v.isPresent())
		{
			System.out.print(v.get().getVehicleStatus());
			
			
			    if(v.get().getVehicleStatus().equalsIgnoreCase("Active"))
				{
			    	
			    	 ftr_vehicle_workitem f=new ftr_vehicle_workitem();
			         f.setVehicle_number(vehicleDtoList.get(0).getVehicle_number());
			         f.setWorkitem_id(workitemId);
			         f.setAssigned_workitem_status("In Progress");
			    	 vehiclerepo.saveAndFlush(f);
			    	 return "Vehicle Allocated";
				}
			else
				return "Vehicle already 1dlmxlvkm allocated";
		}
		else
		{
			return "Vehicle is not present"; 
		}
		
		
	}


	




}
