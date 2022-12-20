package com.placements.abstraction;

public class Test {
	public static void main(String[] args) {
//		Shape shape=new Shape("blue") {
//			@Override
//			double area() {
//				return 25;
//			}
//
//			@Override
//			public String toString() {
//				return null;
//			}
//		};
		Shape s1=new Circle("green",23);
        Shape s2=new Rectangle("blue", 21, 32 );
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
