package com.infy.WorkItem.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ftr_vehicle_workitem")

public class ftr_vehicle_workitem {
	@Id
	private String workitem_id;
	private String vehicle_number;
	private String assigned_workitem_status;
	
	public ftr_vehicle_workitem()
	{
		
	}
	
	public ftr_vehicle_workitem(String workitem_id, String vehicle_number, String assigned_workitem_status) 
	{
		super();
		this.workitem_id = workitem_id;
		this.vehicle_number = vehicle_number;
		
		this.assigned_workitem_status = assigned_workitem_status;
	}
	public String getWorkitem_id() {
		return workitem_id;
	}
	public void setWorkitem_id(String workitem_id) {
		this.workitem_id = workitem_id;
	}
	public String getVehicle_number() {
		return vehicle_number;
	}
	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	
	public String getAssigned_workitem_status() {
		return assigned_workitem_status;
	}
	public void setAssigned_workitem_status(String assigned_workitem_status) {
		this.assigned_workitem_status = assigned_workitem_status;
	}
	
	
}
