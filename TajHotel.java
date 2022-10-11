class TajHotel{
	  TajHotel(){
		  System.out.println(" This is the Constructor of TajHotel ");
		  System.out.println(" ");
		
	  }
	  
	  String foodName;
	  int noOfQuantity;
	  double price;
	  
	public static void main(String []a){
		TajHotel th = new TajHotel();
			th.foodName = "Veg Briyani";
			th.noOfQuantity = 2;
			th.price= 420;
			
			System.out.println(" Food name you want  :  "+th.foodName);
			System.out.println(" How much Quantity of paltes you want :  "+th.noOfQuantity);
			System.out.println(" Total price of your order is  :  "+th.price);
			System.out.println(" ");
		
		TajHotel th1 = new TajHotel();
			th1.foodName = "Panner Curry with Parota";
			th1.noOfQuantity = 4;
			th1.price= 400;
			
			System.out.println(" Food name you want  :  "+th1.foodName);
			System.out.println(" How much Quantity of paltes you want :  "+th1.noOfQuantity);
			System.out.println(" Total price of your order is  :  "+th1.price);
			System.out.println(" ");
			
		TajHotel th2 = new TajHotel();
			th2.foodName = "Masal Dosa ";
			th2.noOfQuantity = 1;
			th2.price= 70;
			
			System.out.println(" Food name you want  :  "+th2.foodName);
			System.out.println(" How much Quantity of paltes you want :  "+th2.noOfQuantity);
			System.out.println(" Total price of your order is  :  "+th2.price);
			System.out.println(" ");
			
		TajHotel th3 = new TajHotel();
			th3.foodName = "Donne Biriyani";
			th3.noOfQuantity = 4;
			th3.price= 500;
			
			System.out.println(" Food name you want  :  "+th3.foodName);
			System.out.println(" How much Quantity of paltes you want :  "+th3.noOfQuantity);
			System.out.println(" Total price of your order is  :  "+th3.price);
			System.out.println(" ");
			
		TajHotel th4 = new TajHotel();
			th4.foodName = "Veg Loaded Pizza ";
			th4.noOfQuantity = 5;
			th4.price= 795;
			
			System.out.println(" Food name you want  :  "+th4.foodName);
			System.out.println(" How much Quantity of paltes you want :  "+th4.noOfQuantity);
			System.out.println(" Total price of your order is  :  "+th4.price);
			System.out.println(" ");
		
		
		
		
	}

}
