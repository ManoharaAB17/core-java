/**
 * 
 */
package com.xworkz.taskapp;

/**
 * @author DELL
 *
 */
public class CountWhiteSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String str = "java html css";
		 int count = 0 ;
		 for( char ch : str.toCharArray()) 
		 {
			 if(ch != ' ')
			 {
				 System.out.print(ch);
			 }
			 else
			 {
				 count++;
			 }
		 }
		 System.out.println("\n"+count);
	}

}
