package com.placements.arraysAndLists;

import java.util.Scanner;

public class Sorting {
	static int[] baseArray=new int[7];
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 0; i < baseArray.length; i++) {
			System.out.println("enter__"+(i+1)+"___element of array");
			baseArray[i]= scanner.nextInt();
		}
		for (int i = 0; i <baseArray.length; i++) {

			System.out.print(baseArray[i]+",");
	    }

    }
}
