class Reverse{
	public static void main(String a[]){
		int num=874803, reverse=0;
		while(num !=0)
		{
			int remainder =num % 10 ;
			reverse =reverse * 10 + remainder;
			num =num/10;
		}
		System.out.println(" The Reverse of the given number "+ reverse);
	}
}