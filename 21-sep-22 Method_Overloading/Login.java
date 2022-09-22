class Login{
	public static void credentials( String name){
		System.out.println(" Loged in with...." +name);		
	}	
	public static void credentials(String name, long phnum){
		System.out.println(" Loged in with...." +name);	
		System.out.println(" Contact number is ...." +phnum);				
 	}	
	public static void main( String arg[]){		
		credentials("Manohar");
		credentials("Manohar", 8748038295L);
		}	
}	