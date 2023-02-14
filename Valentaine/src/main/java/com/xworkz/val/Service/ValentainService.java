package com.xworkz.val.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.val.dto.ValentainDTO;

public interface ValentainService {
	Set<ConstraintViolation<ValentainDTO>> vlaidateAndSave(ValentainDTO dto);
}
