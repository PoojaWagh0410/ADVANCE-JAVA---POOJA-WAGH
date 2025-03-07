package com.pooja.zest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pooja.zest.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


}
