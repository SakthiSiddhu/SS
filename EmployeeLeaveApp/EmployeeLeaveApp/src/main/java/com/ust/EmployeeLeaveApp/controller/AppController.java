package com.ust.EmployeeLeaveApp.controller;

import com.ust.EmployeeLeaveApp.model.Admin;
import com.ust.EmployeeLeaveApp.model.Employee;
import com.ust.EmployeeLeaveApp.model.Leave;
import com.ust.EmployeeLeaveApp.model.LeaveStatus;
import com.ust.EmployeeLeaveApp.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AppController {

    @Autowired
    AppService appService;
/*
    @PostMapping("/register/employee")
    public ResponseEntity<Employee> registerEmployee(Employee employee){

        return ResponseEntity.ok(appService.saveEmployee(employee));
    }

    @PostMapping("/register/admin")
    public ResponseEntity<Employee> registerAdmin(Admin admin){

        return ResponseEntity.ok(appService.saveAdmin(admin));
    }*/

    @GetMapping("/employee/{id}")
            public ResponseEntity<Employee> getEmployeeById(long empid)
    {
        return ResponseEntity.ok(appService.getEmployeeById(empid));
    }

    @PostMapping("/leave")
    public ResponseEntity<Leave> applyForLeave(Leave leave)
    {
        return ResponseEntity.ok(appService.applyForLeave(leave));
    }

    @GetMapping("/allEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee()
    {

        return ResponseEntity.ok(appService.getAllEmployee());
    }

    @PutMapping("/leave/action")
    public ResponseEntity<Leave> updateStatus(long leaveid, LeaveStatus status)
    {

        return ResponseEntity.ok( appService.updateStatus(leaveid,status));
    }
}
