class NewSpeakerIncrease{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int volume;
	static int maxVolume = 8;
	static int currentVolume ; 
	
	public static boolean onOrOff(){
		// System.out.println(" Inside onOrOff()\n");
		
			if(isConnected == false ){
					 isConnected=true;
				System.out.println("Speaker is Turned ON.....");
			}
			
			else if(isConnected == true){
				 isConnected=false;
				System.out.println("Speaker is Turned OFF....");
			}
			
		//  System.out.println(" end of onOrOff()\n");
		return isConnected;
	}	
    public static void incresVolume(){
		// System.out.println(" inside of incresVolume()\n");
		if(isConnected ==true)
		{
			if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1;
			 System.out.println(" The current Volume is : "+currentVolume);
			 }
			 else {
			  System.out.println(" Max Volume Reached...\n");
			  }
		 }
			else  {
			  System.out.println(" Switch on the Speaker\n");
			  }
	}
	

}


