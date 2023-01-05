package com.xworkz.collectionsapp.jan04;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.collectionsapp.jan03.MovieDTO;

public class WeponsDTO implements Serializable, Comparable<WeponsDTO> {
	private String name;
	private String madeby;
	private LocalDate madeon;
	private double price;
	private WeponType type;

	public WeponsDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param madeby
	 * @param madeon
	 * @param price
	 * @param type
	 */
	public WeponsDTO(String name, String madeby, LocalDate madeon, double price, WeponType type) {
		super();
		this.name = name;
		this.madeby = madeby;
		this.madeon = madeon;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeponsDTO [name=" + name + ", madeby=" + madeby + ", madeon=" + madeon + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof WeponsDTO) {
				WeponsDTO wepon = (WeponsDTO) obj;
				if (wepon.name.equals(this.name)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 23;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	public LocalDate getMadeon() {
		return madeon;
	}

	public void setMadeon(LocalDate madeon) {
		this.madeon = madeon;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public WeponType getType() {
		return type;
	}

	public void setType(WeponType type) {
		this.type = type;
	}

	@Override
	public int compareTo(WeponsDTO o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
