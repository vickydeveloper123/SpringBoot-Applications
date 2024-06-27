package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SMTP implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {


		System.out.println("   Email sent to all the customers of our company as today is holiday .........");
	}

}
