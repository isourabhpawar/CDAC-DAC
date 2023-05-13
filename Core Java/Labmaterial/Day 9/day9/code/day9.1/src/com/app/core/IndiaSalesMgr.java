package com.app.core;

public class IndiaSalesMgr extends SalesMgr {

	public IndiaSalesMgr(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return getBasic()+ 12000;
	}

}
