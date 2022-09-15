package com.infy.WorkItemDTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class VehicleDTO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String workitem_id;
	private String vehicle_number;
	private String driver_id;
	private String assigned_workitem_status;
	
	public VehicleDTO(String workitem_id, String vehicle_number, String driver_id, String assigned_workitem_status) {
		super();
		this.workitem_id = workitem_id;
		this.vehicle_number = vehicle_number;
		this.driver_id = driver_id;
		this.assigned_workitem_status = assigned_workitem_status;
	}
	
	@Override
	public String toString() {
		return "VehicleDTO [workitem_id=" + workitem_id + ", vehicle_number=" + vehicle_number + ", driver_id="
				+ driver_id + ", assigned_workitem_status=" + assigned_workitem_status + ", getWorkitem_id()="
				+ getWorkitem_id() + ", getVehicle_number()=" + getVehicle_number() + ", getDriver_id()="
				+ getDriver_id() + ", getAssigned_workitem_status()=" + getAssigned_workitem_status() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public VehicleDTO()
	{
		
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
	public String getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}
	public String getAssigned_workitem_status() {
		return assigned_workitem_status;
	}
	public void setAssigned_workitem_status(String assigned_workitem_status) {
		this.assigned_workitem_status = assigned_workitem_status;
	}

	
}
