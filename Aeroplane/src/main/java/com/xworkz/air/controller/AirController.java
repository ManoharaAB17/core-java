package com.xworkz.air.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.air.dto.AirDTO;
import com.xworkz.air.entity.AirEntity;
import com.xworkz.air.service.AirSerivice;

@Controller
@RequestMapping("/")
public class AirController {
	@Autowired
	public AirSerivice airSerivice;

	public AirController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	List<String> count = Arrays.asList("India", "Shrilanka", "china", "finland", "poland", "South Africa", "America");

	@GetMapping("/airp")
	public String onAir(Model m) {
		m.addAttribute("countrys", count);
		return "Airoplane.jsp";
	}

	@GetMapping("/search")
	
	public String onSearch(@RequestParam int id, Model model) {

		System.out.println("Running on search for id " + id);

		AirDTO dto = this.airSerivice.findById(id);
		
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "Search.jsp";
	}

	@PostMapping("/airp")
	public String onVal(AirDTO dto, Model mo) {
		Set<ConstraintViolation<AirDTO>> constraintViolations = this.airSerivice.vlaidateAndSave(dto);
		if (constraintViolations.isEmpty()) {
			System.out.println("Validation sucess");
			System.out.println(dto);
			return "disp.jsp";
		}
		mo.addAttribute("countrys", count);

		mo.addAttribute("cv", constraintViolations);
		System.out.println(dto);

		System.err.println(" violation in controller");
		return "Airoplane.jsp";
	}

}
