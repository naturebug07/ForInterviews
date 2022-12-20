package com.placements;

public class Employee {


		private String name;
		private double salary;
		private String dpartment;
		public Employee(String name, double salary, String dpartment) {
		this.name = name;
		this.salary = salary;
		this.dpartment = dpartment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDpartment() {
		return dpartment;
	}

	public void setDpartment(String dpartment) {
		this.dpartment = dpartment;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				", dpartment='" + dpartment + '\'' +
				'}';
	}
}
