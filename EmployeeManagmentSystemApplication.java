package com.JBK.EmployeeManagmentSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class EmployeeManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentSystemApplication.class, args);
		System.out.println("Employee Managment System Running > > >");
	}

}
