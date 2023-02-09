package com.xworkz.bekary.controllr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bekary.dto.BekaryDTO;
import com.xworkz.bekary.service.BekaryService;

@Component
@RequestMapping("/")
public class BekaryInfo {
	@Autowired
	public BekaryService bekaryService;
	
	public BekaryInfo() {
		System.out.println("created Bekary component cont");
	}
	
	@PostMapping("/bekary")
	public String onBekary(BekaryDTO dto , Model m) {
		System.out.println(dto);
		m.addAttribute("name",dto.getName());
		m.addAttribute("ownerName" , dto.getOwnerName());
		m.addAttribute("wifeName", dto.getWifeName());
		m.addAttribute("married", dto.getMarried());
		m.addAttribute("famousFor", dto.getFamousFor());
		m.addAttribute("since", dto.getSince());
		boolean saved = this.bekaryService.validateAndSave(dto);
		System.out.println("Saved"+ saved);
		return "disp.jsp";
	}
}
