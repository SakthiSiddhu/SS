package com.ust.EmployeeLeaveApp.repository;

import com.ust.EmployeeLeaveApp.model.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave,Long> {
}
