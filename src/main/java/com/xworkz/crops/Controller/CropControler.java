package com.xworkz.crops.Controller;

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

import com.xworkz.crops.Service.CropService;
import com.xworkz.crops.dto.CropDTO;

@Controller
@RequestMapping("/")
public class CropControler {

	@Autowired
	private CropService cropService;

	public CropControler() {
		System.out.println("Created  Crop Controller");
	}

	List<String> region = Arrays.asList("Karnataka", "Andra Pardesh", "tamilnadu", "kerala", "goa", "Madya pradesh",
			"Andra pradesh");

	@GetMapping("/cropp")
	public String onCrop(Model m) {
		m.addAttribute("regions", region);
		return "Crop.jsp";
	}

	@PostMapping("/cropp")
	public String onCrop(CropDTO dto, Model mo) {
		Set<ConstraintViolation<CropDTO>> constraintViolations = this.cropService.vlaidateAndSave(dto);
		if (constraintViolations.isEmpty()) {
			System.out.println("Validation sucess");
			System.out.println(dto);
			return "disp.jsp";
		}

		mo.addAttribute("regions", region);

		mo.addAttribute("cv", constraintViolations);
		System.out.println(dto);

		System.err.println(" violation in controller");
		return "Crop.jsp";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		CropDTO dto = this.cropService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "Search.jsp";
	}

	@GetMapping("/seacrhByCropName")
	public String onSeacrh(@RequestParam String cropName, Model m) {
		System.out.println("RUnning On Search By Crop Name");
		List<CropDTO> lists = this.cropService.findByCropName(cropName);
		m.addAttribute("list", lists);
		return "SearchByCropName.jsp";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model m) {
		System.out.println("Update By Id");
		CropDTO dto = this.cropService.findById(id);
		m.addAttribute("dto", dto);
		m.addAttribute("regions", region);
		return "Update.jsp";
	}

	@PostMapping("/update")
	public String onUpdate(Model m, CropDTO dto) {
		System.out.println("Running update" + dto);

		Set<ConstraintViolation<CropDTO>> violations = this.cropService.validateAndUpdate(dto);

		if (violations.size() > 0) {
			m.addAttribute("err", violations);
		} else {
			m.addAttribute("message", "Crop DTO UPDATE sucessful");
		}
		m.addAttribute("dto", dto);
		m.addAttribute("regions", region);
		m.addAttribute("messages", "Crop Dto Update sucessful");


		return "Update.jsp";
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model m) {
		System.out.println("Running on delete");
		CropDTO dto = this.cropService.deleteById(id);
		m.addAttribute("delete", dto);
		m.addAttribute("message", "Data Deleted sucessful");

		return "SearchByCropName.jsp";
	}

}
