/**
 * 
 */
package com.xworkz.showroomapp;
import java.util.Scanner;

import com.xworkz.showroomapp.constant.Gender;
import com.xworkz.showroomapp.showroom.Mangers;
import com.xworkz.showroomapp.showroom.MaruthiSuzuki;
/**
 * @author DELL
 *
 */
public class showroomTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size\n");
        int size = scanner.nextInt(); 
        
        MaruthiSuzuki  maruthisuzuki = new MaruthiSuzuki(size);
        
        for (int i = 0; i < size ; i++)
        {
        	Mangers  mang = new Mangers();
        	
        	System.out.println("Enter "+i+" Manger name  : \n");
        	mang.setName(scanner.next());
        	
        	System.out.println("Enter Manger age  :\n");
        	mang.setAge(scanner.nextInt());
        	
        	 System.out.println("Enter the Manger address :\n");
        	mang.setAddress(scanner.next());
        	
        	System.out.println("Enter the Gender :\n");
        	mang.setGender(Gender.valueOf(scanner.next()));
        	
        	maruthisuzuki.addMangers(mang);
        	System.out.println();      	
			
		}
           
        maruthisuzuki.getAllMangers();
        
        scanner.close();
	}
	

}
