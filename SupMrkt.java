class SupMrkt{
	//static String vegatables[];
	static String  sPn =" LU LU HYPERMARKET";
public static void main(String []a){
     System.out.println(" Welcome to ......"+sPn);
		 String vegatables[]={" Onion","Tamato","Carrat","Ginger"," Chilii","DrumStick"," Capsicum","Garlic"};
		String  perfume[]={ "Axe","Denver","Fogg","KS","LayerShot","Sceret",};
		
		System.out.println("List of vegatables");
		for( int v=0;v<vegatables.length;v++){
			System.out.println(vegatables[v]+" ");
			
		}	
         System.out.println();		
		System.out.println (" List Of Perfumes are\n");
		for( int p=0;p<perfume.length;p++){
			System.out.println(perfume[p]+" ");
		}


}
}