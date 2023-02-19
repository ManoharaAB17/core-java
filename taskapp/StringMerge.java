/**
 * 
 */
package com.xworkz.taskapp;

/**
 * @author DELL
 *
 */
public class StringMerge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strOne[] = {"Hi","guys","Welcome"};
		
		
		String strTwo[] = {"to","yesterday's","programming","question"};
		
		int size = strOne.length + strTwo.length;
		
		String newArr[] = new String [size];
		
		for(int i=0; i<strOne.length;i++) {
			  newArr[i] = strOne[i] ; 
		}
		for(int j=0;j < strTwo.length;j++) {
			newArr[strOne.length + j ] = strTwo[j];
		}
		
		for(int x=0;x<newArr.length;x++) {
			System.out.print(newArr[x]+"  ");
		}
		
	}

}
