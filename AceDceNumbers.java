package com.xworkz.numbers.num;
import java.util.Arrays;

public class AceDceNumbers {
	int temp;	
	
	public boolean asc(int[] arr, int size) {
		for (int i=0;i<arr.length;i++)
		{
			for ( int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ascending order:" +Arrays.toString(arr));
		return false;
	}
	
	public boolean desc(int arr[],int size)
	{
		for (int i=0;i<arr.length;i++)
		{
			for ( int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Descending order:" +Arrays.toString(arr));
		return false;
		
	}
}
