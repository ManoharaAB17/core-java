package com.xworkz.numbers;

import com.xworkz.numbers.num.AceDceNumbers;

public class AceDceNumbersTest {

	public static void main(String[] args) 
	{
		int size =5;
		int arr[]=new int [size];
		arr[0]=45;
		arr[1]=5;
		arr[2]=35;
		arr[3]=27;
		arr[4]=3;
		AceDceNumbers s = new AceDceNumbers();
		
		s.asc(arr, size);
		s.desc(arr, size);
		

	}

}
