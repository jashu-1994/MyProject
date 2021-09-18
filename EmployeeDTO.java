package com.softech.dto;

public class EmployeeDTO {

	private String name;
	private String gander;
	private String address;
	private String city;
	private int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGander() {
		return gander;
	}

	public void setGander(String gander) {
		this.gander = gander;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
