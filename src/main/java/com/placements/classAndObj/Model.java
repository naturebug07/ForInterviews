package com.placements.classAndObj;

import java.util.ArrayList;

public class Model {
	int number;
	static int num2;
    Model(int number,int num3){
	    System.out.println("this is my model constructor");
		this.number=number;
		num2=num3;
		m1(this.number,num2);
    }
	static void m1(int n1,int n2){
		System.out.println("m1 method"+n1+n2);
	}
	public static void main(String[] args) {
		Model model=new Model(34,26);
		model.number=45;
		System.out.println(model.number);
	}
}
