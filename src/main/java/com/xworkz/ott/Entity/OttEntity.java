package com.xworkz.ott.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ottdata")
@NamedQuery(name = "findByPlatform", query = "select enttt from OttEntity enttt where enttt.platform=:cp")
public class OttEntity {
	@Id
	@Column(name = "id")
	private int id;
	
	
	

	@Column(name = "c_platform")
	private String platform;
	
	@Column(name = "c_show")
	private String show;

	@Column(name = "c_language")
	private String language;

	@Column(name = "c_cost")
	private Double cost;
	
	@Column(name = "c_monthlyPack")
	private Double monthlyPack;

	
}
