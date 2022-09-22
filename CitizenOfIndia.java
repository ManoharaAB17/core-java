class CitizenOfIndia{

public static void showTheResponsibility(){
 int age=21;
 char gender='F';
 if(age>=10 && age<16) {
   System.out.println("Responsibility is going to school\n");
   return;
 }
 if(age==16){
  System.out.println("Responsibility is going to College\n");
  return;
 }
 if (age ==21){
   System.out.println("Responsibility is going to Voting\n");
	if(gender== 'F'){
		System.out.println("Girl can legally Marry\n");
	}
	else{
		System.out.println("Boy can not legally Marry\n");
	}
 }
}

}