package com.infy.WorkItemDTO;

public class TrackByUserDTO {

	private String vehicle_number;
	
	private String workitemId;
	
	private String workItemStatus;

	public TrackByUserDTO(String vehicle_number, String workitemId, String workItemStatus) {
		super();
		this.vehicle_number = vehicle_number;
		this.workitemId = workitemId;
		this.workItemStatus = workItemStatus;
	}
	
	public TrackByUserDTO()
	{
		
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public String getWorkitemId() {
		return workitemId;
	}

	public void setWorkitemId(String workitemId) {
		this.workitemId = workitemId;
	}

	public String getWorkItemStatus() {
		return workItemStatus;
	}

	public void setWorkItemStatus(String workItemStatus) {
		this.workItemStatus = workItemStatus;
	} 
	
	
} 

