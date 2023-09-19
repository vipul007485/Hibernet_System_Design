package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class TestDelete {
	
	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		
		 int id = employeeService.deleteEmployee(3);
		 
		 System.out.println(id + " Deleted");
	}

}
