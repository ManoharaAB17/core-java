class VivantaTaj
{
public static void main(String a[])
{
String type = "5 Star";	
String address = "M G Road";
String managerName[] = {"Akshatha","Lakshmi","Sangeetha","Ganesha"};
int noOfManager = 4;
String foodMenu[] = {"Chicken Biryani","Chicken Kabab","Paneer Tikka","Broated Chicken","Fried Rice","Egg Curry","Egg Fried Rice","Paneer 65","Chicken Ghee Roast","Fish Meals","Bamboo Biryani","Chicken pepper dry","Pot Biryani","mutton biryani","non-veg meals"};
System.out.println("Welcome to VivantaTaj Hotel");
System.out.println("This hotel has"+" "+type);

for(int s=0;s<managerName.length;s++)
{
	System.out.println("VivantaTaj Hotel manager are :-"+" "+managerName[s]);
}
System.out.println("Total Number of Manager :-"+noOfManager);
System.out.println("\n");
System.out.println("*****List of Menu*****");
for(int p=0;p<foodMenu.length;p++)
{

	System.out.println(p+1+")"+foodMenu[p]);
}
}

}