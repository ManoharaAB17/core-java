public class Armstrong {

    public static void main(String[] args) {

        int n = 151;
		int temp=n;
		int arm =0;
		int rem = 0;
		
	 while (n > 0)
        {
           rem = n % 10;
            arm= (arm)+ (rem * rem * rem);
            n = n/10;
        }

        if(temp == arm)
            System.out.println(temp+ " is an Armstrong number.");
        else
            System.out.println(temp + " is not an Armstrong number.");
    }
}