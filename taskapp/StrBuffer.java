/**
 * 
 */
package com.xworkz.taskapp;

/**
 * @author DELL
 *
 */
public class StrBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		StringBuffer buffer = new StringBuffer("Hai ");
		
		StringBuilder builder = new StringBuilder("Hello JAVA");
		
		
		// concate in string buffer by using append()
		buffer = buffer.append("This is string buffer conacate method()");
		
		System.out.println(buffer);
		
		buffer = buffer.append("we learn String Buffer in today session");
		System.out.println(buffer);

	}

}