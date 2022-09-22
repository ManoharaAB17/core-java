class NewSpeakerDecrease{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int volume;
	static int maxVolume;
	static int decreaseVolume;
	static int currentVolume = 8 ; 
	
	public static boolean onOrOff(){
				
			if(isConnected == false ){
					 isConnected=true;
				System.out.println("Speaker is Turned ON.....");
			}
			
			else if(isConnected == true){
				 isConnected=false;
				System.out.println("Speaker is Turned OFF....");
			}
			
		
		return isConnected;
	}	
    public static void decreaseVolume(){
		
		if(isConnected ==true)
		{
			if(decreaseVolume< currentVolume){
				currentVolume= currentVolume-1;
				 System.out.println(" The current Volume is : "+currentVolume);
			 }
			 else {
			  System.out.println(" The current value...\n");
			  }
		 }
			else  {
			  System.out.println(" The Current Volume Reached\n");
			  }
	}
	

}


