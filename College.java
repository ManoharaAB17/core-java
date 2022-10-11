class College {
	 College(){
		 System.out.println(" This is the  Constructor of College ");
	 }

    String 	collegeName;
	String 	branch;
	int 		noOfStudents;
	int 		noOfFaculty;
	  
	public static void main(String []a){
		College cl = new College();
		    cl.collegeName= "RRCE";
			cl.branch   = "MCA";
			cl.noOfStudents = 120;
			cl.noOfFaculty= 3;
			
			System.out.println(" College Name    :  :  "+cl.collegeName  );
			System.out.println(" Branch Name    :  :  "+cl.branch  );
			System.out.println(" No of students in clat Branch  "+cl.noOfStudents);
			System.out.println(" No Of Faculty in clat College   : "+cl.noOfFaculty);
			System.out.println(" ");
		
		College cl1 = new College();
		    cl1.collegeName= "RV";
			cl1.branch   = "MCA";
			cl1.noOfStudents = 440;
			cl1.noOfFaculty= 8;
			
			System.out.println(" College Name    :  :  "+cl1.collegeName  );
			System.out.println(" Branch Name    :  :  "+cl1.branch  );
			System.out.println(" No of students in clat Branch  "+cl1.noOfStudents);
			System.out.println(" No Of Faculty in clat College   : "+cl1.noOfFaculty);
			System.out.println(" ");
			
		College cl2 = new College();
			cl2.collegeName= "BIT";
			cl2.branch   = "MCA";
			cl2.noOfStudents = 440;
			cl2.noOfFaculty= 11;
			
			System.out.println(" College Name    :  :  "+cl2.collegeName  );
			System.out.println(" Branch Name    :  :  "+cl2.branch  );
			System.out.println(" No of students in clat Branch  "+cl2.noOfStudents);
			System.out.println(" No Of Faculty in clat College   : "+cl2.noOfFaculty);
			System.out.println(" ");
			
		College cl3 = new College();
			cl3.collegeName= "REVA University";
			cl3.branch   = "MCA";
			cl3.noOfStudents = 440;
			cl3.noOfFaculty= 9;
			
			System.out.println(" College Name    :  :  "+cl3.collegeName  );
			System.out.println(" Branch Name    :  :  "+cl3.branch  );
			System.out.println(" No of students in clat Branch  "+cl3.noOfStudents);
			System.out.println(" No Of Faculty in clat College   : "+cl3.noOfFaculty);
			System.out.println(" ");
			
		College cl4 = new College();
			cl4.collegeName= "UBDT";
			cl4.branch   = "MCA";
			cl4.noOfStudents = 440;
			cl4.noOfFaculty= 8;
			 
			System.out.println(" College Name    :  :  "+cl4.collegeName  );
			System.out.println(" Branch Name    :  :  "+cl4.branch  );
			System.out.println(" No of students in clat Branch  "+cl4.noOfStudents);
			System.out.println(" No Of Faculty in clat College   : "+cl4.noOfFaculty);
			System.out.println(" ");		
	}	 
	
}