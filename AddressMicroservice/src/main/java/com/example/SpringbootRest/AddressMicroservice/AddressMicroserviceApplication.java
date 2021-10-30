package com.example.SpringbootRest.AddressMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class AddressMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressMicroserviceApplication.class, args);
	}

}
