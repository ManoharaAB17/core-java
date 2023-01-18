package com.xworkz.mavjan18.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.mavjan18.dto.SoldierDTO;
import com.xworkz.mavjan18.repo.SoldierRepo;

public class SoliderServiceImpl implements SoldierService {
	SoldierRepo repo;

	public SoliderServiceImpl() {
		System.out.println("SoldierService implements");
	}
	public void setRepo(SoldierRepo repo) {
		this.repo=repo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {

		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> voilations=validator.validate(dto);

		if( !voilations.isEmpty()) {
			System.out.println("There are no errors");
			//			ConstraintViolation<SoldierDTO> v;
			voilations.forEach(v->{System.err.println("voilating message" +v.getMessage());
			});
			return true;
		}


		else {
			System.out.println("Data is valid");
			boolean saved =repo.save(dto);
			System.out.println("Dto saving using repo " +saved);
			return saved;
		}	
	}

}


