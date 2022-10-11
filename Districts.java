class Districts {
	 Districts(String name){
		 
		 System.out.println(" This is the  Constructor of Districts ");
		 System.out.println(name);
	 }

    String 	DistrictsName;
	String 	nickName;
	String 		sqrts;
	int 		noOfTaluks;
	
	  
	public static void main(String []a){
		Districts Dis = new Districts("Manohara");
		    Dis.DistrictsName= "Shimogga";
			Dis.nickName   = "Gate way  of Malnad";
			Dis.sqrts = "3280 sq mi";
			Dis.noOfTaluks= 7;
		
			
			System.out.println(" Districts Name    :  :  "+Dis.DistrictsName  );
			System.out.println(" Nick name of District   :  "+Dis.nickName  );
			System.out.println(" Total area of sqrts     :  "+Dis.sqrts);
			System.out.println(" Total no of taluks:  "+Dis.noOfTaluks);
			System.out.println(" ");
		
		Districts Dis1 = new Districts("Pramodh");
		    Dis1.DistrictsName= "Davanagere";
			Dis1.nickName   = "Benneya nagari";
			Dis1.sqrts = "1720 sq mi";
			Dis1.noOfTaluks= 6;
			
			System.out.println(" Districts Name    :  :  "+Dis1.DistrictsName  );
			System.out.println(" Nick name of District   :  "+Dis1.nickName  );
			System.out.println(" Total area of sqrts     :  "+Dis1.sqrts);
			System.out.println(" Total no of taluks:  "+Dis1.noOfTaluks);
			System.out.println(" ");
			
		Districts Dis2 = new Districts("Sanjay");
			Dis2.DistrictsName= "Kodagu";
			Dis2.nickName   = "Scotland of India ";
			Dis2.sqrts = "1584 sq mi";
			Dis2.noOfTaluks= 5;
			
			System.out.println(" Districts Name    :  :  "+Dis2.DistrictsName  );
			System.out.println(" Nick name of District   :  "+Dis2.nickName  );
			System.out.println(" Total area of sqrts     :  "+Dis2.sqrts);
			System.out.println(" Total no of taluks:  "+Dis2.noOfTaluks);
			System.out.println(" ");
			
		Districts Dis3 = new Districts("Sanjana");
			Dis3.DistrictsName= "Mysuru";
			Dis3.nickName   = "Sandlwood City";
			Dis3.sqrts =" 110.5 sq mi";
			Dis3.noOfTaluks= 10;
			
			System.out.println(" Districts Name    :  :  "+Dis3.DistrictsName  );
			System.out.println(" Nick name of District   :  "+Dis3.nickName  );
			System.out.println(" Total area of sqrts     :  "+Dis3.sqrts);
			System.out.println(" Total no of taluks:  "+Dis3.noOfTaluks);
			
			System.out.println(" ");
			
		Districts Dis4 = new Districts("Suchitra");
			Dis4.DistrictsName= "Manglore";
			Dis4.nickName   = "Gate way of Karnataka";
			Dis4.sqrts = "65.64 sq mi";
			Dis4.noOfTaluks= 7;
			 
			System.out.println(" Districts Name    :  :  "+Dis4.DistrictsName  );
			System.out.println(" Nick name of District   :  "+Dis4.nickName  );
			System.out.println(" Total area of sqrts     :  "+Dis4.sqrts);
			System.out.println(" Total no of taluks:  "+Dis4.noOfTaluks);
			
			System.out.println(" ");		
	}	 
	
}