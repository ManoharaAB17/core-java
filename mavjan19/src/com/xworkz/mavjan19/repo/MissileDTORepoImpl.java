package com.xworkz.mavjan19.repo;

import org.springframework.stereotype.Component;

import com.xworkz.mavjan19.dto.MissileDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class MissileDTORepoImpl implements MissileDTORepo {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("Saved DTO is : "+dto);
		return true;
	}
}
