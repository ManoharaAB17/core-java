class GalaxyTest{
             public static void main(String a[]){
			 
			   Galaxy.setName("Milky way");
			   Galaxy.setType("Spiral");
			   Galaxy.setConsistOf("star,dust,gas");
			   Galaxy.setPlanet("Solar system");
			   
			   System.out.println("Galaxy Name :   "+Galaxy.getName()); 
			 System.out.println("Galaxy Type :   "+Galaxy.getType()); 
			 System.out.println("Galaxy Contains :   "+Galaxy.getConsistOf() ); 
			 System.out.println("Galaxy Planet :   "+ Galaxy.getPlanet()); 		 
			 }
}