class Speaker{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	
	public static boolean onOrOff(){
		System.out.println(" Inside onOrOff()\n");
		
			if(isConnected == false ){
					isConnected=true;
				System.out.println("Speaker is Turned ON.....");
			}
			
			else if(isConnected == true){
				isConnected=false;
				System.out.println("Speaker is Turned OFF....");
			}
			
		System.out.println(" end of onOrOff()\n");
		return isConnected;
	}		

}

//tv, ac, mobile,washingmachine,torch
