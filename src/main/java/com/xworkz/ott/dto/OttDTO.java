package com.xworkz.ott.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class OttDTO {

	@Id
	private int id;

	@Size(min = 3, max = 20, message = " Platform should be greater than 3 and less than 20")
	private String platform;

	@Size(min = 3, max = 20, message = " Show should be greater than 3 and less than 20")
	private String show;

	@Size(min = 3, max = 20, message = " Language should be greater than 3 and less than 20")
	private String language;

	@NotNull
	private Double cost;

	@NotNull
	private Double monthlyPack;

}
