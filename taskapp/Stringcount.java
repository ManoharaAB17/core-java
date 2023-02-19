/**
 * 
 */
package com.xworkz.taskapp;

/**
 * @author DELL
 *
 */
public class Stringcount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str= " Manohar A B";
		int count = 0;
		char s[] =str.toCharArray();
		for (char t : s) {
			count++;
		}
		System.out.println(count);
	}

}
