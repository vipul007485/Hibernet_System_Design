package com.jsp.employee.controller;



import com.jsp.employee.dto.Employee;

import com.jsp.employee.service.EmployeeService;

public class TestUpdate {
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();

		Employee employee = employeeService.updateEmployee(2, "abc@gmail.com");
		
		System.out.println(employee.getEmail());
	}

}
