package com.employersSalary;

import org.springframework.stereotype.Controller;

@Controller

public class EmployersSalary {
	
	public EmployersSalary() {

		System.out.println("     Getting all the details of the employers Salary.     ");
	
	}
	
	public String empSalaryDetails() {
		int salary=10000;
		String nameOfEmployee="Dora Sri Vignesh";
		System.out.println("Employee Name ->"+ nameOfEmployee+"   "+" salary ---->"+ salary);
		return "Employee salary details sucessfully saved into the data base ....";
	}

}
