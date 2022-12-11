package com.xworkz.hospital_app.hospital;

public interface Hospital {
	
	public boolean addPatient(Patient patient);
	public void getAllPatient();
	public void getPatientByName(String name);
	public boolean updateAddressByName(String name,String newPatientAddress);
	public boolean deletePatientbyName(String name);
	public void newgetAllPatient();

}
