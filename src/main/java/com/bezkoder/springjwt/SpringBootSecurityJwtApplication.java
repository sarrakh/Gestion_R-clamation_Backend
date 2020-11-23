package com.bezkoder.springjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.bezkoder.springjwt.security.services.SendEmailService;



@SpringBootApplication
public class SpringBootSecurityJwtApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}
	
}
