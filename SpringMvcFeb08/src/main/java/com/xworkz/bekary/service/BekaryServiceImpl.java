package com.xworkz.bekary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bekary.dto.BekaryDTO;
import com.xworkz.bekary.repository.BekaryRepo;
@Service
public class BekaryServiceImpl implements BekaryService {
	
	@Autowired
	public BekaryRepo bekaryRepo;
	
	public BekaryServiceImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BekaryDTO dto) {
		System.out.println("running validate bekarydto");
		boolean saved =this.bekaryRepo.saved(dto);
		System.out.println("Saved repo"+saved);
		return true;
	}

}
