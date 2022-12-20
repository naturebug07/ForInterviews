package com.placements.abstraction;

abstract class Shape {
	String colour;
	abstract double area();
	public abstract String toString();

	public Shape(String colour) {
		System.out.println("inside shape constructor");
		this.colour = colour;
	}

	public String getColour() {
		System.out.println("this is a getter of shape and a concreate  method");
		return colour;
	}

	public void setColour(String colour) {
		System.out.println("this is a setter of shape and a concreate  method");
		this.colour = colour;
	}
}
