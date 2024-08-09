package com.ust.EmployeeLeaveApp.service;

import com.ust.EmployeeLeaveApp.model.Employee;
import com.ust.EmployeeLeaveApp.model.Leave;
import com.ust.EmployeeLeaveApp.model.LeaveStatus;
import com.ust.EmployeeLeaveApp.repository.AdminRepository;
import com.ust.EmployeeLeaveApp.repository.EmployeeRepository;
import com.ust.EmployeeLeaveApp.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    LeaveRepository leaveRepository;

    @Autowired
    AdminRepository  adminRepository;

    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(long empid) {

        return employeeRepository.findById(empid).orElse(null);
    }

    public Leave applyForLeave(Leave leave) {

       return leaveRepository.save(leave);
    }

    public Leave updateStatus(long leaveid, LeaveStatus status) {

        Leave leave  = leaveRepository.findById(leaveid).get();

        leave.setStatus(status);
        return leaveRepository.save(leave);


    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
