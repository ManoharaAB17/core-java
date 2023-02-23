			package com.xworkz.air.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.air.dto.AirDTO;
import com.xworkz.air.entity.AirEntity;
import com.xworkz.air.repository.AirRepo;

@Service
public class AirServiceImpl implements AirSerivice {

	@Autowired
	public AirRepo airRepo;

	public AirServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AirDTO>> vlaidateAndSave(AirDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();

		Set<ConstraintViolation<AirDTO>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.out.println("violation in dto " + dto);
			return violations;
		} else {
			System.out.println("valiadtion is not there in dto, can save");

			AirEntity entity = new AirEntity();
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setType(dto.getType());
			entity.setCost(dto.getCost());
			entity.setCountry(dto.getCountry());

			boolean saved = this.airRepo.save(entity);
			System.out.println("Entity Data is saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public AirDTO findById(int id) {
		if(id>0) {
			
			  AirEntity entity = this.airRepo.findById(id);
			  if(entity!=null) {
				  System.out.println("Entity is found in service for id "+id);
				  
				  AirDTO dto = new AirDTO();
				  
				  dto.setCompany(entity.getCompany());
				  dto.setName(entity.getName());
				  dto.setType(entity.getType());
				  dto.setCost(entity.getCost());
				  dto.setCountry(entity.getCountry());
				  dto.setId(entity.getId()); 
				  return dto;
			  }
			}
			return null;
	
	}

	
}
