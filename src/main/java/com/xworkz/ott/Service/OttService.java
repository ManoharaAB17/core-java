package com.xworkz.ott.Service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.ott.dto.OttDTO;

public interface OttService {
	Set<ConstraintViolation<OttDTO>> vlaidateAndSave(OttDTO dto);
	
	Set<ConstraintViolation<OttDTO>> validateAndUpdate(OttDTO dtos);
	
	OttDTO findById(int id);
	
	default List<OttDTO> findByPlatform(String platform){
		return null;
	}
	
	default OttDTO deleteById(int id) {
		return null;
	}
}
