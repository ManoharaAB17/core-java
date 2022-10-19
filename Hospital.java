package com.xworkz.hospital.hospital;

public class Hospital {
	
	//Datatype variableName[] = {};
	//	String patientNames[] = { null,null,null,null,null,null };
	
	  // Datatype variableName[] = new Datatype[size];
	     String patientNames[] = new String[5]; // use this type for array initialize array values
	     int index;
	     
	     public void  savePatientNames( String patientName) {
	    	  if(patientName !=null && patientNames.length > index) {
	    		patientNames[index++]=patientName;
	       	  }
	    	  else {
	    		  System.out.println("Patient name is full ....");
	    	  }
	    	
	     }
	     
	     public void getPatientName() {
	    	 for (int i = 0; i < patientNames.length; i++) {
			System.out.println(patientNames[i]); 
				
			}
	     }
	     
	     //oldPatientName  sanju
	     //newPatientName  subba
	     public boolean updatePatientNames( String oldPatientName ,String newPatientName) {
	    	 System.out.println("");
	    	 for (int i = 0; i < patientNames.length; i++) {
				if(patientNames[i] == oldPatientName) {
					patientNames[i] = newPatientName;
					return true;
				}
				else {
					System.out.println(newPatientName+" this name is not match");
				}
			}
	    	 return false;
	    	 
	     }
}