package com.xworkz.crops.Service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.crops.dto.CropDTO;

public interface CropService {
	Set<ConstraintViolation<CropDTO>> vlaidateAndSave(CropDTO dto);
	
	Set<ConstraintViolation<CropDTO>> validateAndUpdate(CropDTO dtos);
	
//	Set<ConstraintViolation<CropDTO>> validateAndDelete(CropDTO dtod);
	
	CropDTO findById(int id);
	
	default List<CropDTO> findByCropName(String cropName){
		return null;
	}
}
