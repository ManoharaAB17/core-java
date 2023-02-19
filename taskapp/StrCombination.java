/**
 * 
 */
package com.xworkz.taskapp;


public class StrCombination {

	
		public static void main(String[] args) {

			String str="abcd";
			String str1=str.toUpperCase();

			char[] b=str.toCharArray();

			char[] c=str1.toCharArray();


			for(int i=0;i<c.length;i++)
			{
				System.out.print(c[i]);
				for(int j=0;j<i;j++)
				{
					System.out.print(b[i]);

				}
				System.out.print(" ");	

			}
		}
	}
	
	