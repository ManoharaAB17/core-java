package com.xworkz.mavjan18.repo;

import com.xworkz.mavjan18.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {

	
	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("DTO  saving");
		System.out.println("DTO : " +dto);
		return true;
	}

}
