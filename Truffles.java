class Truffles
{
public static void main(String a[])
{
	
String type = "4 Star";	
System.out.println("\n");
String address = "Koramangala";
System.out.println("\n");
String managerName[] = {"Pramod","Sanjana","Manohar","Sanjay"};
int noOfManager = 4;
String foodMenu[] = {"Chocolate truffle","Dutch Truffle(Eggless)","Ferrero Rocher","Almond and Chocolate Fudge Ring","Black Forest","Kahlua Fantasy","Gooey Mud Cake","Hotch Potch","Orange Peach Meringue","Hazelnut Bomb Dark/White","Choco Mousse","Mississippi Mud Pie","Walnut Fudge Tart","Cappuccino Walnut Brownie","Red velvet cup cake"};
String rate[]={"=115","=120","=125","=105","=115","=120","=120","=120","=160","=135","=135","=130","=130","=120","=80"};
System.out.println("****--------Welcome to Truffles Fast Food  Restaurant--------****");
System.out.println("This hotel has"+" "+type);

for(int s=0;s<managerName.length;s++)
{
	System.out.println("VivantaTaj Hotel manager are :-"+" "+managerName[s]);
}
System.out.println("\n");
System.out.println("Total Number of Manager :-"+noOfManager);
System.out.println("\n");
System.out.println("*****Truffles Special Cakes*****");
if(foodMenu.length==rate.length)
{
for(int p=0;p<foodMenu.length;p++)
{
	
	System.out.println(p+1+")"+foodMenu[p]+" Price : "+rate[p]);
  
}
}
else
{
	System.out.println("index values not match rate and food");
}
}

}