package com.xworkz.mavenjan11.Configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mavenjan11")
public class SoftwareConfiguration {

	@Bean
	public String name1() {
		return "Moon SoftWares";
	}

	@Bean
	public String version() {
		return "11JAN2022.2";
	}

	@Bean
	public String devloper() {
		return "Manohar A B";
	}

	@Bean
	public LocalDate date() {
		return LocalDate.of(2022, 07, 17);
	}

	@Bean
	public boolean free() {
		return false;
	}

}
