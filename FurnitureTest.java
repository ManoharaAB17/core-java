class FurnitureTest{
               public static void main(String a[]){			   
			   Furniture.setBrand("Teakwood");
			   Furniture.setMaterial("wood");
			   Furniture.setId(8746);
			   Furniture.setColor("brown");
			   Furniture.setStyle("classic");
			   
			  System.out.println("Furniture Brand :  "+Furniture.getBrand() ); 
 			   System.out.println("Furniture Material :  "+Furniture.getMaterial() ); 
			   System.out.println("Furniture ID:    "+Furniture.getId()  ); 
			   System.out.println("Furniture Colour   :  "+Furniture.getColor() ); 
			   System.out.println("Furniture Style   :   "+Furniture.getStyle() ); 
			  }
}