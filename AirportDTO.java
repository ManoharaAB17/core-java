/**
 * 
 */
package com.xworkz.collectionsapp.dec28;

import java.io.Serializable;

/**
 * @author DELL
 *
 */
public class AirportDTO implements Serializable{

	private String name;
	private String airportType;
	private String place;


	public AirportDTO() {
		// TODO Auto-generated constructor stub
	}

	public AirportDTO(String name, String airportType, String place) {
		super();
		this.name = name;
		this.airportType = airportType;
		this.place = place;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj !=null) {
			if(obj instanceof AirportDTO) {
				AirportDTO dto =(AirportDTO) obj;
				if(dto.name.equals(this.name)) {
					System.out.println("Name is matching " +dto.name);
					return true;
				}
			}
		}
		return false;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getAirportType() {
		return airportType;
	}


	public void setAirportType(String airportType) {
		this.airportType = airportType;
	}


	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", airportType=" + airportType + ", place=" + place + "]";
	}

	



}
