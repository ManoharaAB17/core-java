// using of array variable

class Theatre{  
  static long priceOfkm []= {1000,150, 250,500, 90000L };
  static int priceOfhm []= {1000,150, 250,500 };
  static String kannadaMovie[]={" KGF Franchise", " Sampathige Sawaal" , "Gandada Gudi" , " Kranthi "};
   static String hindiMovie[]={" 3 iditos", "ddlj " , "pk" , " kashmiri files "};
  

public static void main (String a[]){
     System.out.println("");
     System.out.println(" list of  Kannada movies");
     System.out.println( kannadaMovie[0] +" "+ kannadaMovie[1] +" "+kannadaMovie[2] +" "+kannadaMovie[3] );
     System.out.println("");
	 
	 System.out.println("");
     System.out.println(" Price  of  Kannada movies");
     System.out.println( priceOfkm[0] +" "+ priceOfkm[1] +" "+priceOfkm[2] +" "+priceOfkm[3]+" "+priceOfkm[4] );
      System.out.println("");
   
   System.out.println(" list of  Hindi movies");
   System.out.println( hindiMovie[0] +" "+ hindiMovie[1] +" "+hindiMovie[2] +" "+hindiMovie[3] );
    System.out.println("");
	
     System.out.println(" Price  of  Hindi movies");
     System.out.println( priceOfhm[0] +" "+ priceOfhm[1] +" "+priceOfhm[2] +" "+priceOfhm[3] );
      System.out.println("");
}
}
