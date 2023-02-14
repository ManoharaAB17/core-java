package com.xworkz.val.Service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.val.dto.ValentainDTO;
import com.xworkz.val.repo.ValentainRepo;

@Service
public class ValentainServiceImpl implements ValentainService {


	public ValentainServiceImpl() {
		System.out.println("Created  ValentainServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<ValentainDTO>> vlaidateAndSave(ValentainDTO dto) {
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		Validator validator =factory.getValidator();
		
		Set<ConstraintViolation<ValentainDTO>> constraintViolations= validator.validate(dto);
		
		if(constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exist, return constraintViolations");
			return constraintViolations;
		}
		else {
			System.out.println(" constraintViolations doesn't exist data is good ");
			return Collections.emptySet();
		}
	
	}

}
