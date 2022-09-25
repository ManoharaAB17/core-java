class EcommerceTest{
	public static void main(String args[]){
		Ecommerce.setEcmId(2364);
		Ecommerce.setBranch("Banglore");
		Ecommerce.setName(" Flipkart");
		Ecommerce.setAddress("Bellandur, Banglore");
		
		
		System.out.println("Ecommerce ID:  " +Ecommerce.getEcmId());
		System.out.println("Ecommerce Name : "+Ecommerce.getName());
		System.out.println(" Address : "+ Ecommerce.getAddress());		
		System.out.println(" Ecommerce Branch :   "+Ecommerce.getBranch());
	}

}