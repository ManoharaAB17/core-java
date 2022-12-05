class Palindrome{	
	public static void main(String args[]){
		int n=303;
		int r,sum=0;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			
			n=n/10;
		}
		if(temp==sum)
			System.out.println(" it is palindrome number ");
		else
			System.out.println(" it isnot palindrome number ");
		
		}
	
}