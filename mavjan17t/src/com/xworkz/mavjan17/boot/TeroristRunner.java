package com.xworkz.mavjan17.boot;

import com.xworkz.mavjan17.dto.TerroristsDTO;
import com.xworkz.mavjan17.service.TeroristService;
import com.xworkz.mavjan17.service.TeroristServiceImpl;

public class TeroristRunner {

	public static void main(String[] args) {
		TerroristsDTO dto=new TerroristsDTO();
		dto.setName("B");
		dto.setAge(85);
		dto.setCountry("America");
		dto.setSpecialization("Uneducated");
		dto.setOrganization("Americans");
		dto.setAlive(true);
		dto.setPrison(true);
		System.out.println(dto);
		
		TeroristService service = new TeroristServiceImpl();
		service.validateAndSave(dto);
	}

}
