/**
 * 
 */
package com.xworkz.taskapp;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class Dec16Task {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int sum=1;
		int count =0;
		System.out.println(" Enter the Starting  range \n");
		int n = sc.nextInt();
        
		System.out.println(" Enter the Ending  range \n");
		int m = sc.nextInt();
		
		for( i=n;i<=m;i++) {
			System.out.println(i);
		}
		
		
		
		
//		while(sum !=0) {
//			sum =sum%2;
//			count--;
//		}
//		System.out.println("no of digit : \n"+count);
//		
//		
		sc.close();
	}

}
