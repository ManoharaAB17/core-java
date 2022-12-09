package com.xworkz.redbusapp.transport;

import com.xworkz.redbusapp.contract.RedBusContract;

public class Transport {
	RedBusContract redbusContract;
	 public int noOfBookings;

	String name="Sri Durga parameshwari transport service";
	public boolean bookings(RedBusContract contract)
	{
		boolean isBookingDone = false;
		System.out.println("Inside booking method \n");
		boolean condition = contract.conditionOfBus();
		if(condition == true) {
			System.out.println("Bus is in good condition\n");
			if(noOfBookings <= contract.minBookings() )
			{
				System.out.println("No of Bokkings is  "+noOfBookings);
				System.out.println("Thank you for Booking the ticket through "+ name);
				isBookingDone=true;  
			}
			else {
				System.out.println("Cannot proced with Booiking as noofbooking Exceeds");
			}
		}
		else {
			System.out.println("Cannot proceed with booking as bus is not good condition");
		}
		return isBookingDone;
	}
	
}
