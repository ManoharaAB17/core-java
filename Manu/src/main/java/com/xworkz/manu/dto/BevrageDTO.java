package com.xworkz.manu.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BevrageDTO {
	private String name;
    private int id; 
    private String quantity;
    private int price;
    private String barcodeNo;
    private String colour;
    private String flavour;
    private String type;
    private LocalDate mfdDate;
    private LocalDate expDate;
}
