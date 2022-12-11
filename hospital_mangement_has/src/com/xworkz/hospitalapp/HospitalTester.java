
package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.Patient;

public class HospitalTester {

	public static void main(String[] args) {
		System.out.println("Enter Patient Name \n");
		Scanner sc = new Scanner(System.in);
		String patienName= sc.next();
		System.out.println("Enter Patient Address \n");
		String address= sc.next();
		System.out.println("Enter Patient Age \n");
		String age= sc.next();
		Patient patient = new Patient(patienName,address,"Male",56);
		
		Hospital h = new Hospital();		
		h.isTreatmentRequired=true;
		h.isEmergency=true;
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		boolean isEmergency =h.admit(patient);
		
		
	}

}
