package com.xworkz.redbusapp;

import com.xworkz.redbusapp.contract.RedBusContract;
import com.xworkz.redbusapp.transport.Transport;
import com.xworkz.redbusapp.vrl.VrlImplementation;

public class RedBusTester {

	public static void main(String[] args) {

		RedBusContract  busContract =new VrlImplementation();
		
		Transport transportation = new Transport();
		transportation.noOfBookings=2;
		transportation.bookings(busContract);
	}

}
