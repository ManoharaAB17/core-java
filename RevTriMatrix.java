import java.util.*;
 
class RevTriMatrix
{
	public static void main(String args[])
	{
		int i,j,n,k=1;
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
			if(i%2==0)
			{
	       			for(j=1;j<=i;j++)
        			{
     					System.out.printf("%3d",k);
					k--;
				} 	
	        		System.out.println();
				k=k+i+1;
			}
			else
			{
	       			for(j=1;j<=i;j++)
        			{
     					System.out.printf("%3d",k);
					k++;
				} 	
     				System.out.println();
				k=k+i;
			}	 			
    		}
	}
}
