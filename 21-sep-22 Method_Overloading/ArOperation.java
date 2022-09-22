class ArOperation{
	public static void add(int a, int b)
	{
	   System.out.println("addition of two number"+ a+b);
	}
	public static void add(int a, int b,int c){
		System.out.println("addition of three number"+a+b+c);
	}
	
	public static void sub(int a, int b){
		System.out.println("Subtraction of two number"+(a-b));
	}
	public static void sub(int a, int b, int c){
		System.out.println("Subtraction of three number"+(a-b-c));
	}
	
	public static void mul(int a, int b){
		System.out.println("Multiplication of two number"+ a*b);
	}
	public static void mul(int a, int b,int c){
		System.out.println("Multiplication of Three number"+ a*b*c);
	}
	
	public static void div(int a, int b){
		System.out.println("Division of two number"+ a/b);
	}
	public static void div(int a, int b,int c){
		System.out.println("Division of three number"+ a/b/c);
	}
	public static void main(String args[])
	{
		add(2,5);
		add(2,4,6);
		sub(8,4);
		sub(15,4,2);
		mul(6,3);
		mul(6,4,2);
		div(10,3);
		div(104,3,4);
	}
	
}
