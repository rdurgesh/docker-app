package com.spring.boot.traning.service;

import java.util.List;

import com.spring.boot.traning.domain.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);

	List<Employee> finalAllEmployee();
}
