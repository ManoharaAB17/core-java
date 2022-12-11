package com.xworkz.hospital_app.hospital;



public class AppoloHospital implements Hospital{
	
	public int index ;

	public Patient[] patients,newpatient;
	public AppoloHospital(int size)
	{
		 patients = new Patient[size];
	}

	@Override
	public boolean addPatient(Patient patient) {
		boolean isPatientAdded = false;
		if(patient != null ) {
				System.out.println("Patient's details are Right go....\n ");
				patients[index++] = patient;
				isPatientAdded= true;
		}
				return isPatientAdded;
	}

	@Override
	public void getAllPatient() {
		for(int i=0;i<patients.length;i++) {
			  System.out.println("Patient name : " +patients[i].getName()+"\n Patient address : "+patients[i].getAddress() +"\n patient age : "+patients[i].getAge()+ "\n Gender : "+patients[i].getGender()  );
			}
		
	}

	@Override
	public void getPatientByName(String name) {

		System.out.println("inside getPatientByName");
		System.out.println("No of Parameters: 1 : patientName("+name+")");
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getName().equals(name))
			{
				System.out.println(patients[i].getAddress()+" "+patients[i].getAge()+" ");
			}
			else {
				System.out.println("no Patient found");
				break;
			}
		}
	}
	

	@Override
	public boolean updateAddressByName(String name,String newPatientAddress) {
		boolean isUpdated=false;
		for(int i=0;i<patients.length;i++)
		{
			 if(patients[i].getName().equals(name))
			{
				System.out.println("patient name matched...Proceed with  Updating address...... ");
				patients[i].setAddress(newPatientAddress);
			}
			
			
			
		}
		return isUpdated;
		
	}

	@Override
	public boolean deletePatientbyName(String name) {
		boolean isDeleted=false;
	    newpatient=new Patient[patients.length -1];
	    for(int i=0,k=0;i<patients.length;i++)
	    {
	    	if(!patients[i].getName().equals(name))
	    	{
	    		newpatient[k]=patients[i];
	    		k++;
	    	}
	    	
	    }	
		
		return isDeleted;
	}

	@Override
	public void newgetAllPatient() {
		for(int i=0;i<newpatient.length;i++) {
			  System.out.println("Patient name : " +newpatient[i].getName()+"\n Patient address : "+newpatient[i].getAddress() +"\n patient age : "+newpatient[i].getAge()+ "\n Gender : "+newpatient[i].getGender()  );
			}
		
	}


	

}
