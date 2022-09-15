package com.infy.WorkItemDTO;

import java.util.Date;

import javax.persistence.Id;

public class WorkitemDTO {
	 @Id
	  private Long userId;
	  private String workitemId;
	  private String itemName;
	  private String itemType;
	  private String itemDescription;
	  private String messageToRecipent;
	  private String quantity;
	  private String sourceCountry;
	  private String destinationCountry;
	  private String originHarborLocation;
	  private String selectedHarborLocations;
	  private Date shippingDate;
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

	public WorkitemDTO()
	{
		
	}
	public WorkitemDTO(Long userId, String workitemId, String itemName, String itemType, String itemDescription,
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
