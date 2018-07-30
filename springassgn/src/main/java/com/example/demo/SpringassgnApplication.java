package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringassgnApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con= SpringApplication.run(SpringassgnApplication.class, args);
		Bag b1=con.getBean(Bag.class);
		b1.bagInfo();
	}
}
