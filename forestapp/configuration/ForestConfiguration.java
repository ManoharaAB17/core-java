package com.xworkz.forestapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.forestapp")
public class ForestConfiguration {
	public ForestConfiguration() {
		System.out.println("Created : " + this.getClass().getSimpleName());
	}

	@Bean

	LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
	}
}
