package com.xworkz.hospital_app;
import java.util.Scanner;

import com.xworkz.hospital_app.hospital.AppoloHospital;
import com.xworkz.hospital_app.hospital.Hospital;
import com.xworkz.hospital_app.hospital.Patient;






public class AppoloHospitalTester {
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the size\n");
         int size = scanner.nextInt(); 
         
         Hospital appoloHospital = new AppoloHospital(size);
         for(int i=0;i<size;i++)    
         {
       	  Patient patient = new Patient();  
       	  
	          System.out.println("Enter patient name  : \n");
	          patient.setName(scanner.next());	          
	          System.out.println("Enter patient age  :\n");
	          patient.setAge(scanner.nextInt());
	          
	          System.out.println("Enter the patient address :\n");
	          patient.setAddress(scanner.next());
	          
	          System.out.println("Enter the Gender :\n");
	         
	          patient.setGender(scanner.next());
         
	          appoloHospital.addPatient(patient); 
	          System.out.println();
         }
         
appoloHospital.getAllPatient();
//System.out.println("enter the Patient name to change address");
//String paname=scanner.next();
//System.out.println("enter new addrese to change");
//String paAddress=scanner.next();
//appoloHospital.updateAddressByName(paname,paAddress);
//
//System.out.println("enter the patient name to search");
//String pName=scanner.next();
//appoloHospital.getPatientByName(pName);
appoloHospital.getAllPatient();

System.out.println("enter the Patient name to delete details");
String nnamee=scanner.next();
appoloHospital.deletePatientbyName(nnamee);
appoloHospital.newgetAllPatient();

scanner.close();
	}

}
