package com.xworkz.forestapp.dto;

import javax.persistence.Id;

import lombok.Data;

@Data
public class ForestDTO {
	@Id
	private int id;
    private String  name;
    private String state;
    private String area;
    private String type;
}
