package com.xworkz.air.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.air.dto.AirDTO;

public interface AirSerivice {
	Set<ConstraintViolation<AirDTO>> vlaidateAndSave(AirDTO dto);

	AirDTO findById(int id);
}
