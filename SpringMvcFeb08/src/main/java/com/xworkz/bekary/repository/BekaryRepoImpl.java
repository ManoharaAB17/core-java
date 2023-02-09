package com.xworkz.bekary.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bekary.dto.BekaryDTO;
@Repository
public class BekaryRepoImpl implements BekaryRepo {
	public BekaryRepoImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean saved(BekaryDTO dto) {
		System.out.println("running save");
		return true;
	}

}
