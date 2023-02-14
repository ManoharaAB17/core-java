package com.xworkz.val.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
//@Entity
//@Table(name = "valdata")
public class ValentainDTO {
//	@Id
//	@Column(name = "id")
//	private int id;
//	@Column(name = "name")
	@Size(min = 3, max = 20, message = " Name should be greater than 3 and less than 20")
	private String name;
	
	@Size(min = 3, max = 20, message = "valentainName  should be greater than 3 and less than 20")
	private String valentainName;
	
	@NotBlank( message = "place  should be not be null")
	private String place;
	
	@NotBlank( message = "gift  should not be null")
	private String gift;

}
