package com.xworkz.air.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AirDTO {
	@Id
	private int id;
	
	
	
	@Size(min = 3, max = 20, message = " company should be greater than 3 and less than 20")
  private  String company;
	@Size(min = 3, max = 20, message = "name  should be greater than 3 and less than 20")
  private String name;
	@NotNull
  private Double cost;
	@Size(min = 3, max = 20, message = "type  should be greater than 3 and less than 20")

  private String type;
	@Size(min = 3, max = 20, message = "country  should be greater than 3 and less than 20")

  private String country;
}
