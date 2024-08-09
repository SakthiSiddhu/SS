package com.ust.EmployeeLeaveApp.repository;

import com.ust.EmployeeLeaveApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
