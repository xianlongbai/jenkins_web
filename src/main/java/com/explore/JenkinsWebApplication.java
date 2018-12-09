package com.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class JenkinsWebApplication extends SpringBootServletInitializer implements WebApplicationInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(JenkinsWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsWebApplication.class, args);
	}
}
