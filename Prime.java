public class Prime{
  
	public static void main(String[] args) {
	    
	    // take a Number
	    
	   int n=2;
	    
	    // then dived by 2 with taken Number
	     int m=n/2,flag=0;
	     
	    // apply condition
	    
	    if (n==0|| n==1)
	    {
	        System.out.println(n+" Not a Prime ");
	    }
	    
	    else
	    {
	        
	        for(int i=2;i<m;i++)
	        {
	            if(n%2 == 0)
	            {
	                System.out.println( n +" Not a prime");
	                flag =1;
	                break;
	            }
	        }
	        if(flag==0)
	        {
	            System.out.println( n +"  it is a prime Number");
	        }
	    }
	}
}
