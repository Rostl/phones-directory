package com.rost.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "employees")
@Data
@Builder
@Entity
@Table(name = "employee_department", schema = "phone_storage")
public class EmployeeDepartment extends BaseEntity<Long> {

    @Column(name = "department")
    private String department;

    @OneToMany(mappedBy = "employeeDepartment")
    private Set<Employee> employees = new HashSet<>();

    public EmployeeDepartment(String department) {
        this.department = department;
    }
}
