class Empire
{
public static void main(String a[])
{
String type = "5 Star";	
String address = "RajajiNagar";
String managerName[] = {"Pramod","Sanjana","Manohar","Sanjay"};
int noOfManager = 4;
String foodMenu[] = {"Chicken Biryani","Chicken Tandoori Masala","Kadai Chicken","Empire SPL chicken kebab","chilli kabab","Grilled chicken","Alfaham chicken","Jumbo fish big","Mutton pepper dry","Mutton Brain dry fry","Murg Tikka","Kalmi Kabab","Chilli Chicken dry","POPCorn chicken","Pepper chicken boneless"};
System.out.println("Welcome to Empire Restaurant Hotel");
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