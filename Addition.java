class Addition{
  public static int add( int a, int b){
	   for(int i=1; i<=b;i++){
		   a++;
        }
  return a;
  }
  public static void main(String args[]){
      int a=add(6,3);
	  System.out.println(a); 
 }
}