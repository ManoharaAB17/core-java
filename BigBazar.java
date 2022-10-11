class BigBazar {
	 BigBazar(){
		 System.out.println(" This is the  Constructor of BigBazar ");
	 }

    String 	bigBazarName;
	String 	branch;
	int 		noOfWorkers;
	String 		manager;
	  
	public static void main(String []a){
		BigBazar cl = new BigBazar();
		    cl.bigBazarName= "BIG BAZAR";
			cl.branch   = "Shimogga";
			cl.noOfWorkers = 60;
			cl.manager= "Manohara";
			
			System.out.println(" BigBazar Name    :  :  "+cl.bigBazarName  );
			System.out.println(" Branch Name    :  :  "+cl.branch  );
			System.out.println(" No of workers in that Branch  :  : "+cl.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :  : "+cl.manager);
			System.out.println(" ");
		
		BigBazar cl1 = new BigBazar();
		    cl1.bigBazarName= "BIG BAZAR";
			cl1.branch   = "Badravathi";
			cl1.noOfWorkers = 87;
			cl1.manager= "Sanjana";
			
			System.out.println(" BigBazar Name    :  :  "+cl1.bigBazarName  );
			System.out.println(" Branch Name    :  :  "+cl1.branch  );
			System.out.println(" No of workers in that Branch : : "+cl1.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :  : "+cl1.manager);
			System.out.println(" ");
			
		BigBazar cl2 = new BigBazar();
			cl2.bigBazarName= "BIG BAZAR";
			cl2.branch   = "Sagara";
			cl2.noOfWorkers = 59;
			cl2.manager= "Pramodh";
			
			System.out.println(" BigBazar Name    :  :  "+cl2.bigBazarName  );
			System.out.println(" Branch Name    :  :  "+cl2.branch  );
			System.out.println(" No of workers in that Branch : :  "+cl2.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :  : "+cl2.manager);
			System.out.println(" ");
			
		BigBazar cl3 = new BigBazar();
			cl3.bigBazarName= "BIG BAZAR";
			cl3.branch   = "Shikaripura";
			cl3.noOfWorkers = 98;
			cl3.manager= "Suchitra";
			
			System.out.println(" BigBazar Name    :  :  "+cl3.bigBazarName  );
			System.out.println(" Branch Name    :  :  "+cl3.branch  );
			System.out.println(" No of workers in that Branch :: "+cl3.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :  : "+cl3.manager);
			System.out.println(" ");
			
		BigBazar cl4 = new BigBazar();
			cl4.bigBazarName= "BIG BAZAR";
			cl4.branch   = "Hosanagara";
			cl4.noOfWorkers = 83;
			cl4.manager= "Sanjay";
			 
			System.out.println(" BigBazar Name    :  :  "+cl4.bigBazarName  );
			System.out.println(" Branch Name    :  :  "+cl4.branch  );
			System.out.println(" No of workers in that Branch : : "+cl4.noOfWorkers);
			System.out.println(" Manager Name of the Branch  :   : "+cl4.manager);
			System.out.println(" ");		
	}	 
	
}