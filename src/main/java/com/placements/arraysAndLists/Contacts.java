package com.placements.arraysAndLists;

public class Contacts {
	String name;
	String phoneNumber;
	public Contacts(){};
	public Contacts(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	public String getName(){
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contacts{" +
				"name='" + name + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				'}';
	}
}
