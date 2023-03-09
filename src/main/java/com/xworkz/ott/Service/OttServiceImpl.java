package com.xworkz.ott.Service;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.ott.Entity.OttEntity;
import com.xworkz.ott.dto.OttDTO;
import com.xworkz.ott.repo.OttRepo;


@Service
public class OttServiceImpl implements OttService {
     
	
	@Autowired
	private OttRepo ottRepo;

	public OttServiceImpl() {
		System.out.println("Created  ott ServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<OttDTO>> vlaidateAndSave(OttDTO dto) {
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		Validator validator =factory.getValidator();
		
		Set<ConstraintViolation<OttDTO>> constraintViolations= validator.validate(dto);
		
		if(constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exist, return constraintViolations");
			return constraintViolations;
		}
		else {
			System.out.println(" constraintViolations doesn't exist data is good ");
			OttEntity entity = new OttEntity();
			
			BeanUtils.copyProperties(dto, entity);

			boolean saved = this.ottRepo.save(entity);
			System.out.println("Entity Data is saved "+saved); 			
			
			return Collections.emptySet();
		}
	
	}
	@Override
	public Set<ConstraintViolation<OttDTO>> validateAndUpdate(OttDTO dtos) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        Set<ConstraintViolation<OttDTO>> violations = validator.validate(dtos);
        
        if(violations !=null && !violations.isEmpty()) {
        	System.err.println("Violations in DTO " +dtos);
        	return violations;
        }
        else
        {
        	System.out.println(" constraintViolations doesn't exist data is good ");
        	OttEntity entity = new OttEntity();
        	BeanUtils.copyProperties(dtos, entity);

			boolean saved = this.ottRepo.update(entity);
			System.out.println(saved);
			return Collections.emptySet();
        }
 
	}
	
	@Override
	public OttDTO deleteById(int id) {
		System.out.println("Running Delete By id");
	   	OttEntity ent = this.ottRepo.deleteById(id);
	   	if(ent!= null) {
	   		OttDTO dto = new OttDTO();
	   		BeanUtils.copyProperties(ent, dto);

	   		return dto;
	   	}
	   	else
		return OttService.super.deleteById(id);
	}

	@Override
	public OttDTO findById(int id) {
		if(id>0) {
			
			  OttEntity entity = this.ottRepo.findById(id);
			  if(entity!=null) {
				  System.out.println("Entity is found in service for id "+id);
				  
				  OttDTO dto = new OttDTO();
				  BeanUtils.copyProperties(entity, dto);

				  return dto;
			  }
			}
			return null;
	}
    
	@Override
	public List<OttDTO> findByPlatform(String platform) {
		
		System.out.println("Running find By Platfrom ");
		
		if (platform != null && !platform.isEmpty()) {
			System.out.println("Data is valid ");
			
			List<OttEntity> ent =this.ottRepo.findByPlatform(platform);
			
			List<OttDTO> listDto = new ArrayList<OttDTO>();
			
			for (OttEntity cropEnt : ent) {
				OttDTO dto = new OttDTO();
				BeanUtils.copyProperties(cropEnt, dto);
				listDto.add(dto);
			}
			System.out.println("Size of dtos" +listDto.size());
			System.out.println("Size of entits "+ ent.size());
			return listDto;
		}
		else {
			System.err.println("Platform is invalid");
		}
		return OttService.super.findByPlatform(platform);
	}

	
}
