package com.xworkz.mavjan17.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.mavjan17.dto.TerroristsDTO;


public class TeroristServiceImpl implements TeroristService {
	public TeroristServiceImpl() {
		System.out.println("Creating TerroristSurviceImpl using no-arg const");
	}

	@Override
	public boolean validateAndSave(TerroristsDTO dto) {
		System.out.println("Executing validateAndSave  ");
		System.out.println("Dto passed:"+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<TerroristsDTO>> voilations=validator.validate(dto);
		if(!voilations.isEmpty()) {
			System.err.println("Error is There");
			voilations.forEach(c->System.err.println(c.getMessage()));
			return false;
		}
		
		return true;
		
	}

	

}
