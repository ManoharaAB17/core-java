package com.xworkz.task.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.task.DTO.CasinoDTO;

@Component
@RequestMapping("/casino")
public class Casino {
	public Casino() {
		System.out.println("Created : " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(CasinoDTO dto, Model m) {
		System.out.println("Deatils are :" + dto);
         m.addAttribute("name", dto.getName());
         m.addAttribute("cursie", dto.getCursie());
         m.addAttribute("entryFee", dto.getEntryFee());

		return "dispCasino.jsp";
	}
}
