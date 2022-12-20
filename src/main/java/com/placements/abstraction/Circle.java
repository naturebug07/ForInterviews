package com.placements.abstraction;

class Circle extends Shape {
	double radius;

	public Circle(String colour,double radius) {
		super(colour);
		System.out.println("Circle constructor called");
		radius=this.radius;
	}


	@Override
	double area() {
		System.out.println("printing area of circle");
		System.out.println(Math.PI * Math.pow(radius, 2));
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle{" +
				"radius=" + radius +
				", colour='" + colour + '\'' + ",area="+area()+
				'}';
	}
}
