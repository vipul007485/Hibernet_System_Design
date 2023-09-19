package com.jsp.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vipul");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Employee saveEmployee(Employee employee) {

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

		return employee;
	}

	public int deleteEmployee(int id) {

		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		return id;
	}

	public Employee getEmployee(int id) {

		Employee employee = entityManager.find(Employee.class, id);

		return employee;
	}

	public Employee updateEmployee(Employee employee) {

//		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		return employee;
	}
	public List<Employee> getAllEmployee() {

		String sql = "SELECT e FROM Employee e";

		Query query = entityManager.createQuery(sql);

		List<Employee> employees = query.getResultList();

		return employees;
	}

}
