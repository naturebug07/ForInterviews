package com.placements.arraysAndLists;

import java.util.Arrays;
import java.util.Scanner;
//sorting array , reversing array

public class Sorting {
	static int[] baseArray=new int[7];
	static int[]sortedDescendingArray=new int[7];
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 0; i < baseArray.length; i++) {
			System.out.println("enter__"+(i+1)+"___element of array");
			baseArray[i]= scanner.nextInt();

		}
		for (int x:baseArray) {
			System.out.print(x+",");

		}
		System.out.println("\n----------");

		//copying array method

		sortedDescendingArray= Arrays.copyOf(baseArray,7);
		for (int x:sortedDescendingArray) {
			System.out.print(x+",");
		}
		String flag = new String("true");

		//sorting the array

      while (flag.equalsIgnoreCase("true")){
		  flag="false";
		  for (int i=0;i< sortedDescendingArray.length-1;i++){
			  int temp;
			  if (sortedDescendingArray[i] <sortedDescendingArray[i+1]) {
				  temp=sortedDescendingArray[i];
				  sortedDescendingArray[i]=sortedDescendingArray[i+1];
				  sortedDescendingArray[i+1]=temp;
				  flag="true";
				  System.out.println("------------\n");
				  for (int x:sortedDescendingArray) {
					  System.out.print(x+",");
				  }

			  }
			  else System.out.println("its i > i+1");

		  }
      }
		System.out.println("------------\n");
		for (int x:sortedDescendingArray) {
			System.out.print(x+",");
		}

		//reverse array------------------------


    }
}
