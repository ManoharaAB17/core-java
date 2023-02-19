package com.xworkz.taskapp;

import java.util.Arrays;

public class MergingArrays {

	public static void main(String[] args) {
		
		int arrOne[] = {1,2,3,4,5 ,6,7,8};
		int arrTwo[] = {2,3,46,65,345,342,24,45,23,54};
		
		int size= arrOne.length + arrTwo.length;
		
		int newArr[]=new int[size];
		
		for(int i=0; i<arrOne.length;i++) 
			{
				  newArr[i] = arrOne[i] ; 
			}
		for(int j=0;j < arrTwo.length;j++) 
			{
				newArr[arrOne.length + j ] = arrTwo[j];
			}
		
		for(int x=0;x<newArr.length;x++) 
			{
				System.out.print(","+newArr[x]);
			}
				
	}

}
