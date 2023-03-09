package com.xworkz.ott.Controller;

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

import com.xworkz.ott.Service.OttService;
import com.xworkz.ott.dto.OttDTO;

@Controller
@RequestMapping("/")
public class OttControler {

	@Autowired
	private OttService ottService;

	public OttControler() {
		System.out.println("Created  ott Controller");
	}

	List<String> plat = Arrays.asList("NetFlix","HBO Max", "Disnet+","VOOT");
	List<String> lang = Arrays.asList("Kannada", "Hindi", "Telgu", "Tamil", "English");
	
	@GetMapping("/ottd")
	public String onCrop(Model m) {
		m.addAttribute("platform", plat);
		m.addAttribute("language", lang);
		return "Ott.jsp";
	}

	@PostMapping("/ottd")
	public String onCrop(OttDTO dto, Model mo) {
		Set<ConstraintViolation<OttDTO>> constraintViolations = this.ottService.vlaidateAndSave(dto);
		if (constraintViolations.isEmpty()) {
			System.out.println("Validation sucess");
			System.out.println(dto);
			mo.addAttribute("platform", plat);
			mo.addAttribute("language", lang);

			mo.addAttribute("savem","Data Saved Sucessful");
			return "Ott.jsp";
			//return "disp.jsp";
		}

		mo.addAttribute("platform", plat);
		mo.addAttribute("language", lang);

		mo.addAttribute("cv", constraintViolations);
		System.out.println(dto);

		System.err.println(" violation in controller");
		return "Ott.jsp";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		OttDTO dto = this.ottService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "Search.jsp";
	}

	@GetMapping("/seacrhByCropName")
	public String onSeacrh(@RequestParam String platform, Model m) {
		System.out.println("RUnning On Search By Crop Name");
		List<OttDTO> lists = this.ottService.findByPlatform(platform);
		m.addAttribute("list", lists);
		return "SearchByPlatform.jsp";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model m) {
		System.out.println("Update By Id");
		OttDTO dto = this.ottService.findById(id);
		m.addAttribute("dto", dto);
		m.addAttribute("platform", plat);
		m.addAttribute("language", lang);
		return "Update.jsp";
	}

	@PostMapping("/update")
	public String onUpdate(Model m, OttDTO dto) {
		System.out.println("Running update" + dto);

		Set<ConstraintViolation<OttDTO>> violations = this.ottService.validateAndUpdate(dto);

		if (violations.size() > 0) {
			m.addAttribute("err", violations);
		} else {
			m.addAttribute("message", "OTT DTO UPDATE sucessful");
		}
		m.addAttribute("dto", dto);
		m.addAttribute("platform", plat);
		m.addAttribute("language", lang);
		m.addAttribute("messages", "OTT Dto Update sucessful");


		return "Update.jsp";
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model m) {
		System.out.println("Running on delete");
		OttDTO dto = this.ottService.deleteById(id);
		m.addAttribute("delete", dto);
		m.addAttribute("message", "Data Deleted sucessful");

		return "SearchByPlatform.jsp";
	}

}
