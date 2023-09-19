package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class TestSave {
	
	
	public static void main(String[] args) {
		
		
		Employee employee = new Employee();
		
		employee.setName("Ram");
		employee.setEmail("vipul@gmail.com");
		employee.setCno(1234567890);
		 
		EmployeeService employeeService = new EmployeeService();
		
		employeeService.saveEmployee(employee);
		
		
	}

}
