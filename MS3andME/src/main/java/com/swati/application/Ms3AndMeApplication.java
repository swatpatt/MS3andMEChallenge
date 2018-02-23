package com.swati.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.swati.controller.NumberController;

@SpringBootApplication
@ComponentScan(basePackageClasses = NumberController.class)
public class Ms3AndMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms3AndMeApplication.class, args);
	}
}
