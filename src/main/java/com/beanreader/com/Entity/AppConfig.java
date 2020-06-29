package com.beanreader.com.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Autowired
	private  EmployeeService employee;
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@Bean
	public Employee createEmployeeByType1() {
		Employee hrEmployee= employee.createEmployee(Type.HR.toString());
		System.out.println("TYPE "+" : " + "hrEmployee:"+hrEmployee);
		return hrEmployee;
	}
	
	@Bean
	public Employee createEmployeeByType2() {
		Employee operationsEmployee= employee.createEmployee(Type.OPERATIONS.toString());
		System.out.println("TYPE "+" : " +"OPERATIONS:"+operationsEmployee);
		return operationsEmployee;
	}
	
	
	@Bean
	public Employee createEmployeeByType3() {
		Employee iOTEmployee= employee.createEmployee(Type.IOT.toString());
		System.out.println("TYPE "+" : " +"IOTEmployee:"+iOTEmployee);
		return iOTEmployee;
	}
	

	
	
	
	@Bean 
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Department createDepartment() {
		Department department =departmentService.createDepartment();
		System.out.println("singleTON ::: department:"+department);
		return department;
		
	}
	
	
	

}
