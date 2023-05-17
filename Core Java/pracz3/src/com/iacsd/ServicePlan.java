package com.iacsd;

public enum ServicePlan {
SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	private double planCost;
	private ServicePlan(double planCost) {
		//super(name,ordinal) : java.lang.Enum
		this.planCost=planCost;
	}
	//getter
	public double getPlanCost()
	{
		return planCost;
	}
	//toString : optional 
	@Override
	public String toString()
	{
		return name()+" cost "+this.planCost;
	}
}
