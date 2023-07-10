package com.example.end;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EndApplication {
	//todo: configure openapi endpoints
	//todo: notify client when referenced entity is deleted
	//todo: add index to username field
	public static void main(String[] args) {
		SpringApplication.run(EndApplication.class, args);
	}

}
