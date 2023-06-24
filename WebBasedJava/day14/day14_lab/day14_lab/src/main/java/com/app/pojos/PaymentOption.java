package com.app.pojos;

import java.time.LocalDate;
import javax.persistence.*;

@Embeddable //UDT : composite value type
public class PaymentOption {
	@Column(length = 20)
	private String type;
	@Column(name="exp_date")
	private LocalDate expDate;
	@Column(length = 10)
	private String cvv;
	public PaymentOption() {
		// TODO Auto-generated constructor stub
	}
	public PaymentOption(String type, LocalDate expDate, String cvv) {
		super();
		this.type = type;
		this.expDate = expDate;
		this.cvv = cvv;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "PaymentOption [type=" + type + ", expDate=" + expDate + ", cvv=" + cvv + "]";
	}
	
}
