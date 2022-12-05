 class Digit{

	public static void main(String[] args) {
			int num = 5698234;
			int count = 0;
		while(num!=0) {
			num = num/10; //removes last digit of num
			count++;
		}
		System.out.println(count);
	}
}