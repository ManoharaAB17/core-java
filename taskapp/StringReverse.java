/**
 * 
 */
package com.xworkz.taskapp;

public class StringReverse {

	public static void main(String[] args) {
		String st = "manohara";
		String  rev =" ";
		
		for(char ch:st.toCharArray()) {
			rev= ch+rev;
			
		}
		System.out.println(rev);
	}

}
