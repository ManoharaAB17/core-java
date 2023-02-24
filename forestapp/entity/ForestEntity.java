package com.xworkz.forestapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table (name="forest_data")
@NamedQuery(name="findByName" , query = "select entity from ForestEntity entity where entity.name = 'Bhadra Reserved Forest' ")
@NamedQuery(name="findByState" , query = "select entity from ForestEntity entity where entity.state = 'Karnataka' ")
@NamedQuery(name="findByNameAndStateAndArea" , query = "select entity from ForestEntity entity where entity.name = 'Bhadra Reserved Forest' ")
@NamedQuery(name="findAreaByName" , query = "select entity from ForestEntity entity where entity.area > 4000 ")
@NamedQuery(name="findByIdByNameAndState" , query = "select entity from ForestEntity entity where entity.id = 4 ")
@NamedQuery(name="findNameById" , query = "select entity from ForestEntity entity where entity.id = 18 ")
@NamedQuery(name="findStateByNameAndArea" , query = "select entity from ForestEntity entity where entity.name = 'Sathyamangalam Wildlife Sancturay ' ")
@NamedQuery(name="findCount" , query = "select count(entity) from ForestEntity  entity ")
@NamedQuery(name="findMaxArea" , query = "select max(entity.area) from ForestEntity entity  ")


public class ForestEntity {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="f_name")
    private String  name;
	
	@Column(name="f_state")
    private String state;
	
	@Column(name="f_area")
    private String area;
	
	@Column(name="f_type")
    private String type;
}
