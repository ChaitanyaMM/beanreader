package com.beanreader.com.Entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Qualifier("employeeService")

public class EmployeeService {

	@Transactional
	public Employee createEmployee(String type) {
		Employee emp=prepareData(type);
		return emp;

	}

	private Employee prepareData(String type) {
		Employee employee = new Employee();
		if (type.equals(Type.IOT.toString())) {
			employee.setDepartment("IOT");
			employee.setEmail("chaitanya@gmail.com");
			employee.setFirstName("chaitanya");
			employee.setLastName("bodala");
			employee.setSalary("15");
			return employee;
		} else if (type.equals(Type.OPERATIONS.toString())){
			employee.setDepartment("Operations");
			employee.setEmail("KC@gmail.com");
			employee.setFirstName("chaitanya");
			employee.setLastName("bodala");
			employee.setSalary("15");
			return employee;
		}
		else {
			employee.setDepartment("HR");
			employee.setEmail("humanresources@gmail.com");
			employee.setFirstName("honey");
			employee.setLastName("singh");
			employee.setSalary("15");
			return employee;
		}

	}
}
