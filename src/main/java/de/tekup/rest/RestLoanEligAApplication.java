package de.tekup.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(version = "1.0",
title = "LoanIndicatorService", description = "Check clients for banking services",
contact = @Contact(name = "Hmida Rojbani",email = "hmida.rojbani@tek-up.tn")))
public class RestLoanEligAApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestLoanEligAApplication.class, args);
	}

}
