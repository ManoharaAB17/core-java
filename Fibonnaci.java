class Fibonnaci{
  public static void main(String[] args) {

    int n = 10;
	int firstTerm = 0;
	int secondTerm = 1;
	int nextTerm ;
	
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; i++) {
		
            nextTerm = firstTerm + secondTerm;
	  
			firstTerm = secondTerm;
			
			secondTerm = nextTerm;
			
			 System.out.print(firstTerm + "    ");
    }
  }
}