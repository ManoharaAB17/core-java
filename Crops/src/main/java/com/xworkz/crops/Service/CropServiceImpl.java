package com.xworkz.crops.Service;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.crops.Entity.CropEntity;
import com.xworkz.crops.dto.CropDTO;
import com.xworkz.crops.repo.CropRepo;


@Service
public class CropServiceImpl implements CropService {
     
	
	@Autowired
	private CropRepo cropRepo;

	public CropServiceImpl() {
		System.out.println("Created  Crop ServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<CropDTO>> vlaidateAndSave(CropDTO dto) {
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		Validator validator =factory.getValidator();
		
		Set<ConstraintViolation<CropDTO>> constraintViolations= validator.validate(dto);
		
		if(constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exist, return constraintViolations");
			return constraintViolations;
		}
		else {
			System.out.println(" constraintViolations doesn't exist data is good ");
			CropEntity entity = new CropEntity();
			entity.setCropName(dto.getCropName());
			entity.setType(dto.getType());
			entity.setTotdays(dto.getTotdays());
			entity.setRegion(dto.getRegion());
			entity.setId(dto.getId());
			boolean saved = this.cropRepo.save(entity);
			System.out.println("Entity Data is saved "+saved); 			
			
			return Collections.emptySet();
		}
	
	}
	@Override
	public Set<ConstraintViolation<CropDTO>> validateAndUpdate(CropDTO dtos) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        Set<ConstraintViolation<CropDTO>> violations = validator.validate(dtos);
        
        if(violations !=null && !violations.isEmpty()) {
        	System.err.println("Violations in DTO " +dtos);
        	return violations;
        }
        else
        {
        	System.out.println(" constraintViolations doesn't exist data is good ");
        	CropEntity entity = new CropEntity();
        	BeanUtils.copyProperties(dtos, entity);
//			entity.setCropName(dtos.getCropName());
//			entity.setType(dtos.getType());
//			entity.setTotdays(dtos.getTotdays());
//			entity.setRegion(dtos.getRegion());
//			entity.setId(dtos.getId());
			boolean saved = this.cropRepo.update(entity);
			System.out.println(saved);
			return Collections.emptySet();
        }
 
	}
	
	@Override
	public CropDTO deleteById(int id) {
		System.out.println("Running Delete By id");
	   	CropEntity ent = this.cropRepo.deleteById(id);
	   	if(ent!= null) {
	   		CropDTO dto = new CropDTO();
	   		BeanUtils.copyProperties(ent, dto);
//	   		dto.setCropName(ent.getCropName());
//	   		dto.setId(ent.getId());
//	   		dto.setRegion(ent.getRegion());
//	   		dto.setTotdays(ent.getTotdays());
//	   		dto.setType(ent.getType());
	   		return dto;
	   	}
	   	else
		return CropService.super.deleteById(id);
	}

	@Override
	public CropDTO findById(int id) {
		if(id>0) {
			
			  CropEntity entity = this.cropRepo.findById(id);
			  if(entity!=null) {
				  System.out.println("Entity is found in service for id "+id);
				  
				  CropDTO dto = new CropDTO();
				  BeanUtils.copyProperties(entity, dto);
//				  dto.setCropName(entity.getCropName());
//				  dto.setRegion(entity.getRegion());
//				  dto.setTotdays(entity.getTotdays());
//				  dto.setType(entity.getType());
//				  dto.setId(entity.getId()); 
				  return dto;
			  }
			}
			return null;
	}
    
	@Override
	public List<CropDTO> findByCropName(String cropName) {
		
		System.out.println("Running find By Name ");
		
		if (cropName != null && !cropName.isEmpty()) {
			System.out.println("Data is valid ");
			
			List<CropEntity> ent =this.cropRepo.findByName(cropName);
			
			List<CropDTO> listDto = new ArrayList<CropDTO>();
			
			for (CropEntity cropEnt : ent) {
				CropDTO dto = new CropDTO();
				BeanUtils.copyProperties(cropEnt, dto);
//				dto.setCropName(cropEnt.getCropName());
//				dto.setRegion(cropEnt.getRegion());
//				dto.setTotdays(cropEnt.getTotdays());
//				dto.setType(cropEnt.getType());
//				dto.setId(cropEnt.getId());
				listDto.add(dto);
			}
			System.out.println("Size of dtos" +listDto.size());
			System.out.println("Size of entits "+ ent.size());
			return listDto;
		}
		else {
			System.err.println("Crop Name is invalid");
		}
		return CropService.super.findByCropName(cropName);
	}

	
}
