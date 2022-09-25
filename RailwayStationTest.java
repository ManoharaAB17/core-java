class RailwayStationTest{

               public static void main(String a[]){
			   
			     RailwayStation.setTrainNo(16227);
				 RailwayStation.setStationName("Shimogga Town");
				 RailwayStation.setPltNo(1);
                 RailwayStation.setTrainName("Maysore Talguppa Express");

                 System.out.println("Station Name  :  "+RailwayStation.getStationName() );  
			     System.out.println("Train Name  :  "+RailwayStation.getTrainName() ); 
				 System.out.println("Train Number  :  "+RailwayStation.getTrainNo() ); 
				 System.out.println("Platform Number  :  "+RailwayStation. getPltNo() ); 
				 
			   }

}