/**
 * 
 */
package com.xworkz.taskapp;

/**
 * @author DELL
 *
 */
public class UpperToLower {
	public static void main(String args[]) {
	String st ="	MANOHARA";
	String str=" ";
	for(int i =0;i<st.length();i++)
	{
		char ch =st.charAt(i);
		if(65<=ch && ch <= 90)
		{
			str = str + (char)(ch+32);
		}
	}
	System.out.println(str);
	}
}