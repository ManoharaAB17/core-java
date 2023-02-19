/**
 * 
 */
package com.xworkz.taskapp;

/**
 * @author DELL
 *
 */
public class Stri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String var ="radhika";
//		
//		String var2 ="radhika";
//		
//		String var3 = new String("danush");
//		
//		System.out.println(var == var2);
//		System.out.println(var == var2);
//		System.out.println(var.equals(var3));
//		
		
		
		String str =new String("Baba");
		
		String str1 = new String("Baba");
		
		System.out.println(str == str1);
		str = str1;
		
		System.out.println(str == str1);
		
		System.out.println(str.equals(str1));
		
		
		String st = "baba";
		String st2 ="Baba";
		System.out.println(st == st2);
		System.out.println("============================");
		
		String s = new String("null ");
		
		String s1 = null;
		
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		
	}

}
