package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.AppoloHospital;
import com.xworkz.hospitalapp.hospital.Patient;

public class ApploHospitalTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the size\n");
          int size = scanner.nextInt(); 
          AppoloHospital appoloHospital = new AppoloHospital(size);
          
          for(int i=1;i<=size;i++) 
          {
        	  Patient patient = new Patient();  
        	  
	          System.out.println("Enter "+i+" patient name  : \n");
	          patient.setName(scanner.next());
	          
	          System.out.println("Enter patient age  :\n");
	          patient.setAge(scanner.nextInt());
	          
	          System.out.println("Enter the patient address :\n");
	          patient.setAddress( scanner.next());
	          
	          System.out.println("Enter the Gender :\n");
	          patient.setGender(Gender.valueOf(scanner.next()));
          
	          appoloHospital.addPatient(patient); 
	          System.out.println();
          }
          
           appoloHospital.getAllPatient();
          
//	        System.out.println("Enter the patient name to find \n");
//	        String pN =scanner.next();
//	        appoloHospital.getPatientByName(pN);
//          
//	          System.out.println("Enter the patient age to find \n");
//	          int pn =scanner.nextInt();
//	         appoloHospital.getPatientByAge(pn);
//   
//          
//	          System.out.println("Enter the patient address to find \n");
//	         String adr =scanner.next();
//	        appoloHospital.getPatientByAddress(adr);
//        
//	        System.out.println("Enter the patient Gender to find \n");
//	       appoloHospital.getPatientByGenderByName(Gender.valueOf(scanner.next()));
//          
//          System.out.println("Enter the patient name to find \n");
//          String pname =scanner.next();
//	       appoloHospital.getPatientByNameByGen(pname);
	       
//           System.out.println("Enter the patient name to find \n");
//           String pName =scanner.next();
//           System.out.println("Enter the patient new address \n");
//           String addr =scanner.next();
//           appoloHospital.updatePatientAddressByName(pName ,addr);
//           
//           System.out.println("Enter the patient name to find \n");
//           String pName =scanner.next();
//           System.out.println("Enter the patient new age \n");
//           int age =scanner.nextInt();
//           appoloHospital.updatePatientAddressByAge(pName ,age);
//            // appoloHospital.getAllPatient();
           
           System.out.println("Enter the patient name to delete \n");
           String pName =scanner.next();          
           appoloHospital.deltePatientByName(pName);
           
           appoloHospital.getAllNewPatients();
          // appoloHospital.getAllPatient();
           
          scanner.close();
	}
}

// ariport = terminal[]
