package com.placements.encapsulation;

public class Encapsulation {
	private int length;
	private int breadth;

	private int area;
	Encapsulation(){};

	public void setLength(int length) {
		this.length = length;
	}
	public void setBreadth(int breadth){
		this.breadth=breadth;
	}

	protected int getArea(){
		//if we make method private it can't be instantiated
		area=length*breadth;
		return area;

	}
}
