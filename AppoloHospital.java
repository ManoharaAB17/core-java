package com.xworkz.hospitalapp.hospital;

import java.util.Iterator;

import com.xworkz.hospitalapp.constant.Gender;

public class AppoloHospital extends Hospital {
	
	
	public Patient[] patients;
    public int index ;
	
	public AppoloHospital(int size) {
		  patients = new Patient[size];
	}
	
	
	public boolean addPatient(Patient patient){
		boolean isPatientAdded = false;
		if(patient != null ) {
				System.out.println("Patient's details are Right go....\n ");
				patients[index++] = patient;
				isPatientAdded= true;
		}
				return isPatientAdded;
	}
	
	public void getAllPatient() {
		for(int i=1;i<patients.length;i++) {
		  System.out.println(+i+" Patient name : " +patients[i].getName()+"\n Patient address : "+patients[i].getAddress() +"\n patient age : "+patients[i].getAge()+ "\nGender : "+patients[i].getGender()  );
		  System.out.println(" ");
		}
	}
	
	public void getPatientByName(String patientName) {
		System.out.println("inside getPatientByName ");
		for (int i = 0; i < patients.length; i++) {
			//Patient patient = patients[i];
			if(patients[i].getName().equals(patientName)) {
				System.out.println(" Patient name : " +patients[i].getName()+"\n Patient address : "+patients[i].getAddress() +"\n patient age : "+patients[i].getAge()+ "\nGender : "+patients[i].getGender()  );
				 
			}
			else {
				System.out.println("No patient found");
				break;
			}
		}
	}
		
		public void getPatientByAge(int age) {
			System.out.println("inside getPatientByName ");
			for (int i = 0; i < patients.length; i++) {
				//Patient patient = patients[i];
				if(patients[i].getAge() == age) {
					System.out.println(" Patient name : " +patients[i].getName()+"\n Patient address : "+patients[i].getAddress() +"\n patient age : "+patients[i].getAge()+ "\nGender : "+patients[i].getGender()  );
					 
				}
				else {
					System.out.println("No patient found");
					break;
				}
			}
			
		}
		
		public void getPatientByGender(Gender gen) {
			System.out.println("inside getPatientByName ");
			for (int i = 0; i < patients.length; i++) {
				//Patient patient = patients[i];
				if(patients[i].getGender().equals(gen)) {
					System.out.println(" Patient name : " +patients[i].getName()+"\n Patient address : "+patients[i].getAddress() +"\n patient age : "+patients[i].getAge()+ "\nGender : "+patients[i].getGender()  );
					 
				}
				else {
					System.out.println("No patient found");
					break;
				}
			}
		}
		
		public void getPatientByAddress(String addr) {
			System.out.println("inside getPatientByName ");
			
			for (int i = 0; i < patients.length; i++) {
				
				if(patients[i].getAddress().equals(addr)) {
					System.out.println(" Patient name : " +patients[i].getName()+"\n Patient address : "+patients[i].getAddress() +"\n patient age : "+patients[i].getAge()+ "\nGender : "+patients[i].getGender()  );
					 
				}
				else {
					System.out.println("No patient found");
					break;
				}
			}
		}
		
		public void getPatientByGenderByName(Gender gen) {
			System.out.println("inside getPatientByGenderByName ");
			for (int i = 0; i < patients.length; i++) {
				if(patients[i].getGender().equals(gen)) {
					
					System.out.println(" Patient name : " +patients[i].getName() );
					 
				}
				else {
					System.out.println("No patient found");
					break;
				}
			}
		}
		
		public void getPatientByNameByGen(String pName) {
			System.out.println("inside getPatientByName ");
			for (int i = 0; i < patients.length; i++) {
				//Patient patient = patients[i];
				if(patients[i].getName().equals(pName)) {
					
					System.out.println(" Patient name : " +patients[i].getName()+ "\nGender : "+patients[i].getGender()  );
					 
				}
				else {
					System.out.println("No patient found");
					break;
				}
			}
		}
		
		// getPatientByAge(int age)
		// getPatientByGender(Gender gen)
		// getPatientByAddress(String address)
		//getPatientByNameByGender(Gender gender)  prints only names if male else female
		//getGenderByPatientName(String name)  prints name by gender
	}


