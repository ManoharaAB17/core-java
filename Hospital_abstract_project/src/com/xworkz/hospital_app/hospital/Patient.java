package com.xworkz.hospital_app.hospital;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient{
    private String gender;
	private String name;
	private int age;
	private String address;
	 
	public Patient( ) {
		super();
//		this.name =name;
//		this.address=address;		
//	   this.gender= Gender.valueOf(Gender);
//		
//		this.age=age;
		
	}
	public void display() {
		  System.out.println("The patient name :"+ this.name);
		  System.out.println("The patient address :"+ this.address);
		  System.out.println("The patient age :"+ this.age);
	}

}
