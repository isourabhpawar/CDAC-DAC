package com.app.core;

import java.time.LocalDate;

public class Vehicle implements Comparable<Vehicle>{
	/*
	 * chasisNo(string) : Unique ID, color(enum) , netPrice(double) ,
	 * manufactureDate(LocalDate),company,isAvailable
	 */
	private String chasisNo;
	private Color vehicleColor;
	private double netPrice;// netPrice=base price + color based cost
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;

	public Vehicle(String chasisNo, Color vehicleColor, double netPrice, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = vehicleColor;
		this.netPrice = netPrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable = true;
	}
	public Vehicle(String chasisNo)
	{
		this.chasisNo=chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehicleColor=" + vehicleColor + ", netPrice=" + netPrice
				+ ", manufactureDate=" + manufactureDate + ", company=" + company + ", isAvailable=" + isAvailable
				+ "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle equals");
		if (o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) o).chasisNo);
		return false;
	}
	
	@Override
	public int compareTo(Vehicle anotherVehicle) {
		System.out.println("in vehicle : compare to");
		//sorting criteria : chasis no : String --Comparable<String>
		//i.e has implemented compareTo : <0 , =0 , > 0 : as er uni code values!
		return this.chasisNo.compareTo(anotherVehicle.chasisNo);
		
	}
	
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public Color getVehicleColor() {
		return vehicleColor;
	}
	
	

}
