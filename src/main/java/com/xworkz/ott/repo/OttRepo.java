package com.xworkz.ott.repo;

import java.util.Collections;
import java.util.List;

import com.xworkz.ott.Entity.OttEntity;

public interface OttRepo {
	boolean save(OttEntity entity);
	
	boolean update(OttEntity entity);
	 
	OttEntity findById(int id);
	 
	 default List<OttEntity> findByPlatform(String platform){
		 return Collections.emptyList();
	 }

	 default  OttEntity  deleteById(int id){
		 return null;
	 }
}
