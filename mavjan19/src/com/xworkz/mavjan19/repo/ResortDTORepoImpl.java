package com.xworkz.mavjan19.repo;

import org.springframework.stereotype.Component;

import com.xworkz.mavjan19.dto.ResortDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class ResortDTORepoImpl implements ResortDTORepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Saved DTO is : "+dto);
		return true;
	}

}
