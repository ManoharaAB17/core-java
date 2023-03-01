package com.xworkz.crops.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cropdata")
@NamedQuery(name = "findByCropName", query = "select enttt from CropEntity enttt where enttt.cropName=:cp")
public class CropEntity {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "c_name")
	private String cropName;

	@Column(name = "c_totdays")
	private Double totdays;

	@Column(name = "c_type")
	private String type;

	@Column(name = "c_region")
	private String region;
}
