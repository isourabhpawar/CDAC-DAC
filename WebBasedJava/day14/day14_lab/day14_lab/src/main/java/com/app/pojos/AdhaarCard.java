package com.app.pojos;

import java.time.LocalDate;
import javax.persistence.*;

@Embeddable//Mandatory annotation to tell hibernate that following class DOES NOT have a standalone existence(no PK) , going to be embedded within owning Entity 
public class AdhaarCard {
	@Column(name="card_number",length=20,unique = true)
	private String cardNumber;
	@Column(name="creation_date")
	private LocalDate creationDate;
	@Column(length = 20)
	private String location;
	public AdhaarCard() {
		// TODO Auto-generated constructor stub
	}
	public AdhaarCard(String cardNumber, LocalDate creationDate, String location) {
		super();
		this.cardNumber = cardNumber;
		this.creationDate = creationDate;
		this.location = location;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "AdhaarCard [cardNumber=" + cardNumber + ", creationDate=" + creationDate + ", location=" + location
				+ "]";
	}
	
}
