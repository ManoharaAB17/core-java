package com.xworkz.crops.repo;

import java.util.Collections;
import java.util.List;

import com.xworkz.crops.Entity.CropEntity;

public interface CropRepo {
	boolean save(CropEntity entity);
	
	boolean update(CropEntity entity);
	
//	boolean delete(CropEntity entity);

	 
	CropEntity findById(int id);
	 
	 default List<CropEntity> findByName(String cropName){
		 return Collections.emptyList();
	 }

	 default List<CropEntity> deleteById(int id){
		 return Collections.emptyList();
	 }
}
