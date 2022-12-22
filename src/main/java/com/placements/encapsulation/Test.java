package com.placements.encapsulation;

public class Test {
	public static void main(String[] args) {
		System.out.println("printing area of rectangle whose length and breadth is 25");
		Encapsulation encapsulation=new Encapsulation();
		//hence we haven't defined getter method , there is no way you can access the length and breadth
		encapsulation.setLength(25);
		encapsulation.setBreadth(25);
		encapsulation.getArea();
		System.out.println(encapsulation.getArea());
	}
}
