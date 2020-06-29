package com.beanreader.com.Entity;

import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	public Department createDepartment() {

		Department department = new Department();
		department.setId("1");
		department.setCity("HYD");
		department.setName("R&D");

		return department;

	}

}
