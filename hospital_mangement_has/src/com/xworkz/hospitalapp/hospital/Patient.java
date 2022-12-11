/**
 * 
 */
package com.xworkz.hospitalapp.hospital;
import com.xworkz.hospitalapp.constant.Gender;
import lombok.Getter;
import lombok.Setter;

/**
 * @author DELL
 *
 */
//grouping the data into a single block  
@Getter
@Setter
public class Patient extends Hospital {
    
	private Gender gender;
	private String name;
	private int age;
	private String address;
	 
	public Patient( ) {
		super();
		
	}
	public void display() {
		  System.out.println("The patient name :"+ this.name);
		  System.out.println("The patient address :"+ this.address);
		  System.out.println("The patient age :"+ this.age);
	}

}
