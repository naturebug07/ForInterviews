package com.placements.arraysAndLists;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysPrac {

	public static void main(String[] args) {
		//1st way of initializing
		int[] myIntVariableArray={23,32,432,432,55,23,432};
		//2nd way of initializing
		//myIntVariableArray=new int[10];//goes from 0-9
		//myIntVariableArray[0]=50;
		int[] thirdArray=new int[10];
		//System.out.print(myIntVariableArray[0]);
		//if you give i=11 you get array out of bound exception
		for (int i = 0; i < 10; i++) {
			thirdArray[i]=i*10;
		}
		int sortedArray[]=thirdArray;
		//good idea to use array.length
		for (int i = 0; i < thirdArray.length; i++) {

			System.out.print(thirdArray[i]+",");
			average+=thirdArray[i];//average=average+thirsArray[i]
			if(i==thirdArray.length-1){
				Arrays.sort(thirdArray);
				System.out.println(sortedArray[0]);
			averageOfArrays(average);
			}
		}




	}
	static int average=0;
	public static void averageOfArrays(int average){
		average=average/2;
		System.out.println("-----the average of array is  :"+average);
	};

}
