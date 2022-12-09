/**
 * 
 */
package com.xworkz.taskapp;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class PeopleLikes {

	/**
	 * @param args
	 */
	
	static void check(String[] arr)
	{
		
			if(arr.length==0)
			{
				System.out.println(arr.length+" ---> No one likes");
			}
			else if(arr.length==1)
			{
				System.out.println(arr[0]+" ---> like this");
			}
			else if(arr.length==2)
			{
				System.out.println(arr[0]+" and "+arr[1]+" ---> like this");
			}
			else if(arr.length==3)
			{
				System.out.println(arr[0]+" and "+arr[1]+", "+arr[2]+" ---> like this");
			}
			else 
			{
				System.out.println(arr[0]+" and "+arr[1]+"  , "+arr[2]+" ---> and some other like this");
			}
	}
	

	public static void main(String[] args) {
		
		String arr[]= {};
		String arr1[]= {"peter"};
		String arr2[]= {"jacob","alex"};
		String arr3[]= {"max","mark","gousling"};
		String arr4[]= {"james","kkk","moon","mmmm"};
		
		
		check(arr);check(arr1);check(arr2);check(arr3);check(arr4);
		
	}


}
