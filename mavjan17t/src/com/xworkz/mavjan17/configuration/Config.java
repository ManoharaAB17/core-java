package com.xworkz.mavjan17.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mavjan17")
public class Config {
   public Config() {
System.out.println("Configuration Constructor");}
}
