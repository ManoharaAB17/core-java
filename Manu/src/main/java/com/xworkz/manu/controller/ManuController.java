package com.xworkz.manu.controller;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.manu.dto.BevrageDTO;
import com.xworkz.manu.dto.ChatDTO;
import com.xworkz.manu.dto.EducationDTO;
import com.xworkz.manu.dto.MobilDto;

@Component
@RequestMapping("/")
public class ManuController {
	public ManuController() {
		System.out.println("Created : Congtroller COnst");
	}

	@GetMapping("/mail")
	public String onEmail(Model m) {
		String em = " moonmanu1999@gamil.com";
		m.addAttribute("email", em);
		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onMobile(Model mm) {
		long mnum = 8748038295L;
		mm.addAttribute("mobilem", mnum);
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model mm) {
		mm.addAttribute("age", 24);
		return "index.jsp";
	}

	@GetMapping("/adr")
	public String onAadhar(Model mm) {
		mm.addAttribute("aadhar", 228222030403L);
		return "index.jsp";
	}

	@GetMapping("/dob")
	public String onDateOf(Model mm) {
		mm.addAttribute("dob", "17-Jul-199 9.45Am");
		return "index.jsp";
	}

	@GetMapping("/sallary")
	public String onDesiredSal(Model mm) {
		mm.addAttribute("sall", "4lpa");
		System.out.println("Running Sallary");
		return "index.jsp";
	}

	@GetMapping("/bestfrnds")
	public String onBestFrnds(Model mm) {
		List<String> bff = new ArrayList<String>();
		bff.add("Pramodh");
		bff.add("Sanjana");
		bff.add("Sanjay");
		bff.add("Sagar");
		bff.add("Hema");
		bff.add("Niveditha");
		bff.add("Suchitra");
		System.out.println("Running Best Frinends");
		mm.addAttribute("best", bff);
		return "index.jsp";
	}

	@GetMapping("/visitedPlace")
	public String onVisitedPalce(Model mm) {
		List<String> vp = new ArrayList<String>();
		vp.add("Shimogga");
		vp.add("Dasarahalli");
		vp.add("Electronic city");
		vp.add("GT World mall");
		vp.add("Malleshwaram Shopping Point");
		vp.add("Xworkz");
		vp.add("Navarang Theatre");
		System.out.println("Running Visited Place+");
		mm.addAttribute("vistedp", vp);
		return "index.jsp";
	}

	@GetMapping("/listOfSkill")
	public String onListOfSkill(Model mm) {
		List<String> sk = new ArrayList<String>();
		sk.add("Java");
		sk.add("JavaScript");
		sk.add(" HTML");
		sk.add("SQL");
		sk.add("Servlet");
		sk.add("Spring");
		sk.add("JSP");
		System.out.println("Running Skill Set");
		mm.addAttribute("skill", sk);
		return "index.jsp";
	}

	@GetMapping("/edu")
	public String onEducation(Model mm) {

		EducationDTO dto = new EducationDTO();

		dto.setName("Manohara A B");
		dto.setStandard("MCA");
		dto.setSection("A");
		dto.setTotSubjects(6);
		dto.setSub1("Data Analytics Using Python");
		dto.setSub2("Research Methodlogy");
		dto.setSub3("Internet of things");
		dto.setSub4("Java, JavaServlet");
		dto.setSub5("ADO .Net");
		dto.setSub6("PHP");

		mm.addAttribute("eduDto", dto);
		System.out.println("Running education Dto zhyjn");
		return "index.jsp";
	}

	@GetMapping("/mob")
	public String onMobil(Model mm) {
		MobilDto dto = new MobilDto();
		dto.setName("Realme_7");
		dto.setModel("Android12");
		dto.setPrice(17000);
		dto.setDispSize("6.13 inch");
		dto.setRam("8 GB Ram");	
		mm.addAttribute("mobi", dto);		
		System.out.println("Running Mobile Dto ");
		return "index.jsp";
	}
	
	@GetMapping("/bev")
	public String onBev(Model mm) {
		
		BevrageDTO dto = new BevrageDTO();
		dto.setName("TUBORG");
		dto.setId(1);
		dto.setQuantity("3");
		dto.setPrice(600);
		dto.setBarcodeNo("js673bc67437");
		dto.setColour("brownish");
		dto.setFlavour("Crispy");
		dto.setType("Beer");
		dto.setMfdDate(LocalDate.of(2023,1,12));
		dto.setExpDate(LocalDate.of(2024, 2,03));
		mm.addAttribute("bev", dto);		
		System.out.println("Running BEvrage Dto ");
		return "index.jsp";
	}
	
	@GetMapping("/chat")
	public String onChat(Model mm) {
		ChatDTO dto= new ChatDTO();
		
		dto.setName("BangarPet Chats");
		dto.setId(1);
		dto.setLocation("Bashyam Circle");
		dto.setPrice(35);
		dto.setChat1("Pani puri");
		dto.setChat2("Dhai puri");
		dto.setChat3("Gobi Manchurian");
		dto.setChat4("nipat masal");
		dto.setChat5("Sev Puri");
		dto.setChat6("Masal Puri");
		
		mm.addAttribute("chat", dto);		
		System.out.println("Running chat Dto ");
		return "index.jsp";
	}

}
