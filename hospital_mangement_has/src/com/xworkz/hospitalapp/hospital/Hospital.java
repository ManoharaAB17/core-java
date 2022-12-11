/**
 * 
 */
package com.xworkz.hospitalapp.hospital;

/**
 * @author DELL
 *
 */
public class Hospital {
	Patient Patient;
	public boolean isEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient Patient) 
	{
		 System.out.println("Inside admit method");
		 boolean isAddmited=false;
		 System.out.println("Patient Status");
		 if(isTreatmentRequired==true)
		 {
			 if(isEmergency==true) 
			 {
				this.Patient = Patient;
				isAddmited = true ; 
				this.Patient.display();
				System.out.println("++++++++++++++++++++++++++++++++++");
				System.out.println("Details of patient it can allow ");
			 }
			 else 
			 {
				 System.out.println("Details of patient it can not be allow ");
			 }
		 }
		 else 
		 {
			 System.out.println("Patient emergeny it cant be allowed");
		 }
			return isAddmited;
	}


}
