package com.softech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMPLOYEE_ID")
	private int ID;

	@Column(name = "NAME")
	private String name;

	@Column(name = "GENDER")
	private String gander;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "CITY")
	private String city;

	@Column(name = "SALARY")
	private int salary;

	

	public int getID() {
		return ID;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setID(int iD) {
		ID = iD;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", gander=" + gander + ", address=" + address + ", city="
				+ city + ", salary=" + salary + "]";
	}

}
