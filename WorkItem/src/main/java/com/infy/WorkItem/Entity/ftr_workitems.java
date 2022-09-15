package com.infy.WorkItem.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="ftr_workitems")

public class ftr_workitems {
  @Id
  private Long userId;
  
  @NotEmpty
  @Size(max=5,message="User id should be present, please check")
  
  @NotEmpty
  @Size(max=5,message="Workitem Id should be present, please check")
  private String workitemId;
  
  @NotEmpty
  @Size(min=3,max=25,message="Workitem name should be present, please check")
  private String itemName;
  
  @NotEmpty
  @Size(min=4,max=25,message="Workitem type should be present, please check")
  private String itemType;
  
  @NotEmpty
  @Size(min=10,max=45,message="Workitem description should be present, please check")
  private String itemDescription;
  
  @NotEmpty
  @Size(min=10,max=55,message="Message to recipient should be present, please check")
  private String messageToRecipent;
 
  @NotEmpty
  private String quantity;
  
  @NotEmpty
  @Size(min=5,max=25,message="Source country should be present, please check")
  private String sourceCountry;
  
  @NotEmpty
  @Size(min=5,max=25,message=" Destination country should be present, please check")
  private String destinationCountry;
  
  @NotEmpty
  @Size(min=5,max=25,message="Selected Harbor location should be present, please check")
  private String originHarborLocation;
  
  @NotEmpty
  @Size(min=5,max=25,message="User id should be present, please check")
  private String selectedHarborLocations;
  
  @NotEmpty(message="Shipping date should be present, please check")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @JsonFormat(pattern = "MM/dd/yyyy")
  private Date shippingDate;
  
  @NotNull
  private Integer amount;
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getWorkitemId() {
	return workitemId;
}
public void setWorkitemId(String workitemId) {
	this.workitemId = workitemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getItemType() {
	return itemType;
}
public void setItemType(String itemType) {
	this.itemType = itemType;
}
public String getItemDescription() {
	return itemDescription;
}
public void setItemDescription(String itemDescription) {
	this.itemDescription = itemDescription;
}
public String getMessageToRecipent() {
	return messageToRecipent;
}
public void setMessageToRecipent(String messageToRecipent) {
	this.messageToRecipent = messageToRecipent;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getSourceCountry() {
	return sourceCountry;
}
public void setSourceCountry(String sourceCountry) {
	this.sourceCountry = sourceCountry;
}
public String getDestinationCountry() {
	return destinationCountry;
}
public void setDestinationCountry(String destinationCountry) {
	this.destinationCountry = destinationCountry;
}
public String getOriginHarborLocation() {
	return originHarborLocation;
}
public void setOriginHarborLocation(String originHarborLocation) {
	this.originHarborLocation = originHarborLocation;
}
public String getSelectedHarborLocations() {
	return selectedHarborLocations;
}
public void setSelectedHarborLocations(String selectedHarborLocations) {
	this.selectedHarborLocations = selectedHarborLocations;
}
public Date getShippingDate() {
	return shippingDate;
}
public void setShippingDate(Date shippingDate) {
	this.shippingDate = shippingDate;
}
public Integer getAmount() {
	return amount;
}
public void setAmount(Integer amount) {
	this.amount = amount;
}

public ftr_workitems()
{
	
}
public ftr_workitems(Long userId, String workitemId, String itemName, String itemType, String itemDescription,
		String messageToRecipent, String quantity, String sourceCountry, String destinationCountry,
		String originHarborLocation, String selectedHarborLocations, Date shippingDate, Integer amount) {
	super();
	this.userId = userId;
	this.workitemId = workitemId;
	this.itemName = itemName;
	this.itemType = itemType;
	this.itemDescription = itemDescription;
	this.messageToRecipent = messageToRecipent;
	this.quantity = quantity;
	this.sourceCountry = sourceCountry;
	this.destinationCountry = destinationCountry;
	this.originHarborLocation = originHarborLocation;
	this.selectedHarborLocations = selectedHarborLocations;
	this.shippingDate = shippingDate;
	this.amount = amount;
}
	
}
