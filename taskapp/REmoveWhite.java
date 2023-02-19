/**
 * 
 */
package com.xworkz.taskapp;

public class REmoveWhite {

	public static void main(String[] args) {

		String str="manohara A B";
		int count=0;
		
		for(char ch:str.toCharArray())
		{
			if(ch != ' ')
			{
				count++;
				System.out.print(ch);
			}			
		}
		System.out.println("\n String count: "+count);
	}

}
