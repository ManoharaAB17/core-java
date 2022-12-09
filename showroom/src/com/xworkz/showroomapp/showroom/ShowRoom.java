/**
 * 
 */
package com.xworkz.showroomapp.showroom;



/**
 * @author DELL
 *
 */
public class ShowRoom {
	Mangers Mangers;
	public boolean isMangerRequired;
	
	public boolean admit(Mangers Mangers) 
	{
		 System.out.println("Inside admit method");
		 boolean isAddmited=false;
		 System.out.println("Manger Status");
		
		 
			 if(isMangerRequired==true) 
			 {
				this.Mangers = Mangers;
				isAddmited = true ; 
				this.Mangers.display();
				System.out.println("++++++++++++++++++++++++++++++++++");
				System.out.println("Details of Manger it can allow ");
			 }
			 else 
			 {
				 System.out.println("Details of Manger it can not be allow ");
			 }
	
	
			return isAddmited;
	}
	

}
