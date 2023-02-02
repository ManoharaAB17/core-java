package com.xworkz.interview.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.interview.DTO.InterviewDTO;

@Component
@RequestMapping("/inter")
public class InterviewGetDeatils {
      @PostMapping
      public String onClick(InterviewDTO dto)
      {
    	  System.out.println("The Deatils are : " +dto);
    	  return "disp.jsp";
      }
}
