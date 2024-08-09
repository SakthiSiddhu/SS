package com.ust.EmployeeLeaveApp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class Leave {

    @Id
    @GeneratedValue

    private long leaveId;
    private String reason;
    @Column(columnDefinition = "Varchar(10) default 'PENDING'")
    private LeaveStatus status;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Employee employee;
}
