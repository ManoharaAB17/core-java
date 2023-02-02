package com.xworkz.interview.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InterviewInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] ref = { InterviewConfig.class };
		System.out.println("Running  getServletConfigClasses" + Arrays.toString(ref));
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running  getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
