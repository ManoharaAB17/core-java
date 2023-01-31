package com.xworkz.laser.spring.Configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	public SpringWebInit() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClass = { SpringConfiguration.class };
		System.out.println("getServletConfigClasses");
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		String[] ref = { "/" };
		System.out.println("getServletMappings");

		return ref;
	}

}
