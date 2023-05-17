package com.app.core;

public class Emp {
	private String id;
	private String name;
	private double salary;

	public Emp(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	//override equals to replace ref equality by content(PK) equality
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp eq");
		if(o instanceof Emp)
			return this.id.equals(((Emp)o).id);
		return false;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in emp hashCode");
		return this.id.hashCode();
	}

}







