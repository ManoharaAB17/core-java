/**
 * 
 */
package com.xworkz.showroomapp;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class ShowRoomTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size\n");
         int size = sc.nextInt();
         
         ShowRoom sr = new ShowRoomImpl(size);
         
         for (int i = 0; i < size; i++) {
        	 
        	 MangersDeatils mg = new MangersDeatils();
        	 
        	 System.out.println("Enter manger Name : \n");
        	 mg.setName(sc.next());
        	 
        	 System.out.println("Enter manger Address : \n");
        	 mg.setAddress(sc.next());
        	 
        	 System.out.println("Enter manger Age : \n");
        	 mg.setAge(sc.nextInt());
        	 
        	 System.out.println("Enter manger Gender : \n");
        	 mg.setGender(Gender.valueOf(sc.next()));
        	 
        	 sr.addMangers(mg);
			
		}     
         
         sr.getAllMangers();
         
         System.out.println("Enter the name to find \n");
         String name1 = sc.next();
         sr.getMangerByName(name1);
         
         sc.close();
         


	}

}
