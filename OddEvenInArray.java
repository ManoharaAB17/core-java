public class OddEvenInArray{ 
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
				if(a[i]%2!=0){  
						System.out.println("the number is odd "+a[i]);  
				}  
				else
				{
					System.out.println("the number is even "+a[i]);  
				}
		}  
		
	}
}  