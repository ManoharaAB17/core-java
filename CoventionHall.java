class CoventionHall {
	 CoventionHall(){
		 System.out.println(" This is the  Constructor of CoventionHall ");
	 }

    String 	name;
	String 	branch;
	int 		noOfWorkers;
	String 		manager;
	  
	public static void main(String []a){
		CoventionHall cl = new CoventionHall();
		    cl.name= "Sarji  CoventionHall";
			cl.branch   = "Shimogga";
			cl.noOfWorkers = 60;
			cl.manager= "Manohara";
			
			System.out.println(" CoventionHall Name    :  :  "+cl.name  );
			System.out.println(" Branch Name    :  :  "+cl.branch  );
			System.out.println(" No of workers in that Branch  :  : "+cl.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :  : "+cl.manager);
			System.out.println(" ");
		
		CoventionHall cl1 = new CoventionHall();
		    cl1.name= "Lagan CoventionHall";
			cl1.branch   = "Badravathi";
			cl1.noOfWorkers = 87;
			cl1.manager= "Sanjana";
			
			System.out.println(" CoventionHall Name    :  :  "+cl1.name  );
			System.out.println(" Branch Name    :  :  "+cl1.branch  );
			System.out.println(" No of workers in that Branch : : "+cl1.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :  : "+cl1.manager);
			System.out.println(" ");
			
		CoventionHall cl2 = new CoventionHall();
			cl2.name= "Shri Shaila Mallikarjuna CoventionHall";
			cl2.branch   = "Sagara";
			cl2.noOfWorkers = 59;
			cl2.manager= "Pramodh";
			
			System.out.println(" CoventionHall Name    :  :  "+cl2.name  );
			System.out.println(" Branch Name    :  :  "+cl2.branch  );
			System.out.println(" No of workers in that Branch : :  "+cl2.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :  : "+cl2.manager);
			System.out.println(" ");
			
		CoventionHall cl3 = new CoventionHall();
			cl3.name= "Daivagna CoventionHall";
			cl3.branch   = "Shikaripura";
			cl3.noOfWorkers = 98;
			cl3.manager= "Suchitra";
			
			System.out.println(" CoventionHall Name    :  :  "+cl3.name  );
			System.out.println(" Branch Name    :  :  "+cl3.branch  );
			System.out.println(" No of workers in that Branch :: "+cl3.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :  : "+cl3.manager);
			System.out.println(" ");
			
		CoventionHall cl4 = new CoventionHall();
			cl4.name= "Shri Veerashiva CoventionHall";
			cl4.branch   = "Hosanagara";
			cl4.noOfWorkers = 83;
			cl4.manager= "Sanjay";
			 
			System.out.println(" CoventionHall Name    :  :  "+cl4.name  );
			System.out.println(" Branch Name    :  :  "+cl4.branch  );
			System.out.println(" No of workers in that Branch : : "+cl4.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :   : "+cl4.manager);
			System.out.println(" ");		
	}	 
	
}