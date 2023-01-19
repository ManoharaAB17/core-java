package com.xworkz.mavjan19.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mavjan19.dto.FirstAidDTO;
import com.xworkz.mavjan19.repo.FirstAidRepo;

@Component
public class FirstAidDtoServiceImpl implements FirstAidDtoService {

   @Autowired
   private  Validator validator;
   private  FirstAidRepo firstAidRepo;
   
   @Autowired
   public FirstAidDtoServiceImpl(FirstAidRepo firstAidRepo) {
	   this.firstAidRepo = firstAidRepo;
	   System.out.println("Created Service by passing repo from spring");
   }
   
	@Override
	public boolean updateAndSave(FirstAidDTO dto) {
		
		System.out.println("AIDDTO : "+dto);
		  Set<ConstraintViolation<FirstAidDTO>> violation = this.validator.validate(dto);
		  
		  if(!violation.isEmpty()) {
			  System.out.println("There is Error\n");
			  violation.forEach(v -> {System.out.println("Violation message is : "+v.getMessage());});
			  return false;
		  }
		  else {
			  System.out.println("Data is Saved");
			  System.out.println("DTO saving using repo");
			 // System.out.println(firstAidRepo);
			  return true;
		  }
	}

}
