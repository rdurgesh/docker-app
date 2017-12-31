package com.spring.boot.traning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.traning.domain.Employee;
import com.spring.boot.traning.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> finalAllEmployee() {
		return employeeRepository.findAll();
	}

}
