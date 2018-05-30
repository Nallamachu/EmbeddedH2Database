package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.spring.boot.controller,com.spring.boot.repository")
public class EmbeddedH2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedH2DatabaseApplication.class, args);
	}
}
