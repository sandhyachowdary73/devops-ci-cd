package com.myapp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class DevopsSpringRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsSpringRestApiApplication.class, args);
	}

}