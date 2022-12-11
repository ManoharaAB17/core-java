/**
 * 
 */
package com.xworkz.showroomapp;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class ShowRoomImpl implements ShowRoom{
	Scanner sc = new Scanner(System.in);
       public MangersDeatils[] manger;
       //public MangersDeatils[] mang;
         public int index;
		
         
		public ShowRoomImpl(int size) {
			manger = new MangersDeatils[size];
		}
         
	@Override
	public boolean addMangers(MangersDeatils mangers) {
		boolean isMangerAdded = false;
		if(mangers != null ) {
				System.out.println("Manger details are Right go....\n ");
				
				manger[index++] = mangers;
				isMangerAdded= true;
		}
				return isMangerAdded;		
	}
	@Override
	public void getAllMangers() {
		for(int i=0;i<manger.length;i++) {
            System.out.println(manger[i].getName()+" "+manger[i].getAddress()+" "+manger[i].getAge()+ " "+manger[i].getGender()  );
		  System.out.println(" ");
		}
	}

	@Override
	public void getMangerByName(String name) {
           
           for(int i=0;i<manger.length;i++) 
           {
        	   if(manger[i].getName().equals(name)) 
        	   {
        		   System.out.println(manger[i].getName() +"  Is found in the Mangers in this Shworoom" );
        	   }
//        	   else {
//        		   System.out.println(manger[i].getName()+"  this Manger not found in this Showroom");
//        		   break;
//        	   }
           }

	}



}
