class SnowMoonHotel{
public  static void main(String a[]){
 String type=" 3 Star Hotel";
 String addr="Shivamogga";
 String[]   mName={" Sanjana"," Pramodh"," Sanjay"," Suchitra","Sagar"};
int nOfMan=5;
String foodMenu[]= { " Veg Biriyani","Palav"," Masal Dosa"," Pudi Masal Dosa","Roti","Panner Curry","Mushrum Curry","Chapati","Veg Roll","Tandor Naan","CurdRice","Gee Rice","Tandor Panner masala"};


System.out.println("  WELCOME TO SnowMoonHotel ........................\n");
System.out.println("  This is  "+type);
		System.out.println(" We have "+ nOfMan +"   Manager\n");
		for(int m=0;m<mName.length;m++)
		{
			System.out.println();
			System.out.println(m+1+")" +mName[m]);
			System.out.println();
		}
		System.out.println(" It is located in "+addr);
		System.out.println(" Hello Good Morning/Afternoon/Evening   Sir/Madam     your menu is here....\n");
		for(int f=0;f<foodMenu.length;f++){
		
		
		System.out.println(f+1+")   " +foodMenu[f]);
		}



}
}


// Empire Hotel
// Truffels