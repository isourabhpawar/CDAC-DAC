package Pkg;

import java.time.LocalDate;

public class Vehicle {

	private String chasisNo;
	private Color vehicleColor;
	private double netprice;
	private LocalDate manufractreDate;
	private String company;
	private boolean isAvailable;
	
	
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}


	public Vehicle(String chasisNo, Color vehicleColor, double netprice, LocalDate manufractreDate, 
			String company) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = vehicleColor;
		this.netprice = netprice;
		this.manufractreDate = manufractreDate;
		this.company = company;
		this.isAvailable = isAvailable;
	}


	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehicleColor=" + vehicleColor + ", netprice=" + netprice
				+ ", manufractreDate=" + manufractreDate + ", company=" + company + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	
	
	
	
}
