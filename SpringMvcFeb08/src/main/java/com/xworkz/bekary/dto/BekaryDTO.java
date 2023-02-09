package com.xworkz.bekary.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="bekary_data")
public class BekaryDTO {
	
	@Column(name="b_id")
	@Id
	private int id;
	
	@Column(name="b_name")
	private String name;
	
	@Column(name="b_ownerName")
	private String ownerName;
	
	@Column(name="b_wifeName")
	private String wifeName;
	
	@Column(name="b_married")
	private String married;
	
	@Column(name="b_famousFor")
	private String famousFor;
	
	@Column(name="b_since")
	private int since;
}
