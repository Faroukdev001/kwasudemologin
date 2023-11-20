package com.faroukdev.kwasudemologin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class KwasudemologinApplication {

	public static void main(String[] args) {
		SpringApplication.run(KwasudemologinApplication.class, args);
	}

}
