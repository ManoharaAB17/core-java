package com.xworkz.crops.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class CropDTO {
   
	 @Id
    private int id;
	 @Size(min = 3, max = 20, message = " Name should be greater than 3 and less than 20")
	private String cropName;
	 @NotNull
	private Double totdays;
	 @Size(min = 3, max = 20, message = " type should be greater than 3 and less than 20")
	private String type;
	 @Size(min = 3, max = 20, message = " region should be greater than 3 and less than 20")
	private String region;

}
