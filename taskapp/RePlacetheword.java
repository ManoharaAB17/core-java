/**
 * 
 */
package com.xworkz.taskapp;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class RePlacetheword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String reverse ="";
		 
		System.out.println("Enter a string \n");
		String sentence=sc.nextLine();
		
		System.out.println("Enter a string to rev \n");
		String word=sc.next();
		
		String[] str = sentence.split(" ");
		
		for ( int i=0;i<str.length;i++)
		{
			if(str[i].equals(word)) 
			{
				char ch[] = word.toCharArray();
				
				for (int j =ch.length-1; j >=0 ; j--) {
					reverse=reverse+ch[j];					
				}
				str[i]=reverse;
			}
		}
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i] + " ");
		}
  }
}
