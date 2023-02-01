package com.xworkz.fooditem.configuration;

import org.apache.catalina.tribes.util.Arrays;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodItemInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running  getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] ref = {FoodItemConfiguration.class};
		System.out.println("running getServletConfigClasses" +Arrays.toString(ref));
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running  getServletMappings ");
		return new  String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling ");
		configurer.enable();
	}

}
