package com.jsp.employee.service;

import java.util.List;
import com.jsp.employee.dao.EmployeeDao;
import com.jsp.employee.dto.Employee;

public class EmployeeService {

	EmployeeDao employeeDao = new EmployeeDao();

	public Employee saveEmployee(Employee employee) {
		Employee e = employeeDao.saveEmployee(employee);
		return e;
	}

	public int deleteEmployee(int id) {
	   return employeeDao.deleteEmployee(id);
	
	}

	public Employee getEmployee(int id) {
		Employee emp = employeeDao.getEmployee(id);
		return emp;
	}

	public Employee updateEmployee(int id, String email) {
		Employee employee = employeeDao.getEmployee(id);
		employee.setEmail(email);
		return employeeDao.updateEmployee(employee);

	}

	public List<Employee> getAllEmployee() {
	    return employeeDao.getAllEmployee();
	
	}

}
