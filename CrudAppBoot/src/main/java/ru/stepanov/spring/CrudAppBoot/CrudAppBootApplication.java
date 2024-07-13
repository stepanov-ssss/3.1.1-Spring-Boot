package ru.stepanov.spring.CrudAppBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudAppBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppBootApplication.class, args);
		System.out.println("Hello World!");
	}

}
