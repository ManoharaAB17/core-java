package com.xworkz.mavjan19.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mavjan19.dto.MissileDTO;
import com.xworkz.mavjan19.dto.ResortDTO;
import com.xworkz.mavjan19.repo.ResortDTORepo;
@Component
public class ResortDTOServiceImpl implements ResortDTOService {
	@Autowired
	   private  Validator validator;
		private  ResortDTORepo resortDtoRepo;
		
	@Autowired
    public ResortDTOServiceImpl(ResortDTORepo resortDtoRepo) {
		this.resortDtoRepo= resortDtoRepo;
	}
	@Override
	public boolean validateAndUpdate(ResortDTO dto) {
		System.out.println("ResortDTO : "+dto);
		Set<ConstraintViolation<ResortDTO>> violation = this.validator.validate(dto);
        
		if(!violation.isEmpty()) {
			  System.out.println("There is Error\n");
			  violation.forEach(v -> {System.out.println("Violation message is : "+v.getMessage());});
			  return false;
		  }
		  else {
			  System.out.println("Data is Saved");
			  return true;
		  }
		
	}

}
