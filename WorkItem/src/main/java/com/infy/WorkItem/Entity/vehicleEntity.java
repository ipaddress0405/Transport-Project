package com.infy.WorkItem.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class vehicleEntity {

//@Size(min=6,max=6,message="vehicle number accepts only 6 characters but first 2 are alphabets and remaining 4 should be digits")
	@Id
    private String vehicleNumber;


@Size(max=30,message="Invalid Vehicle Name")
    private String vehicleName;

@NotEmpty(message="Vehicle Maximum Lifting capacity should be present, please check")
	private Double maxLiftingCapacity;


@NotEmpty(message="retire date should be present, please check")
@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
@JsonFormat(pattern = "MM/dd/yyyy")
	private Date retireDate;

@NotEmpty(message="Status can be either Active,Retired,InProgress only")
	private String vehicleStatus;

@NotEmpty
@Size(min=5,max=25,message="Enter valid harbor location")
	private String harborLocation;

@NotEmpty
@Size(min=5,max=25,message="Enter Valid Country Name")
	private String country;
	
	public vehicleEntity()
	{
		
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Double getMaxLiftingCapacity() {
		return maxLiftingCapacity;
	}
	public void setMaxLiftingCapacity(Double maxLiftingCapacity) {
		this.maxLiftingCapacity = maxLiftingCapacity;
	}
	public Date getRetireDate() {
		return retireDate;
	}
	public void setRetireDate(Date retireDate) {
		this.retireDate = retireDate;
	}
	public String getVehicleStatus() {
		return vehicleStatus;
	}
	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	public String getHarborLocation() {
		return harborLocation;
	}
	public void setHarborLocation(String harborLocation) {
		this.harborLocation = harborLocation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "vehicleEntity [vehicleNumber=" + vehicleNumber + ", vehicleName=" + vehicleName
				+ ", maxLiftingCapacity=" + maxLiftingCapacity + ", retireDate=" + retireDate + ", vehicleStatus="
				+ vehicleStatus + ", harborLocation=" + harborLocation + ", country=" + country + "]";
	}
	public vehicleEntity(String vehicleNumber, String vehicleName, Double maxLiftingCapacity, Date retireDate,
			String vehicleStatus, String harborLocation, String country) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.maxLiftingCapacity = maxLiftingCapacity;
		this.retireDate = retireDate;
		this.vehicleStatus = vehicleStatus;
		this.harborLocation = harborLocation;
		this.country = country;
	}
	
	

}
