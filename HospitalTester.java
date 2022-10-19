package com.xworkz.hospital;

import com.xworkz.hospital.hospital.Hospital;
public class HospitalTester {
	public static void main(String []args) {
		Hospital hospital = new Hospital();
		
		hospital.savePatientNames("sanju");
		hospital.savePatientNames("sanjana");
		hospital.savePatientNames("suchitra");
		hospital.savePatientNames("akash");	
		
		
		hospital.savePatientNames("navya");
		 hospital.getPatientName();
		hospital.savePatientNames("summanth");
		hospital.savePatientNames("sushma");
		
		hospital.updatePatientNames("moon","subba");
		
		 hospital.getPatientName();
	}

}
