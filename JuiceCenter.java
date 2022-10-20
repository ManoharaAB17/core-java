package com.xworkz.chatscenterapp.new_chats_center;

public class JuiceCenter {

	public String name;
	public String gstNo;
	public String address;
	public String[] staffNames;
	public String[] menu;
	public int[] price;
	public String[] billingMethod;
	
	public JuiceCenter  (String name,String address,String gstNo,String[] staffNames, String[] menu,int[] price,String[] billingMethod)
	{		
		System.out.println("Object created");
		this.name=name;
		 this.address=address;
		 this.gstNo=gstNo;
		 this.staffNames=staffNames;
		 this.menu=menu;
		 this.price=price;
		 this.billingMethod=billingMethod;
		
	}
	public void dispalyInfo() {
		 System.out.println("JuiceCenter name is  :  "+name);
		 System.out.println("");
		 System.out.println("-------------------------------");
		 
		 System.out.println("JuiceCenter  gstNo is  :  "+gstNo);
		 System.out.println("");
		 System.out.println("-------------------------------");
		 
		 System.out.println("JuiceCenter  Address is  :  "+address);
		 System.out.println("");
		 System.out.println("-------------------------------");
		 
		 System.out.println("JuiceCenter  Staff Information");
		 	for(int i=0;i<staffNames.length;i++)
		 	{
		 		System.out.println(staffNames[i]);
		 	}
		 System.out.println("");
		 System.out.println("-------------------------------");
		
		 
			 System.out.println("JuiceCenter  Menu");
			 	for(int i=0;i<menu.length;i++)
			 	{
			 		System.out.println(menu[i]);
			 	}

			System.out.println("");
			System.out.println("-------------------------------");
			
			System.out.println("JuiceCenter  Menu price");
		 	for(int i=0;i<price.length;i++)
		 	{
		 		System.out.println(price[i]);
		 	}

		System.out.println("");
		System.out.println("-------------------------------");
				
		    System.out.println("JuiceCenter  biilingMethod Information");
			     for(int i=0;i<billingMethod.length;i++)
					{
						System.out.println(billingMethod[i]);
					}
				 
	}
}


