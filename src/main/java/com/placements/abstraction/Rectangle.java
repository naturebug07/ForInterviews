package com.placements.abstraction;

 class Rectangle extends Shape {
	 double length;
	 double width;
	 public Rectangle(String colour,double length,double width){
		 //if you give soop here it won't work call of super should be first in constructor body
		 super(colour);
		 this.length=length;
		 this.width=width;
		 System.out.println("inside rectangle constructor");
	 }

	 @Override
	 double area() {
		 System.out.println("the are of rectangle is "+(length*width));
		 return (length*width);
	 }
	@Override
	 public String toString() {
		 return "Rectangle{" +
				 "length=" + length +"width=" + width+
				 ", colour='" + colour + '\'' + ",area="+area()+
				 '}';
	 }
 }
