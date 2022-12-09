/**
 * 
 */
package com.xworkz.showroomapp.showroom;



/**
 * @author DELL
 *
 */
public class MaruthiSuzuki {
	public Mangers[] mangers;
	public Mangers[] newMangers;
	
	public int index;
	
	public MaruthiSuzuki(int size) {
		mangers = new  Mangers[size];
	}

	public MaruthiSuzuki() {
		// TODO Auto-generated constructor stub
	}

	public boolean addMangers(Mangers manger){
		boolean isMangerAdded = false;
		if(mangers != null ) {
				System.out.println("Manger details are Right go....\n ");
				mangers[index++] = manger;
				isMangerAdded= true;
		}
				return isMangerAdded;
	}
	
	public void getAllMangers() {
		for(int i=0;i<mangers.length;i++) {
            System.out.println(mangers[i].getName());
		  System.out.println(" ");
		}
	}
	
	public void getMangertByName(String mangerName) {
		System.out.println("inside getMangerByName ");
		for (int i = 0; i < mangers.length; i++) {
			//Patient patient = patients[i];
			if(mangers[i].getName().equals(mangerName)) {
				System.out.println(mangers[i].getName()+"\n "+mangers[i].getAddress() +"\n  "+mangers[i].getAge()+ "\n"+mangers[i].getGender()  );
				 
			}
			else {
				System.out.println("No Manger found");
				break;
			}
		}
	}
	
	
	
	
	

}
