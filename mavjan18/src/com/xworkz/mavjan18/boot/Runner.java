package com.xworkz.mavjan18.boot;

import com.xworkz.mavjan18.dto.SoldierDTO;
import com.xworkz.mavjan18.repo.SoldierRepo;
import com.xworkz.mavjan18.repo.SoldierRepoImpl;
import com.xworkz.mavjan18.service.SoliderServiceImpl;

public class Runner {

	public static void main(String[] args) {
		SoldierDTO dto = new SoldierDTO(1, "Thukaram Naika","India","Lieutenant","Nagpur");
		SoldierDTO dto1 = new SoldierDTO(1, "Manjunath","India","LeftinentGenral","Nepal Border");
		SoliderServiceImpl service = new SoliderServiceImpl();
		SoldierRepo  repo = new SoldierRepoImpl();
		service.setRepo(repo);
		service.validateAndSave(dto);
		service.validateAndSave(dto1);
	}

}
