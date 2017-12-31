package com.spring.boot.traning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.traning.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
