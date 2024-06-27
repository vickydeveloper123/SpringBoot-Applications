package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.empEducationDetails.EmployeeEducation;
import com.employersSalary.EmployersSalary;

@SpringBootApplication
@ComponentScan(basePackages = { "com.empEducationDetails", "com.employersSalary", "com.empFamily" })

public class SpringBootDemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDemApplication.class, args);

		System.out.println("=====================================================================");
		System.out.println("=======>" + run.getClass().getName());
		System.out.println("Total Bean count ------>" + run.getBeanDefinitionCount());

	}

	@Bean

	public EmployeeEducation educationDetailsFetching() {
		EmployeeEducation REF = new EmployeeEducation();

		return REF;
	}

	@Bean

	public EmployeeEducation educationDetailsFetching1() {
		EmployeeEducation REF = new EmployeeEducation();

		return REF;

	}

	@Bean
	public EmployersSalary salaryDetails() {

		EmployersSalary ref1 = new EmployersSalary();
		ref1.empSalaryDetails();
		ref1.hashCode();
		return ref1;

	}

}
