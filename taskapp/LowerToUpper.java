/**
 * 
 */
package com.xworkz.taskapp;

/**
 * @author DELL
 *
 */
public class LowerToUpper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st ="manohar";
		String str=" ";
		for(int i =0;i<st.length();i++)
		{
			char ch =st.charAt(i);
			if(97 <=ch && ch <= 122)
			{
				str = str + (char)(ch-32);
			}
		}
		System.out.println(str);
	}

}
