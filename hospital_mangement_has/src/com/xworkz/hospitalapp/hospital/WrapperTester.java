/**
 * 
 */
package com.xworkz.hospitalapp.hospital;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class WrapperTester {
public static void main(String[] args) {
	int age = 78;
	//Boxing : 
	Integer age1 =age;
	//Un-Boxing : 
 System.out.println(age);
	System.out.println(age1);
	
	long mob =8748038295l;
	Long mob1= mob;
	System.out.println(mob);
	System.out.println(mob1);
	
	byte b =7;
	Byte b1= b;
	System.out.println(b);
	System.out.println(b1);
	
	short sh =23;
	Short sh1= sh;
	System.out.println(sh);
	System.out.println(sh1);
	
	double d = 9.7;
	Double d1 = d;
	System.out.println(d);
	System.out.println(d1);
	
	float f = 9.34f;
	Float f1=f;
	System.out.println(f);
	System.out.println(f1);
}
}
