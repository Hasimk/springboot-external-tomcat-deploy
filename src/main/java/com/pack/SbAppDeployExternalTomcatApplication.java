package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SbAppDeployExternalTomcatApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SbAppDeployExternalTomcatApplication.class, args);
	}
	
	  

}