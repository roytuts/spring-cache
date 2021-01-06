package com.roytuts.spring.boot.ehcache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.roytuts.spring.boot.ehcache.model.Employee;
import com.roytuts.spring.boot.ehcache.service.EmployeeService;

@EnableCaching
@SpringBootApplication
public class SpringEhCacheApp implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEhCacheApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> employees = employeeService.getListOfEmployees();

		System.out.println(employees);
		System.out.println("---------------------------------------------------");

		employees = employeeService.getListOfEmployees();

		System.out.println(employees);
		System.out.println("---------------------------------------------------");

		Employee employee = employeeService.findEmployeeByName("Sumit", employees);

		System.out.println(employee);
		System.out.println("---------------------------------------------------");

		employee = employeeService.findEmployeeByName("Sumit", employees);

		System.out.println(employee);
		System.out.println("---------------------------------------------------");

		employee = employeeService.findEmployeeByName("Liton", employees);
		System.out.println(employee);
		System.out.println("---------------------------------------------------");
	}

}
