package com.xworkz.val.Configurtaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.val")
public class ValentaienConfiguration {
	public ValentaienConfiguration() {
		System.out.println("Created ValentaienConfiguration ");
	}
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
//		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//		return bean;
//	}
}
