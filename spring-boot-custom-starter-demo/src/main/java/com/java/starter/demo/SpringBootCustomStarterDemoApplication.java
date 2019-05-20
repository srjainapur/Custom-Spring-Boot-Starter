package com.java.starter.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.greeter.library.Greeter; 

@SpringBootApplication
public class SpringBootCustomStarterDemoApplication implements CommandLineRunner {

	@Autowired
	private Greeter greeter;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomStarterDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String message = greeter.greet();
		System.out.println(message);
	}   
}
