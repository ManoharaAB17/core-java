class Television{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	
	public static boolean onOrOff(){
		System.out.println(" Inside onOrOff()\n");
		
			if(isConnected == false ){
					isConnected=true;
				System.out.println("Television is Turned ON.....");
			}
			
			else if(isConnected == true){
				isConnected=false;
				System.out.println("Television is Turned OFF....");
			}
			
		System.out.println(" end of onOrOff()\n");
		return isConnected;
	}		

}

