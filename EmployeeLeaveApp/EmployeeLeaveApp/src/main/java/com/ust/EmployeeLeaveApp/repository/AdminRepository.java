package com.ust.EmployeeLeaveApp.repository;

import com.ust.EmployeeLeaveApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository  extends JpaRepository<Admin,Long> {
}
