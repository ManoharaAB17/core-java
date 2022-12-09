/**
 * 
 */
package com.xworkz.showroomapp.showroom;
import  com.xworkz.showroomapp.showroom.MaruthiSuzuki;
import com.xworkz.showroomapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;

/**
 * @author DELL
 *
 */
@Getter
@Setter
public class Mangers extends MaruthiSuzuki {

	private Gender gender;	
	private String name;
	private int age;
	private String address;
	
	public Mangers() {
		super();
		
	}
	public void display() {
		  System.out.println("The patient name :"+ this.name);
		  System.out.println("The patient address :"+ this.address);
		  System.out.println("The patient age :"+ this.age);
		  System.out.println("The patient age :"+ this.gender);
	}

}
