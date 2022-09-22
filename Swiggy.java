class Swiggy {

    // Pizza , Burger , Sandwitch , mosaranna , frechFries , SouthIndian , Pastries
   public static double takeOrder( String  item){
   
    if(item == "Pizza"){
	System.out.println("Thank you for Ordering "+ item);
	System.out.println(" The total amnt for "+item +"\n");
	return 99.00  ;
	}
	if(item == "Burger")
	{
	System.out.println("Thank you for Ordering "+ item);
	return 60.00 ; 
	}
    if(item  == "SouthIndian")
	{
	System.out.println("Thank you for Ordering "+ item);
	return 135  ; 
	}
	
	if(item  == "mosaranna")
	{
	System.out.println("Thank you for Ordering"+ item);
	return 25 ; 
	}
	
	if(item == "Sandwitch"){
	System.out.println("Thank you for Ordering "+ item);
	return 45   ; 
	}
	if(item == "Pastries"){
	System.out.println("Thank you for Ordering "+ item);
	return 50  ; 
	
	}
      
	return 0.0 ; 
   } 
   
    public static double takeOrder( String  item ,double quntity){
   
    if(item == "Pizza"){
	System.out.println("Thank you for Ordering "+ item);
	System.out.println(" The total quantity is "+quntity+" "+item+" total amnt is");
	return 99.00 * quntity ;
	}
	if(item == "Burger")
	{
	System.out.println("Thank you for Ordering "+ item);
	System.out.println(" The total quantity is "+quntity+" "+item+" total amnt is");
	return 60.00 * quntity ; 
	}
    if(item  == "SouthIndian")
	{
	System.out.println("Thank you for Ordering "+ item);
	System.out.println(" The total quantity is "+quntity+" "+item+" total amnt is");
	return 135 * quntity  ; 
	}
	
	if(item  == "mosaranna")
	{
	System.out.println("Thank you for Ordering"+ item);
	System.out.println(" The total quantity is "+quntity+" "+item+" total amnt is");
	return 25 * quntity  ; 
	}
	
	if(item == "Sandwitch"){
	System.out.println("Thank you for Ordering "+ item);
	System.out.println(" The total quantity is "+quntity+" "+item+" total amnt is");
	return 45 * quntity  ; 
	}
	if(item == "Pastries"){
	System.out.println("Thank you for Ordering "+ item);
	System.out.println(" The total quantity is "+quntity+" "+item+" total amnt is");
	return 50* quntity  ; 
	
	}
      
	return 0.0 ; 
   } 
   
}