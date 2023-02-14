package com.xworkz.val.Controller;

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

import com.xworkz.val.Service.ValentainService;
import com.xworkz.val.Service.ValentainServiceImpl;
import com.xworkz.val.dto.ValentainDTO;

@Controller
@RequestMapping("/vall")
public class ValentainController {
	@Autowired
	private ValentainService valentainService;
	public ValentainController() {
		System.out.println("Created  ValentainController");
	}
	List<String> palce = Arrays.asList("Gajnur Dam", "Gandi Park", "Church", "Hotel", "IceCream Parlour","Cenema Theater", "City Center");
	List<String> gift = Arrays.asList("Teddy Bear", "Chocloate", "Ring", "Saree", "I-Phone");
	@GetMapping
	public String onVal(Model m) {
		m.addAttribute("places", palce);
		m.addAttribute("gifts", gift);
		return "Valentain.jsp";
	}
	@PostMapping
	public String onVal(ValentainDTO dto, Model mo) {
		Set<ConstraintViolation<ValentainDTO>> constraintViolations = this.valentainService.vlaidateAndSave(dto);
		if (constraintViolations.isEmpty()) {
			System.out.println("Validation sucess");
			System.out.println(dto);
			return "disp.jsp";
		}
		mo.addAttribute("places", palce);
		mo.addAttribute("gifts", gift);
        mo.addAttribute("cv" , constraintViolations);
		System.out.println(dto);
		System.err.println(" violation in controller" );
		return "Valentain.jsp";
	}
}
