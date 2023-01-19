package com.xworkz.mavjan19.repo;

import org.springframework.stereotype.Component;

import com.xworkz.mavjan19.dto.FirstAidDTO;

import lombok.NoArgsConstructor;
 @Component
 @NoArgsConstructor
public class  FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("Running save ");
		System.out.println("Saved DTO is : "+dto);
		return true;
	}

}
