package com.xworkz.festapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "fest_data")
@NamedQuery (name="fidByIdAndName", query="select data from FestivalEntity data where data.id=14")
@NamedQuery (name="findByMainGod", query="select data from FestivalEntity data where data.mainGod = 'thrissur'")
@NamedQuery (name="findByNameAndRegionAndMainGod", query="select data.region ,data.mainGod from FestivalEntity data where data.name = 'sankranti' ")
@NamedQuery (name="findMainGodAndTotalDaysByName", query="select data.mainGod ,data.totalDays from FestivalEntity data where data.name = 'diwali'")
@NamedQuery (name="findMaxTotalDays", query="select max(data.totalDays) from FestivalEntity data ")
@NamedQuery (name="findRegionAndMainGodByNameAndId", query="select data.region ,data.mainGod from FestivalEntity data where data.name=:byName and data.id=:byid")
@NamedQuery (name="findTotal", query="select count(data) from FestivalEntity data ")
@NamedQuery (name="findTotalDaysByName", query="select data.totalDays from FestivalEntity data where data.name = 'diwali'")


public class FestivalEntity {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "f_name")
	private String name;

	@Column(name = "f_region")
	private String region;

	@Column(name = "f_totalDays")
	private int totalDays;

	@Column(name = "f_sweet")
	private String sweet;

	@Column(name = "f_mainGod")
	private String mainGod;
}
