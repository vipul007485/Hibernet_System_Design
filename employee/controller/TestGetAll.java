package com.jsp.employee.controller;

import java.util.List;

import com.jsp.employee.dto.Employee;
//import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class TestGetAll {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();

		List<Employee> employee = employeeService.getAllEmployee();

		for(Employee e : employee) {
			System.out.println("===========================================");
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getCno());
			System.out.println("===========================================");

		}

	}

}
